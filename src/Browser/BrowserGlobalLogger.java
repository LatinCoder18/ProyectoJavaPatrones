package Browser;

public class BrowserGlobalLogger {
    private static BrowserGlobalLogger instance = null;

    private BrowserGlobalLogger() {
    }

    public static synchronized BrowserGlobalLogger getInstance() {
        if (instance == null) {
            instance = new BrowserGlobalLogger();
        }
        return instance;
    }

    public void logSuccess(String param) {
        System.out.println(STR."Success:\{param}");

    }

    public void logWarning(String param) {
        System.out.println(STR."Warning:\{param}");
    }

    public void logInfo(String param) {
        System.out.println(STR."Info:\{param}");
    }
}
