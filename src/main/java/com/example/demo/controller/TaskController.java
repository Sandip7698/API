package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Taskdto;
import com.example.demo.model.Task;
import com.example.demo.service.taskService;

@RestController
public class TaskController {
@Autowired
taskService taskService;

@PostMapping("/save")
ResponseEntity<String> saveuser(@RequestBody Taskdto taskdto){
	
return taskService.saveinfo(taskdto);
}

@GetMapping("/findById/{userId}")
public Optional<Task> getByid(@PathVariable ("userId")Long userId){
    return taskService.getById(userId);
}

}
