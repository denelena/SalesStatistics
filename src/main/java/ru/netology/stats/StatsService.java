package ru.netology.stats;

public class StatsService {
    long calculateTotalSales(long[] monthlySales) {
        long accumulator = 0;
        for (long currentSale : monthlySales) {
            accumulator += currentSale;
        }
        return accumulator;
    }

    double calculateAverageSales(long[] monthlySales) {
        return calculateTotalSales(monthlySales) / monthlySales.length;
    }

    int getMonthOfMaxSales(long[] monthlySales) {
        int monthOfMaxSales = 0;
        for (int monthNo = 0; monthNo < monthlySales.length; monthNo++) {
            if (monthlySales[monthNo] >= monthlySales[monthOfMaxSales]) {
                monthOfMaxSales = monthNo;
            }
        }
        return monthOfMaxSales + 1; //1-based
    }

    int getMonthOfMinSales(long[] monthlySales) {
        int monthOfMinSales = 0;
        for (int monthNo = 0; monthNo < monthlySales.length; monthNo++) {
            if (monthlySales[monthNo] <= monthlySales[monthOfMinSales]) {
                monthOfMinSales = monthNo;
            }
        }
        return monthOfMinSales + 1; //1-based
    }

    int getNumberOfMonthsBelowAvegage(long[] monthlySales) {
        double averageSale = calculateAverageSales(monthlySales);
        int monthsCount = 0;
        for (long currSale : monthlySales) {
            if (currSale < averageSale) {
                monthsCount++;
            }
        }
        return monthsCount;
    }

    int getNumberOfMonthsAboveAvegage(long[] monthlySales) {
        double averageSale = calculateAverageSales(monthlySales);
        int monthsCount = 0;
        for (long currSale : monthlySales) {
            if (currSale > averageSale) {
                monthsCount++;
            }
        }
        return monthsCount;
    }
}
