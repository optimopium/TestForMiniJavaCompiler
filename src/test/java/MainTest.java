import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parser.Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Parser parser;

    @BeforeEach
    void initialize() {
        this.parser = new Parser();
    }

    @Test
    void test1() {
        try {
            // start parsing
            parser.startParse(new Scanner(new File("src/main/resources/code")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}