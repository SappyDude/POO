Algoritmo �rea_figura
	Definir altura, base, base_trapecio, radio, forma Como Real
	Escribir '�Qu� tipo de figura desea hallar su �rea?'
	Escribir '(1) cuadrado'
	Escribir '(2) rect�ngulo'
	Escribir '(3) tri�ngulo'
	Escribir '(4) paralelogramo'
	Escribir '(5) trapecio'
	Escribir '(6) c�rculo'
	Leer forma
	
	Segun forma Hacer
		1:
			Escribir 'Introduzca la altura de su figura'
			Leer altura
			Escribir 'Introduzca la base de su figura'
			Leer base
			Escribir 'Su �rea es ' altura ^ 2
		2:
			Escribir 'Introduzca la altura de su figura'
			Leer altura
			Escribir 'Introduzca la base de su figura'
			Leer base
			Escribir 'Su �rea es ' altura * base
		3:
			Escribir 'Introduzca la altura de su figura'
			Leer altura
			Escribir 'Introduzca la base de su figura'
			Leer base
			Escribir 'Su �rea es ' (altura * base) / 2
		4:
			Escribir 'Introduzca la altura de su figura'
			Leer altura
			Escribir 'Introduzca la base de su figura'
			Leer base
			Escribir 'Su �rea es ' altura * base
		5:
			Escribir 'Introduzca la altura de su figura'
			Leer altura
			Escribir 'Introduzca la base de su figura'
			Leer base
			Escribir 'Introduzca la segunda base que tiene la figura'
			Leer base_trapecio
			Escribir 'Su �rea es ' (altura*(base + base_trapecio)) / 2
		6:	
			Escribir 'Ingrese el radio'
			Leer radio
			Escribir 'Su �rea es ' PI * (radio ^ 2)
		De Otro Modo:
			Escribir 'Por favor, utilice alguna de las opciones propuestas'
	FinSegun

	
//	
//	Escribir 'Introduzca la altura de su figura'
//	Leer altura
//	Escribir 'Introduzca la base de su figura'
//	Leer base
//	Escribir '�Qu� tipo de figura es?'
//	Escribir '(cuadrado, rect�ngulo, tri�ngulo, paralelogramo, trapecio, c�rculo)'
//	Leer forma
//	Segun forma Hacer
//		'cuadrado':
//			Escribir 'Su �rea es ' altura ^ 2
//		'rectangulo' o 'Rectangulo' o 'Rect�ngulo' o 'rect�ngulo':
//			Escribir 'Su �rea es ' altura * base
//		'triangulo':
//			Escribir 'Su �rea es ' (altura * base) / 2
//		'paralelogramo':
//			Escribir 'Su �rea es ' altura * base
//		'trapecio':
//			Escribir 'Introduzca la segunda base que tiene la figura'
//			Leer base_trapecio
//			Escribir 'Su �rea es ' (altura*(base + base_trapecio)) / 2
//		'circulo':
//			Escribir 'Ingrese el radio'
//			Leer radio
//			Escribir 'Su �rea es ' PI * (radio ^ 2)
//		De Otro Modo:
//			Escribir 'Por favor, utilice alguna de las opciones propuestas'
//	Fin Segun
FinAlgoritmo
