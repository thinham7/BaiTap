package com.example.tinhtong.Service;

public class TinhToanService {
    public static int tinhTong(int a, int b) {
        return a + b;
    }
    public static int tinhHieu(int a, int b) {
        return a - b;
    }
    public static int tinhTich(int a, int b) {
        return a * b;
    }
    public static int tinhThuong(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0 ");
        }
        return a / b;
    }
}
