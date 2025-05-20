package com.example.tinhtong.Test;

import com.example.tinhtong.Service.TinhTongNSoLeDaNhapService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestTinhTongNSoLe {
    TinhTongNSoLeDaNhapService tinhTongNSoLeDaNhapService;
    @Test
    public void testTinhTongNSoLe1() {
        int [] arr = {1, 3, 5, 7, 9};
        int expected = 25;
        int actual = tinhTongNSoLeDaNhapService.tinhTong(arr);
        assertEquals(expected, actual);
    }
    @Test
    public void testTinhTongNSoLe2() {
        int [] arr = {1, 3, 5, 7, 9, 11};
        int expected = 36;
        int actual = tinhTongNSoLeDaNhapService.tinhTong(arr);
        assertEquals(expected, actual);
    }
    @Test
    public void testTinhTongNSoLe3() {
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int expected = 16;
        int actual = tinhTongNSoLeDaNhapService.tinhTong(arr);
        assertEquals(expected, actual);
    }
    @Test
    public void testTinhTongNSoLe4() {
        int [] arr = {1, 3, 5, 7, 9, 11, 13};
        int expected = 49;
        int actual = tinhTongNSoLeDaNhapService.tinhTong(arr);
        assertEquals(expected, actual);
    }
}
