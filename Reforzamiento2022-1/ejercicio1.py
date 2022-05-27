def surieFibonaci():
   nI:int(0)
   nS=1
   n=int(input("Introduce el N numero"))
   cont=1
   while(cont<n):
       print(nS)
       nT=nS+nI
       nI=nS
       nS=nT
       cont=cont+1

serieFibonaci()