package com.example.sweater.controller;

import com.example.sweater.domain.Timesheet;
import com.example.sweater.repos.TimesheetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class TimesheetController {

    @Autowired
    private TimesheetRepo timesheetRepo;

    @GetMapping("/timesheet")
    public String main(@RequestParam(required = false, defaultValue = "") String filter, Model model) {
        Iterable<Timesheet> timesheets = timesheetRepo.findAll();

        if (filter != null && !filter.isEmpty()) {
            timesheets = timesheetRepo.findByNumberGroup(filter);
        } else {
            timesheets = timesheetRepo.findAll();
        }

        model.addAttribute("timesheets", timesheets);
        model.addAttribute("filter", filter);

        return "timesheet";
    }

    @PostMapping("/timesheet")
    public String addTimesheet(
            @RequestParam(required = false, defaultValue = "") String numberGroup,
            @RequestParam(required = false, defaultValue = "") String day,
            @RequestParam(required = false, defaultValue = "") String firstLessonName,
            @RequestParam(required = false, defaultValue = "") String firstTeacherName,
            @RequestParam(required = false, defaultValue = "") Integer firstClassroom,
            @RequestParam(required = false, defaultValue = "") String secondLessonName,
            @RequestParam(required = false, defaultValue = "") String secondTeacherName,
            @RequestParam(required = false, defaultValue = "") Integer secondClassroom,
            @RequestParam(required = false, defaultValue = "") String therdLessonName,
            @RequestParam(required = false, defaultValue = "") String therdTeacherName,
            @RequestParam(required = false, defaultValue = "") Integer therdClassroom,
            @RequestParam(required = false, defaultValue = "") String forthLessonName,
            @RequestParam(required = false, defaultValue = "") String forthTeacherName,
            @RequestParam(required = false, defaultValue = "") Integer forthClassroom,
            @RequestParam(required = false, defaultValue = "") String fifthLessonName,
            @RequestParam(required = false, defaultValue = "") String fifthTeacherName,
            @RequestParam(required = false, defaultValue = "") Integer fifthClassroom,
            @RequestParam(required = false, defaultValue = "") String sixthLessonName,
            @RequestParam(required = false, defaultValue = "") String sixthTeacherName,
            @RequestParam(required = false, defaultValue = "") Integer sixthClassroom,
            @RequestParam Map<String, Object> model
    ){

        Timesheet timesheet = new Timesheet(numberGroup,  day,  firstLessonName,  secondLessonName,  therdLessonName,  forthLessonName,  fifthLessonName,  sixthLessonName,  firstTeacherName,  secondTeacherName,  therdTeacherName,  forthTeacherName,  fifthTeacherName,  sixthTeacherName, firstClassroom, secondClassroom, therdClassroom, forthClassroom, fifthClassroom, sixthClassroom);

        timesheetRepo.save(timesheet);

        Iterable<Timesheet> messages = timesheetRepo.findAll();

        model.put("messages", messages);

        return "timesheet";
    }
}