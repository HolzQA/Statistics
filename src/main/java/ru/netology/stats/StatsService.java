package ru.netology.stats;

public class StatsService {

    public int summOfSellings(int[] dataSell) {
        int sum = dataSell[0];
        for (int i = 1; i < dataSell.length; i++) {
            sum = sum + dataSell[i];
        }
        return sum;
    }

    public int averageSumm(int[] dataSell) {

        return summOfSellings(dataSell) / dataSell.length;
    }

    public int numMaxSell(int[] dataSell) {
        int max = 0;
        for (int i = 1; i < dataSell.length; i++) {
            if (dataSell[i] >= dataSell[max]) {
                max = i;
            }
        }
        return max;
    }

    public int numMinSell(int[] dataSell) {
        int min = 0;
        for (int i = 1; i < dataSell.length; i++) {
            if (dataSell[i] <= dataSell[min]) {
                min = i;
            }
        }
        return min;
    }

    public int quantityLessAverage(int[] dataSell) {
        int quan = 0;
        for (int d : dataSell) {
            if (d < averageSumm(dataSell)) {
                quan = quan + 1;
            }
        }
        return quan;
    }

    public int quantityMoreAverage(int[] dataSell) {
        int quan = 0;
        for (int d : dataSell) {
            if (d > averageSumm(dataSell)) {
                quan = quan + 1;
            }
        }
        return quan;
    }

}
