import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Fazer150Test {
    @Test
    void deveRetornarComissaoFazer250ComAdministrativo() {
        Yamaha yamaha = new Administrativo();
        Fazer150 fazer150 = new Fazer150(10000.0f);
        fazer150.setYamaha(yamaha);
        assertEquals(0.0f, fazer150.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoFazer250ComDono() {
        Yamaha yamaha = new Dono();
        Fazer150 fazer150 = new Fazer150(10000.0f);
        fazer150.setYamaha(yamaha);
        assertEquals(3000.0f, fazer150.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoFazer250ComMecanico() {
        Yamaha yamaha = new Mecanico();
        Fazer150 fazer150 = new Fazer150(10000.0f);
        fazer150.setYamaha(yamaha);
        assertEquals(0.0f, fazer150.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoFazer250ComVendedor() {
        Yamaha yamaha = new Vendedor();
        Fazer150 fazer150 = new Fazer150(10000.0f);
        fazer150.setYamaha(yamaha);
        assertEquals(500.0f, fazer150.calcularComissao(), 0.01f);
    }
}
