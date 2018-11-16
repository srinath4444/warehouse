package com.app.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {

	@Autowired
	private IShipmentTypeDao dao;
		@Transactional
		public Integer saveShipmentType(ShipmentType shipmentType) {
			// TODO Auto-generated method stub
			return dao.saveShipmentType(shipmentType);
		}

		@Transactional
		public void updateShipmentType(ShipmentType shipmentType) {
			// TODO Auto-generated method stub
			dao.updateShipmentType(shipmentType);
		}

		@Transactional
		public void deleteShipmentType(Integer id) {
			// TODO Auto-generated method stub
			dao.deleteShipmentType(id);
		}

		@Transactional(readOnly=true)
		public ShipmentType getOneShipmentType(Integer id) {
			// TODO Auto-generated method stub
			return dao.getOneShipmentType(id);
		}

		@Transactional(readOnly=true)
		public List<ShipmentType> getAllShipmentTypes() {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			List<ShipmentType> shipmentTypes=dao.getAllShipmentTypes();
			//lambda, valid, parameter type is optional
					Collections.sort(shipmentTypes,(o1, o2)->o2.getId()-o1.getId());

			return shipmentTypes;
		}


}
