package utils;

public class Utils {

    public static boolean isEnvironmentRemote() {
        String env = System.getProperty("target.environment");
        return env != null && env.equals("remote");
    }
}
