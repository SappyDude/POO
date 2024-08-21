Algoritmo organizar 
	Definir nro1, nro2, nro3 Como Entero
	Escribir 'Ingrese su primer valor'
	Leer nro1
	Escribir 'Ingrese su segundo valor'
	Leer nro2
	Escribir 'Ingrese su tercer valor'
	Leer nro3
	
	si nro1 > nro2 Entonces
		si nro1 > nro3 
			si nro2 > nro3 Entonces
				Escribir nro1 ' ' nro2 ' ' nro3 
			SiNo
				Escribir nro1 ' ' nro3 ' ' nro2 
			FinSi
		SiNo
			Escribir nro3 ' ' nro1 ' ' nro2
		FinSi
	SiNo
		si nro3 > nro2 Entonces
			Escribir nro3 ' ' nro2 ' ' nro1
		SiNo
			si nro1 > nro3 Entonces
				Escribir nro2 ' ' nro1 ' ' nro3
			SiNo
				Escribir nro2 ' ' nro3 ' ' nro1
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo