clc;
x=input('Introduzca el valor de x:');
xi=input('Introduzca los valores de X0,.....,Xn[X0 ..... Xn]:');Qij=zeros(length(xi),length(xi));
i=0;
j=0;
numerador=0;
denominador=0;
for i=1:length(xi)
fprintf('Introduzca el valor deQ%1.0f0[F(%1.2f)]:',i-1,xi(i));
Qij(i,1)=input('');
end
i=0;fprintf('\n\nQij=[(x-xi-j)Qij-1-(x-xi)Qi-1j-1]/(xi-xi-j)\n');
for i=1:length(xi)
fprintf('Q%1.0f0=P%1.0f=F(%1.2f)=%2.9f\n',i-1,i-1,xi(i),Qij(i,1));
end
for i=2:length(xi)for j=2:length(xi)
if i>=j
if i==j
numerador=(x-xi(1))*Qij(i,j-1)-(x-xi(i))*Qij(i-1,j-1);denominador=xi(i)-xi(1);fprintf('Q%1.0f%1.0f=((x-x0)*Q%1.0f%1.0f-(x-x%1.0f)*Q%1.0f%1.0f)/(x%1.0f-x0)=',i-1,j-1,i-1,j-2,i-1,i-2,j-2,i-1);
else
numerador=(x-xi(i-j+1))*Qij(i,j-1)-(x-xi(i))*Qij(i-1,j-1);denominador=xi(i)-xi(i-j+1);fprintf('Q%1.0f%1.0f=((x-x%1.0f)*Q%1.0f%1.0f-(x-x%1.0f)*Q%1.0f%1.0f)/(x%1.0f-x%1.0f)=',i-1,j-1,i-j,i-1,j-2,i-1,i-2,j-2,i-1,i-j);
end
Qij(i,j)=numerador/denominador;fprintf('%2.9f/%2.9f=%2.9f\n',numerador,denominador,Qij(i,j));
end
end
end
