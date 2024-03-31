package Browser;

import static java.lang.StringTemplate.STR;

public class BrowserGlobalLogger {
    // Solo debería de existir una única instancia de esta clase en toda la aplicación;
    private static BrowserGlobalLogger instance;
    private BrowserGlobalLogger(){}
    public static BrowserGlobalLogger getInstance(){
        if (instance==null)
            return instance= new BrowserGlobalLogger();
        return instance;
    }
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
