package rw.ac.rca.mis.rcamis.controllers;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import rw.ac.rca.mis.rcamis.models.Student;
import rw.ac.rca.mis.rcamis.services.StudentService;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    StudentService service=StudentService.getInstance();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = "2005-02-20";
        LocalDate dob = LocalDate.parse(date, pattern);
        Student student1 = new Student(fname,lname,email, 12,dob);
        service.addStudent(student1);
        request.getRequestDispatcher("WEB-INF/register.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = "2005-02-20";
        LocalDate dob = LocalDate.parse(date, pattern);
        Student student1 = new Student(fname,lname,email, 12,dob);
        service.addStudent(student1);

        request.getRequestDispatcher("WEB-INF/register.jsp").forward(request, response);
    }


}