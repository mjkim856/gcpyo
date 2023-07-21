package com.example.test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    EventService service;

    /*
    정상작동 - jsp

    @GetMapping("/event")
    public String event() {
        return "eventjsp";
    }

    @PostMapping("/event")
    public ModelAndView event(EventDto dto) {
        ModelAndView mv = new ModelAndView();
        service.insertEvent(dto);
        mv.addObject("dto", dto);
        mv.setViewName("completejsp");
        return mv;
    }

    @PostMapping("/check")
    public ModelAndView check(String telCheck) {
        ModelAndView mv = new ModelAndView();
        EventDto dto = service.getEvent(telCheck);
        mv.addObject("dto", dto);
        mv.setViewName("insdeljsp");
        return mv;
    }

    @PostMapping("/update")
    public ModelAndView update(EventDto edto) {
        ModelAndView mv = new ModelAndView();
        service.updateEvent(edto);
        EventDto dto = service.getEvent(edto.getTel());
        mv.addObject("dto", dto);
        mv.setViewName("completejsp");
        return mv;
    }

    @GetMapping("/index")
    public String index() {
        return "indexjsp";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value="seq", required=true) int seq) {
        service.deleteEvent(seq);
        return "eventjsp";
    }

    @GetMapping ("/complete")
    public String complete() {
        return "completejsp";
    }
     */

    // index가 없는 이유 : springboot의 static은 js, html, css 등 정적 파일을 설정하는 곳이라
    // 그냥 index.html만 하면 자동으로 메인 설정되어 뜬다.

//    @GetMapping("/")
//    public String main() {
//        return "index";
//    }

    @PostMapping("/submit-form")
    @ResponseBody
    public String submitForm(@RequestBody EventDto formData) {
        // 데이터베이스에 저장하거나 처리할 작업 수행
        // 여기서는 간단히 받은 데이터를 출력하는 것으로 대체합니다.
        System.out.println("이름: " + formData.getName());
        System.out.println("나이: " + formData.getAge());
        System.out.println("성별: " + formData.getGender());
        System.out.println("전화번호: " + formData.getTel());

        service.insertEvent(formData);

        return "전송되었습니다!";
    }



//    @GetMapping("/events")
//    public String showEvents(Model model) {
//        List<EventFormData> events = eventService.getAllEvents();
//        model.addAttribute("events", events);
//        return "event-list"; // 이 부분은 View의 이름을 반환하는 것으로, Thymeleaf 템플릿을 사용할 때는 이와 같이 View의 이름을 반환합니다.
//    }

//    @GetMapping("/event")
//    public List<EventDto> getEventData() {
//        return service.getAllEvent();
//    }
//
//

















//    @PostMapping("/event")
//    public ModelAndView event(@RequestParam("name") String name,
//                              @RequestParam("gender") String gender,
//                              @RequestParam("age") String age,
//                              @RequestParam("tel") String tel) {
//        ModelAndView mv = new ModelAndView();
//        service.insertEvent(dto);
//        mv.setViewName("completejsp");
//        return mv;
//    }



//    @PostMapping("/event")
//    public ModelAndView event(EventDto dto) {
//        ModelAndView mv = new ModelAndView();
//        service.insertEvent(dto);
//        mv.setViewName("complete");
//        return mv;
//    }

//    @PostMapping("/event")
//    public EventDto event(@RequestBody EventDto dto) {
//        ModelAndView mv = new ModelAndView();
//        service.insertEvent(dto);
//        mv.setViewName("complete");
//        return dto;
//    }

//    @GetMapping ("/complete")
////    public String complete(@RequestParam("name") String name, @RequestParam("gender") int gender,  @RequestParam("age") int age,  @RequestParam("tel") int tel) {
//    public String complete() {
////        service.getEvent();
//        return "completejsp";
//    }


}
