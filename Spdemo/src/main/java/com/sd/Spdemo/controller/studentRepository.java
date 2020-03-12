package com.sd.Spdemo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sd.Spdemo.students;

public interface studentRepository extends CrudRepository<students, Integer> {

}
