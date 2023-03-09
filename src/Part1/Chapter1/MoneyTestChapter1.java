package Part1.Chapter1;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class MoneyTestChapter1 {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);

        five.times(2);
        assertEquals(10, five.amount);
    }
}
