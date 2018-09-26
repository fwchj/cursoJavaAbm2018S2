## Definimos las variables
mujer = False
mex = False

## Python require más detalle para manejar los boolean
if(mujer==True & mex==False):
    print("Es una mujer de México")
elif(mujer==False & mex==True):
    print("Es un hombre de México")
elif(mujer & mex==False):
    print("Es una mujer de otro pais")
else:
    print("Es un hombre de otro pais")
