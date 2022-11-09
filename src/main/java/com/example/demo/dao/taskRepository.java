package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Task;

import java.util.Optional;

public interface taskRepository extends JpaRepository<Task,Long>{

    Optional<Task> findByFirstName(String firstName);
}
