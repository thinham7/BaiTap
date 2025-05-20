package com.example.tinhtong.Test;

import com.example.tinhtong.Service.KiemTraSoNguyenAmService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSoAm {

    @Test
    public void testSoAm1() {
        int sa = -5;
        boolean result = KiemTraSoNguyenAmService.SoAm(sa);
        assertTrue(result, "Expected true for negative number -5");
    }

    @Test
    public void testSoAm2() {
        int sa = -10;
        boolean result = KiemTraSoNguyenAmService.SoAm(sa);
        assertTrue(result, "Expected true for negative number -10");
    }

    @Test
    public void testSoAm3() {
        int sa = 0;
        boolean result = KiemTraSoNguyenAmService.SoAm(sa);
        assertFalse(result, "Expected false for zero");
    }

    @Test
    public void testSoAm4() {
        int sa = 15;
        boolean result = KiemTraSoNguyenAmService.SoAm(sa);
        assertFalse(result, "Expected false for positive number 15");
    }

    @Test
    public void testSoAm5() {
        int sa = Integer.MIN_VALUE;
        boolean result = KiemTraSoNguyenAmService.SoAm(sa);
        assertTrue(result, "Expected true for Integer.MIN_VALUE");
    }
}
