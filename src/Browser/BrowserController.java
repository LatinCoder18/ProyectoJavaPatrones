package Browser;

public class BrowserController implements QuickSearch {

    private BrowserFacade browserEngine;

    public BrowserController() {

        browserEngine = new BrowserFacade();

    }

    public void searchImage(String name) {
        
        browserEngine.searchImage(name);
    }

    public void searchWord(String param) {
       
        browserEngine.searchWord(param);
    }

    public void searchSite(String param) {
        
        browserEngine.searchWord(param);
    }
}
