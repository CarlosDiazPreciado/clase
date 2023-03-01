public class Carro{
	private int velocidad;
	public void encender(){
		System.out.println("Me he encendido");
	}

	public int acelerar(int a){
		velocidad=velocidad+a;	
			return velocidad;

	}
	public int frenar(int a){
		velocidad=velocidad-a;
			return velocidad;

	}

	public void setvelocidad(int a){
		velocidad=a;
			
	}

	public int getVelocidad(){
		return velocidad;
	}
}