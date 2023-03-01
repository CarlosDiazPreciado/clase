public abstract class Moto {
    public String Marca;
    
    
    public Moto(){} //metodo constructor
    
    public void comprar(){
        System.out.println("La " +Marca+ " es de las mas top.");
           
    }
    
    public abstract void Pagar(); //metodo abstracto
    
    public void setMarca(String BMW){ 
        Marca = BMW;
    }
    
    public String getMarca(){
        return Marca;
    }
    
   
}