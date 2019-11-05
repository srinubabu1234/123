package com.rs.fer.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import com.rs.fer.dao.FerDao;
import com.rs.fer.model.Expense;
import com.rs.fer.model.User;

public class FerDaoImpl implements FerDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(User user) {
		sessionFactory.openSession().save(user);
	}

	public void update(User user) {
		sessionFactory.openSession().update(user);
	}

	public Object load(String username, String password) {
		return sessionFactory.openSession().load(username, password);
	}

	public void save(Expense expense) {
		sessionFactory.openSession().save(expense);
	}

	public void update(Expense expense) {
		sessionFactory.openSession().update(expense);
	}

	public void delete(Expense expense) {
		sessionFactory.openSession().delete(expense);
	}

	/*
	 * public void update( String currentPassword, String newPassword) {
	 * sessionFactory.openSession().update(currentPassword, newPassword); }
	 */

	public List<Expense> getExpenses() {
		return sessionFactory.openSession().find("from Expense");

	}

	public Expense findById(int id) {
		List list = sessionFactory.openSession().createQuery("from Expense where id="+id).list();
		return (Expense) list.get(0);
	}

	public List<Expense> expenseReport(String expense_type, String fromDate, String toDate) {
		return sessionFactory.openSession().find("from Expense");
	}

	public User findByUser(int id) {
		List list = sessionFactory.openSession().createQuery("from User where Id="+id).list();
		return (User) list.get(0);
	}

	@Override
	public void update(String currentPassword, String newPassword) {
		// TODO Auto-generated method stub
		
	}
	
}
