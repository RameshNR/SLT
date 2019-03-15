package com.ecomm.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.model.Category;

public class CategoryDAOTest 
{
	static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	@Test
	public void addCategoryTest()
	{
		Category category = new Category();
		category.setCategoryName("Sony");
		category.setCategoryDesc("all Smart phone of Sony Brand");
		
		assertTrue("Problem in Adding Category", categoryDAO.addCategory(category));
		
	}
	

	
}
