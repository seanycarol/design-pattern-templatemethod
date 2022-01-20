package templatemethod;

import java.util.List;

public abstract class Bebida {
    public abstract String preparo();
    public abstract List<String> ingredientes();

    public abstract String getTipoBebida();

    public String receita() {
        String receita = this.getTipoBebida() + "\n";
        for(String ingrediente : this.ingredientes()) {
            receita += ingrediente + "\n";
        }
        receita += this.preparo();
        return  receita;
    }
}
