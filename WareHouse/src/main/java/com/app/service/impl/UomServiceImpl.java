package com.app.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUomDao;
import com.app.model.Uom;
import com.app.service.IUomService;

@Service
public class UomServiceImpl implements IUomService {

	@Autowired
	private IUomDao dao;
		@Transactional
		public Integer saveUom(Uom uom) {
			// TODO Auto-generated method stub
			return dao.saveUom(uom);
		}

		@Transactional
		public void updateUom(Uom uom) {
			// TODO Auto-generated method stub
			dao.updateUom(uom);
		}

		@Transactional
		public void deleteUom(Integer id) {
			// TODO Auto-generated method stub
			dao.deleteUom(id);
		}

		@Transactional(readOnly=true)
		public Uom getOneUom(Integer id) {
			// TODO Auto-generated method stub
			return dao.getOneUom(id);
		}

		@Transactional(readOnly=true)
		public List<Uom> getAllUoms() {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			List<Uom> uoms=dao.getAllUoms();
			//lambda, valid, parameter type is optional
					Collections.sort(uoms,(o1, o2)->o2.getId()-o1.getId());

			return uoms;
		}

}
