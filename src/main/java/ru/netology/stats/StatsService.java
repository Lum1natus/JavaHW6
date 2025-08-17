package ru.netology.stats;

public class StatsService {

    public long getTotalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long getMiddleSales(long[] sales) {
        return getTotalSales(sales) / sales.length;
    }

    public long getMaxSales(long[] sales) {
        int HighMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[HighMonth]) {
                HighMonth = i;
            }
        }
        return HighMonth + 1;
    }

    public long getLowSales(long[] sales) {
        int LowMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[LowMonth]) {
                LowMonth = i;
            }
        }
        return LowMonth + 1;
    }

    public long countMonthsUnderAverage(long[] sales) {
        long average = getMiddleSales(sales);  // вызываем уже готовый метод по расчету средней продажи
        long count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public long countMonthsAboveAverage(long[] sales) {
        long average = getTotalSales(sales) / sales.length; // можно и так
        long count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }


}