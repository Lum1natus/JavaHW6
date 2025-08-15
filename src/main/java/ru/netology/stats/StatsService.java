package ru.netology.stats;

public class StatsService {

    public long getTotalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total = total + sale;
        }
        return total;
    }

    public long getMiddleSales(long[] sales) {
        long total1 = 0;
        long total = getTotalSales(sales);
        total1 = total / (sales.length);
        return total1;
    }

    public long getMaxSales(long[] sales) {
        int HighMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[HighMonth]) {
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
        long average = getTotalSales(sales) / sales.length;
        long count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public long countMonthsAboveAverage(long[] sales) {
        long average = getTotalSales(sales) / sales.length;
        long count1 = 0;
        for (long sale : sales) {
            if (sale > average) {
                count1++;
            }
        }
        return count1;
    }


}