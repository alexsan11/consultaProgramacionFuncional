




// 1. Crear la función llamada "integracion"
def integracion(f: Double => Double, a: Double, b: Double): Double =
  (b - a) * ((f(a) + (4 * f((a + b) / 2)) + f(b)) / 6)

// 3. crear una funcion para calcular el error
def calcularError(valorEsperado: Double, valorObtenido: Double): Double =
  math.abs(valorEsperado - valorObtenido)

// 2. Aproximar el valor de las siguientes integrales definidas usando la función
// "integracion" creada en el paso 1

// Integral 1
val funcion1: Double => Double = (x: Double) => -math.pow(x, 2) + 8 * x - 12
val resultado1: Double = integracion(funcion1, 3, 5)
// calcular error integral 1
val valorEsperado1: Double = 7.33
val error1: Double = calcularError(valorEsperado1, resultado1)


// Integral 2
val funcion2: Double => Double = (x: Double) => 3 * math.pow(x, 2)
val resultado2: Double = integracion(funcion2, 0, 2)
// calcular error integral 2
val valorEsperado2: Double = 8
val error2: Double = calcularError(valorEsperado2, resultado2)
//salida 0.0

// Integral 3
val funcion3: Double => Double = (x: Double) => x + 2 * math.pow(x, 2) - math.pow(x, 3) + 5 * math.pow(x, 4)
val resultado3: Double = integracion(funcion3, -1, 1)
// calcular error integral 3
val valorEsperado3: Double = 3.333
val error3: Double = calcularError(valorEsperado3, resultado3)
//salida 1.3336666666666668

// Integral 4
val funcion4: Double => Double = (x: Double) => (2 * x + 1) / (math.pow(x, 2) + x)
val resultado4: Double = integracion(funcion4, 1, 2)
// calcular error integral 4
val valorEsperado4: Double = 1.09861
val error4: Double = calcularError(valorEsperado4, resultado4)
// salida 0.0013899999999997803

// Integral 5
val funcion5: Double => Double = (x: Double) => math.pow(Math.E, x)
val resultado5: Double = integracion(funcion5, 0, 1)
// calcular error
val valorEsperado5: Double = 1.71828
val error5: Double = calcularError(valorEsperado5, resultado5)
//salida 5.811518765928003E-4

// Integral 6
val funcion6: Double => Double = (x: Double) => 1 / math.sqrt(x - 1)
val resultado6: Double = integracion(funcion6, 2, 3)
// calcular error
val valorEsperado6: Double = 0.82842
val error6: Double = calcularError(valorEsperado6, resultado6)
//salida 4.288508162421101E-4

// Integral 7
val funcion7: Double => Double = (x: Double) => 1 / (1 + math.pow(x, 2))
val resultado7: Double = integracion(funcion7, 0, 1)
// calcular error
val valorEsperado7: Double = 0.785398
val error7: Double = calcularError(valorEsperado7, resultado7)
//salida 0.0020646666666667146
