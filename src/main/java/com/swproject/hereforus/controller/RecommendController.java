package com.swproject.hereforus.controller;

import com.swproject.hereforus.dto.FestivalDto;
import com.swproject.hereforus.dto.MovieDto;
import com.swproject.hereforus.dto.PerformanceDto;
import com.swproject.hereforus.dto.WeatherDto;
import com.swproject.hereforus.service.RecommendService;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.Document;
import java.util.List;

@RestController
@RequestMapping("/recommend")
public class RecommendController {

    @Autowired
    private RecommendService recommendService;

    @Hidden
    @GetMapping("/festival")
    public List<FestivalDto> getFestival() throws Exception  {
        return recommendService.fetchFestivals();
    }

    @Hidden
    @GetMapping("/movie")
    public List<MovieDto> getMovie() throws Exception {
        return recommendService.fetchMovies();
    }

    @Hidden
    @GetMapping("/weather")
    public WeatherDto getWeather() throws Exception {
        return recommendService.fetchTodayWeather();
    }

    @Hidden
    @GetMapping("/performance")
    public List<PerformanceDto> getPerformance() throws Exception {
        return recommendService.fetchPerformance();
    }
}