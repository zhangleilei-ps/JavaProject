package org.zll.example.javalearningdemo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysLoginMapper {
    String selectById();
}
