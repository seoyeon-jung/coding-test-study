#include <iostream>

using namespace std;

int main() {
    // 변수를 정의할 때 자료형을 미리 지정해야 한다
    // 자료형을 바꿀 수 없음

    // 내부적으로 이미 메모리를 갖고 있음
    int i; // 변수 정의
    i = 123; // 변수에 값 지정 (객체 래퍼런스 아님)

    // sizeof
    cout << i << " " << sizeof(i) << endl; // 123 4

    float f = 123.456f; // 마지막 f 주의 (4byte)
    double d = 123.456; // f 불필요 (8bytes)

    // 문제풀이 시스템에 따라 double을 기본으로 사용하는 경우도 있음
    cout << f << " " << sizeof(f) << endl; // 123.456 4
    cout << d << " " << sizeof(d) << endl; // 123.456 8

    // c++는 글자 하나와 문자열을 구분한다
    char c = 'a';
    char str[] = "Hello World"; // std::string
   
    cout << c << " " << sizeof(c) << endl; // a 1
    cout << str << " " << sizeof(str) << endl; // Hello World 12

    // 그 외에도 다양한 자료형 존재

    // 형변환
    i = 987.654; // double을 int에 강제로 저장
    cout << "int from double" << i << endl; // 987

    f = 567.89; // 형변환
    cout << "float from double" << f << endl; // 567.89

    // 기본 연산자
    i += 100; // 1087
    i++; // 1088

    cout << "i = " << i << endl; // 1088

    // boolean
    bool is_good = true;
    is_good = false;
    cout << is_good << endl; // 0

    is_good = true;
    cout << is_good << endl; // 1

    cout << boolalpha << true << endl; // true
    cout << is_good << endl; // true
    cout << noboolalpha << true << endl; // 1

    // 비교
    cout << (1 > 3) << endl; // 0
    cout << (3 == 3) << endl; // 1
    cout << (i >= 3) << endl; // 1
    cout << ('a' != 'c') << endl; // 1
    cout << ('a' == 'a') << endl; // 1

    // scope
    i = 123; // 더 넓은 영역

    {
        int i = 345;
        cout << i << endl; // 345
    }
    cout << i << endl; // 123

    return 0;
}