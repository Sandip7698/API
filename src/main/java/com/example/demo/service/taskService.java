package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.Taskdto;
import com.example.demo.model.Task;

public interface taskService  {

	ResponseEntity<String> saveinfo(Taskdto taskdto);

	Optional<Task> getById(Long userId);


    Optional<Task> getByFirstName(String firstName);

	ResponseEntity<String> updatedata(Long userId, Taskdto taskdto);

	ResponseEntity<String> deleteById(Long userId);

	List<Task> all();
}
