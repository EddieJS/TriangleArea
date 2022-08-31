package entities;

public class Triangle {
	 
	//1º Declarar os atributos da minha classe 
	public double a;
	public double b; 
	public double c;

	// Fórmula para calcular as áreas dos triângulos X e Y
	public double area(){
		double p = (a + b + c) / 2.00;
		return Math.sqrt (p * (p - a) * (p - b) * (p - c));
	}

}
