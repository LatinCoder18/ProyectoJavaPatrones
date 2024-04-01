package Browser;

public class BrowserController {
    // Clase que utilizando uno de los patrones englobará el resto de Clases que sean necesarias llamar en nuestra aplicacion
    //facade
    private BrowserCache browserCache;

    public BrowserController() {
        // Este llamado puede ser mejorado utilizando otro de los patrones vistos en clases.
        this.browserCache = new BrowserCache(new BrowserEngine.Builder().Name("Firefox").IsPasswordProtected(true).ProfileName("Estudiante").IsPrivateMode(true).Password("Estudiante24_").Build());
                //("Firefox",true, "Estudiante",true, "Estudiante24_");
    }
    public BrowserController(BrowserEngine browserEngine) {
        this.browserCache = new BrowserCache(browserEngine);
    }

    public void searchSite(String param){
        //Implementar patron que permita actuar de intermedio para crear una busqueda previa sobre las busquedas ya realizadas.
        browserCache.searchWord(param);
    }
    public void searchImages(String name){
        //Implementar patron que permita actuar de intermedio para crear una busqueda previa sobre las busquedas ya realizadas.
        browserCache.searchImage(name);
    }
    public void LogList(){
        BrowserGlobalLogger browserGlobalLogger=BrowserGlobalLogger.getInstance();
        for(String string :browserGlobalLogger.GetLogs()){
            System.out.println(string);
        }
    }
}
