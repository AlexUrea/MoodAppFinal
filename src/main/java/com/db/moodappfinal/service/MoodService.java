package com.db.moodappfinal.service;

import com.db.moodappfinal.model.Mood;
import com.db.moodappfinal.repository.MoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoodService {

    @Autowired
    private MoodRepository moodRepository;


    public Mood getMoodById(Long id) {
        return moodRepository.findById(id).get();
    }

    public Mood getMoodByDate(String date) {
        return moodRepository.getAllByDate(date);
    }

    public Mood getMoodByDateAndId(String date, Long id) {
        return moodRepository.getAllByDateAndId(date, id);
    }

    public Mood createMood(Mood mood) {
        return moodRepository.save(mood);
    }

    public void save(Mood mood) {
        moodRepository.save(mood);
    }

    public void delete(Long id) {
        moodRepository.deleteById(id);
    }


    public List<Mood> getMoods() {
        return moodRepository.findAll();
    }
}
