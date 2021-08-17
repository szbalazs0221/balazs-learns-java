package test.java.algorithms;

import static main.java.algorithms.Algorithms.getLongestWord;
import static org.junit.Assert.*;
import org.junit.Test;

public class AlgorithmsTest {

    @Test
    public void getLongestWordReturnsLongestWord() {
        assertEquals("sentence", getLongestWord("My example sentence"));
    }

    @Test
    public void getLongestWordReturnsFirstLongestWordIfThereAreMultipleWithSameLength() {
        assertEquals("Hello", getLongestWord("Hello there"));
    }

    @Test
    public void getLongestWordIgnoresPunctuation() {
        assertEquals("really",getLongestWord("Hello, I am really happy to see you here!"));
    }

}
