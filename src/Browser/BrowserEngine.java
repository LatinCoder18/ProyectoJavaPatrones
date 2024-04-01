package Browser;
import Browser.BrowserGlobalLogger;

import static java.lang.StringTemplate.STR;

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
        this.browserGlobalLogger = BrowserGlobalLogger.getInstance();
        if(!isPasswordProtected){
            this.browserGlobalLogger.logWarning(STR."The password is not protected\n\{LogGenerator()}");
        }
        this.browserGlobalLogger.logSuccess(STR."Conection \{LogGenerator()}");
    }

    public void searchWord(String param){
        System.out.println(STR."Browser Word\{param}");
        browserGlobalLogger.logInfo(STR."Word \{param} OK\n\{LogGenerator()}");
    }
    public void searchImage(String name){
        System.out.println(STR."Browser Image\{name}");
        browserGlobalLogger.logInfo(STR."Image \{name} OK\n\{LogGenerator()}");
    }

    public static class Builder {
        //TODO: Implementar builder
        private String name;
        private Boolean isPrivateModeEnabled = Boolean.FALSE;
        private String profileName;
        private Boolean isPasswordProtected;
        private String password;

        public BrowserEngine.Builder Name(String name) {
            this.name = name;
            return this;
        }

        public BrowserEngine.Builder IsPrivateMode(boolean isPrivateModeEnabled) {
            this.isPrivateModeEnabled = isPrivateModeEnabled;
            return this;
        }

        public BrowserEngine.Builder ProfileName(String profileName) {
            this.profileName = profileName;
            return this;
        }

        public BrowserEngine.Builder IsPasswordProtected(boolean isPasswordProtected) {
            this.isPasswordProtected = isPasswordProtected;
            return this;
        }

        public BrowserEngine.Builder Password(String password) {
            this.password = password;
            return this;
        }
        public BrowserEngine Build(){
            return new BrowserEngine(this);
        }
    }
    public BrowserEngine(Builder builder){
        this.name=builder.name;
        this.isPrivateModeEnabled=builder.isPrivateModeEnabled;
        this.profileName=builder.profileName;
        this.isPasswordProtected=builder.isPasswordProtected;
        this.password=builder.password;
        this.browserGlobalLogger = BrowserGlobalLogger.getInstance();
        if(!isPasswordProtected){
            this.browserGlobalLogger.logWarning(STR."The password is not protected\n\{LogGenerator()}");
        }
        this.browserGlobalLogger.logSuccess(STR."Conection \{LogGenerator()}");
    }
    public String LogGenerator(){
        return STR."@Name:\{name} /@IsPrivateModeEnabled:\{isPrivateModeEnabled} /@ProfileName:\{profileName} /@IsPasswordProtected:\{isPasswordProtected} /@Password:\{password}";
    }

}
