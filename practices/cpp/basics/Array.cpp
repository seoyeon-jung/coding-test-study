#include <iostream>

using namespace std;

int main() {
    int a = 1;
    int b = 2;
    int c = 3;
    // ...

    // 같은 자료형의 데이터를 저장하기 위히 메모리에 미리 잡아놓은 것
    int my_array[3] = {1, 2, 3}; // 배열 정의 및 초기화

    // 인덱싱 (zero-based)
    cout << my_array[0] << " "
        << my_array[1] << " "
        << my_array[2] << endl; // 1 2 3
    
    // 인덱싱으로 하나짜리 변수처럼 사용 가능
    my_array[1] = 5;
    cout << my_array[0] << " "
        << my_array[1] << " "
        << my_array[2] << endl; // 1 5 3
    
    // cout << my_array[10000] << endl; // 0 (쓰레기값이 나올 수도 있음)

    // 문자열은 기본적으로 문자의 배열
    char name[75] = "Hello World"; // 문자''와 "" 구분

    cout << name << " " << sizeof(name) << endl; // Hello World 75
    // Null character '\0' 존재

    name[10] = 'A';
    name[11] = 'B';
    name[12] = 'C';
    cout << name << endl; // ABClo WorlABC

    name[2] = '\0';
    cout << name << endl; // He
    // null character 이후의 문자는 출력되지 않음

    return 0;
}