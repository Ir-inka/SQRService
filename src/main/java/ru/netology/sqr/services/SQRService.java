package ru.netology.sqr.services;

public class SQRService {
    public int calcSQRS(int bordenMin, int bordenMax) {
        int total = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bordenMin) {
                if (i * i <= bordenMax) {
                    total++;

                }

            }
        }
        return total;
    }

}
