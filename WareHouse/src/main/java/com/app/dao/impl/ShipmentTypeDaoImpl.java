package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;

@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {

	@Autowired
	private HibernateTemplate ht;
		@Override
		public Integer saveShipmentType(ShipmentType shipmentType) {
			// TODO Auto-generated method stub
			return (Integer)ht.save(shipmentType);
		}

		@Override
		public void updateShipmentType(ShipmentType shipmentType) {
			// TODO Auto-generated method stub
			ht.update(shipmentType);
			
		}

		@Override
		public void deleteShipmentType(Integer id) {
			// TODO Auto-generated method stub
			ShipmentType shipmentType=new ShipmentType();
			shipmentType.setId(id);
			ht.delete(shipmentType);
		}

		@Override
		public ShipmentType getOneShipmentType(Integer id) {
			// TODO Auto-generated method stub
			return ht.get(ShipmentType.class, id);
		}

		@Override
		public List<ShipmentType> getAllShipmentTypes() {
			// TODO Auto-generated method stub
			return ht.loadAll(ShipmentType.class);
		}

}
