package tests;

import configs.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTest {

    @Test
    public void apiTest() {
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(apiConfig.baseUrl()).isEqualTo("http://demowebshop.tricentis.com");
        assertThat(apiConfig.token()).isEqualTo("b1ff587b-b80b-4fcd-a11f-4fb57d737a59");
    }

    @Test
    public void tmpFileTest() throws IOException {
        String text = "token=test1234test";
        Path props = Paths.get("C:\\Users\\kurga\\Desktop\\token.properties");
        Files.write(props, text.getBytes(StandardCharsets.UTF_8));
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(apiConfig.token()).isEqualTo("test1234test");

        Files.delete(props);
    }
}