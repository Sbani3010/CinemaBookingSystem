package za.ac.cput.controller;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Movie;
import za.ac.cput.util.ApiRequest;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MovieControllerTest {
@Autowired
private TestRestTemplate testRestTemplate;

    private final String baseUrl = "http://localhost:8084/movie/";
    @Test
    void a_create() throws IOException, InterruptedException {
        List<Movie> list= ApiRequest.movieList();
        for(int i=0;i<list.size();i++){
            String url = baseUrl + "create";
            ResponseEntity<Movie> responseEntity = testRestTemplate.postForEntity(url, list.get(i), Movie.class);
            assertNotNull(responseEntity);
            assertNotNull(responseEntity.getBody());
            System.out.println(list.get(i));
        }
    }
}