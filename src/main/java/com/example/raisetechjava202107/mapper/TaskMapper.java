package com.example.raisetechjava202107.mapper;

import java.util.List;

import com.example.raisetechjava202107.domain.Task;

import org.apache.ibatis.annotations.Mapper;
// import org.apache.ibatis.annotations.Select;

@Mapper
public interface TaskMapper {

    // @Select("select * from task")
    List<Task> findAll();

}
