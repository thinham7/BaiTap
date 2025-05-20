package com.example.tinhtong.Service;

public class TinhTongNSoDaNhapService {
    public static int tinhTong(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được null hoặc rỗng");
        }
        int tong = 0;
        for (int num : arr) {
            tong += num;
        }
        return tong;
    }
}
