package com.db.moodappfinal.model;

import javax.persistence.OneToMany;
import java.util.List;

public class User {
    @OneToMany
    private List<Mood> moods;
}
