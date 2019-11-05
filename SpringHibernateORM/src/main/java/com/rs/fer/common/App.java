package com.rs.fer.common;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rs.fer.bo.FerBo;
import com.rs.fer.model.Expense;
import com.rs.fer.model.User;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

		FerBo ferBo = (FerBo) appContext.getBean("ferBo");

		/*
		 * // Registration
		 * 
		 * User user = new User(); user.setId(1); user.setFirstname("SRINU");
		 * user.setMiddlename("BABU"); user.setLastname("T");
		 * user.setEmail("SRINU@mail.com"); user.setUsername("sri");
		 * user.setPassword("s"); user.setMobilenumber("12345");
		 * 
		 * ferBo.save(user);
		 */

		// Add expense
		/*
		 * Expense expense = new Expense(); expense.settype("goods");
		 * expense.setDate("01-11-2019"); expense.setPrice((float) 101.43);
		 * expense.setTotal(500); expense.setNumberofitems(3); expense.setBywhom("me");
		 * expense.setUserid(1); ferBo.save(expense);
		 * 
		 * System.out.println(expense);
		 */

		// get user
		
		 // User user1=ferBo.findByUser(1); System.out.println(user1);
		 
		 
		  
		  //get expense
		  
		 // Expense expense1=ferBo.findById(3); System.out.println(expense1);
		 

		
		 //Edit expense
		
		Expense expense1=ferBo.findById(1);
		  expense1.settype("milk"); expense1.setDate("01-11-2019");
		  expense1.setTotal(401); expense1.setBywhom("srinu"); expense1.setUserid(1);
		 ferBo.update(expense1);
		  
		 System.out.println(expense1);
		 

		// delete expense

		//Expense expense1=ferBo.findById(1);
		//ferBo.delete(expense1); 
		//System.out.println("deleted successfully");
		 
		//resetpassword
		
		 //get expenses
		 //List<Expense>list=ferBo.getExpenses(); for(Expense e:list)
		 //{System.out.println("Expense list:" +e);}
		 

		/*
		 * //login ferBo.load(user1); System.out.println("Valid login details");
		 */
		/*
		 * //update name user1.setMiddle_name("flora"); System.out.println(user1);
		 */
		/** select **/
		/*
		 * User stock2 = stockBo.findByStockCode("002"); System.out.println(stock2);
		 * 
		 *//** update **/
		/*
		 * 
		 * 
		 * //stock2.setStockName("kitkat"); stockBo.update(stock2);
		 * 
		 *//** delete **//*
							 * //stockBo.delete(stock2);
							 * 
							 * //System.out.println("Done"); }
							 */
	}
}
