package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Jakub"));
    }

    @Test
    void helloWorld2() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each....");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("Allert!!! **** - I am only called once!!!");
    }
}