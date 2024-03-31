package Browser;

public class BrowserController {
    // Clase que utilizando uno de los patrones englobará el resto de Clases que sean necesarias llamar en nuestra aplicacion
    private BrowserEngine browserEngine;

    public BrowserController() {
        // Este llamado puede ser mejorado utilizando otro de los patrones vistos en clases.
        this.browserEngine = new BrowserEngine.Builder().Name("Firefox").IsPasswordProtected(true).ProfileName("Estudiante").IsPrivateMode(true).Password("Estudiante24_").Build();
                //("Firefox",true, "Estudiante",true, "Estudiante24_");
    }

    public void searchSite(String param){
        //Implementar patron que permita actuar de intermedio para crear una busqueda previa sobre las busquedas ya realizadas.
        //proxy con BrowserCache
        browserEngine.searchWord(param);
    }
}
