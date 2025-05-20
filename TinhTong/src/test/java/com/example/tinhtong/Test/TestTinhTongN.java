package com.example.tinhtong.Test;

import com.example.tinhtong.Service.TinhTongNSoDaNhapService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestTinhTongN {
   TinhTongNSoDaNhapService TinhTongNSoDaNhap;
   @Test
    public void testTinhTongN1() {
         int [] arr = {1, 2, 3, 4, 5};
         int expected = 15;
         int result = TinhTongNSoDaNhap.tinhTong(arr);
         assertEquals(expected, result);
    }
    @Test
    public void testTinhTongN2() {
         int [] arr = {0, 0, 0, 0, 0};
         int expected = 0;
         int result = TinhTongNSoDaNhap.tinhTong(arr);
         assertEquals(expected, result);
    }
    @Test
    public void testTinhTongN3() {
         int [] arr = {1, 2, 3, 4, 5, 6};
         int expected = 21;
         int result = TinhTongNSoDaNhap.tinhTong(arr);
         assertEquals(expected, result);
    }
    @Test
    public void testTinhTongN4() {
         int [] arr = {10, 20, 30, 40, 50};
         int expected = 150;
         int result = TinhTongNSoDaNhap.tinhTong(arr);
         assertEquals(expected, result);
    }
    @Test
    public void testTinhTongN5() {
         int [] arr = {};
         try {
             TinhTongNSoDaNhap.tinhTong(arr);
         } catch (IllegalArgumentException e) {
             assertEquals("Mảng không được null hoặc rỗng", e.getMessage());
         }
    }


}
