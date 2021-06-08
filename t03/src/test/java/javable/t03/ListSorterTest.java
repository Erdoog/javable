package javable.t03;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListSorterTest {
    @Test
    void bubbleListSortCorrect() {
        var target = Arrays.asList(2, 4, -1, 2);
        var expected = Arrays.asList(-1, 2, 2, 4);
        new BubbleListSorter<Integer>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void bubbleListSortAlreadySorted() {
        var target = Arrays.asList(1, 2, 3, 4, 5);
        var expected = Arrays.asList(1, 2, 3, 4, 5);
        new BubbleListSorter<Integer>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void bubbleListSortEmptyList() {
        List<Long> target = Arrays.asList();
        List<Long> expected = Arrays.asList();
        new BubbleListSorter<Long>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void bubbleListSortNull() {
        List<Long> target = null;
        List<Long> expected = null;
        new BubbleListSorter<Long>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void bubbleListSortForSameElements() {
        List<Integer> target = Arrays.asList(0, 0, 0, 0, 0);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0);
        new BubbleListSorter<Integer>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void selectionListSortCorrect() {
        var target = Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE, 9, 8, -1, 100);
        var expected = Arrays.asList(Integer.MIN_VALUE, -1, 8, 9, 100, Integer.MAX_VALUE);
        new BubbleListSorter<Integer>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void selectionListSortAlreadySorted() {
        var target = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        new BubbleListSorter<Integer>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void selectionListSortEmptyList() {
        List<Long> target = Arrays.asList();
        List<Long> expected = Arrays.asList();
        new BubbleListSorter<Long>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void selectionListSortNull() {
        List<Long> target = null;
        List<Long> expected = null;
        new BubbleListSorter<Long>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void quickListSortCorrect() {
        var target = Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE, 9, 8, -1, 100);
        var expected = Arrays.asList(Integer.MIN_VALUE, -1, 8, 9, 100, Integer.MAX_VALUE);
        new BubbleListSorter<Integer>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void quickListSortAlreadySorted() {
        var target = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        new BubbleListSorter<Integer>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void quickListSortEmptyList() {
        List<Long> target = Arrays.asList();
        List<Long> expected = Arrays.asList();
        new BubbleListSorter<Long>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void quickListSortNull() {
        List<Long> target = null;
        List<Long> expected = null;
        new BubbleListSorter<Long>().sort(target);
        assertEquals(expected, target);
    }



    @Test
    void quickListSortForOneElement() {
        var target = Arrays.asList(0L);
        var expected = Arrays.asList(0L);
        new BubbleListSorter<Long>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void quickListSortForTwoElement() {
        var target = Arrays.asList(Long.MAX_VALUE, Long.MIN_VALUE);
        var expected = Arrays.asList(Long.MIN_VALUE, Long.MAX_VALUE);
        new BubbleListSorter<Long>().sort(target);
        assertEquals(expected, target);
    }

    @Test
    void quickListSortForThreeElement() {
        var target = Arrays.asList(BigDecimal.TEN, BigDecimal.ONE, BigDecimal.ZERO);
        var expected = Arrays.asList(BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN);
        new BubbleListSorter<BigDecimal>().sort(target);
        assertEquals(expected, target);
    }
}
