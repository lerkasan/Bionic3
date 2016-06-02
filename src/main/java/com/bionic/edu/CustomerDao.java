package com.bionic.edu;

import java.util.List;

public interface CustomerDao {
	public Customer findById(int id);

	public List<String> getNames(double sumPayed);
}
