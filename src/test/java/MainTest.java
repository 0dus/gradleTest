import org.example.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    void testPrintNumbers() {
        // Capture the console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            Main main = new Main();
            main.printNumbers();
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }

        String output = outContent.toString();

        // Verify some expected output
        assertTrue(output.contains("i = 1"));
        assertTrue(output.contains("i = 5"));
    }
}
