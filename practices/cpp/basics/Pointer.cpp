#include <iostream>

using namespace std;

int main() {
    int a = 123;
    
    // address of 주소 연산자 & ampersand
    cout << a << " " << &a << endl; // 123 0x16ae2e1bc

    int *b = &a; // b에 a의 주소를 저장

    // deference operator (역참조 연산자)
    cout << b << " " << *b << endl; // 0x16ae2e1bc 123

    *b = 567;

    cout << a << " " << b << " " << *b << endl; // 567 0x16ae2e1bc 567

    // 포인터 자체의 주소 크기와 자료형의 크기 (주소의 크기는 항상 동일)
    double *c = nullptr; // 아무 주소도 가르키고 있지 않다는 의미로 초기화, 0도 많이 사용

    cout << sizeof(int) << " " << sizeof(double) << endl; // 4 8
    cout << sizeof(int *) << " " << sizeof(double *) << endl; // 8 8
    cout << sizeof(b) << " " << sizeof(c) << endl; // 8 8

    // 포인터 연산과 배열
    // 포인터를 배열로 사용하는 경우가 있음

    // size_t 안내 (여기서는 주소를 10진수로 변환 용도)
    cout << sizeof(size_t) << endl; // 8
    cout << size_t(b) << " " << size_t(b + 1) << " " << size_t(b + 2) << endl; 
    // 6155854232 6155854236 6155854240
    cout << size_t(c) << " " << size_t(c + 1) << " " << size_t(c + 2) << endl; // 0 8 16

    // sizeof(char) === 1

    // 문자열, 배열 연결시키기
    int my_array[] = {23, 38, 56, 69, 74};
    char my_str[] = {'h', 'e', 'l', 'l', 'o', '\0'};

    char *ptr = my_str; // 배열의 이름은 포인터

    cout << *(ptr + 3) << endl; // l
    cout << ptr[3] << endl; // l

    return 0;
}