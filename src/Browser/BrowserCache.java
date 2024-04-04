package Browser;

public class BrowserCache {

    private String[] searchHistory = new String[10];
    private int index = 0;

    public void saveSearch(String param) {

        searchHistory[index] = param;
        index++;
    }

    public String[] getSearchHistory() {
        return searchHistory;
    }

    public void clearSearchHistory() {

        index = 0;
    }

}
