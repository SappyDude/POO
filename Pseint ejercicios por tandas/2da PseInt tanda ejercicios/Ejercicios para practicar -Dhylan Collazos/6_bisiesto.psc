Algoritmo bisiesto 
	Definir año Como Entero
	Escribir 'Ingrese su año'
	Leer año 
	si año % 4 = 0  y año % 100 <> 0 | año % 400 = 0 Entonces
		Escribir 'El año es bisiesto'
	SiNo
		Escribir 'El año no es bisiesto'
	FinSi
FinAlgoritmo
