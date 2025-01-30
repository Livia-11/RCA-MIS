package rw.ac.rca.mis.rcamis.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import rw.ac.rca.mis.rcamis.models.Student;
import rw.ac.rca.mis.rcamis.util.HibernateUtil;

import java.time.LocalDate;

public class StudentService {
    protected static SessionFactory sf = HibernateUtil.getSessionFactory();
    protected static Session session ;
    protected static StudentService studentService;
    public StudentService getInstance() {
        if (studentService == null)
            return new StudentService();
        return studentService;

    }
    private StudentService(){

    }
    public void add(Student student) {
        Session session = sf.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            Student student1 = new Student(1, "Mike", "Mugabo", "mike@gmail.com", 12, LocalDate.now());
            session.persist(student1);
            session.persist(student1);
            transaction.commit();
        }
        finally {
            session.close();
        }
    }
}



















