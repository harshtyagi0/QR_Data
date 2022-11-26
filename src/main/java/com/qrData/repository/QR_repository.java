package com.qrData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qrData.entity.QR_data;

@Repository
public interface QR_repository extends JpaRepository<QR_data, Integer> {

}
