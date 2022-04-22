package com.zensar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;

import com.zensar.bean.Address;
import com.zensar.bean.BankAccount;
import com.zensar.bean.Employee;
import com.zensar.bean.Skill;


public class App {
	
	public static void loadtesting() {
		
		//code here to load employee object
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		Employee employee=null;
		employee=em.find(Employee.class, 1);
		System.out.println(employee);
		em.close();
		emf.close();
		
		
		
	}
	
	public static void inserttesting() {
		
		//write a code here to persist employee object
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		Address address=new Address();
		address.setAddressid(123);
		address.setCityname("bangalore");
		address.setPincode("12345");
		
		BankAccount account=new BankAccount();
		account.setBankid(990);
		account.setAccountid("556");
		
		/*Skill skill =new Skill();
		skill.setSkillname("java");
		skill.setSkilllevel(80);
		*/
		
		Employee employee=new Employee();
		
		employee.setName("abhi");
		employee.setBasicsalary(20000);
		employee.setAddress(address);
		employee.setAccount(account);
		
		
		
		em.getTransaction().begin();
		em.persist(employee);
		
		em.getTransaction().commit();
		
		em.close();
		
		emf.close();
		
		
	}
	
	
  public static void main(String[] args) {
    inserttesting();
  }
}
