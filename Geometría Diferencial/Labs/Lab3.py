# -*- coding: utf-8 -*-
"""
Created on Mon Dec 13 17:01:26 2021

@author: Gonzalo
"""
import math
import sympy as sy
u, v = sy.symbols('u, v', real = True)
x, y, z, t = sy.symbols('x, y, z, t', real = True)

u0=0
v0=0

"""
punto para Ecuaciones Gauss Mainardi
"""

u1=2
v1=2


sup=(sy.sin(u)*sy.cosh(v), sy.cos(u)*sy.sinh(v), sy.cos(u)+sy.cos(v))

sdu = [sy.diff(sup[i], u) for i in range(3)] 
sdv = [sy.diff(sup[i], v) for i in range(3)]

sduu = [sy.diff(sdu[i], u) for i in range(3)] 
sduv = [sy.diff(sdu[i], v) for i in range(3)]
sdvv = [sy.diff(sdv[i], v) for i in range(3)]

dudv = sy.Matrix(sdu).cross(sy.Matrix(sdv))
n = sy.Matrix(dudv).normalized()

"""
Ejercicio 1 - Segunda Forma Fundamental
"""
print("Ejercicio 1 - Segunda Forma Fundamental")

E = sy.Matrix(sdu).dot(sy.Matrix(sdu))
F = sy.Matrix(sdu).dot(sy.Matrix(sdv))
G = sy.Matrix(sdv).dot(sy.Matrix(sdv))

E = E.subs(u,u0)
E = E.subs(v,v0).evalf()
F = F.subs(u,u0)
F = F.subs(v,v0).evalf()
G = G.subs(u,u0)
G = G.subs(v,v0).evalf()

primeraFun = sy.Matrix([[E, F],[F, G]]) 



e = sy.Matrix(n).dot(sy.Matrix(sduu))
f = sy.Matrix(n).dot(sy.Matrix(sduv))
g = sy.Matrix(n).dot(sy.Matrix(sdvv))

e = e.subs(u,u0)
e = e.subs(v,v0).evalf()
f = f.subs(u,u0)
f = f.subs(v,v0).evalf()
g = g.subs(u,u0)
g = g.subs(v,v0).evalf()

segundaFun = sy.Matrix([[e, f],[f, g]]) 

print(segundaFun)
print("")

"""
Ejercicio 2 - Curvatura de Gauss
"""
print("Ejercicio 2 - Curvatura de Gauss")

K = (e*g-f**2)/(E*G-F**2)

print(K)
print("")

"""
Ejercicio 3 - Curvatura Media
"""
print("Ejercicio 3 - Curvatura Media")

H = (e*G+g*E-2*f*F)/(2*(E*G-F**2))

print(H)
print("")

"""
Ejercicio 4 - Simbolos Christoffel primera Especie
"""
print("Ejercicio 4 - Simbolos Christoffel primera Especie ")

s111=sy.Matrix(sduu).dot(sy.Matrix(sdu))
s121=sy.Matrix(sduv).dot(sy.Matrix(sdu))
s221=sy.Matrix(sdvv).dot(sy.Matrix(sdu))
s112=sy.Matrix(sduu).dot(sy.Matrix(sdv))
s122=sy.Matrix(sduv).dot(sy.Matrix(sdv))
s222=sy.Matrix(sdvv).dot(sy.Matrix(sdv))

matrixChris=sy.Matrix([[s111, s121, s221],[s112, s122, s222]])
matrixChris = matrixChris.subs(u,u0)
matrixChris = matrixChris.subs(v,v0)

print(matrixChris)
print("")

"""
Ejercicio 5
"""
print("Ejercicio 5 - Simbolos Christoffel segunda Especie ")

invPrimeraFun = primeraFun.inv()

simbSegEspecie = invPrimeraFun*matrixChris

print(simbSegEspecie)
print("")

"""
Ejercicio 6
"""
print("Ejercicio 6 ")

print("")

print("a) ecuacion gauss (i,j) = (1,2)")

i0=1
j0=2

ia=i0-1
ja=j0-1

g11=4*u**2 + 1
g12=4*u*v
g22=4*v**2 + 1

L11 = 2/(sy.sqrt(4*u**2 + 4*v**2 + 1))
L12 = 0
L22 = 2/(sy.sqrt(4*u**2 + 4*v**2 + 1))

ej6primFun=sy.Matrix([[g11, g12],[g12, g22]])

ej6segFun=sy.Matrix([[L11,L12],[L12,L22 ]])

gaussa= (ej6primFun[0,0]*((ej6segFun[0,0]*ej6segFun[1,1] - (ej6segFun[0,1])**2)))/(ej6primFun[0,0]*ej6primFun[1,1] - ej6primFun[0,1]**2)


Eu=sy.diff(ej6primFun[0,0], u)
Ev=sy.diff(ej6primFun[0,0], v)
Fu=sy.diff(ej6primFun[0,1], u)
Fv=sy.diff(ej6primFun[0,1], v)
Gu=sy.diff(ej6primFun[1,1], u)
Gv=sy.diff(ej6primFun[1,1], v)

c111=Eu/2
c121=Ev/2
c221=(2*Fv-Gu)/2
c112=(2*Fu-Ev)/2
c122=Gu/2
c222=Gv/2
crist = sy.Matrix([[c111, c121,c221],[c112, c122,c222]])

invPrimeraFun6 = ej6primFun.inv()

segEspecie = invPrimeraFun6*crist


gauss2a= sy.diff(segEspecie[1,0], v) - sy.diff(segEspecie[1,1], u) + ( segEspecie[0,0]*segEspecie[1,1]-segEspecie[0,1]*segEspecie[1,0] ) + ( segEspecie[1,0]*segEspecie[1,2]-segEspecie[1,1]*segEspecie[1,1] )


gaussa=gaussa.subs(u,u1)
gaussa=gaussa.subs(v,v1).evalf()
gauss2a=gauss2a.subs(u,u1)
gauss2a=gauss2a.subs(v,v1)


print("")
print(gaussa)
print(gauss2a)


print("")


print("b) ecuacion gauss (i,j) = (2,1)")

i0=2
j0=1

ia=i0-1
ja=j0-1

g11=4*u**2 + 1
g12=4*u*v
g22=4*v**2 + 1

L11 = 2/(sy.sqrt(4*u**2 + 4*v**2 + 1))
L12 = 0
L22 = 2/(sy.sqrt(4*u**2 + 4*v**2 + 1))

ej6primFun=sy.Matrix([[g11, g12],[g12, g22]])

ej6segFun=sy.Matrix([[L11,L12],[L12,L22 ]])

gaussb= (ej6primFun[1,1]*((ej6segFun[0,0]*ej6segFun[1,1] - (ej6segFun[0,1])**2)))/(ej6primFun[0,0]*ej6primFun[1,1] - ej6primFun[0,1]**2)


Eu=sy.diff(ej6primFun[0,0], u)
Ev=sy.diff(ej6primFun[0,0], v)
Fu=sy.diff(ej6primFun[0,1], u)
Fv=sy.diff(ej6primFun[0,1], v)
Gu=sy.diff(ej6primFun[1,1], u)
Gv=sy.diff(ej6primFun[1,1], v)

c111=Eu/2
c121=Ev/2
c221=(2*Fv-Gu)/2
c112=(2*Fu-Ev)/2
c122=Gu/2
c222=Gv/2
crist = sy.Matrix([[c111, c121,c221],[c112, c122,c222]])

invPrimeraFun6 = ej6primFun.inv()

segEspecie = invPrimeraFun6*crist


gauss2b= sy.diff(segEspecie[0,2], u) - sy.diff(segEspecie[0,1], v) + ( segEspecie[0,2]*segEspecie[0,0]-segEspecie[0,1]*segEspecie[0,1] ) + ( segEspecie[1,2]*segEspecie[0,1]-segEspecie[1,1]*segEspecie[0,2] )


gaussb=gaussb.subs(u,u1)
gaussb=gaussb.subs(v,v1).evalf()
gauss2b=gauss2b.subs(u,u1)
gauss2b=gauss2b.subs(v,v1)


print("")
print(gaussb)
print(gauss2b)
print("")

print("c) ecuacion Mainardi (i,j) = (1,2)")

main1c = sy.diff(L11,v) - sy.diff(L12,u)
main2c = (segEspecie[0,1]*L11)+(segEspecie[1,1]*L12)-(segEspecie[0,0]*L12)-(segEspecie[1,0]*L22)


main1c=main1c.subs(u,u1)
main1c=main1c.subs(v,v1)
main2c=main2c.subs(u,u1)
main2c=main2c.subs(v,v1)

print("")
print(main1c)
print(main2c)

print("")
print("d) ecuacion Mainardi (i,j) = (2,1)")

main1d = sy.diff(L22,u) - sy.diff(L12,v)
main2d = (segEspecie[0,1]*L11)+(segEspecie[1,1]*L12)-(segEspecie[0,2]*L12)-(segEspecie[1,2]*L22)

main1d=main1d.subs(u,u1)
main1d=main1d.subs(v,v1)
main2d=main2d.subs(u,u1)
main2d=main2d.subs(v,v1)

print("")
print(main1d)
print(main2d)
print("")