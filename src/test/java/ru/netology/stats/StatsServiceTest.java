package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

//    @ParameterizedTest
//    @CsvFileSource(files="src/test/resources/DataOfSellings")

    @Test
    public void testSummOfSellings() {
        StatsService service = new StatsService();

        int[] dataSell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumm = 180;
        Assertions.assertEquals(expectedSumm, service.summOfSellings(dataSell));
    }

    @Test
    public void testAverageSumm() {
        StatsService service = new StatsService();

        int[] dataSell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectAvSumm = 15;
        Assertions.assertEquals(expectAvSumm, service.averageSumm(dataSell));
    }

    @Test
    public void testNumMaxSell() {
        StatsService service = new StatsService();

        int[] dataSell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumMax = 7;
        Assertions.assertEquals(expectedNumMax, service.numMaxSell(dataSell));
    }

    @Test
    public void testNumMinSell() {
        StatsService service = new StatsService();

        int[] dataSell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumMin = 8;
        Assertions.assertEquals(expectedNumMin, service.numMinSell(dataSell));
    }

    @Test
    public void testQuantityLessAverage() {
        StatsService service = new StatsService();

        int[] dataSell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuanLess = 5;
        Assertions.assertEquals(expectedQuanLess, service.quantityLessAverage(dataSell));
    }

    @Test
    public void testQuantityMoreAverage() {
        StatsService service = new StatsService();

        int[] dataSell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuanMore = 5;
        Assertions.assertEquals(expectedQuanMore, service.quantityMoreAverage(dataSell));
    }
}
