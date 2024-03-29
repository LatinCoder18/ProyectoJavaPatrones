package Browser;

public class BrowserGlobalLogger {
    // Solo debería de existir una única instancia de esta clase en toda la aplicación;
    public BrowserGlobalLogger(){}
    public void logSuccess(String param){
        System.out.println(STR."Success:\{param}");

    }
    public void logWarning(String param){
        System.out.println(STR."Warning:\{param}");
    }
    public void logInfo(String param){
        System.out.println(STR."Info:\{param}");
    }
}
