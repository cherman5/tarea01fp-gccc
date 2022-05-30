import os, sys

focos_verdes = 0

focos_blancos = 0

focos_rojos = 0

n = int (input ('Ingresa el valor de n: '))

for i in range (1, n + 1):

   print ('PROCESO ' + repr (i))

   print ('Selecciona el valor de color.')

   print ('\t1.- verde')

   print ('\t2.- blanco')

   print ('\t3.- rojo')

   sys.stdout.write ('\t')

   color = 0

   while color<1 or color>3:

       color = int (input (': '))

       if color<1 or color>3:

           sys.stdout.write ('Valor incorrecto. Ingr\u00E9salo nuevamente.')

   if color==1:

       focos_verdes=focos_verdes+1

   if color==2:

       focos_blancos=focos_blancos+1

   if color==3:

       focos_rojos=focos_rojos+1

   print ()

print ('Valor de focos verdes: ' + repr (focos_verdes))

print ('Valor de focos blancos: ' + repr (focos_blancos))

print ('Valor de focos rojos: ' + repr (focos_rojos))

os.system ('pause')