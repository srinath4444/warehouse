package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUomDao;
import com.app.model.Uom;

@Repository
public class UomDaoImpl implements IUomDao {

	@Autowired
	private HibernateTemplate ht;
		@Override
		public Integer saveUom(Uom uom) {
			// TODO Auto-generated method stub
			return (Integer)ht.save(uom);
		}

		@Override
		public void updateUom(Uom uom) {
			// TODO Auto-generated method stub
			ht.update(uom);
		}

		@Override
		public void deleteUom(Integer id) {
			// TODO Auto-generated method stub
			Uom uom=new Uom();
			uom.setId(id);
			ht.delete(uom);
		}

		@Override
		public Uom getOneUom(Integer id) {
			// TODO Auto-generated method stub
			return ht.get(Uom.class, id);
		}

		@Override
		public List<Uom> getAllUoms() {
			// TODO Auto-generated method stub
			return ht.loadAll(Uom.class);
		}

}
