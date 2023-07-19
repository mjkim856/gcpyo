package com.example.test1.controller;

public interface EventService {
    void insertEvent(EventDto dto);
    void updateEvent(EventDto dto);
    EventDto getEvent(String tel);
    void deleteEvent(int seq);
}
