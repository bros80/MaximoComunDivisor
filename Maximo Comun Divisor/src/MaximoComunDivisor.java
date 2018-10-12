
/*
 *  Autor:		Bruno
 *  Propósito:	Calcular entre dos números el Máximo Común Divisor
 *  			por medio de recursividad.
 */

public class MaximoComunDivisor {
	private long primerNumero;
	private long segundoNumero;
	
	public MaximoComunDivisor(long pNumero, long sNumero) {
		this.primerNumero = pNumero;
		this.segundoNumero = sNumero;
	}
	
	public long Calcular() {
		if(this.primerNumero > 0 && this.segundoNumero > 0)
			return Computar(this.primerNumero, this.segundoNumero);
		else
			return -1;
	}
	
	private long Computar(long pNumero, long sNumero) {
		long mayor = 0;
		long menor = 0;
		
		if(primerNumero > segundoNumero) {
			mayor = pNumero;
			menor = sNumero;
		}
		else {
			mayor = sNumero;
			menor = pNumero;
		}
		
		if(mayor % menor == 0)
			return menor;
		else
			return Computar(menor, mayor % menor);
	}
}
