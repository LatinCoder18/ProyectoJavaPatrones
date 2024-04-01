import Browser.BrowserController;

public class Main{
    public static void main(String[] args){
        BrowserController bc = new BrowserController();
        bc.searchSite("Latincoders");
        bc.searchSite("Latincod");
        bc.searchSite("Latincoders");
        bc.searchSite("Latin");
        System.out.println("\n\n\n\n\n\n");
        bc.LogList();
    }
}

