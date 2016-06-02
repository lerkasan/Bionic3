package com.bionic.edu;

import java.util.List;

public interface CustomerService {
	public Customer findById(int id);
	public List<String> getNames(double sumPayed);

}
