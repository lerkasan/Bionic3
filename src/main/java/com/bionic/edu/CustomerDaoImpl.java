package com.bionic.edu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getNames(double sumPayed) {
		String txt = "SELECT DISTINCT c.name FROM ";   
	      txt += "Payment p, Customer c " ;
	      txt += "WHERE c.id = p.customerId AND p.sumPayed > 	" 	+ sumPayed;
	      TypedQuery<String> query = em.createQuery(txt, String.class);
	      return query.getResultList();
	}
	
}
