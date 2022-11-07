package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dao.taskRepository;
import com.example.demo.dto.Taskdto;
import com.example.demo.model.Task;
import com.example.demo.service.taskService;
@Service
public class TaskServiceImpl implements taskService {
	@Autowired
taskRepository taskRepository;
	public ResponseEntity<String> saveinfo(Taskdto taskdto) {
		int min=0;
		int max=1000;
		long random=(long) (Math.random() * (max - min + 1) + min);
		Task task=new Task();
		task.setRandomId(random);
		task.setFullName(taskdto.getFullName());
		task.setFirstName(taskdto.getFirstName());
		task.setLastName(taskdto.getLastName());
		task.setEmail(taskdto.getEmail());
		task.setPhoneNo(taskdto.getPhoneNo());
		taskRepository.save(task);
		return  new ResponseEntity<>("200 SUCCESSFULL REGISTERED",HttpStatus.OK); 
	}
	@Override
	public Optional<Task> getById(Long userId) {
		return taskRepository.findById(userId);
	
	}

	
}
