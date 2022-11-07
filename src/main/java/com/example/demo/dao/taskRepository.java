package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Task;

public interface taskRepository extends JpaRepository<Task,Long>{

}
