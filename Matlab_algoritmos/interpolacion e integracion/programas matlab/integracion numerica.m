clear; 
format long
fprintf('\n\t::::::::::PROGRAMADO POR: Obed Gómer Cruz Campos::::::::::\n');
while 1
disp('[1] TRAPECIO SIMPLE (h>0)')
disp('[2] TRAPECIO COMPUESTO(h<0)')
disp('[3] FORMULA DE SIMPSON SIMPLE')
disp('[4] FORMULA DE LOS TRES OCTAVOS DE SIMPSON')
disp('[5] FORMULA DE SIMPSON COMPUESTO')
disp('[6] INTEGRACION DE ROMBERG')
disp('[7] ROMBERG MODIFICADO')
disp('[8] VOLVER')
elecc3 = input('ELIGA OPCION ');

switch elecc3
    %TRAPECIO SIMPLE
 case 1
 clc; clear;
 fprintf('\t\tTRAPECIO SIMPLE\n')
 funcion=input('ingrese la funcion \n f(x)=','s');
 b=input('ingrese el limite superior de la integral\n');
 a=input('ingrese el limite inferior de la integral\n');
 h=b-a;
 x=a;
 f=eval(funcion);
 x=b;
 f= (f+eval(funcion))*(h/2);
 fprintf('El valor aproximado es: %10.15f\n\n',f)
 
 case 2
 clc; clear;
 fprintf('\t\tTRAPECIO COMPUESTO\n')
 funcion=input('ingrese la funcion \n f(x)=','s');
 b=input('ingrese el limite superior de la integral\n');
 a=input('ingrese el limite inferior de la integral\n');
 n=input('ingrese el numero de intervalos\n');
 h=(b-a)/n;
 f=0;
 for k=1:n-1
 x=a+h*k;
 f=f+eval(funcion);
 end
 f=2*f;
 x=a; f=f+eval(funcion); x=b; f=f+eval(funcion);
 f=(h/2)*(f);
 fprintf('El valor aproximado es: %10.15f\n\n',f)
 
 case 3
 clc; clear;
 fprintf('\t\tFORMULA DE SIMPSON SIMPLE\n')
 funcion=input('ingrese la funcion \n f(x)=','s');
 b=input('ingrese el limite superior de la funcion\n');
 a=input('ingrese el limite inferior de la integral\n');
 h=(b-a)/2;
 x=a; f=eval(funcion); x=b; f=f+eval(funcion);
 x=a+h; f=f+ 4*(eval(funcion));
 f=(h/3)*f;
 fprintf('El valor aproximado de la integral es: %10.15f\n\n',f)
 
 case 4
 clc; clear;
 fprintf('\t\tFORMULA DE LOS TRES OCTAVOS DE SIMPSON\n')
 funcion=input('ingrese la funcion \n f(x)=','s');
 b=input('ingrese el limite superior de la funcion\n');
 a=input('ingrese el limite inferior de la integral\n');
 h=(b-a)/3;
 x=a;
 f=eval(funcion);x=a+h; f=f+3*(eval(funcion));
 x=a+2*h; f=f+3*(eval(funcion)); x=b;
 f=f+eval(funcion);
 f=(3*h/8)*f;
 fprintf('El valor aproximado de la integral es: %10.15f\n\n',f)
 
 case 5
 clc; clear;
 fprintf('\t\tFORMULA DE SIMPSON COMPUESTO\n')
 funcion=input('ingrese la funcion \n f(x)=','s');
 b=input('ingrese el limite superior de la integral\n');
 a=input('ingrese el limite inferior de la integral\n');
 n=input('ingrese el numero de intervalos');
 h=(b-a)/(2*n);
 f=0;
 for k=1:n-1
 x=a+h*(2*k);
 f=f+eval(funcion);
 end
 f1=0;
 for k=1:n
 x=a+h*(2*k-1);
 f1=f1+eval(funcion);
 end
 f=2*f+4*f1;
 x=a; f=f+eval(funcion); x=b; f=f+eval(funcion);
 f=(h/3)*f;
 fprintf('el valor aproximado de la integral es: %10.15f\n\n',f)
 
 case 6
 clc; clear;
 fprintf('\t\tINTEGRACION DE ROMBERG\n')
 funcion=input('ingrese la funcion \n f(x)=','s');
 b= input('ingrese el límite superior de la integral \n');
 a= input('ingrese el límite inferior de la integral \n');
 n= input('ingrese el número de intervalos\n');
 h=(b-a);
 M=1;
 J=0;
 R=zeros(n,n);
 x=a;
 f1=eval(funcion);
 x=b;
 f2=eval(funcion);
 R(1,1)=h*(f1+f2)/2;
 while (J<(n-1))
 J=J+1;
 h=h/2;
 s=0;
 for p=1:M
 x=a+h*(2*p-1);
 f3=eval(funcion);
 s=s+f3;
 end
 R(J+1,1)=(1/2)*(R(J,1))+h*s;
 M=2*M;
 for k =1:J
 R(J+1,k+1)=R(J+1,k)+(R(J+1,k)-R(J,k))/(4^k-1);
 end
 end
 R
 fprintf('La aproximacion buscada es: %10.15f\n\n', R(J+1,J+1))
 case 7
 clc; clear;
 fprintf('\t\tINTEGRACION DE ROMBERG\n')
 funcion=input('ingrese la funcion \n f(x)=','s');
 b=input('Ingrese el limite superior:\n');
 a=input('Ingrese el limite inferior:\n');
 n=input('Ingrese el numero de particiones:\n');
 tol=input('Ingrese la tolerancia:\n');
 M=1;
 h=b-a;
 err=1;
 J=0;
 R=zeros(4,4);
 x=a;
 f_a=eval(funcion);
 x=b;
 f_b=eval(funcion);
 R(1,1)=h*(f_a+f_b)/2;
 disp(' quad err h')
 while((err>tol)&(J<n))|(J<4)
 J=J+1;
 h=h/2;
 s=0;
 for p=1:M
 x1=a+h*(2*p-1);
 x=x1;
 f_x1=eval(funcion);
 s=s+f_x1;
 end
 R(J+1,1)=R(J,1)/2+h*s;
 M=2*M;
 for K=1:J
 R(J+1,K+1)=R(J+1,K)+(R(J+1,K)-R(J,K))/(4^K-1);
 end
 err=abs(R(J,J)-R(J+1,K+1));
 fprintf('%10.9f %10.9f %10.9f\n',R(J+1,J+1),err,h)
 end
 disp('LA MATRIZ TRIANGULAR INFERIOR ES:')
 disp(R)
 disp('El error es para el numero de particiones:')
 disp(err)
 disp('El tamaño de la ultima particion es:')
 disp(h)
 disp('La respuesta es:')
 disp(R(J+1,J+1))
 otherwise
 clc
 fprintf('\n\t::::::::::Derechos: Obed Gómer Cruz Campos::::::::::\n');
 fprintf('\t::::::::::::::::::UNHEVAL-FICA-2008:::::::::::::::::\n');
 fprintf('\n :::::::::::::::::::::::GRACIAS::::::::::::::::::::::\n');
 break
end
end