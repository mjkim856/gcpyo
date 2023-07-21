package com.example.test1.controller;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EventDao {
    void insertEvent(EventDto dto);
    void updateEvent(EventDto dto);
    EventDto getEvent(String tel);
    void deleteEvent(int seq);
    List<EventDto> getAllEvent();

}
