package templatemethod;

import java.util.Arrays;
import java.util.List;

public class Cafe extends Bebida {

    public String getTipoBebida() {
        return "Café";
    }

    public String preparo() {
        return "Preparo do café";
    }

    public List<String> ingredientes() {
        return Arrays.asList("3 xícaras de água", "3 colheres (sopa) cheias de açúcar", "3 colheres (sopa) de pó de café", "1 filtro de papel");
    }
}
