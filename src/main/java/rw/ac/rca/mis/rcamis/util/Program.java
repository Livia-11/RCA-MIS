package rw.ac.rca.mis.rcamis.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import rw.ac.rca.mis.rcamis.models.Student;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory() ;
       Session session = sessionFactory.openSession();
       Transaction transaction = session.beginTransaction();
        Student student1 = new Student(1, "Mike", "Mugabo", "mike@gmail.com", 12, LocalDate.now());
        session.persist(student1);
        transaction.commit();
     }
}
