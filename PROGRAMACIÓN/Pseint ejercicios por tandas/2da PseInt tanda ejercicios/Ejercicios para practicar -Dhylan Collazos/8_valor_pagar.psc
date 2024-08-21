Algoritmo valor_pagar
//El subtotal es el valor antes de aplicar cualquier tipo de descuento o impuesto
Definir subtotal,total Como Real
Escribir '¿Cuánto es el subtotal de su venta?'
Leer subtotal
Si subtotal >= 100000 Entonces
	total <- subtotal * 1.16
SiNo
	si  subtotal > 80000 y subtotal < 100000 Entonces
		total <- subtotal * 1.08
	SiNo
		si subtotal > 60000 y subtotal <= 80000 Entonces
			total <- subtotal * 1.05		
		SiNo
			total <- subtotal
		FinSi
	FinSi
FinSi
Escribir 'Su total es: ' total
FinAlgoritmo
