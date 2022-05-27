def fibonaciN():
    nI=0
    nS=1
    n=int(input("introduce el N numero"))
    cont=1
    if(n>1):
        while(cont<n):             
            nT=nS+nI;                        
            nI=nS
            nS=nT
            cont=cont+1
    else:
        nS=n
    print(f"el fiboneci de {n} es {nS}")

fibonaciN()
   