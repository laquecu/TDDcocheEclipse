
public class Coche {

	public int velocidad;

	public void acelerar_JorgeSelva(int aceleracion) {
		velocidad += aceleracion;
		
	}

	public void decelerar_JorgeSelva(int deceleracion) {
		velocidad -= deceleracion;
		if(velocidad < 0) velocidad = 0;
		
	}
	
}
