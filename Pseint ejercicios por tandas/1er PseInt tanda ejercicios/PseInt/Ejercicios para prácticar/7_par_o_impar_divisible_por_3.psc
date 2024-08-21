Algoritmo par_o_impar_divisible_por_3
	definir dato Como Entero	
	Escribir 'Digite su número a revisar'
	Leer dato
	Si dato % 2 = 0 Entonces
		Escribir 'Su dato es par'
	SiNo
		Si dato % 3 = 0
			Escribir 'Su dato no es par, pero su dato es divisible entre 3'
		SiNo
			Escribir 'Su dato no es par, y tampoco es divisible entre 3'
		FinSi
	FinSi
	
FinAlgoritmo
