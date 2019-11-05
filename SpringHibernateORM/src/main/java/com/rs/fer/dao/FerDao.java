package com.rs.fer.dao;

import java.util.List;

import com.rs.fer.model.Expense;
import com.rs.fer.model.User;

public interface FerDao {
	
	// registration
		void save(User user);

	//login
		Object load(String username, String password);

	//addExpense
		void save(Expense expense);

	//editExpense
		void update(Expense expense);

	//deletExpense
		void delete(Expense expense);

	//reset password
		void update(String currentPassword, String newPassword);

	//get expenses
		List<Expense> getExpenses();

	//get expense
		Expense findById(int id);

	//expense report
		List<Expense> expenseReport(String expense_type, String fromDate, String toDate);

	//get user
		User findByUser(int id);

	//update user
		void update(User user);


}
