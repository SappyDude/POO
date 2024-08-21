Algoritmo estructura_doble
	Definir a, b, c, X1, X2 Como Real
	Escribir "Primer nro"
	Leer  a
	Escribir "Segundo nro"
	Leer  b
	Escribir "Tercer nro"
	Leer  c
	D <- ((b*b) - (4 * a * c))
	Si D >= 0 Entonces
		X1 <- [((-b) + (D)^0.5) / (2*a)]
		X2 <- [((-b) - (D)^0.5) / (2*a)]
		Escribir  "a: " a "  b: " b "  c: " c
		Escribir "La primera raíz es: " X1 ", y la segunda raíz es: " X2
	SiNo
		Escribir  "a: " a "b: " b "c: " c
		Escribir "Raíces imaginarias"
	Fin Si

FinAlgoritmo
