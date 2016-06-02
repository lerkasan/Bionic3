package com.bionic.edu;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class MerchantServiceImp implements MerchantService{
	
    @Inject
    private MerchantDao merchantDao;
    public Merchant findById(int id) { 
    	return merchantDao.findById(id); 
    }
    
    public List<Merchant> findAll() {
    	return merchantDao.findAll();
    }
}