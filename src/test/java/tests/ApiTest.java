package tests;

import configs.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.io.File;
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
        String token = "test1234test";
        Path props = Paths.get("tmp/token1.properties");
        Files.write(props, token.getBytes(StandardCharsets.UTF_8));
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(apiConfig.token()).isEqualTo("b1ff587b-b80b-4fcd-a11f-4fb57d737a59");

        Files.delete(props);
    }
}