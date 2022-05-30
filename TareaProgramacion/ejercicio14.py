import os

n = int (input ('Ingresa el valor de n: '))

for i in range (1, n + 1):

   print ('PROCESO ' + repr (i))

   nombre_del_trabajador = input ('Ingresa el nombre del trabajador: ')

   horas_trabajadas = float (input ('Ingresa el valor de horas trabajadas: '))

   sueldo_por_hora = float (input ('Ingresa el valor de sueldo por hora: '))

   sueldo_semanal=horas_trabajadas*sueldo_por_hora

   descuento=0

   if sueldo_semanal>0 and sueldo_semanal<=150:

       descuento=sueldo_semanal*0.05

   if sueldo_semanal>150 and sueldo_semanal<=300:

       descuento=sueldo_semanal*0.07

   if sueldo_semanal>300 and sueldo_semanal<=450:

       descuento=sueldo_semanal*0.09

   sueldo_semanal=sueldo_semanal-descuento

   print ('Nombre del trabajador: ' + nombre_del_trabajador)

   print ('Valor de descuento: ' + repr (descuento))

   print ('Valor de sueldo semanal: ' + repr (sueldo_semanal))

   print ()
