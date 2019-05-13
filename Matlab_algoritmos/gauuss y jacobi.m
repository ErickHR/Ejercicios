function metodo=metodo()
format long
disp('¿QUE METODO DESEA UTILIZAR PARA RESOLVER EL PROBLEMA?');
disp('1.-MÉTODO DE JACOBI');
disp('2.-MÉTODO DE GAUSS');
disp('3.-SALIR');
n=input('SELECCIONE UNA OPCION: ');
if n==1
num=input('INTODUCE EL NUMERO DE ECUACIONES: ');
A=input('INTRODUCE LA MATRIZ DE COEFICIENTES: ');
b=input('INTRODUCE LA MATRIZ DE COEFICIENTES INDEPENDIENTES: ');
X0=input('INTRODUZCA LA MATRIZ INICIAL: ');
z=input('INTRODUZCA EL NUMERO DE ITERACIONES: ');
for f=1:z
for i=1:num
suma=0;
for j=1:num
if i~=j
suma=suma+A(i,j)*X0(j);
end
end
X(i)=(b(i)-suma)/A(i,i);
fprintf('%10.6f',X(i));
end
fprintf('\n');
X0=X;
end
elseif n==2
num=input('INTRODUCE EL NUMERO DE ECUACIONES: ');
A=input('INTRODUCE LA MATRIZ DE COEFICIENTES: ');
b=input('INTRIODUCE LA MATRIZ DE COEFICIENTES INDEPENDIENTES: ');
X0=input('INTRODUZCA LA MATRIZ INICIAL: ');
z=input('INTRODUZCA EL NUMERO DE ITERACIONES: ');
X=X0;
for f=1:z
for i=1:num
suma=0;
for j=1:num
if i~=j
suma=suma+A(i,j)*X(j);
end
end
X(i)=(b(i)-suma)/A(i,i);
fprintf('%10.4f', X(i));
end
X0=X;
fprintf('\n');
end
elseif n==3
return;
else
disp('ERROR');
end