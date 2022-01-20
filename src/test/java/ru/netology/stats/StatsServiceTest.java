package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void shouldCalculatorSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expendet = 180;

        int actual = service.calculatorSum(sales);

        assertEquals(expendet, actual);

    }

    @Test
    public void shouldCalculatorAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expendet = 15;

        int actual = service.calculatorAverage(sales);

        assertEquals(expendet, actual);

    }

    @Test
    public void shouldCalculatorMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expendet = 8;

        long actual = service.calculatorMaxSales(sales);

        assertEquals(expendet, actual);
    }

    @Test
    public void shouldCalculatorMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expendet = 9;

        long actual = service.calculatorMinSales(sales);

        assertEquals(expendet, actual);

    }

    @Test
    public void shoudCalculatorMonthBelowAverage() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expendet = 5;

        int actual = service.calculatorMonthBelowAverage(sales);

        assertEquals(expendet, actual);

    }

    @Test
    public void shoudCalculatorMonthAboveAverage() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expendet = 5;

        int actual = service.calculatorMonthAboveAverage(sales);

        assertEquals(expendet, actual);

    }
}





