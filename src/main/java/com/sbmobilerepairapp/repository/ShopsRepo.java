package com.sbmobilerepairapp.repository;

import java.util.List;

import com.sbmobilerepairapp.entity.Shops;

public interface ShopsRepo {
	
	public List<Shops> getAllShops();
	
	public boolean saveShop(Shops shops );
	

}
