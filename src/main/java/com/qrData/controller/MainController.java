package com.qrData.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qrData.entity.QR_data;
import com.qrData.service.QR_service;

@RestController
@RequestMapping("/")
public class MainController {
	final private QR_service service;

	public MainController(QR_service service) {
		this.service = service;
	}

	@PostMapping
	private ResponseEntity<Boolean> saveQRdata(@RequestBody QR_data data) {
		return ResponseEntity.ok().body(service.saveData(data));
	}
	
	
	
}