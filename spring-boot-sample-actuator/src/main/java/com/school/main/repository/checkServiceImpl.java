package com.school.main.repository;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

import com.school.main.Exception.ConnectionNotFoundException;
import com.school.main.enity.CheckEntity;

@Repository
public class checkServiceImpl implements CheckService {

	@Resource
	HibernateTransactionManager transactionManager;

	public CheckEntity getCheck(CheckEntity checkEntity) throws ConnectionNotFoundException {
		SessionFactory sdf = transactionManager.getSessionFactory();
		if (sdf != null) {
			Session session = sdf.openSession();
			session.beginTransaction();
			session.persist(checkEntity);
			session.getTransaction().commit();
		} else {
			throw new ConnectionNotFoundException("Connection not found");
		}
		return checkEntity;
	}

	public CheckEntity getData(Integer id) {
		SessionFactory sdf = transactionManager.getSessionFactory();
		Session session = sdf.openSession();
		CheckEntity checkEntity = (CheckEntity) session.get(CheckEntity.class, id);
		return checkEntity;
	}

	@Override
	public CheckEntity putForCRUD(String id, String name) {
		SessionFactory sdf = transactionManager.getSessionFactory();
		Session sd = sdf.openSession();
		Criteria ctr = sd.createCriteria(CheckEntity.class);
		ctr.add(Restrictions.eq("id", Integer.parseInt(id)));
		List<CheckEntity> listOfObjects = ctr.list();
		CheckEntity toBeUpdated = listOfObjects.get(0);
		toBeUpdated.setName(name);
		sd.beginTransaction();
		sd.save(toBeUpdated);
		sd.getTransaction().commit();
		// sd.beginTransaction();
		// sd.persist(checkEntity);
		// sd.getTransaction().commit();
		// return checkEntity;
		return toBeUpdated;
	}

}
