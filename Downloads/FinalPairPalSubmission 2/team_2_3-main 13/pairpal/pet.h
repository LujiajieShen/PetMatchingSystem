#ifndef PET_H
#define PET_H
#include <iostream>
#include <list>

using namespace std;

// pointer system : method
class pet
{
public:
    pet(std::string name, int age, std::string color);
    ~pet();

    std::string name;
    int age;
    std::string color;
    int value;
    std::string condition;
    //   std::list<std::string, std::string> listOfConditions;//list of string pairs
    int conditionCase;

    void updateName(std::string newName);
    void updateAge(int newAge);
    void updateHealth(std::string typeOfCondition,std::string nameOfCondition);
    int  calcValue();
    std::string displayInfo();

};

#endif // PET_H
