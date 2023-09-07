package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Cinema;
import za.ac.cput.domain.MovieRoom;
import za.ac.cput.factory.CinemaFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CinemaControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;
    private List<MovieRoom> movieRooms=new ArrayList<>();
    private Cinema cinema=CinemaFactory.createCinema(movieRooms);
    private final String baseUrl = "http://localhost:8084/cinema/";
    @Test
    void create() {
        String url = baseUrl + "create";
        ResponseEntity<Cinema> responseEntity = testRestTemplate.postForEntity(url, cinema, Cinema.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
        System.out.println(responseEntity.getBody());
    }

    @Test
    void read() {
        String url = baseUrl + "123";
        ResponseEntity<Cinema> responseEntity = testRestTemplate.getForEntity(url,Cinema.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
        System.out.println(responseEntity.getBody());
    }

    @Test
    void update() {
    }
    @Test
    void getAll(){

    }
}