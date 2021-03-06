# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

import sympy as sy
sy.init_printing()
x, y, z, t = sy.symbols('x y z t')
a11 = 2
a12 = 6
a22 = 2
b1 = 1
b2 = 1
c = 1
#definimos la matriz A
A = sy.Matrix([[a11, sy.Rational(a12, 2)],[sy.Rational(a12, 2), a22]]) 
#definimos la matriz b
b = sy.Matrix([[b1,b2]])
#siendo P la matriz de giro de forma que A = PDP**-1
P, D = A.diagonalize()
n=1/sy.sqrt(abs(P.det()))
P2=n*P

V=sy.Matrix([[x,y]])
Vtras = V.transpose()

ec= sum(V*D*Vtras + b*P2*Vtras, c)

x1, y1, x2, y2 = sy.symbols('x1 y1 x2 y2')


"""
Ejercicio de curvatura con signo de curva en t0
"""

#punto t0
t0=-1
#Curva y sus dos primeras derivadas
curva = [sy.cos(t)*sy.exp(t), sy.exp(t), 0]
curva1 = sy.Matrix([sy.diff(curva[0], t), sy.diff(curva[1], t), sy.diff(curva[2], t)])
curva2 = sy.Matrix([sy.diff(curva[0], t, 2), sy.diff(curva[1], t, 2), sy.diff(curva[2], t, 2)])
#norma de la primera derivada
normaCurva1=curva1.norm()
#producto vectorial de las derivadas
prodVect= sy.Matrix(curva1).cross(sy.Matrix(curva2))
#formula de prod vect entre norma
M = prodVect/(normaCurva1**3)
#curvatura con signo de la curva
ks= M[2]
#Curvatura con signo en el punto
kst02=ks.subs(t, t0).evalf()


"""
Ejercicio de centro de curvatura en t0
"""
#punto t0
t0=1
#Curva y sus dos primeras derivadas
curva = sy.Matrix([t-sy.sin(t), 2*t+ sy.cos(t), 0])
curva1 = sy.Matrix([sy.diff(curva[0], t), sy.diff(curva[1], t), sy.diff(curva[2], t)])
curva2 = sy.Matrix([sy.diff(curva[0], t, 2), sy.diff(curva[1], t, 2), sy.diff(curva[2], t, 2)])
#norma de la primera derivada
normaCurva1=curva1.norm()
#producto vectorial de las derivadas
prodVect= sy.Matrix(curva1).cross(sy.Matrix(curva2))
#formula de prod vect entre norma
M = prodVect/(normaCurva1**3)
#curvatura con signo de la curva
ks= M[2]
#Curvatura con signo en el punto
kst0=ks.subs(t, t0).evalf()

curvaAlpha=curva.subs(t,t0).evalf()
Tan = sy.Matrix([curva1[0].subs(t,t0),curva1[1].subs(t,t0)])
Tan2 = Tan/Tan.norm()
Norm=[-Tan2[1],Tan2[0]]

Centro=sy.Matrix([curvaAlpha[0]+1/kst0*Norm[0],curvaAlpha[1]+1/kst0*Norm[1]]).evalf()



"""
Ejercicio de Triedro de Frenet
"""

curva = sy.Matrix([t+sy.log(t**2 +1)+1, t**2 , t ])
vel = sy.Matrix([sy.diff(curva[0], t), sy.diff(curva[1], t), sy.diff(curva[2], t)])
ac = sy.Matrix([sy.diff(curva[0], t, 2), sy.diff(curva[1], t, 2), sy.diff(curva[2], t, 2)])
normVel = vel.norm()
prodVelAc= sy.Matrix(vel).cross(sy.Matrix(ac))
normProd=prodVelAc.norm()

T1=vel/normVel
B1=prodVelAc/normProd

T=T1.subs(t,t0).evalf()
B=B1.subs(t,t0).evalf()
N=sy.Matrix(B).cross(sy.Matrix(T))

"""
Ejercicio de torsi??n
"""
t0=1
curva4 = sy.Matrix([t-sy.sin(t), t , 2*t + sy.cos(t) ])
vel = sy.Matrix([sy.diff(curva4[0], t), sy.diff(curva4[1], t), sy.diff(curva4[2], t)])
ac = sy.Matrix([sy.diff(curva4[0], t, 2), sy.diff(curva4[1], t, 2), sy.diff(curva4[2], t, 2)])
derv3 = sy.Matrix([sy.diff(curva4[0], t, 3), sy.diff(curva4[1], t, 3), sy.diff(curva4[2], t, 3)])

prodVelAc= sy.Matrix(vel).cross(sy.Matrix(ac))
normprodVelAc=prodVelAc.norm()
torsion = (sy.Matrix(prodVelAc).dot(sy.Matrix(derv3)))/(normprodVelAc**2)

torsion.subs(t,t0).evalf()

