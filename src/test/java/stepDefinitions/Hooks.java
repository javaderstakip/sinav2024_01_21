package stepDefinitions;

import io.cucumber.java.*;

public class Hooks extends BaseTest{

    @BeforeAll
    public static void initTest() throws InterruptedException {
        System.out.println("************ Begin Test");
        DriverSource.INSTANCE.getDriver();
        DriverSource.INSTANCE.getDriver().get("https://www.saucedemo.com/");
        DriverSource.INSTANCE.getDriver().manage().window().maximize();
        //Thread.sleep(2000);
    }

    @AfterAll
    public static void endTest() throws InterruptedException {
        System.out.println("************ End Test");
        Thread.sleep(2000);
        DriverSource.INSTANCE.getDriver().manage().window().minimize();
        DriverSource.INSTANCE.getDriver().quit();
        Thread.sleep(2000);
    }

    @Before
    public void beforeScenario(Scenario s) {
        System.out.println("Before Scenario: " + s.getName());
    }

    @After
    public void afterScenario(Scenario s) {
        System.out.println("After  Scenario:" + s.getName());
    }
}
