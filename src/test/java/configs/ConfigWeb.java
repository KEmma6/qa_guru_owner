package configs;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${testRunning}.properties")

public interface ConfigWeb extends Config {

    @Key("browser.name")
    @DefaultValue("CHROME")
    String browserName();

    @Key("browser.version")
    @DefaultValue("98.0")
    String browserVersion();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();
}
