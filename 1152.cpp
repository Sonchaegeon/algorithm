#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    string str;
    int i = 0, cnt = 1;
    getline(cin, str);

    for(i = 0; i < str.length(); i++) {
        if(str[i] == ' ') cnt++;
    }
    if(str[0] == ' ') cnt--;
    if(str[str.length() - 1] == ' ') cnt--;
    cout << cnt;
    return 0;
}
