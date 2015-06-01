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

public class CreateEmployee 
{
	public static void main( String[ ] args ) 
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "com.mycompany_JPA_jar_1.0-SNAPSHOTPU" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		
		Employee employee = new Employee( ); 
		employee.setEid( 1204 );
		employee.setEname( "Gopal" );
		employee.setSalary( 40000 );
		employee.setDeg( "Technical Manager" );
		entitymanager.persist( employee );
		entitymanager.getTransaction( ).commit( );
		
		entitymanager.close( );
		emfactory.close( );
	}
}