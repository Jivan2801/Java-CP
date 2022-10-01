// *
// * *
// * * *
// * * * *
// * * * * *

#include<iostream>
using namespace std;

void prb1(int n){
    for (int row = 1; row <= n; row++){
        for(int col = 1; col <=row; col++){
            cout << "* ";
        }
        cout << "\n";
    }
}

int main() {
    prb1(8);
}