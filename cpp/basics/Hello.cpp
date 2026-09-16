#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector<int> numbers = {5, 3, 1, 4, 2};

    sort(numbers.begin(), numbers.end());

    for (int number : numbers) {
        cout << number << " ";
    }

    cout << '\n';

    return 0;
}