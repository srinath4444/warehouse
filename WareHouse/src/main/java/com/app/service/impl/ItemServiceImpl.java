package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IItemDao;
import com.app.model.Item;
import com.app.service.IItemService;

@Service
public class ItemServiceImpl implements IItemService {

	@Autowired
	private IItemDao dao;

	@Override
	public Integer saveItem(Item item) {
		// TODO Auto-generated method stub
		return dao.saveItem(item);
	}
	

	@Override
	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		 dao.updateItem(item);
	}

	@Override
	public void deleteItem(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteItem(id);
	}

	@Override
	public Item getOneItem(Integer id) {
		// TODO Auto-generated method stub
		return dao.getOneItem(id);
	}

	@Override
	public List<Item> getAllItem() {
		// TODO Auto-generated method stub
		return dao.getAllItem();
	}
}
