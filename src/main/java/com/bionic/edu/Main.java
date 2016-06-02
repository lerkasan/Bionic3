package com.bionic.edu;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MerchantService merchantService = context.getBean(MerchantService.class);
		PaymentService paymentService = context.getBean(PaymentService.class);
		CustomerService customerService = context.getBean(CustomerService.class);
		Merchant m1 = merchantService.findById(1);
		System.out.println("name = " + m1.getName());
		List<Merchant> list = merchantService.findAll();
		for (Merchant m : list)
			System.out.println("name = " + m.getName() + " charge = " + m.getCharge());
		List<Payment> list2 = paymentService.findByMerchantId(3);
		for (Payment p : list2) {
			System.out.println(p.toString());
		}
		List<String> list3 = customerService.getNames(500.0);
		for (String s : list3)
			System.out.println(s);
		List<Payment> list4 = paymentService.getLargePayments(750.0);
		for (Payment p : list4)
			System.out.println(p.getSumPayed());
	}
}
