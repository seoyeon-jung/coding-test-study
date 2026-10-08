#include <iostream>
#include <cstring>

using namespace std;

struct MyStruct {
    int first;
    int second;
    // ... 추가 기능

    int Sum() {
        return first + second;
    }
};

int main() {

    MyStruct a;
    a.first = 123;
    a.second = 456;

    cout << sizeof(a) << endl; // 8

    // 포인터는 member(->) operator가 화살표
    MyStruct *ptr_a = &a;

    ptr_a->first = -6;

    cout << a.first << " " << a.second << " " << a.Sum() << endl; // -6 456 450
    cout << ptr_a->first << " " << ptr_a->second << " " << ptr_a->Sum() << endl; // -6 456 450

    // 배열도 가능
    MyStruct pairs[10];

    for (int i = 0; i < 10; i++) {
        // pairs->first = 1; 주의
        // pairs->second = i * 10;

        pairs[i].first = i;
        pairs[i].second = i * 10;
    }

    for (int i = 0; i < 10; i++) {
        cout << pairs[i].Sum() << endl;
    }
    
    return 0;
}