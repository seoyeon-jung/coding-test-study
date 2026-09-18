#ifndef MY_CLASS_H
#define MY_CLASS_H

class MyClass {
    public:
        MyClass(); // 멤버 함수의 몸체(body) 모두 삭제
        MyClass(int number);
        ~MyClass();

        void Increment(int a);
        // void Decrement(int a); // 구현 실습
        void Print();

    private:
        int number_ = 0; // 초기값
};

#endif