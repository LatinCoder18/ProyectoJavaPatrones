package Browser;

import java.util.LinkedList;

public class BrowserCache implements QuickSearch{
    private LinkedList<String> words;
    private LinkedList<String> images;
    private BrowserEngine browserEngine;
    private BrowserGlobalLogger browserGlobalLogger;
    public BrowserCache(BrowserEngine browserEngine){
        this.words=new LinkedList<String>();
        this.images=new LinkedList<String>();
        this.browserEngine=browserEngine;
        this.browserGlobalLogger=BrowserGlobalLogger.getInstance();
    }
    @Override
    public void searchWord(String param) {
        for (String string:words){
            if (string.equals(param)){
                System.out.println(STR."BrowserCache Word \"\{param}\"");
                browserGlobalLogger.logSuccess(STR."BrowserCache Word \"\{param}\" OK\n\{browserEngine.LogGenerator()}");
                return;
            }
        }
        browserEngine.searchWord(param);
        words.add(param);
    }

    @Override
    public void searchImage(String name) {
        for (String string:images){
            if (string.equals(name)){
                System.out.println(STR."BrowserCache Image \"\{name}\"");
                browserGlobalLogger.logSuccess(STR."BrowserCache Word \"\{name}\" OK\n\{browserEngine.LogGenerator()}");
                return;
            }
        }
        browserEngine.searchWord(name);
        images.add(name);
    }
    //TODO: Implementar (Proxy)

}
