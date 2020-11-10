package com.wozu.Api2;

import com.wozu.Api2.Models.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.springframework.util.Assert.isInstanceOf;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DogControllerTest {

    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test(){
        Dog dog = this.restTemplate
                .getForObject("http://localhost:"
                        + port + "/api/dog", Dog.class );

        System.out.println(dog.getMessage());
        assertThat(dog, instanceOf(Dog.class));
    }
}
