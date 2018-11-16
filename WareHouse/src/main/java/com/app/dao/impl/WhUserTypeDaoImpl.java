package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IWhUserTypeDao;
import com.app.model.WhUserType;

@Repository
public class WhUserTypeDaoImpl implements IWhUserTypeDao {

	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveWhUserType(WhUserType whUserType) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(whUserType);
	}

	@Override
	public void updateWhUserType(WhUserType whUserType) {
		// TODO Auto-generated method stub
		ht.update(whUserType);
	}

	@Override
	public void deleteWhUserType(Integer id) {
		// TODO Auto-generated method stub
		WhUserType whUserType=new WhUserType();
		whUserType.setId(id);
		ht.delete(whUserType);
	}

	@Override
	public WhUserType getOneWhUserType(Integer id) {
		// TODO Auto-generated method stub
		return  ht.get(WhUserType.class, id);
	}

	@Override
	public List<WhUserType> getAllWhUserTypes() {
		// TODO Auto-generated method stub
		return ht.loadAll(WhUserType.class);
	}
}
