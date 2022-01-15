# -*- coding: utf-8 -*-
"""
Created on Mon Nov 29 17:03:38 2021

@author: Gonzalo
"""

import sympy as sy
u, v = sy.symbols('u,v', real = True)
x,y,z,t = sy.symbols('x,y,z,t', real = True)

#sup = [sy.cosh(u)*sy.cosh(v)-3, sy.sinh(u), v]
sup = [u**2+u-2, u**2+v**2,v**2-3*v]

sdu = [sy.diff(sup[i], u) for i in range(3)]
sdv = [sy.diff(sup[i], v) for i in range(3)]



"""
Ejercicio 1
"""
print("Ejercicio 1 ")

E = sy.Matrix(sdu).dot(sy.Matrix(sdu))
F = sy.Matrix(sdu).dot(sy.Matrix(sdv))
G = sy.Matrix(sdv).dot(sy.Matrix(sdv))

E = E.subs(u,1)
E = E.subs(v,1).evalf()
F = F.subs(u,1)
F = F.subs(v,1).evalf()
G = G.subs(u,1)
G = G.subs(v,1).evalf()

primeraFun = sy.Matrix([[E, F],[F, G]]) 

print(primeraFun)
print("")

"""
Ejercicio 2
"""
print("Ejercicio 2 ")
p1=0
p2=1

vector = sy.Matrix(sdu).cross(sy.Matrix(sdv)).normalized()
vector = vector.subs(u,p1)
vector = vector.subs(v,p2).evalf()

sup=sy.Matrix(sup)

superfP = sy.Matrix(sup).subs(u,p1)
superfP = superfP.subs(v,p2).evalf()

term = sy.Matrix(vector).dot(sy.Matrix(superfP))

print("Multiplicando x,y,z: ")
print(vector)

print("Term indep: ")
print(term)
print("")

"""
Ejercicio3
"""
from scipy.integrate import dblquad
print("Ejercicio 3 ")
u1=-1
u2=1
v1=-1
v2=1
elemArea = sy.lambdify((u, v), (sy.Matrix(sdu).cross(sy.Matrix(sdv)).norm()), "numpy")
area = dblquad(elemArea, v1, v2, lambda u: u1, lambda u: u2)

print("Area: ")
print(area)
print("")

"""
duxdv=sy.Matrix(sdu).cross(sy.Matrix(sdv))
n = sy.Matrix(duxdv).normalized()
n=n.norm()
sy.Matrix(vecVel).norm()
"""


"""
Ejercicio 4
"""
print("Ejercicio 4 ")

alpha = [-1+2*t**2, 2-t**2]

gamma=sy.Matrix(sup).subs(u,alpha[0])
gamma=gamma.subs(v,alpha[1])
gamma1 = [sy.diff(gamma[i],t) for i in range(3)]
gamma2 = [sy.diff(gamma1[i],t) for i in range(3)]

n= sy.Matrix(sdu).cross(sy.Matrix(sdv)).normalized()

m = sy.Matrix(n).subs(u,alpha[0])
m = m.subs(v,alpha[1])

cnormal=(sy.Matrix(gamma2).dot(sy.Matrix(m)))/(sy.Matrix(gamma1).norm()**2)



t0=1

cnormal= cnormal.subs(t,t0).evalf()

print("Curvatura Normal: ")
print(cnormal)
print("")

"""
Ejercicio 5
"""

print("Ejercicio 5 ")

cgeo= sy.Matrix(gamma1).dot(sy.Matrix(gamma2).cross(sy.Matrix(m)))/((sy.Matrix(gamma1).norm())**3)
cgeo0=cgeo.subs(t,t0).evalf()
print("Curvatura Geo: ")
print(cgeo0)
print("")

