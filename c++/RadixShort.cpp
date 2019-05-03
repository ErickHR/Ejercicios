#include <iostream>
#include <vector>
#include <math.h>
using namespace std;

vector< vector <int> > Vector;

int main(){
	
	
	int cantidad_numeros;
	int mayor;
	int cantidad_digitos = 0;
	
	cout << "***METODO DE RADIXSHORT***\n\n";
	cout << "Ingrese la cantidad de numeros: "; cin >> cantidad_numeros;
	
	int vector_numeros[cantidad_numeros];
	
	cout << "Inserte valores: \n";
	
	//inserta valores
	for ( int i = 0; i < cantidad_numeros; i++ ){
		
		cout << i+1 << ") " ; cin >> vector_numeros[i];
		
	}
	
	//busca el mayor numero
	mayor = vector_numeros[0];
	for ( int i = 1; i < cantidad_numeros; i++){
		
		if ( mayor <= vector_numeros[i]){
			
			mayor = vector_numeros[i];
			
		}
		
	}
	
	//del mayor numero, saca la cantidad de digitos que tiene
	while ( mayor > 0 ){
		
		mayor = mayor / 10;
		cantidad_digitos++;
		
	}
	
	//aqui viene la magia
	for ( int i = 0; i < cantidad_digitos; i++){
		
		Vector.resize(10);//asignamos 10 por que son 10 digitos (0-9)
		
		int digito;//es el residuo
		int m = 0;
		
		int p = 0;
		int r = 0;
		
		for ( int j = 0; j < cantidad_numeros; j++){
			
			digito = (int) (vector_numeros[j] / pow(10, i)) % 10;//saca el residuo
			Vector[digito].push_back(vector_numeros[j]);//inserta a la matriz vector
			
		}
		
		for ( int k = 0; k < 10; k++){//recorre la cantidad de columnas de Vector
			
			for ( int l = 0; l < Vector[k].size() ; l++ ){ //recorre la cantidad de filas que tiene la columna
				
				vector_numeros[m] = Vector[k][l]; //inserta todos los elementos del vector  a vector_numeros
				
				m++;
				
			}
			
			Vector[k].clear();//elimina los valores de la columna vector
			
		}
		
	}
	
	cout<<"\n\nEl vector ordenado en forma ascedente\n";
	
	for ( int i = 0; i < cantidad_numeros; i++ ){
		
		cout << vector_numeros[i] << " - ";
		
	}
	
} 
