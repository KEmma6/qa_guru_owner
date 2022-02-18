package configs;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

public class WebConfigProvider {

    private static ConfigWeb config = ConfigFactory.create(ConfigWeb.class, System.getProperties());

    public static void configure() {
        Configuration.browser = config.browserName();
        Configuration.browserVersion = config.browserVersion();

        if (System.getProperty("testRunning").equals("remote")) {
            Configuration.remote = config.remoteDriverUrl();
        }
    }
}
