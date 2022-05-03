public abstract class Moto {

    protected Yamaha yamaha;

    protected float valorMoto;

    public Moto(float valorMoto) {
        this.valorMoto = valorMoto;
    }

    public void setYamaha(Yamaha yamaha) {
        this.yamaha = yamaha;
    }

    public void setValorMoto(float valorMoto) {
        this.valorMoto = valorMoto;
    }

    public abstract float calcularComissao();

}
