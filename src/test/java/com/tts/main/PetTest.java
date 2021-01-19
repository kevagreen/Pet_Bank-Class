package com.tts.main;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PetTest {
     Pet myPet = new Pet();
//     myPet.setPetName("Apollo");
//     myPet.setPetAge(3);
//     myPet.setPetLocation("Foster");
//     myPet.setPetType("unknown");

    @BeforeEach
    void setUp(){
        System.out.println("Testing");
    }
    @Test
    void petName(){
     String expected = "Apollo";
     String actual = myPet.getPetName();
     assertEquals(expected, actual);
    }
    @Test
    void petAge(){
     int expected = 3;
     int actual = myPet.getPetAge();
     assertEquals(expected, actual);
    }
}
