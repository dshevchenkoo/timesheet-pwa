package com.dshevchenkoo.timesheet.controller;

import com.dshevchenkoo.timesheet.domain.TeachingGroup;
import com.dshevchenkoo.timesheet.domain.User;
import com.dshevchenkoo.timesheet.repos.TeachingGroupRepo;
import com.sun.xml.internal.messaging.saaj.util.TeeInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private TeachingGroupRepo teachingGroupRepo;

    @GetMapping("/")
    public String greeting(Map<String, Object> model){
        return "greeting";
    }

    @GetMapping("/main")
    public String main(@RequestParam(required = false, defaultValue = "none") String filter, Model model){
        Iterable<TeachingGroup> groups = teachingGroupRepo.findAll();


        if (filter != null && !filter.isEmpty()){
            groups = teachingGroupRepo.findByNumber(filter);
        } else {
            groups = teachingGroupRepo.findAll();
        }

        model.addAttribute("groups", groups);
        model.addAttribute("filter", filter);

        return "main";
    }

    @PostMapping("/main")
    public String add(
            @AuthenticationPrincipal User user,
            @RequestParam String number,
            Map<String, Object> model
    ){
        TeachingGroup teachingGroup = new TeachingGroup(number, user);

        teachingGroupRepo.save(teachingGroup);

        Iterable<TeachingGroup> groups = teachingGroupRepo.findAll();

        model.put("groups", groups);

        return "main";
    }
}
