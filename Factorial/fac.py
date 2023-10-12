#Código Iterativo para crear un factorial
#Código Recursivo para crear un factorial
import math

def fac_i(x):
	if x < 0:
		return 'ERROR'

	acum=1
	for i in range(1,x+1):
		acum*=i
	return acum


def fac_r(x):
	if x < 0 :
		return 'ERROR'
		
	if x==0 or x==1:
		return 1
	else:
		return x*fac_r(x-1)



n=int(input('Ingrese un numero entero: '))



print('El numero factorial de ' , n, ' usando iterativo es: ', fac_i(n))
print('++++++++++++++++++++++')
print('El numero factorial de ' , n, 'usando recursivo es: ', fac_r(n))
print('++++++++++++++++++++++')
print('El nuemro factorial usando MATH de  ', n  ,' es: ', math.factorial(n))
