package rw.ac.rca.mis.rcamis.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import rw.ac.rca.mis.rcamis.models.Student;
import rw.ac.rca.mis.rcamis.util.HibernateUtil;

import java.time.LocalDate;

public class StudentService {
    protected static SessionFactory sf = HibernateUtil.getSessionFactory();
    protected static Session session;
    protected static StudentService studentServices;
    public static StudentService getInstance() {
        if (studentServices == null)
            return new StudentService();
        return studentServices;
    }
    private StudentService() {}

    public void addStudent(Student student) {
        Session session = sf.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.persist(student);
            transaction.commit();
        }
        finally {
            session.close();
        }
    }
}