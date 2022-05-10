#ifndef USER_H
#define USER_H
#include <iostream>
using namespace std;
class user
{
public:
    user(std::string fAndL, std::string addy, int numOfPets, std::string number);
    ~user();

    std::string firstAndLast;
    std::string address;
    int number;
    std::string allergies;

    void updateAddress(std::string newAddy);
    void updateNumber(int newNumber);
    void updateAllergies(int upAllerg);

    std::string releaseInfo();
};

#endif // USER_H
