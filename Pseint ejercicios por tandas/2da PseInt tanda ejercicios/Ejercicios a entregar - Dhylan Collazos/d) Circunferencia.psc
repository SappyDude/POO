Algoritmo 	Circunferencia 
	Definir x, fx, ins Como Real
	Escribir 'Ingrese su primera coordenada (x)'
	Leer x
	Escribir 'Ingrese su segunda coordenada (y)'
	Leer fx
	ins <- (x ^ 2) + (fx ^ 2) 
	si ins < 9 Entonces
		Escribir 'Sus coordenadas están dentro de la circunferencia de un círculo de radio 3 con origen en (0 , 0)'
	SiNo
		Escribir 'Sus coordenadas NO están dentro de la circunferencia de un círculo de radio 3 con origen en (0 , 0)'
	FinSi
FinAlgoritmo