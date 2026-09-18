#include <iostream>

using namespace std;

int main() {
    // for 기본 예제
    for (int i = 0; i < 10; i++) {
        cout << i << " ";
    }
    cout << endl; // 0 1 2 3 4 5 6 7 8 9

    // 배열 데이터 출력 연습 문제로 제공
    // 힌트 : sizeof(my_array)
    int my_array[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
    for (int i = 0; i < sizeof(my_array) / sizeof(int); i++) {
        cout << my_array[i] << " ";
    }
    cout << endl; // 0 1 2 3 4 5 6 7 8 9 

    // 문자열 출력
    char my_string[] = "Hello\n World";

    // 문자열을 한 글자씩 출력하ㅣㄱ
    // cout << my_string << endl; 사용 금지
    for (int i = 0; i < sizeof(my_string); i++) {
        if (my_string[i] == '\0') {
            break;
        }
        cout << my_string[i];
    }
    cout << endl;
    // Hello
    //  World

    // segmentation fault 발생 예제
    // for(int i = 0; my_string[i] != ]'\0'; i++) {
    //     cout <<  i << " " << my_string[i] << endl;
    // }

    // while 기본 예제
    int i = 0;
    while (i < 10) {
        cout << i << " ";
        i++; // 무한반복 주의
    }
    cout << endl; // 0 1 2 3 4 5 6 7 8 9

    // 실습
    while (true) {
        // 0~9 출력
        cout << i << " ";
        i++;
        if (i >=10)
            break;
    }
    cout << endl; // 0 1 2 3 4 5 6 7 8 9 

    // 런타임 오류 주의
    i = 0;
    while (i < sizeof(my_string) && my_string[i] != '\0') {
        cout << my_string[i];
        i++;
    }
    cout << endl; // Hello 

    return 0;
}