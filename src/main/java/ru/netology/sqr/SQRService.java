package ru.netology.sqr;

public class SQRService {

    public int calculate(int min, int max) {
        int qty = 0;
        for (int i = 10; i <= 99; i++) {
            int sqri = i * i;
            if (sqri >= min) {
                if (sqri <= max) {
                    qty++;
                }
            }
        }
        return qty;
    }
}
