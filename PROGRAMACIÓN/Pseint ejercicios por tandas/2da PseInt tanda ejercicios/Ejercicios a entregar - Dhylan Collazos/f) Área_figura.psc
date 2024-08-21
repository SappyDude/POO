Algoritmo área_figura
	Definir altura, base, base_trapecio, radio, forma Como Real
	Escribir '¿Qué tipo de figura desea hallar su área?'
	Escribir '(1) cuadrado'
	Escribir '(2) rectángulo'
	Escribir '(3) triángulo'
	Escribir '(4) paralelogramo'
	Escribir '(5) trapecio'
	Escribir '(6) círculo'
	Leer forma
	
	Segun forma Hacer
		1:
			Escribir 'Introduzca la altura de su figura'
			Leer altura
			Escribir 'Introduzca la base de su figura'
			Leer base
			Escribir 'Su área es ' altura ^ 2
		2:
			Escribir 'Introduzca la altura de su figura'
			Leer altura
			Escribir 'Introduzca la base de su figura'
			Leer base
			Escribir 'Su área es ' altura * base
		3:
			Escribir 'Introduzca la altura de su figura'
			Leer altura
			Escribir 'Introduzca la base de su figura'
			Leer base
			Escribir 'Su área es ' (altura * base) / 2
		4:
			Escribir 'Introduzca la altura de su figura'
			Leer altura
			Escribir 'Introduzca la base de su figura'
			Leer base
			Escribir 'Su área es ' altura * base
		5:
			Escribir 'Introduzca la altura de su figura'
			Leer altura
			Escribir 'Introduzca la base de su figura'
			Leer base
			Escribir 'Introduzca la segunda base que tiene la figura'
			Leer base_trapecio
			Escribir 'Su área es ' (altura*(base + base_trapecio)) / 2
		6:	
			Escribir 'Ingrese el radio'
			Leer radio
			Escribir 'Su área es ' PI * (radio ^ 2)
		De Otro Modo:
			Escribir 'Por favor, utilice alguna de las opciones propuestas'
	FinSegun

	
//	
//	Escribir 'Introduzca la altura de su figura'
//	Leer altura
//	Escribir 'Introduzca la base de su figura'
//	Leer base
//	Escribir '¿Qué tipo de figura es?'
//	Escribir '(cuadrado, rectángulo, triángulo, paralelogramo, trapecio, círculo)'
//	Leer forma
//	Segun forma Hacer
//		'cuadrado':
//			Escribir 'Su área es ' altura ^ 2
//		'rectangulo' o 'Rectangulo' o 'Rectángulo' o 'rectángulo':
//			Escribir 'Su área es ' altura * base
//		'triangulo':
//			Escribir 'Su área es ' (altura * base) / 2
//		'paralelogramo':
//			Escribir 'Su área es ' altura * base
//		'trapecio':
//			Escribir 'Introduzca la segunda base que tiene la figura'
//			Leer base_trapecio
//			Escribir 'Su área es ' (altura*(base + base_trapecio)) / 2
//		'circulo':
//			Escribir 'Ingrese el radio'
//			Leer radio
//			Escribir 'Su área es ' PI * (radio ^ 2)
//		De Otro Modo:
//			Escribir 'Por favor, utilice alguna de las opciones propuestas'
//	Fin Segun
FinAlgoritmo
