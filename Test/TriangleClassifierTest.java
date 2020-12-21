import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("2-2-2")
    void triangle222() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam Giac Deu";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("2-2-3")
    void triangle223() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam Giac Can";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("3-4-5")
    void triangle345() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam Giac Thuong";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("8-2-3")
    void triangle823() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Khong Phai La Tam Giac";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("-1-2-1")
    void triangle121() {
        int a = -1;
        int b = 2;
        int c = 3;
        String expected = "Khong Phai La Tam Giac";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("0-1-1")
    void triangle011() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Khong Phai La Tam Giac";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }
}