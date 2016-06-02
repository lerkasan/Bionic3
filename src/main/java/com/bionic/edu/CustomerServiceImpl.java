package com.bionic.edu;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CustomerServiceImpl implements CustomerService {
	@Inject
	CustomerDao customerDao;

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getNames(double sumPayed) {
		return customerDao.getNames(sumPayed);
	}
	

}
