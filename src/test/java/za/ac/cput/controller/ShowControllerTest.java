package za.ac.cput.controller;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Show;
import za.ac.cput.factory.ShowFactory;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ShowControllerTest {
    private static Show show = ShowFactory.createShow(23, "12/11/23","12:00","");
    private final String baseURL = "http://localhost:8084/show/";
    private TestRestTemplate restTemplate;
    void create() throws IOException, InterruptedException{
        String url = baseURL + "/create";
        ResponseEntity<Show> postResponse = restTemplate.postForEntity(url, show,Show.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        Show savedShow = postResponse.getBody();
        System.out.println("Saved Data: " + savedShow);
        assertEquals(show.getShowId(),savedShow.getShowId());
    }
    @Test
    void read(){
        String url = baseURL + "/read/" + show.getShowId();
        System.out.println("URl: " + url);
        ResponseEntity<Show> response = restTemplate.getForEntity(url,Show.class);
        assertEquals(show.getShowId(),response.getBody().getShowId());
        System.out.println(response.getBody());
    }
    @Test
    void update() throws IOException, InterruptedException{
        Show updatedBooking = new Show.Builder().copy(show).setRoomNum(44).build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Updated Data: " + updatedBooking);
        ResponseEntity<Show> response = restTemplate.postForEntity(url,updatedBooking, Show.class);
        assertNotNull(response.getBody());
    }

    @Test
    void getAll() throws IOException, InterruptedException{
        String url = baseURL + "all";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show All: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }

}