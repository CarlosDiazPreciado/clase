public class Principal{
	public static void main(String [] args){
		Sedan chevrolet = new Sedan();
		chevrolet.encender();
		System.out.println(chevrolet.acelerar(30));
		System.out.println(chevrolet.getVelocidad());
	}
}