public class Fazer150 extends Moto {

    public Fazer150(float valorMoto) {
        super(valorMoto);
    }

    public float calcularComissao() {
        return this.valorMoto * this.yamaha.percentualComissao();
    }
}
