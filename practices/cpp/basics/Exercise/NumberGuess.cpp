#include <iostream>
#include <random>

using namespace std;

// 숫자 맞추기 게임

int main() {
    // 난수 생성
    std::random_device rd;
    std::mt19937 gen(rd());
    std::uniform_int_distribution<int> dis(1, 99);

    int number = dis(gen);

    while(1) {
        int guess;
        cout << "입력: ";
        cin >> guess;

        if (guess == number) {
            cout << "정답!" << endl;
            break;
        } else if (guess > number) {
            cout << "너무 큽니다." << endl;
        } else {
            cout << "너무 작습니다." << endl;
        }
    }
}