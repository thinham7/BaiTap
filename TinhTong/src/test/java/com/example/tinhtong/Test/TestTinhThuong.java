package com.example.tinhtong.Test;

import com.example.tinhtong.Service.TinhToanService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestTinhThuong {
    TinhToanService tinhToanService = new TinhToanService();
    @Test
    public void testTinhThuong1() {
        TinhToanService tinhToanService = new TinhToanService();
        assertEquals(1, tinhToanService.tinhThuong(4, 4));
    }
    @Test
    public void testTinhThuong2() {
        TinhToanService tinhToanService = new TinhToanService();
        assertEquals(1, tinhToanService.tinhThuong(5, 5));
    }
    @Test
    public void testTinhThuong3() {
        TinhToanService tinhToanService = new TinhToanService();
        assertEquals(1, tinhToanService.tinhThuong(6, 6));
    }
    @Test
    public void testTinhThuong4() {
        TinhToanService tinhToanService = new TinhToanService();
        assertEquals(1, tinhToanService.tinhThuong(9, 9));
    }
    @Test
    public void testTinhThuong5() {
        TinhToanService tinhToanService = new TinhToanService();
        assertEquals(1, tinhToanService.tinhThuong(10, 10));
    }

}

