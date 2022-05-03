public class Factor150 extends Moto {

    public Factor150(float valorMoto) {
        super(valorMoto);
    }

    public float calcularComissao() {
        return this.valorMoto * this.yamaha.percentualComissao();
    }

}
