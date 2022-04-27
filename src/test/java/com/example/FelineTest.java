package com.example;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void felineFoodTest() throws Exception {
        List<String> actualList = feline.eatMeat();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void felineFamalyTest() {
        String actual= feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void felineKittensTest() {
        int actualKittens = feline.getKittens();
        int expectedNumberOfKittens = 1;
        assertEquals(expectedNumberOfKittens, actualKittens);
    }


}
