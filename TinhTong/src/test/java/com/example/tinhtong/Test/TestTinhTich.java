package com.example.tinhtong.Test;

import com.example.tinhtong.Service.TinhToanService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestTinhTich {
    TinhToanService tinhToanService = new TinhToanService();
    @Test
    public void testTinhTich1() {
        assertEquals(40, TinhToanService.tinhTich(4, 10));
    }
    @Test
    public void testTinhTich2() {
        assertEquals(50, TinhToanService.tinhTich(5, 10));
    }
    @Test
    public void testTinhTich3() {
        assertEquals(60, TinhToanService.tinhTich(6, 10));
    }
    @Test
    public void testTinhTich4() {
        assertEquals(90, TinhToanService.tinhTich(9, 10));
    }
    @Test
    public void testTinhTich5() {
        assertEquals(100, TinhToanService.tinhTich(10, 10));
    }
}
