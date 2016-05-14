package com.school.main.repository;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

import com.school.main.enity.CheckEntity;

@Repository
public class checkServiceImpl implements CheckService {

	@Resource
	HibernateTransactionManager transactionManager;

	public CheckEntity getCheck(CheckEntity checkEntity) {
		CheckEntity checkEntity2;

		SessionFactory sdf = transactionManager.getSessionFactory();
		Session session = sdf.openSession();

		session.beginTransaction();
		 session.persist(checkEntity);
		session.getTransaction().commit();
		return checkEntity;
	}

}
