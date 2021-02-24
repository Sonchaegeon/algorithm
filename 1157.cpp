#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    string str;
    cin >> str;
    int max = 0, cnt = 0, target = 0;
    int a[26] = { 0, };
    transform(str.begin(), str.end(), str.begin(), toupper);

    for (int i = 0; i < str.length(); i++) {
        a[str[i] - 'A']++; // index -> askii code operation
    }

    for (int i = 0; i < 26; i++) {
        if (max < a[i]) {
            max = a[i];
            cnt = 0;
            target = i;
        }
        if (max == a[i]) {
            cnt++;
        }
    }
    if (cnt > 1) cout << "?";
    else cout << (char)(target + 'A');
    return 0;
}
