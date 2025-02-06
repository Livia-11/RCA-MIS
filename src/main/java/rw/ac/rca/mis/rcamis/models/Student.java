package rw.ac.rca.mis.rcamis.models;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="abanyeshuri")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="fname",length=50)
    private String firstName;
    private String lastName;
    @Column(unique=true)
    private String email;
    private int age;
    private LocalDate dob;
    /**
     *
     */
    public Student(){};
    /**
     * @param firstName
     * @param lastName
     */
    public Student(int id, String firstName,String lastName, String email, int age, LocalDate dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }
    public Student( String firstName,String lastName, String email, int age, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }
}


















