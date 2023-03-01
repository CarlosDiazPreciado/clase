public class Comprar extends transportar{
    
    public Comprar(){
        super();
        setMarca("antiguo");
    }
    public void Pagar(){
            System.out.println("Si es cliente antiguo tiene descuento del 20%");
    }
}