#include <iostream>
using namespace std;

int main() {
    string dial;
    int alpha[26] = { 0, };
    int i, time = 0, result = 0;
    cin >> dial;

    for (i = 0; i < dial.length(); i++) {
        alpha[dial[i] - 'A']++;
    }

    for (i = 0; i < 26; i++) {
        time = i / 3 + 3;
        if (i == 'S' - 'A' || i == 'V' - 'A') {
            time = i / 3 + 2;
        }

        if (alpha[i]) {
            time = (time > 9) ? 10 : time;
            result += time * alpha[i];
        }
    }
    cout << result;
    return 0;
}
