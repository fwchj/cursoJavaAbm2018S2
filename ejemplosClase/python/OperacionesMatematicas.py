#Required imports (math package)
import math

# Declaramos e initializamos algunas variables numericas
a = 5
b = 70
c = 13
d = 14
e = 15




		
#Suma de dos valores
print("a+b=",a+b)

# Division de dos valores: importante hacer el 'cast' 
print("c/b = ",c/b)

#lo mismo pero guardando la informacion
division = c/a
print("c/a = %s",division)

# Calcular el modulo
print("d % a = ",d%a)

# Rondear variables
div = float(c/b)
print("Floor:", math.floor(div))
print("Ceil:",math.ceil(div))
print("Round:", round(div))


# Calcular el maximo de a,b y c
print("Maximo: ",max(a, max(b, c)))

