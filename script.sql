USE [master]
GO
/****** Object:  Database [ass_prj]    Script Date: 3/23/2022 3:52:00 PM ******/
CREATE DATABASE [ass_prj]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ass_prj', FILENAME = N'D:\SQL\MSSQL15.SQLEXPRESS\MSSQL\DATA\ass_prj.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'ass_prj_log', FILENAME = N'D:\SQL\MSSQL15.SQLEXPRESS\MSSQL\DATA\ass_prj_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [ass_prj] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ass_prj].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ass_prj] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ass_prj] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ass_prj] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ass_prj] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ass_prj] SET ARITHABORT OFF 
GO
ALTER DATABASE [ass_prj] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [ass_prj] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ass_prj] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ass_prj] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ass_prj] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ass_prj] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ass_prj] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ass_prj] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ass_prj] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ass_prj] SET  DISABLE_BROKER 
GO
ALTER DATABASE [ass_prj] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ass_prj] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ass_prj] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ass_prj] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ass_prj] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ass_prj] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ass_prj] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ass_prj] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [ass_prj] SET  MULTI_USER 
GO
ALTER DATABASE [ass_prj] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ass_prj] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ass_prj] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ass_prj] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [ass_prj] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [ass_prj] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [ass_prj] SET QUERY_STORE = OFF
GO
USE [ass_prj]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 3/23/2022 3:52:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[username] [nchar](50) NOT NULL,
	[password] [nchar](16) NOT NULL,
	[role] [int] NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Course]    Script Date: 3/23/2022 3:52:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Course](
	[courseID] [nvarchar](50) NOT NULL,
	[doctorID] [nvarchar](50) NOT NULL,
	[courseName] [nvarchar](150) NOT NULL,
	[courseTimeWorking] [nvarchar](50) NOT NULL,
	[coursePrice] [nvarchar](50) NULL,
	[courseImg] [nvarchar](150) NULL,
	[courseInfo] [nvarchar](500) NULL,
 CONSTRAINT [PK__Course__2AA84FF1170874B3] PRIMARY KEY CLUSTERED 
(
	[courseID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Department]    Script Date: 3/23/2022 3:52:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Department](
	[departmentID] [nvarchar](50) NOT NULL,
	[departmentName] [varchar](150) NOT NULL,
	[departmentPhone] [char](11) NULL,
 CONSTRAINT [PK_Department] PRIMARY KEY CLUSTERED 
(
	[departmentID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Doctor]    Script Date: 3/23/2022 3:52:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Doctor](
	[doctorID] [nvarchar](50) NOT NULL,
	[departmentID] [nvarchar](50) NOT NULL,
	[doctorName] [nvarchar](150) NOT NULL,
	[doctorAge] [int] NOT NULL,
	[doctorGender] [bit] NULL,
	[username] [nchar](50) NULL,
 CONSTRAINT [PK__Doctor__7224859660E7C171] PRIMARY KEY CLUSTERED 
(
	[doctorID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Patient]    Script Date: 3/23/2022 3:52:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Patient](
	[patientID] [int] IDENTITY(1,1) NOT NULL,
	[roomID] [nvarchar](50) NULL,
	[bill_ID] [varchar](50) NULL,
	[patientName] [nvarchar](150) NULL,
	[patientGender] [bit] NULL,
	[patientAddress] [nvarchar](150) NULL,
	[patientPhone] [nvarchar](150) NULL,
	[patientEmail] [nvarchar](150) NULL,
	[username] [nchar](50) NULL,
 CONSTRAINT [PK_Patient_1] PRIMARY KEY CLUSTERED 
(
	[patientID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Patient_Course]    Script Date: 3/23/2022 3:52:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Patient_Course](
	[patientID] [int] NOT NULL,
	[courseID] [nvarchar](50) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[RoomPatient]    Script Date: 3/23/2022 3:52:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RoomPatient](
	[roomID] [nvarchar](50) NOT NULL,
	[departmentID] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[roomID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Supervisor]    Script Date: 3/23/2022 3:52:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Supervisor](
	[supervisorID] [int] IDENTITY(1,1) NOT NULL,
	[supervisorCode] [nvarchar](50) NOT NULL,
	[departmentID] [nvarchar](50) NULL,
	[supervisorName] [nvarchar](150) NOT NULL,
	[supervisorDob] [date] NOT NULL,
	[supervisorPhone] [char](11) NOT NULL,
	[username] [nchar](50) NULL,
 CONSTRAINT [PK_Supervisor] PRIMARY KEY CLUSTERED 
(
	[supervisorID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Patient] ADD  CONSTRAINT [DF__Patient__patient__10566F31]  DEFAULT ((1)) FOR [patientGender]
GO
ALTER TABLE [dbo].[Course]  WITH CHECK ADD  CONSTRAINT [fk_nurse] FOREIGN KEY([doctorID])
REFERENCES [dbo].[Doctor] ([doctorID])
GO
ALTER TABLE [dbo].[Course] CHECK CONSTRAINT [fk_nurse]
GO
ALTER TABLE [dbo].[Doctor]  WITH CHECK ADD  CONSTRAINT [FK_Doctor_Account] FOREIGN KEY([username])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[Doctor] CHECK CONSTRAINT [FK_Doctor_Account]
GO
ALTER TABLE [dbo].[Doctor]  WITH CHECK ADD  CONSTRAINT [FK_Doctor_Department] FOREIGN KEY([departmentID])
REFERENCES [dbo].[Department] ([departmentID])
GO
ALTER TABLE [dbo].[Doctor] CHECK CONSTRAINT [FK_Doctor_Department]
GO
ALTER TABLE [dbo].[Patient]  WITH CHECK ADD  CONSTRAINT [FK_Patient_Account] FOREIGN KEY([username])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[Patient] CHECK CONSTRAINT [FK_Patient_Account]
GO
ALTER TABLE [dbo].[Patient]  WITH CHECK ADD  CONSTRAINT [fk_patient_room] FOREIGN KEY([roomID])
REFERENCES [dbo].[RoomPatient] ([roomID])
GO
ALTER TABLE [dbo].[Patient] CHECK CONSTRAINT [fk_patient_room]
GO
ALTER TABLE [dbo].[Patient_Course]  WITH CHECK ADD  CONSTRAINT [FK_Patient_Course_Course] FOREIGN KEY([courseID])
REFERENCES [dbo].[Course] ([courseID])
GO
ALTER TABLE [dbo].[Patient_Course] CHECK CONSTRAINT [FK_Patient_Course_Course]
GO
ALTER TABLE [dbo].[Patient_Course]  WITH CHECK ADD  CONSTRAINT [FK_Patient_Course_Patient] FOREIGN KEY([patientID])
REFERENCES [dbo].[Patient] ([patientID])
GO
ALTER TABLE [dbo].[Patient_Course] CHECK CONSTRAINT [FK_Patient_Course_Patient]
GO
ALTER TABLE [dbo].[RoomPatient]  WITH CHECK ADD  CONSTRAINT [FK_RoomPatient_Department] FOREIGN KEY([departmentID])
REFERENCES [dbo].[Department] ([departmentID])
GO
ALTER TABLE [dbo].[RoomPatient] CHECK CONSTRAINT [FK_RoomPatient_Department]
GO
ALTER TABLE [dbo].[Supervisor]  WITH CHECK ADD  CONSTRAINT [FK_Supervisor_Account] FOREIGN KEY([username])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[Supervisor] CHECK CONSTRAINT [FK_Supervisor_Account]
GO
ALTER TABLE [dbo].[Supervisor]  WITH CHECK ADD  CONSTRAINT [FK_Supervisor_Department] FOREIGN KEY([departmentID])
REFERENCES [dbo].[Department] ([departmentID])
GO
ALTER TABLE [dbo].[Supervisor] CHECK CONSTRAINT [FK_Supervisor_Department]
GO
USE [master]
GO
ALTER DATABASE [ass_prj] SET  READ_WRITE 
GO
