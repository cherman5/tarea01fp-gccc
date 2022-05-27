def siNumeroPrimo():
    num=int(input("ingrese el numero:"))
    cont=1
    cantDv=0
    while(cont<=num):
        if (num%cont==0):
            cantDiv=cantDiv+1
        cont=cont+1
    if(cantDi==2):
        print(f"El numero {num} es primo")
    else:
        print(f"El numero {num} no es primo")


    siNumeroPrimo()