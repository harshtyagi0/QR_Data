package com.qrData.service.impl;

import org.springframework.stereotype.Service;

import com.qrData.entity.QR_data;
import com.qrData.repository.QR_repository;
import com.qrData.service.QR_service;

@Service
public class QR_serviceImpl implements QR_service {

	final private QR_repository repository;

	public QR_serviceImpl(QR_repository repository) {
		this.repository = repository;
	}

	@Override
	public boolean saveData(QR_data data) {
		try {
			repository.save(data);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
