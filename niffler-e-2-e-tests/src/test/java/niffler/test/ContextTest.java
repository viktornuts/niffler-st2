package niffler.test;

import niffler.jupiter.extension.ContextExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ContextExtension.class)
public class ContextTest {

    @AfterAll
    static void afterAll() {
        System.out.println("  #### @AfterAll");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("  #### @beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("      #### @BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("      #### @AfterEach");
    }

    @Test
    void firstTest() {
        System.out.println("             #### @Test firstTest()");
    }

    @Disabled
    @Test
    void secondTest() {
        System.out.println("             #### @Test secondTest()");
    }
}
