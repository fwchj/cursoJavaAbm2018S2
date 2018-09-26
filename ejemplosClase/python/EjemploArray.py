## Equivalente en Python del EjemploArray.java

## Python es mas facil para arreglos, ya que la construccion se hace de forma mas sencilla

# Definir 'grades' directamente. Python detecta el tipo automáticamente
# Arrays se llaman 'lists' en python
grades =[6.8,8.9,10.1]
print(grades)


# Array de integers
edad =[0]*3     # Si queremos hacer el arrgelo vacio (=0.0), es la forma de hacerlo
print(edad)
edad[0] = 65
edad[1] = 38
edad[2] = 99


# Array de strings
letras = [""]*4
print(letras)
letras[0] = "a"
letras[1] = "b"
letras[2] = "c"
letras[3] = "d"
print(letras)



## Comportamiento al copiar arrays/listas
import copy
x = [1,2,3,4]
y = x
z = copy.deepcopy(x) # this is equivalent to .clone() in Java
print(x,y,z)
x[3]=55
print(x,y,z)
