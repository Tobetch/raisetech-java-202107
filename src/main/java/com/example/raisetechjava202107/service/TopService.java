package com.example.raisetechjava202107.service;

import java.util.List;

import com.example.raisetechjava202107.domain.Task;
import com.example.raisetechjava202107.mapper.TaskMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopService {

    @Autowired
    TaskMapper taskMapper;

    public List<Task> getAllTasks() {
        return taskMapper.findAll();
    }

    public Task getTask(int id) {
        return taskMapper.findById(id);
    }

}
