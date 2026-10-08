#include <iostream>

using namespace std;

int main() {
    // cin은 데이터를 흘려 보내는 스트림
    // 그 데이터를 해석하는 것은 자료형
    // 자료형에 따라서 알아서 처리해주기 떄문에 scanf() 보다 편리

    char user_input[100];

    // cin과 getline 차이
    cout << "원하는 문장을 입력해주세요." << endl;
    cout << "입력: ";

    cin.getline(user_input, sizeof(user_input)); // 공백 포함 입력 가능
    cout << "입력한 문장: " << user_input << endl;
    // 중간에 줄바꿈, 빈칸 있으면 그 이후로는 받아오지 않음

    int number = -1;

    cin >> user_input; // 공백 전까지만 입력 가능
    
    // cin.getline(user_input, sizeof(user_input)); // 공백 포함 입력 가능
    // > getline 으로 입력받으면 공백 포함해서 입력 가능
    // (예) hello wolrd 입력 -> hello world 출력

    // cin.ignore(100, '\n'); // 최대 100글자까지 입력 받고 무시

    cin >> number; // 공백 전까지만 입력 가능
    cout << user_input << " " << number << endl;
    // cin 사용 시 'helo world' 입력 -> 'hello 0' 출력 (공백 이후는 무시)

    return 0;
}