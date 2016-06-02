package com.bionic.edu;

import java.util.List;

public interface PaymentDao {
	public List<Payment> findByMerchantId(int id);
	public List<Payment> getLargePayments(double limit);
}
