import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Factor150Test {
    @Test
    void deveRetornarComissaoFazer250ComAdministrativo() {
        Yamaha yamaha = new Administrativo();
        Factor150 factor150 = new Factor150(7000.0f);
        factor150.setYamaha(yamaha);
        assertEquals(0.0f, factor150.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoFazer250ComDono() {
        Yamaha yamaha = new Dono();
        Factor150 factor150 = new Factor150(7000.0f);
        factor150.setYamaha(yamaha);
        assertEquals(2100.0f, factor150.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoFazer250ComMecanico() {
        Yamaha yamaha = new Mecanico();
        Factor150 factor150 = new Factor150(7000.0f);
        factor150.setYamaha(yamaha);
        assertEquals(0.0f, factor150.calcularComissao(), 0.01f);
    }

    @Test
    void deveRetornarComissaoFazer250ComVendedor() {
        Yamaha yamaha = new Vendedor();
        Factor150 factor150 = new Factor150(7000.0f);
        factor150.setYamaha(yamaha);
        assertEquals(350.0f, factor150.calcularComissao(), 0.01f);
    }
}
