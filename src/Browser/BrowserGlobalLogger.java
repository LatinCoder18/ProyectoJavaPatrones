package Browser;

import java.util.LinkedList;

import static java.lang.StringTemplate.STR;

public class BrowserGlobalLogger {
    // Solo debería de existir una única instancia de esta clase en toda la aplicación;
    private LinkedList<String> logs;
    public LinkedList<String> GetLogs(){
        return logs;
    }
    private static BrowserGlobalLogger instance;
    private BrowserGlobalLogger(){
        this.logs= new LinkedList<String>();
    }
    public static BrowserGlobalLogger getInstance(){
        if (instance==null)
            return instance= new BrowserGlobalLogger();
        return instance;
    }
    public void logSuccess(String param){
        //System.out.println(STR."Success:\{param}");
        logs.add(STR."Success: \{param}");
    }
    public void logWarning(String param){
        //System.out.println(STR."Warning:\{param}");
        logs.add(STR."Warning: \{param}");
    }
    public void logInfo(String param){
        //System.out.println(STR."Info:\{param}");
        logs.add(STR."Info: \{param}");
    }
}
