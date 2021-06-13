import org.junit.jupiter.api.*;

public class LifecyceTest {

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("beforeAllTests called");
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("beforeEachTest called");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("afterAllTests called");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("afterEachTest called");
    }

    @Test
    void test1() {
        System.out.println("test1 called");
    }

    @Test
    void test2() {
        System.out.println("test2 called");
    }
}
