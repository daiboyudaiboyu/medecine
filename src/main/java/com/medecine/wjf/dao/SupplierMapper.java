package com.medecine.wjf.dao;

import java.util.List;

import com.medecine.wjf.pojo.SupplierPojo;

public interface SupplierMapper {

	List<SupplierPojo> Supplierquery();
	
	int SupplierAdd(SupplierPojo pojo);
	
	int SupplierUpdate(SupplierPojo pojo);
}
