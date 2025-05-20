package com.example.tinhtong.Test;

import com.example.tinhtong.Service.TimViTriMangService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestTimVt {
    TimViTriMangService timViTriMangService = new TimViTriMangService();
    @Test
    public void testTimViTri1() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, timViTriMangService.timViTri(arr, 3));
    }
    @Test
    public void testTimViTri2() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, timViTriMangService.timViTri(arr, 1));
    }
    @Test
    public void testTimViTri3() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, timViTriMangService.timViTri(arr, 6));
    }
    @Test
    public void testTimViTri4() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(4, timViTriMangService.timViTri(arr, 5));
    }
    @Test
    public void testTimViTri5() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(3, timViTriMangService.timViTri(arr, 4));
    }
}
