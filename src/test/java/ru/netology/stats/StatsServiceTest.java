package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldCalculateTotalSales() {
        StatsService sService = new StatsService();
        long[] salesMonthlyData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long totalSales = sService.calculateTotalSales(salesMonthlyData);
        long expected = 180;
        Assertions.assertEquals(expected, totalSales);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService sService = new StatsService();
        long[] salesMonthlyData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double averageSales = sService.calculateAverageSales(salesMonthlyData);
        double expected = 15.0;
        Assertions.assertEquals(expected, averageSales);
    }

    @Test
    void shouldGetMaxSalesMonth() {
        StatsService sService = new StatsService();
        long[] salesMonthlyData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthNo = sService.getMonthOfMaxSales(salesMonthlyData);
        int expected = 8;
        Assertions.assertEquals(expected, monthNo);
    }

    @Test
    void shouldGetMinSalesMonth() {
        StatsService sService = new StatsService();
        long[] salesMonthlyData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthNo = sService.getMonthOfMinSales(salesMonthlyData);
        int expected = 9;
        Assertions.assertEquals(expected, monthNo);
    }

    @Test
    void shouldGetMonthsAboveAverage() {
        StatsService sService = new StatsService();
        long[] salesMonthlyData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthCount = sService.getNumberOfMonthsAboveAvegage(salesMonthlyData);
        int expected = 5;
        Assertions.assertEquals(expected, monthCount);
    }

    @Test
    void shouldGetMonthsBelowAverage() {
        StatsService sService = new StatsService();
        long[] salesMonthlyData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthCount = sService.getNumberOfMonthsAboveAvegage(salesMonthlyData);
        int expected = 5;
        Assertions.assertEquals(expected, monthCount);
    }
}
