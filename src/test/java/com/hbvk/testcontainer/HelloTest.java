package com.hbvk.testcontainer;

import com.hbvk.testcontainer.repo.HelloRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloTest {
    @Autowired
    HelloRepository helloRepository;

    @Test
    void testHelloCount() {
        assertEquals(1, helloRepository.count());
    }

}