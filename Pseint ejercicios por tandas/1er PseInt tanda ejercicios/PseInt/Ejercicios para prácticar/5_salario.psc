Algoritmo salario
	Definir salario_trabajador, nuevo_salario Como Real
	Escribir 'Ingrese el salario actual del trabajador'
	Leer salario_trabajador
	Si salario_trabajador > 400000
		nuevo_salario <- ((salario_trabajador*8)/100) + salario_trabajador
	SiNo
		nuevo_salario <- ((salario_trabajador*15)/100) + salario_trabajador
	FinSi
	Escribir 'El salario del trabajador es ' nuevo_salario
FinAlgoritmo
