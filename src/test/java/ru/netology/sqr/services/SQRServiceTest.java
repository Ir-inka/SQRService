package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rootRange.csv")
    public void rootRange(int expected, int bordenMin, int bordenMax) {
        SQRService service = new SQRService();
        int actual = service.calcSQRS(bordenMin, bordenMax);

        Assertions.assertEquals(expected, actual);

    }
}
