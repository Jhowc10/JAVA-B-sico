package idiomadoaplicativo;

import java.util.*;

public class IdiomaDoAplicativo {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        
        System.out.println("O idioma útilizado é:");
        System.out.println(idioma.getDisplayLanguage());
        System.out.println(idioma.getLanguage());
    }
}
