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
import za.ac.cput.domain.Seat;
import za.ac.cput.factory.CinemaFactory;
import za.ac.cput.factory.MovieRoomFactory;
import za.ac.cput.factory.SeatFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CinemaControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    private Cinema cinema;
    private final String baseUrl = "http://localhost:8084/cinema/";
    @Test
    void create() {
        List<MovieRoom> movieRooms=new ArrayList<>();
        List<Seat> seats=new ArrayList<>();
        for (int i=1;i<=30;i++){
            seats.add(SeatFactory.createSeat(i,250,false));
        }
        for(int i=1;i<=20;i++){
            movieRooms.add(MovieRoomFactory.createRoom(i,true,seats));
        }
        cinema=CinemaFactory.createCinema(movieRooms);
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