package com.example.tinhtong.Test;

import com.example.tinhtong.Service.TinhToanService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTinhHieu {
    TinhToanService tinhToanService = new TinhToanService();
    @Test
    public void tinhHieu1() {
        assertEquals(6, tinhToanService.tinhHieu(10, 4));
    }
    @Test
    public void tinhHieu2() {
        assertEquals(5, tinhToanService.tinhHieu(10, 5));
    }
    @Test
    public void tinhHieu3() {
        assertEquals(4, tinhToanService.tinhHieu(10, 6));
    }
    @Test
    public void tinhHieu4() {
        assertEquals(1, tinhToanService.tinhHieu(10, 9));
    }
    @Test
    public void tinhHieu5() {
        assertEquals(0, tinhToanService.tinhHieu(10, 10));
    }

}
