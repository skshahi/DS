package com.app.manytomany;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMappingClass {

	public static void main(String[] args) {

		Laptop laptop = new Laptop();
		laptop.setLid(102);
		laptop.setName("Dell");
		

		Student std = new Student();
		std.setRollNo(200);
		std.setName("Vivaan");
		laptop.getStudent().add(std);
		std.getLaptop().add(laptop);
		

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);
		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();

		session.save(laptop);

		session.save(std);

		t.commit();

	}

}
