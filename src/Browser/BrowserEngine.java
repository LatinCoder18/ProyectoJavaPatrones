package Browser;

import Browser.BrowserGlobalLogger;

public class BrowserEngine implements QuickSearch {
    private final String name;
    private final boolean isPrivateModeEnabled;
    private final String profileName;
    private final boolean isPasswordProtected;
    private final String password;
    private final BrowserGlobalLogger browserGlobalLogger;

    public static Builder builder() {
        return new Builder();
    }

    public BrowserEngine(String name, boolean isPrivateModeEnabled, String profileName, boolean isPasswordProtected,
            String password) {
        this.name = name;
        this.isPrivateModeEnabled = isPrivateModeEnabled;
        this.profileName = profileName;
        this.isPasswordProtected = isPasswordProtected;
        this.password = password;
        this.browserGlobalLogger = BrowserGlobalLogger.getInstance();
    }

    public void searchWord(String param) {
        System.out.println("Browser Word " + param);
        browserGlobalLogger.logInfo("OK");
    }

    public void searchImage(String name) {
        System.out.println("Browser Image " + name);
    }

    // gets
    public String getName() {
        return name;
    }

    public boolean isPrivateModeEnabled() {
        return isPrivateModeEnabled;
    }

    public String getProfileName() {
        return profileName;
    }

    public boolean isPasswordProtected() {
        return isPasswordProtected;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder {
        private String name;
        private boolean isPrivateModeEnabled;
        private String profileName;
        private boolean isPasswordProtected;
        private String password;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder isPrivateModeEnabled(boolean isPrivateModeEnabled) {
            this.isPrivateModeEnabled = isPrivateModeEnabled;
            return this;
        }

        public Builder profileName(String profileName) {
            this.profileName = profileName;
            return this;
        }

        public Builder isPasswordProtected(boolean isPasswordProtected) {
            this.isPasswordProtected = isPasswordProtected;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public BrowserEngine build() {
            return new BrowserEngine(name, isPrivateModeEnabled, profileName, isPasswordProtected, password);
        }

    }

}
