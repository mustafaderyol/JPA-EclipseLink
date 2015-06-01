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
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScalarandAggregateFunctions 
{
	public static void main( String[ ] args ) 
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "com.mycompany_JPA_jar_1.0-SNAPSHOTPU" );
		EntityManager entitymanager = emfactory.createEntityManager();
                
		//Scalar function
		Query query = entitymanager.createQuery("Select UPPER(e.ename) from Employee e");
                
		List<String> list=query.getResultList();
		
		for(String e:list)
		{
			System.out.println("Employee NAME :"+e);
		}
                
		//Aggregate function
		Query query1 = entitymanager.createQuery("Select MAX(e.salary) from Employee e");
                
		Double result=(Double) query1.getSingleResult();
                
		System.out.println("Max Employee Salary :"+result);
	}
}