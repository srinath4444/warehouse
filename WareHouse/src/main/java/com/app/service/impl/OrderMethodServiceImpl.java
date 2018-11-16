package com.app.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IOrderMethodDao;
import com.app.model.OrderMethod;
import com.app.service.IOrderMethodService;

@Service
public class OrderMethodServiceImpl implements IOrderMethodService {

	@Autowired
	private IOrderMethodDao dao;
		@Transactional
		public Integer saveOrderMethod(OrderMethod orderMethod) {
			// TODO Auto-generated method stub
			return dao.saveOrderMethod(orderMethod);
		}

		@Transactional
		public void updateOrderMethod(OrderMethod orderMethod) {
			// TODO Auto-generated method stub
			dao.updateOrderMethod(orderMethod);
		}

		@Transactional
		public void deleteOrderMethod(Integer id) {
			// TODO Auto-generated method stub
			dao.deleteOrderMethod(id);
		}

		@Transactional(readOnly=true)
		public OrderMethod getOneOrderMethod(Integer id) {
			// TODO Auto-generated method stub
			return dao.getOneOrderMethod(id);
		}

		@Transactional(readOnly=true)
		public List<OrderMethod> getAllOrderMethods() {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			List<OrderMethod> orderMethods=dao.getAllOrderMethods();
			//lambda, valid, parameter type is optional
					Collections.sort(orderMethods,(o1, o2)->o2.getId()-o1.getId());

			return orderMethods;
		}

	
}
