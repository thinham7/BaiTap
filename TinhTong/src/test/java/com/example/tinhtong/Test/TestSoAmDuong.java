package com.example.tinhtong.Test;
import static com.example.tinhtong.Service.KiemTraSoAmDuongService.SoAm;
import static com.example.tinhtong.Service.KiemTraSoAmDuongService.SoDuong;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.example.tinhtong.Service.KiemTraSoAmDuongService;
import org.junit.jupiter.api.Test;

public class TestSoAmDuong {
    KiemTraSoAmDuongService service;

    @Test
    public void testSoAm() {
        int so = -5;
        assertTrue(SoAm(so), "Số -5 phải là số âm");
        assertFalse(SoDuong(so), "Số -5 không phải là số dương");
    }

    @Test
    public void testSoDuong() {
        int so = 5;
        assertTrue(SoDuong(so), "Số 5 phải là số dương");
        assertFalse(SoAm(so), "Số 5 không phải là số âm");
    }

    @Test
    public void testSoKhong() {
        int so = 0;
        assertFalse(SoAm(so), "Số 0 không phải là số âm");
        assertFalse(SoDuong(so), "Số 0 không phải là số dương");
    }

    @Test
    public void testSoAmLon() {
        int so = -1000;
        assertTrue(SoAm(so), "Số -1000 phải là số âm");
        assertFalse(SoDuong(so), "Số -1000 không phải là số dương");
    }

    @Test
    public void testSoDuongLon() {
        int so = 1000;
        assertTrue(SoDuong(so), "Số 1000 phải là số dương");
        assertFalse(SoAm(so), "Số 1000 không phải là số âm");
    }
}
