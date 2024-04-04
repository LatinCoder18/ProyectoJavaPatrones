package Browser;

public class BrowserFacade {

    private BrowserEngine browserEngine;
    private BrowserCache browserCache;

    public BrowserFacade() {
        this.browserEngine = BrowserEngine.builder()
                .name("Google")
                .isPrivateModeEnabled(false)
                .profileName("Default")
                .isPasswordProtected(false)
                .password("")
                .build();
        ;

        this.browserCache = new BrowserCache();
    }

    public void searchWord(String param) {

        browserEngine.searchWord(param);
        browserCache.saveSearch(param);
    }

    public void searchImage(String name) {
        browserEngine.searchImage(name);
        browserCache.saveSearch(name);
    }

}
