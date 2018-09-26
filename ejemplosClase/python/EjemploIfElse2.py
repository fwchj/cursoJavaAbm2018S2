## Definimos las variables
mujer = True
mex = False

## Python require más detalle para manejar los boolean
if mujer and mex:
    print("Es una mujer de México")
elif not mujer and mex:
    print("Es un hombre de México")
elif mujer and not mex:
    print("Es una mujer de otro pais")
else:
    print("Es un hombre de otro pais")
