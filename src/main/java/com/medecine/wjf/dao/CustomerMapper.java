package com.medecine.wjf.dao;

import java.util.List;

import com.medecine.wjf.pojo.CustomerPojo;

public interface CustomerMapper {

	List<CustomerPojo> Customerquery();
	
	int CustomerAdd(CustomerPojo pojo);
	
	int CustomerUpdate(CustomerPojo pojo);
}
