#include <iostream>
#include <cmath>
#include <string>


using namespace std;

int main(){
    string nome;
    cout << sqrt(900.0) << endl; /* Raiz quadrada */
    cout << ceil(9.2) << endl; /* Arredonda um número  */
    cout << exp(1.0) << endl; /* Função exponencia e^x*/
    cout << log10(100) << endl; /* Log de x na base 10 */
    cout << "Informe um nome: " << endl;
    getline(cin,nome);
    cout << "Prazer em te conhecer " << nome << endl; 
    return 0;
}