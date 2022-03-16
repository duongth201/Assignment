/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Course {
    private String courseID;
    private String courseName;
    private String courseTime;
    private String coursePrice;
    private String courseImg;
    private String courseInfo;
    private Doctor d;
    public Course() {
    }

    public Course(String courseID, String courseName, String courseTime, String coursePrice, String courseImg, String courseInfo) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseTime = courseTime;
        this.coursePrice = coursePrice;
        this.courseImg = courseImg;
        this.courseInfo = courseInfo;
    }

//    public Course(String cid, String courname, String time, int price, String img, String info, Doctor doctor) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo;
    }

    

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }

    public Course(String courseID, String courseName, String courseTime, String coursePrice, String courseImg, String courseInfo, Doctor d) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseTime = courseTime;
        this.coursePrice = coursePrice;
        this.courseImg = courseImg;
        this.courseInfo = courseInfo;
        this.d = d;
    }

    public Doctor getD() {
        return d;
    }

    public void setD(Doctor d) {
        this.d = d;
    }



    @Override
    public String toString() {
        return "Course{" + "courseID=" + courseID + ", courseName=" + courseName + ", courseTime=" + courseTime + ", coursePrice=" + coursePrice + ", courseImg=" + courseImg + ", courseInfo=" + courseInfo + ", d=" + d + '}';
    }

    

    
    
}
