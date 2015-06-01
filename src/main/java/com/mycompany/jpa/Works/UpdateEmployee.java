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

public class UpdateEmployee 
{
	public static void main( String[ ] args ) 
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "com.mycompany_JPA_jar_1.0-SNAPSHOTPU" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		
                entitymanager.getTransaction( ).begin( );
		Employee employee=entitymanager.find( Employee.class, 1201 );
		//before update
		System.out.println( employee );
		employee.setSalary( 46000 );
		entitymanager.getTransaction( ).commit( );
            //after update
		System.out.println( employee );
		entitymanager.close();
		emfactory.close();
	}
}