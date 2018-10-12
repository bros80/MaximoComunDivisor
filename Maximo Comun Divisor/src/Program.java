
/*
 *	Autor:		Bruno
 *	Propósito:	Uso de la clase MaximoComunDivisor. 
 */

public class Program {
	public static void main(String[] args) {
		System.out.println("Maximo Comun Divisor entre dos numeros");
		
		final long primerNumero = 200;
		final long segundoNumero = 60;
		
		MaximoComunDivisor mcd = new MaximoComunDivisor(primerNumero, segundoNumero);
		System.out.println("El resultado es: " + mcd.Calcular());
	}

}
