package identificandoresolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class IdentificandoResolucaoTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension resolucao = tk.getScreenSize();
        
        System.out.println("Widht = " + resolucao.width);
        System.out.println("Height = " + resolucao.height);
    }
    
}
