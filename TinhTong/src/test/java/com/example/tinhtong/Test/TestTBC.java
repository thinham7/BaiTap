package com.example.tinhtong.Test;

import com.example.tinhtong.Service.TinhTrungBinhService;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;
public class TestTBC {
    TinhTrungBinhService tinhTrungBinhService = new TinhTrungBinhService();
    @Test
    public void testTinhTrungBinh1() {
        int[] arr = {1, 2, 3, 4, 5};
        double expected = 3.0;
        double result = tinhTrungBinhService.tinhTrungBinh(arr);
        assertEquals(expected, result);
    }
    @Test
    public void testTinhTrungBinh2() {
        int[] arr = {};
        try {
            tinhTrungBinhService.tinhTrungBinh(arr);
        } catch (IllegalArgumentException e) {
            assertEquals("Mảng không được null hoặc rỗng", e.getMessage());
        }
    }
    @Test
    public void testTinhTrungBinh3() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        double expected = 3.5;
        double result = tinhTrungBinhService.tinhTrungBinh(arr);
        assertEquals(expected, result);
    }
    @Test
    public void testTinhTrungBinh4() {
        int[] arr = {10, 20, 30, 40, 50};
        double expected = 30.0;
        double result = tinhTrungBinhService.tinhTrungBinh(arr);
        assertEquals(expected, result);
    }
    @Test
    public void testTinhTrungBinh5() {
        int[] arr = {0, 0, 0, 0, 0};
        double expected = 0.0;
        double result = tinhTrungBinhService.tinhTrungBinh(arr);
        assertEquals(expected, result);
    }


}
