package utilities;

import java.io.InputStream;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class ConfigReader {

    private static Map<String, Object> config;

    static {
        Yaml yaml = new Yaml();
        InputStream inputStream =
                ConfigReader.class.getClassLoader()
                        .getResourceAsStream("config.yml");
        config = yaml.load(inputStream);
    }

    public static String getEnvironment() {
        String env = System.getProperty("environment");
        if (env == null) {
            env = (String) config.get("environment");
        }
        return env;
    }

    @SuppressWarnings("unchecked")
    public static String getValue(String key) {
        String env = getEnvironment();
        Map<String, Object> envConfig =
                (Map<String, Object>) config.get(env);
        return envConfig.get(key).toString();
    }
}