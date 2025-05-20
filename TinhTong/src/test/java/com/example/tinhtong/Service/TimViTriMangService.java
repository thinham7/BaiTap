package com.example.tinhtong.Service;

public class TimViTriMangService {
    public static int timViTri(int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được null hoặc rỗng");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
