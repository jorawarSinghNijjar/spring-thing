package com.jorawarsingh.learn.h2jpajdbc.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate template;

    private static String INSERT_QUERY =
            """
            insert into course (id, name, author)
                        values (?,?,?);
            """;
    private static String DELETE_QUERY =
            """
            delete from course where id=? ;
            """;

    public void insert(Course course){
        template.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(long courseId){
        template.update(DELETE_QUERY,courseId);
    }
}
