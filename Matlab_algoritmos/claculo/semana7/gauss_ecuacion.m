A=[-3 1 -1; 5 -2 1; -1 1 3]
b =[-4; 6; 0]
function x=gauss_ecuacion(A,b)
    Ab=[A b];
    n=length(b);
%matriz triangular
  for k=1:n-1 
        [mayor,j]=max(abs(Ab(k:n,k)));
        fila=j+k-1;
        if fila~=k
            Ab([k,fila],:)=Ab([fila,k],:);%intercambio de filas
        end
        for i=k+1:n
            factor=Ab(i,k)/Ab(k,k);
            Ab(i,k:n+1)=Ab(i,k:n+1)-factor*Ab(k,k:n+1);          
        end
    end
%incógnitas
    x=zeros(n,1);
    x(n)=Ab(n,n+1)/Ab(n,n);
    for i=n-1:-1:1 
        x(i)=Ab(i,n+1)/Ab(i,i)-Ab(i,i+1:n)*x(i+1:n)/Ab(i,i); 
    end
end