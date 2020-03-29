package utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;

public class Utils {
  private static final File downloadDirectory = new File("src/test/resources/download/");

  public static boolean isEnvironmentRemote() {
    String env = System.getProperty("target.environment");
    return env != null && env.equals("remote");
  }

  public static File getDownloadedResourceFile(String nameWithExtension) {
    return new File(Objects.requireNonNull(Utils.class.getClassLoader()
        .getResource("download/" + nameWithExtension)).getPath());
  }

  public static void cleanDirectory() throws IOException {
    FileUtils.cleanDirectory(downloadDirectory);
  }

  public static boolean isDirectoryClean() {
   return Objects.requireNonNull(downloadDirectory.list()).length == 0;
  }

  public static void isFileDownloadedToTheDownloadFolder(String fileName, int waitSeconds) {
    Path pathToFile = Paths.get("src/test/resources/download/","international-migration-December-2019-citizenship-by-visa-by-country-of-last-permanent-residence.csv");
   await().atMost(waitSeconds, SECONDS)
        .ignoreExceptions()
        .until(() -> pathToFile.toFile().exists());
  }
}
