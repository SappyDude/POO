Algoritmo raíces_reales
	Definir co1, co2, co3, condition, R1, R2, img Como  Reales	
	Escribir 'Introduzca solo el coeficiente A del primer valor (Ax^2)'
	Leer co1
	Mientras co1 = 0 Hacer
		Escribir 'Digite un valor distinto a 0'
		Leer co1	
	Fin Mientras
	Escribir 'Introduzca solo el coeficiente B del segundo valor (bx)'
	Leer co2
	Escribir 'Introduzca el término independiente (c)'
	Leer co3
	condition <- (co2 ^ 2) - (4 * co1 * co3)
	
	Si condition >= 0 Entonces
		R1 <- (-co2 - condition) / (2 * co1)
		R2 <- (-co2 + condition) / (2 * co1)
		Escribir 'Sus raíces son: ' R1 ' y ' R2 
	SiNo
		img <- (ABS(condition)) ^ (1 / 2)
		
		Escribir 'Las soluciones son imaginarias, su primera raíz es: ', (-co2)/(2 * co1) ' +' (img)/(2 * co1) 'i', ', y su segunda raíz es: ' (-co2)/(2 * co1) ' -' (img)/(2 * co1) 'i'
	FinSi	
FinAlgoritmo


