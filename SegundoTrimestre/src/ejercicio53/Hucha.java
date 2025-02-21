package ejercicio53;

import java.math.BigDecimal;

public class Hucha{
	private BigDecimal importeActual ;
	
	
	public Hucha(){
		
	}
	
	public BigDecimal meterDinero(BigDecimal importe) {
		
		BigDecimal resta =importeActual.subtract(importe);
		return  resta;
	}
	
}