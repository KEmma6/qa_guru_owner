package tests;

import com.codeborne.selenide.Configuration;
import configs.WebConfigProvider;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        System.setProperty("testRunning", "local");
        Configuration.startMaximized = true;
        WebConfigProvider.configure();
    }
}
