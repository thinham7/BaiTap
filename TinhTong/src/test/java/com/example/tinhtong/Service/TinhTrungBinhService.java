package com.example.tinhtong.Service;

public class TinhTrungBinhService {
    public static double tinhTrungBinh(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được null hoặc rỗng");
        }
        double tong = 0;
        for (int num : arr) {
            tong += num;
        }
        return tong / arr.length;
    }
}
