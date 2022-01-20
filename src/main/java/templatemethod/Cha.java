package templatemethod;

import java.util.Arrays;
import java.util.List;

public class Cha extends Bebida {

    public String getTipoBebida() {
        return "Chá";
    }

    public String preparo() {
        return "Preparo do chá";
    }

    public List<String> ingredientes() {
        return Arrays.asList("2 colheres (sopa) de chá mate", "6 colheres (sopa) de açúcar", "1l de água");
    }
}
