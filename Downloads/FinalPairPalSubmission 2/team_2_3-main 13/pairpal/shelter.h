#ifndef SHELTER_H
#define SHELTER_H
#include <iostream>

using namespace std;

class shelter
{
public:
    shelter(std::string addy, int numOfPets, std::string number);
    ~shelter();

    std::string address;
    int numberOfPets;
    std::string number;

    void updateAddress(std::string newAddy);
    void updateNumOfPets(int newNumOfPets);
    void updateNumber(std::string newNumber);

    std::string getShelterInfo();
};

#endif // SHELTER_H
