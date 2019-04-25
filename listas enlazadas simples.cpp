#include<iostream>
#include<conio.h>
using namespace std;
struct nodo{
	int dato;
	nodo *siguiente;
}*primero, *ultimo;
void InsertarAdelante();
void InsertarFinal();
void MostrarLista();
void CantidadDeElementos();
void menuprincipal();
void menuinsertar();
void max();
void min();
void BuscarElemento();
void EliminarElemento();
void EliminarElementoDup();
void InsertarAntesNodo();
void InsertarDespuesNodo();
int main(){
	int opc;
	do{
		menuprincipal();
		cout<<endl<<"Ingresar opcion[1-10]: "; cin>>opc;
		cout<<endl<<endl;
		switch(opc){
			case 1:
				int ob;
				do{
					menuinsertar();
					cout<<"Ingrese opcion[1-3]: "; cin>>ob;
					switch(ob){
						case 1:
							InsertarAdelante();
							break;
						case 2:
							InsertarFinal();
							break;
					}
				}while(ob!=3);
				break;
			case 2:
				MostrarLista();
				break;
			case 3:
				CantidadDeElementos();
				break;
			case 4:
				max();
				break;
			case 5:
				min();
				break;
			case 6:
				BuscarElemento();
				break;
			case 7:
				EliminarElemento();
				break;
			case 8:
				EliminarElementoDup();
				break;
			case 9:
				InsertarAntesNodo();
				break;
			case 10:
				InsertarDespuesNodo();
				break;
		}
	}while(opc!=11);
}
void menuinsertar(){
	cout<<endl<<endl<<"***MENU INSERTAR***"<<endl<<endl<<"1. Insertar adelante"<<endl<<"2. Insertar Final"<<endl<<"3. Salir"<<endl;
}
void menuprincipal(){
	cout<<endl<<endl<<"***MENU PRINCIPAL***"<<endl<<endl<<"1. Insertar datos"<<endl<<"2. Mostrar elementos"<<endl<<"3. Cantidad de elementos"<<endl<<"4. Maximo"<<endl<<"5. Minimo"
	<<endl<<"6. Buscar"<<endl<<"7. Eliminar "<<endl<<"8. Eliminar elemento duplicado"<<endl<<"9. Insertar antes"<<endl<<"10. Insertar despues"<<endl<<"11.Salir"<<endl;
}
void InsertarAdelante(){
	nodo *nuevo=new nodo();
	cout<<"Ingrese datos: "; cin>>nuevo->dato;
	if(primero==NULL){
		primero=nuevo;
		primero->siguiente=NULL;
		ultimo=nuevo;
	}else {
		nuevo->siguiente=primero;
		primero=nuevo;
	}
	MostrarLista();
}
void InsertarFinal(){
	nodo *nuevo=new nodo();
	cout<<"Ingrese dato: "; cin>>nuevo->dato;
	if(primero==NULL){
		primero=nuevo;
		primero->siguiente=NULL;
		ultimo=nuevo;
	}else {
		ultimo->siguiente=nuevo;
		nuevo->siguiente=NULL;
		ultimo=nuevo;
	}
	MostrarLista();
}
void MostrarLista(){
	nodo *buscar=new nodo();
	buscar=primero;
	cout<<"Los elementos son: ";
	while(buscar!=NULL){
		cout<<buscar->dato<<" - ";
		buscar=buscar->siguiente;
	}
	cout<<endl;
}
void CantidadDeElementos(){
	nodo *cantidad=new nodo();
	cantidad=primero;
	int cant=0;
	while(cantidad!=NULL){
		cant++;
		cantidad=cantidad->siguiente;
	}
	cout<<"Cantidad de elementos: "<<cant<<endl;
}
void max(){
	nodo *max=new nodo();
	int num;
	max=primero;
	while(max!=NULL){
		if(num<max->dato) num=max->dato;
		max=max->siguiente;
	}
	cout<<endl<<"EL maximo elemento es: "<<num<<endl;
}
void min(){
	nodo *min=new nodo();
	int num=ultimo->dato;
	min=primero;
	while(min!=NULL){
		if(num>min->dato) num=min->dato;
		min=min->siguiente;
	}
	cout<<endl<<"El minimo elemento es: "<<num<<endl;
}
void BuscarElemento(){
	nodo *bus=new nodo();
	bus=primero;
	int ele,cont=0;
	cout<<"Ingrese el elemento a buscar: ";cin>>ele;
	while(bus!=NULL){
		cont++;
		if(bus->dato==ele){
			cout<<"El elemento si existe en la lista: "<<bus->dato<<", Posicion: "<<cont<<endl;
			MostrarLista();
		}
		bus=bus->siguiente;
	}
}
void EliminarElemento(){
	nodo *eliminar=new nodo();
	nodo *anterior=new nodo();
	eliminar=primero;
	anterior=primero;
	MostrarLista();
	int numel;
	cout<<"Numero a eliminar: "; cin>>numel;
	while(eliminar!=NULL){
		if(eliminar->dato==numel){
			if(primero->dato==numel){
				primero=primero->siguiente;
			}else {
				anterior->siguiente=eliminar->siguiente;
			}
			break;
		}
		anterior=eliminar;
		eliminar=eliminar->siguiente;
	}
}
void EliminarElementoDup(){
	nodo *eliminar=new nodo();
	nodo *anterior=new nodo();
	eliminar=primero;
	anterior=primero;
	cout<<endl;
	int numel;
	MostrarLista();
	cout<<endl<<"Numero a eliminar: "; cin>>numel;
	while(eliminar!=NULL){
		if(eliminar->dato==numel){
			if(primero->dato==numel){
				primero=primero->siguiente;
			}else {
				anterior->siguiente=eliminar->siguiente;
			}
		}
		anterior=eliminar;
		eliminar=eliminar->siguiente;
	}
}
void InsertarAntesNodo(){
	nodo *insertardato=new nodo();
	nodo *anterior= new nodo();
	nodo *actual=new nodo();
	anterior=primero;
	actual=primero;
	int inser,num;
	if(primero!=NULL){
		MostrarLista();
		cout<<endl<<"Numero a insertar: ";cin>>insertardato->dato;
		cout<<endl<<"Antes de que numero?: ";cin>>num;
		while(actual!=NULL){
			if(actual->dato==num){
				if(primero->dato==num){
					insertardato->siguiente=primero;
					primero=insertardato;
				}else {
					anterior->siguiente=insertardato;
					insertardato->siguiente=actual;
				}
			}
			anterior=actual;
			actual=actual->siguiente;
		}
	}else cout<<endl<<"La lista esta vacia"<<endl;
	
}
void InsertarDespuesNodo(){
	nodo *actual=new nodo();
	nodo *insertar=new nodo();
	actual=primero;
	int numero;
	if(primero!=NULL){
		MostrarLista();
		cout<<"Que numero desea insertar? : ";cin>>insertar->dato;
		cout<<"delante de que numero desea insertar? : ";cin>>numero;
		while(actual!=NULL){
			if(actual->dato==numero){
				insertar->siguiente=actual->siguiente;
				actual->siguiente=insertar;
			}
			actual=actual->siguiente;
		}
		
	}else cout<<endl<<endl<<"La lista se encuentra vacia"<<endl<<endl;
	
		MostrarLista();
}
