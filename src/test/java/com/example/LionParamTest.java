package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {
    private final  String sex;
    private final boolean hasMane;
    Feline feline = new Feline();

    public LionParamTest(String sex, boolean hasMane) {
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

        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals("Wrong hasMane value",hasMane, actual);
    }
}