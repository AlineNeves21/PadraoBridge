import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Fazer250Test {

    @Test
    void deveRetornarComissaoFazer250ComAdministrativo() {
        Yamaha yamaha = new Administrativo();
        Fazer250 fazer250 = new Fazer250(15000.0f);
        fazer250.setYamaha(yamaha);
        assertEquals(0.0f, fazer250.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoFazer250ComDono() {
        Yamaha yamaha = new Dono();
        Fazer250 fazer250 = new Fazer250(15000.0f);
        fazer250.setYamaha(yamaha);
        assertEquals(4500.0f, fazer250.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoFazer250ComMecanico() {
        Yamaha yamaha = new Mecanico();
        Fazer250 fazer250 = new Fazer250(15000.0f);
        fazer250.setYamaha(yamaha);
        assertEquals(0.0f, fazer250.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoFazer250ComVendedor() {
        Yamaha yamaha = new Vendedor();
        Fazer250 fazer250 = new Fazer250(15000.0f);
        fazer250.setYamaha(yamaha);
        assertEquals(750.0f, fazer250.calcularComissao(), 0.01f);
    }

}
