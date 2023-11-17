package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Infomation;

public interface InfomationDAO extends JpaRepository<Infomation, String> {

}
