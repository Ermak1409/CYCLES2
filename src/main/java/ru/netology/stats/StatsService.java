package ru.netology.stats;

public class StatsService {

    public int calculatorSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculatorAverage(int[] sales) {
        return calculatorSum(sales) / sales.length;
    }

    public int calculatorMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculatorMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculatorMonthBelowAverage(int[] sales) {

        int summonth = 0;
        int average = calculatorAverage(sales);
        for (int sale : sales) {
            if (average > sale) {
                summonth = summonth + 1;
            }

        }
        return summonth;
    }

    public int calculatorMonthAboveAverage(int[] sales) {

        int summonth = 0;
        int average = calculatorAverage(sales);
        for (int sale : sales) {
            if (average < sale) {
                summonth = summonth + 1;
            }

        }
        return summonth;
    }
}
