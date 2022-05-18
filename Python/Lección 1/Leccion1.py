miVariable =3
print(miVariable)
miVariable = "a"
print(miVariable)
miVariable = 3.7
print(miVariable)

#Como vemos la variable es dianmica,o reutilizable, pq va tomando distintos valores sin acalarar que tipo de dato es

x= 10
y= 2
z = x + y
print(z)
print("El espacio de memoria es ",id(x))#Uso la coma para concatenar

#Recordar que el espacio de memoria solo dura hasta que se termina de ejecutar el ej,y si lo vuelvo a ejecutar tomará otro esp memoria#

#Manejo de Cadenas (String)

miGrupoFavorito = "Los Autenticos Decadentes,"
caracteristicas = "Cuarteto de Nos"
print ("Mi grupo favorito es: "+miGrupoFavorito + " "+caracteristicas)
#Con el signo + concatenamos cuando estamos encadenas de string

num1="7"
num2="5"
print(num1+num2) #Concatena, no suma pq son String
print(int(num1)+int(num2))#en este caso sumo

#Tipos Booleanos(bool)
miBooleano= 1>2
print(miBooleano)

if  miBooleano:
    print("Mi rdo es; Verdadero")
else:
    print("Mi rdo es; Falso")

#Procesar la entrada de datos
#funcion imput
resultado= input("Digite un numero: ") #La Fx INPUT nos devuelve un dato tipo String
print(resultado)

#Conversión de la entrada de datos en la función Input
num1= int(input("Escribe un número: "))
num2= int(input("Escribe otro número: "))
resultado= (num1+num2)
print(resultado)
