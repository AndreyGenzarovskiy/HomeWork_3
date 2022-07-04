package ua.nix.genzarovskiy.hw3;
import static ua.nix.genzarovskiy.hw3.LessonEnd.GetLessonEnd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LessonEndTest {
    @Test
    void getLessonEnd() {
        int numOfLesson = 2;
        String expected = "10 35";
        String actual = GetLessonEnd(numOfLesson);
        assertEquals(expected, actual, "Calculated value is wrong");
    }
}