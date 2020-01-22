package com.hcl.student;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hcl.util.HibernateUtil;
public class Main {
public static void main(String[] args) {
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction transaction = null;
try {
transaction = session.beginTransaction();
Set<Phone> phoneNumbers = new HashSet<Phone>();
phoneNumbers.add(new Phone("house","9576987648"));
phoneNumbers.add(new Phone("mobile","6343546512"));
Student student = new Student("ramarao", phoneNumbers);
session.save(student);
transaction.commit();
} catch (HibernateException e) {
transaction.rollback();
e.printStackTrace();
} finally {
session.close();
}
}
}