Algoritmo Calculadora
	Definir nro1, nro2 Como Real
	Definir operador Como Caracter
	Escribir 'Digite su primer valor'
	Leer nro1
	Escribir 'Digite su segundo valor'
	Leer nro2
	Escribir 'Digite la operacion que desee realizar (+,-,*,/)'
	Leer operador	
	Segun operador Hacer
		'+':
			Escribir 'El resultado de su operacióm es: ' nro1 + nro2
		'-':
			Escribir 'El resultado de su operación es: ' nro1 - nro2
		'*':
			Escribir 'El resultado de su operación es: ' nro1 * nro2
		'/':
			Escribir 'El resultado de su operación es: ' nro1 / nro2
		De Otro Modo:
			Escribir 'Porfavor vuelva a ingresar los datos de manera correcta'
	Fin Segun
FinAlgoritmo
