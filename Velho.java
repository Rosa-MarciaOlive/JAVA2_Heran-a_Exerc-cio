public class Velho extends Imovel {
    
    private  int desconto;

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    } 

    System.out.println(desconto.get());
}

