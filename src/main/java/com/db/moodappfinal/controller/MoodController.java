package com.db.moodappfinal.controller;

import com.db.moodappfinal.model.EmailDetails;
import com.db.moodappfinal.model.Mood;
import com.db.moodappfinal.service.EmailService;
import com.db.moodappfinal.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class MoodController {

    @Autowired
    private MoodService moodService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/new-mood")
    public Mood createMood(@RequestBody Mood mood) {
        mood.setDate(LocalDate.now());
        if(mood.getValue() < 5){
            EmailDetails details = new EmailDetails();
            details.setRecipient("ureaalex@gmail.com");
            details.setSubject("sad employee");
            details.setMsgBody(" had a bad day");
            emailService.sendSimpleMail(details);
        }
        return moodService.createMood(mood);
    }

    @GetMapping("/get-mood/{id}")
    public Mood getMoodById(@PathVariable Long id) {
        return moodService.getMoodById(id);
    }

}
