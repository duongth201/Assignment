/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tld;

import DAL.CourseDAO;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author ADMIN
 */
public class TagHandler extends SimpleTagSupport {

    private int pageindex;
    private int pagesize;

    public int getPageindex() {
        return pageindex;
    }

    public void setPageindex(int pageindex) {
        this.pageindex = pageindex;
    }

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();

        try {
            CourseDAO dao = new CourseDAO();
            int pagesize = 4;
            int totalrecords = dao.getCount();
            int totalpage;
            if (totalrecords % pagesize == 0) {
                totalpage = totalrecords / pagesize;
            } else {
                totalpage = totalrecords / pagesize + 1;
            }
            if (pageindex != 1) {
                out.print("  <a href=\"course?page=1\">First</a>\n");
            }
            if (pageindex - 2 > 0) {
                out.print("  <a href=\"course?page=" + (pageindex - 2) + "\">" + (pageindex - 2) + "</a>\n");
            }
            if (pageindex - 1 > 0) {
                out.print("  <a href=\"course?page=" + (pageindex - 1) + "\">" + (pageindex - 1) + "</a>\n");
            }
            out.print("" + pageindex + "");
            if (pageindex + 1 < totalpage) {
                out.print("  <a href=\"course?page=" + (pageindex + 1) + "\">" + (pageindex + 1) + "</a>\n");
            }
            if (pageindex + 2 < totalpage) {
                out.print("  <a href=\"course?page=" + (pageindex + 2) + "\">" + (pageindex + 2) + "</a>\n");
            }
            if (pageindex != totalpage) {
                out.print("  <a href=\"course?page=" + (totalpage) + "\">Last</a>\n");
            }

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Pager tag", ex);
        }
    }

}