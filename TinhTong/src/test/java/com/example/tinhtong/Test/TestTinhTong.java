package com.example.tinhtong.Test;
import com.example.tinhtong.Service.TinhToanService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTinhTong {
    TinhToanService tinhToanService = new TinhToanService();
    @Test
    public void tinhTong1() {
        assertEquals(14, tinhToanService.tinhTong(4, 10));
    }
    @Test
    public void tinhTong2() {
        assertEquals(15, tinhToanService.tinhTong(5, 10));
    }
    @Test
    public void tinhTong3() {
        assertEquals(16, tinhToanService.tinhTong(6, 10));
    }
    @Test
    public void tinhTong4() {
        assertEquals(19, tinhToanService.tinhTong(9, 10));
    }
    @Test
    public void tinhTong5() {
        assertEquals(20, tinhToanService.tinhTong(10, 10));
    }

}
