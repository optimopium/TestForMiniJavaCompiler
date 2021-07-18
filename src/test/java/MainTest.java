import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parser.Parser;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Parser parser;

    @BeforeEach
    void initialize() {
        this.parser = new Parser();
    }

    @Test
    void test1() {
        assertEquals(1 + 2, 3);
    }
}