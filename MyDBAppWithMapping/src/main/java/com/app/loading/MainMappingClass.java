package com.app.loading;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMappingClass {

	public static void main(String[] args) {

		Laptop laptop = new Laptop();
		laptop.setLid(111);
		laptop.setName("Dell");
		Laptop laptop1 = new Laptop();
		laptop1.setLid(112);
		laptop1.setName("HP");
		Laptop laptop2 = new Laptop();
		laptop2.setLid(113);
		laptop2.setName("Sony");
		Laptop laptop3 = new Laptop();
		laptop3.setLid(114);
		laptop3.setName("Lenovo");

		Student std = new Student();
		std.setRollNo(100);
		std.setName("Vivaan");
		laptop.setStudent(std);
		std.getLaptop().add(laptop);
		Student std1 = new Student();
		std1.setRollNo(200);
		std1.setName("Sonu");
		laptop1.setStudent(std1);
		std1.getLaptop().add(laptop1);
		Student std2 = new Student();
		std2.setRollNo(300);
		std2.setName("Atul");
		laptop2.setStudent(std2);
		std2.getLaptop().add(laptop2);
		Student std3 = new Student();
		std3.setRollNo(400);
		std3.setName("Shivam");
		laptop3.setStudent(std3);
		std3.getLaptop().add(laptop3);
		
		Laptop laptop4 = new Laptop();
		laptop4.setLid(115);
		laptop4.setName("apple");
		laptop4.setStudent(std3);
		
		Laptop laptop5 = new Laptop();
		laptop5.setLid(116);
		laptop5.setName("microsoft");
		laptop5.setStudent(std);
		
		

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);
		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();

		/*
		 * session.save(laptop); session.save(std);
		 * 
		 * 
		 * session.save(std1); session.save(laptop1);
		 * 
		 * session.save(std2); session.save(laptop2);
		 * 
		 * session.save(std3); session.save(laptop3);
		 * 
		 * session.save(laptop5); session.save(laptop4);
		 */
		
		Student student=session.get(Student.class, 400);
		//System.out.println(student);
		//Hibernate: select student0_.rollNo as rollno1_1_0_, student0_.name as name2_1_0_, laptop1_.student_rollNo as student_3_0_1_, laptop1_.lid as lid1_0_1_, laptop1_.lid as lid1_0_2_, laptop1_.name as name2_0_2_, laptop1_.student_rollNo as student_3_0_2_ from Student student0_ left outer join Laptop laptop1_ on student0_.rollNo=laptop1_.student_rollNo where student0_.rollNo=?
		

		t.commit();

	}

}
