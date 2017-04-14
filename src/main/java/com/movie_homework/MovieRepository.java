package com.movie_homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by chrisaanerud on 4/13/17.
 */
@Component
public class MovieRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Movie> listMovies(String search) {
        return jdbcTemplate.query(
                "SELECT * FROM movie WHERE lower(title) = lower(?)",
                new Object[]{search},
                (resultSet, i) -> new Movie(
                        resultSet.getString("title"),
                        resultSet.getDate("date"),
                        resultSet.getDouble("length"),
                        resultSet.getString("language"),
                        resultSet.getString("rating"),
                        resultSet.getString("country"),
                        resultSet.getDouble("budget"),
                        resultSet.getDouble("gross"),
                        resultSet.getString("released")

                )
        );

    }
}
