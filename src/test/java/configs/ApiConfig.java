package configs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:C:\\Users\\kurga\\Desktop\\token.properties",
        "classpath:token.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("http://demowebshop.tricentis.com")
    String baseUrl();

    @Key("token")
    String token();
}
