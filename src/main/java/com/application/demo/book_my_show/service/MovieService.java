package com.application.demo.book_my_show.service;

import com.application.demo.book_my_show.convertors.MovieConvertor;
import com.application.demo.book_my_show.entity.MovieEntity;
import com.application.demo.book_my_show.enums.Language;
import com.application.demo.book_my_show.repository.MovieRepository;
import com.application.demo.book_my_show.requestdtos.MovieRequestDto;
import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public String addMovie(MovieRequestDto movieRequestDto) throws Exception{
        MovieEntity movieEntity = MovieConvertor.convertShowMovieRequestDtoToMovieEntity(movieRequestDto);
        movieRepository.save(movieEntity);
        return "Movie Added Successfully";
    }
    public MovieEntity getMovieByMovieName(String movieName) throws Exception{
       MovieEntity movieEntity = movieRepository.findByMovieName(movieName);
        return movieEntity;
    }
    public List<MovieEntity> getMovieByLanguage(Language language) throws Exception{
         List<MovieEntity> movieEntityList = movieRepository.findByLanguage(language);
        return movieEntityList;
    }
}
