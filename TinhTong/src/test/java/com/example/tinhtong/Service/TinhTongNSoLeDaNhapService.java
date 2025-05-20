package com.example.tinhtong.Service;

public class TinhTongNSoLeDaNhapService {
    public static int tinhTong(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được null hoặc rỗng");
        }
        int tong = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                tong += num;
            }
        }
        return tong;
    }
}