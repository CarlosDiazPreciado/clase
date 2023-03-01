public class Liga{

	String nombre;
	String categoria;

	public static void main(String [] args){
		Liga nacional = new Liga();
			nacional.nombre = "betplay";
			nacional.categoria = "A";

	System.out.println("Nacional juega en: "+nacional.nombre);
	System.out.println("Nacional es de la categoria: "+nacional.categoria);
	
	}

}