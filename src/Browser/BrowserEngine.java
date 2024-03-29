package Browser;
import Browser.BrowserGlobalLogger;
public class BrowserEngine implements QuickSearch{
    private String name;
    private Boolean isPrivateModeEnabled = Boolean.FALSE;
    private String profileName;
    private Boolean isPasswordProtected;

    private String password;

    private BrowserGlobalLogger browserGlobalLogger;

    public BrowserEngine(String name, Boolean isPrivateModeEnabled, String profileName, Boolean isPasswordProtected,String password) {
        this.name = name;
        this.isPrivateModeEnabled = isPrivateModeEnabled;
        this.profileName = profileName;
        this.isPasswordProtected = isPasswordProtected;
        this.password = password;
        this.browserGlobalLogger = new BrowserGlobalLogger();
    }

    public void searchWord(String param){
        System.out.println(STR."Browser Word\{param}");
        browserGlobalLogger.logInfo("OK");
    }
    public void searchImage(String name){
        System.out.println(STR."Browser Image\{name}");
    }

    public class Builder{
        //TODO: Implementar builder
    }
}
