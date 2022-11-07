package com.example.demo.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.Taskdto;
import com.example.demo.model.Task;

public interface taskService  {

	ResponseEntity<String> saveinfo(Taskdto taskdto);

	Optional<Task> getById(Long userId);



}
