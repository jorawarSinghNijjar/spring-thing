package com.jorawarsingh.learn.h2jpajdbc.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Course ml = new Course(1, "Machine Learning", "Jorawar");
        repository.insert(ml);
        repository.insert(new Course(2, "Artificial Integlligence", "Jorawar"));
        repository.insert(new Course(3, "Java Core", "Jorawar"));
        repository.delete(ml.getId());
    }
}
