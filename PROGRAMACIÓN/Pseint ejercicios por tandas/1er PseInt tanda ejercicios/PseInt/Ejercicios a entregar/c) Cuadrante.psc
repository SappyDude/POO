Algoritmo cuadrante
	Definir x, fx Como Entero
	Escribir 'Especifique el valor de x'
	Leer x
	Escribir 'Especifique el valor de y'
	Leer fx
	si x <> 0 y fx <> 0 Entonces
		si x > 0 Entonces
			si fx > 0 Entonces
				Escribir 'Su coordenada está ubicada en la zona superior derecha en el plano cartesiano'
			sino 
				Escribir 'Su coordenada está ubicada en la zona inferior derecha en el plano cartesiano'
			FinSi
		SiNo
			si fx < 0
				Escribir 'Su coordenada está ubicada en la zona inferior izquierda en el plano cartesiano'
			SiNo
				Escribir 'Su coordenada está ubicada en la zona superior izquierda en el plano cartesiano'
			FinSi
		FinSi
	SiNo
		Escribir 'Su coordenada está sobre el origen de un eje'
		// se puede extender para dar una respuesta hacia que lado esta ubicado sobre un eje
	FinSi
	
FinAlgoritmo
