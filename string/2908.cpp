#include <iostream>
using namespace std;

int main() {
    int i;
    string x, y;
    cin >> x >> y;

    for (i = 2; i >= 0; i--) {
        if (x[i] == y[i]) {
            cout << x[i];
        }
        else if (x[i] > y[i]) {
            while (i >= 0) cout << x[i--];
        }
        else {
            while (i >= 0) cout << y[i--];
        }
    }
    return 0;
}
