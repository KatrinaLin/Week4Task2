package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {

    private FizzBuzzGame game;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    @Before
    public void setUp() throws Exception {
        game = new FizzBuzzGame();
    }

    @Test
    public void should_return_1_when_have_1() {
        String result = game.sayWord(1);
        assertEquals("1", result);
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        String result = game.sayWord(3);
        assertEquals(FIZZ, result);
    }

    @Test
    public void should_return_Fizz_when_have_5() {
        String result = game.sayWord(5);
        assertEquals(BUZZ, result);
    }

    @Test
    public void should_return_Fizz_when_have_7() {
        String result = game.sayWord(7);
        assertEquals(WHIZZ, result);
    }

    @Test
    public void should_return_Fizz_when_have_9() {
        String result = game.sayWord(9);
        assertEquals(FIZZ, result);
    }

    @Test
    public void should_return_Fizz_when_contains_3() {
        String result = game.sayWord(13);
        assertEquals(FIZZ, result);

        result = game.sayWord(23);
        assertEquals(FIZZ, result);

        result = game.sayWord(35);
        assertEquals(FIZZ, result);
    }

    @Test
    public void should_return_FizzBuzz_when_multiplier_of_3_5() {
        String result = game.sayWord(15);
        assertEquals(FIZZ + BUZZ, result);

        result = game.sayWord(60);
        assertEquals(FIZZ + BUZZ, result);
    }

    @Test
    public void should_return_FizzBuzz_when_multiplier_of_3_7() {
        String result = game.sayWord(21);
        assertEquals(FIZZ + WHIZZ, result);
    }

    @Test
    public void should_return_FizzBuzz_when_multiplier_of_5_7() {
        String result = game.sayWord(70);
        assertEquals(BUZZ + WHIZZ, result);
    }

    @Test
    public void should_return_FizzBuzz_when_multiplier_of_3_5_7() {
        String result = game.sayWord(105);
        assertEquals(FIZZ + BUZZ + WHIZZ, result);
    }
}
