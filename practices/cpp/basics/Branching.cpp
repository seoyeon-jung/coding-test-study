#include <iostream>

using namespace std;

int main() {
    // 0 아니면 true다 안내
    // 나머지 연산자 안내
    // 줄바꿈 '\n' newline
    // 블럭 내용이 한 줄일 경우에는 {} 생략 가능

    int number;
    cin >> number;

    if (number % 2 == 0) {
        cout << "Even" << endl;
    } else {
        cout << "Odd" << endl;
    }

    // 조건 연산자 (삼항연산자)
    // cout << (number % 2 == 0 ? "Even" : "Odd") << endl;

    // switch-case
    switch (number) {
    case 0:
        cout << "Zero" << endl;
        break;
    case 1:
        cout << "One" << endl;
        break;
    default:
        cout << "Other" << endl;
    }

    return 0;
}