#include <iostream>
#include <cstring>

using namespace std;

// public, private 접근 권한 안내

class Myclass {
    public:
        Myclass() {
            // 호출 시점 화긴
            cout << "MyClass()" << endl;
        }

        Myclass(int number) { // init_str이 유효한 메모리라고 가정
            cout << "MyClass(int number)" << endl;

            // this pointer (현재 만들고 있는 인스턴스의 주소를 의미)
            // 그냥 소개만 하는 것 (멤버변수라는 걸 확실히 보여주기 위해 this 사용한것일 뿐 빼도 가능)
            this->number_ = number;
        }

        ~Myclass() {
            // 호출 시점 확인
            cout << "~MyClass()" << endl;
        }

        void Increment(int a) {
            number_ += a;
        }

        void Print() {
            cout << number_ << endl;
        }
    
    private:
        int number_ = 0; // 초기값
};

int main() {
    Myclass my_class1;
    Myclass my_class2(123);

    my_class1.Print(); // MyClass()
    my_class2.Print(); // MyClass(int number)

    my_class1.Increment(1);
    my_class1.Print();

    // 배열 사용 가능
    // 포인터 사용 가능
    // 기본 자료형과 비교

    return 0;
}

/**
 * 
MyClass()
MyClass(int number)
0
123
1
~MyClass()
~MyClass()
 * 
 */