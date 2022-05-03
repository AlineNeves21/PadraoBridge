public class Fazer250 extends Moto {

    public Fazer250(float valorMoto) {
        super(valorMoto);
    }

    public float calcularComissao() {
        return this.valorMoto * this.yamaha.percentualComissao();
    }

}
