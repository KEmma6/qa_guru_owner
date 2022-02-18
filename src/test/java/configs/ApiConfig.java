package configs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/token.properties",
        "classpath:token.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("http://demowebshop.tricentis.com")
    String baseUrl();

    @Key("token")
    String token();
}
