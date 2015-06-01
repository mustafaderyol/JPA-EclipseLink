/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpa.Works;

/**
 *
 * @author MstfDryl
 */
import com.mycompany.jpa.Entity.Employee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindEmployee 
{
	public static void main( String[ ] args ) 
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "com.mycompany_JPA_jar_1.0-SNAPSHOTPU" );
		EntityManager entitymanager = emfactory.createEntityManager();
		Employee employee = entitymanager.find( Employee.class, 1201 );
		
		System.out.println("employee ID = "+employee.getEid( ));
		System.out.println("employee NAME = "+employee.getEname( ));
		System.out.println("employee SALARY = "+employee.getSalary( ));
		System.out.println("employee DESIGNATION = "+employee.getDeg( ));
	}
}