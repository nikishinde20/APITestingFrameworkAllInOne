package utilities;

import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class ConfigReader {

    private static Map<String, Object> config;

    static {
        try {
            Yaml yaml = new Yaml();
            InputStream inputStream =
                    ConfigReader.class.getClassLoader()
                            .getResourceAsStream("config.yml");

            config = yaml.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getBaseUrl() {
        String environment = System.getProperty("environment", "qa");

        Map<String, Object> environments =
                (Map<String, Object>) config.get("environments");

        Map<String, String> envConfig =
                (Map<String, String>) environments.get(environment);

        return envConfig.get("baseUrl");
    }
}