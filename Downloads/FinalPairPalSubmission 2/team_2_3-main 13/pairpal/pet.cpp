#include "pet.h"

//! A constructor.
/*!
      The constructor has three parameter, and it
      will initialize the parameters.
    */
pet::pet(std::string n, int a, std::string c)
{
    name = n;
    age = a;
    color = c;
}

//! A normal member taking one argument and does not return anything.
/*!
      \param newName new name of pet.
    */
void pet::updateName(std::string newName)
{
    name = newName;
}
void pet::updateAge(int newAge)
{
    age = newAge;
}

//void pet::updateHealth(std::string typeOfCondition,std::string nameOfCondition)
//{
//    if(listOfConditions.contains(nameOfCondition)) {}//then don't duplicate pair
//    else{
//    //check what type of condition the pet has
//    if(typeOfCondition == "disease")
//    {value = value + 2;}

//    else if (typeOfCondition == "allergy")
//    {value = value + 1;}

//    else if (typeOfCondition == "minor condition")
//    {value = value + 1;}

//    else if (typeOfCondition == "mental illness")
//    {value = value + 3;}

//    else if (typeOfCondition == "terminal")
//    {value = value + 4;}

//    else value = value + 0;
//    listOfConditions.push_back(typeOfCondition, nameOfCondition);
//}
    //add condition
    // if it already exists in the arrayList/Deque then don't duplicate
//}


//! A normal member that does not take any argument and does not return anything,
//! and it will display the information.
std::string pet::displayInfo()
{
    std::string info = "Name: " + name
            //+ ", Health Notes: " + listOfConditions
            + ", Age: " + to_string(age)
            + ", Color: " + color + ". \n";
    return info;
}

//! A normal member that does not take any argument and does not return anything,
//! and it will return the value.
int pet::calcValue()
{
    return value;
}
