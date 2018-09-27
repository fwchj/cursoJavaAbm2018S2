## Definimos las variables
grades = [9.5, 8.6, 7.9, 10.0];

## Loop simple 
for g in grades:
    print(g)

## El loop con el indice no existe realmente en Python. Lo podríamos hacer
## manual, pero la verdad no vale la pena. Se puede hacer un loop que incluye
## al mismo tiempo el indice como el valor:
for index, value in enumerate(grades):  
    print("Index: ",index," => ",value)

#Ejercicio 1: suma de los valores
sum = 0;    # Igual como en Java, hay que definir la variable sum antes del loop
for g in grades:
    sum +=g     #Vamos agregando cada elemento
print("La suma es ",sum)
