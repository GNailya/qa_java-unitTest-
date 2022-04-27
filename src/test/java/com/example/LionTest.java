package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)

public class LionTest {
    private final  String sex;
    private final boolean hasMane;

    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getManeData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},

        };
    }
    @Test
    public void hasMane() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals("Wrong hasMane value",hasMane, actual);



    }
    @Test
    public void kittenLionTest() throws Exception {
        Lion lion = new Lion("Самец");
        int kittensCount = lion.getKittens();
        assertEquals(1, kittensCount);
    }
    @Test
    public void lineFoodTest() throws Exception { // не работает
        Feline feline = new Feline();
        Lion lion = new Lion(sex);
        List<String> actualList = feline.getFood("Хищник");
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);

}}
