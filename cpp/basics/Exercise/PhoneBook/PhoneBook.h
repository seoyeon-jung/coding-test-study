#ifndef PHONE_BOOK_H
#define PHONE_BOOK_H

const int kMaxstr = 20; // 문자열 최대 글자 수

struct Contact {
    char name[kMaxstr];
    char phone[kMaxstr];
};

class PhoneBook {
    public:
        PhoneBook();
        ~PhoneBook();

        bool IsEmpty();
        bool IsFull();
        void PrintAll();
        void PrintContact(int i);
        void AddContact();
        void AddContact(const char name[], const char phone[]);
        int FindByName();
        bool IsEqual(const char str1[], const char str2[]);
        void DeleteByName();
    
    private:
        int capacity_ = 3; // 연락처 최대 개수
        int num_contacts_ = 0;
        Contact *contacts_ = nullptr;
};

#endif