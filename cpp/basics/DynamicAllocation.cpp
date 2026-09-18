#include <iostream>
#include <cstring>

using namespace std;

const int kMaxStr = 100; // 전역상수

int Min(int a, int b) {
    return a < b ? a : b;
}

int main() {
    // 문자열 복사
    char str1[] = "Hello, World!";
    char str2[kMaxStr];

    // dest, src 안내 (복사할 메모리 크기 주의 안내)
    // sizeof(배열이름) : 배열이 사용하는 메모리 전체 크기
    memcpy(str2, str1, Min(sizeof(str1), sizeof(str2)));
    cout << str2 << endl; // Hello, World!

    char *dynamic_array = new char[kMaxStr]; // 동적할당

    // 동적할당 메모리는 변수 사이즈가 포인터 사이즈이다 (배열이 아님)
    memcpy(dynamic_array, str1, kMaxStr);
    cout << dynamic_array << endl; // Hello, World!

    cout << str1 << " " << str2 << " " << dynamic_array << endl; 
    // Hello, World! Hello, World! Hello, World!
    cout << size_t(str1) << " " << size_t(str2) << " " << size_t(dynamic_array) << endl; 
    // 6164242824 6164242724 4309048128

    // 보통 크기를 별도로 지정함

    delete[] dynamic_array; // 동적할당 해제

    // 지우지 않고 재할당할 경우 잃어버림
    // dynamic_array = new char[원하는크기];
    // delete[] dynamic_array; 다시 지워줘야 한다

    return 0;
}