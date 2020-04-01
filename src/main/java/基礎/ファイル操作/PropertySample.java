package 基礎.ファイル操作;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertySample {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/mail.properties");

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            Properties properties = new Properties();
            properties.load(reader);

            String address = properties.getProperty("system.mail.address");
            System.out.println(address);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
