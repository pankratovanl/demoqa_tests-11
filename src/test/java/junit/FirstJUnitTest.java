package junit;

import com.codeborne.selenide.Selenide;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJUnitTest {

    @BeforeEach
    void before () {
        System.out.println("Этот метод выполняется перед каждым тестом!");

    }

    @AfterEach
    void after() {
        System.out.println("Этот метод выполняется после каждого теста!");

    }

    @Test
    void textTest() {
        System.out.println("        Это первый тест!");
    }

    @Test
    void videoTest() {
        System.out.println("        Это второй тест!");
    }
}

