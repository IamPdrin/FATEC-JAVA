public class dpCompra {
    public int numeroCompra;
    public dpCupom cupom;

    public dpCompra(int numeroCompra){
        this.numeroCompra = numeroCompra;
    }

    public void aplicarCupom(dpCupom cupom){
        this.cupom = cupom;
    }
}
