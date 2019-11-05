package com.rs.fer.bo.impl;

import java.io.Serializable;
import java.util.List;

import com.rs.fer.bo.FerBo;
import com.rs.fer.dao.FerDao;
import com.rs.fer.model.Expense;
import com.rs.fer.model.User;

public class FerBoImpl implements FerBo {

	FerDao ferDao;

	public void setFerDao(FerDao ferDao) {
		this.ferDao = ferDao;
	}

	public void save(User user) {
		ferDao.save(user);
	}

	public void update(User user) {
		ferDao.update(user);
	}

	public Object load(String username, String password) {
		return ferDao.load(username, password);
	}

	public void save(Expense expense) {
		ferDao.save(expense);
	}

	public Expense update(Expense expense) {
		ferDao.update(expense);
		return expense;
	}

	public void delete( Expense expense) {
		ferDao.delete(expense);

	}

	public void update(String currentPassword, String newPassword) {
		ferDao.update(currentPassword, newPassword);

	}

	public List<Expense> getExpenses() {
		return ferDao.getExpenses();
	}

	public Expense findById(int id) {
		return ferDao.findById(id);
	}

	public List<Expense> expenseReport(String expense_type, String fromDate, String toDate) {

		return ferDao.expenseReport(expense_type, fromDate, toDate);
	}

	public User findByUser(int id) {
		return ferDao.findByUser(id);
	}

	

	

	
}
