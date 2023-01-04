package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] dataSell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        System.out.println("Сумма всех продаж равна " + service.summOfSellings(dataSell));
        System.out.println("Средняя сумма продаж за год равна " + service.averageSumm(dataSell));
        System.out.println("Номер месяца с максимальной суммой продаж - " + service.numMaxSell(dataSell));
        System.out.println("Номер месяца с минимальной суммой продаж - " + service.numMinSell(dataSell));
        System.out.println("Количество месяцев с продажами ниже среднего равно " + service.quantityLessAverage(dataSell));
        System.out.println("Количество месяцев с продажами выше среднего равно " + service.quantityMoreAverage(dataSell));

    }
}