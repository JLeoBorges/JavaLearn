import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.print("A hora é : ");
        System.out.println(relogio.toString());

        Locale ling = Locale.getDefault();
        System.out.println("Lingua do sistema: " + ling.getDisplayLanguage());


        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dms = tk.getScreenSize();
        System.out.print("Minha resolução é de " + dms.width +"x"+ dms.height);

    }
}
