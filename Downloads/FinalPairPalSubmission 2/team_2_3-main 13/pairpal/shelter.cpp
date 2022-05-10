#include "shelter.h"

//! A constructor.
/*!
      The constructor has three parameter, and it
      will initialize the parameters.
    */
shelter::shelter(std::string addy, int numOfPets, std::string num)
{
    address = addy;
    numberOfPets = numOfPets;
    number = num;
}

//! A normal member taking one argument and does not return anything.
/*!
      \param newAddy new address of shelter.
    */
void shelter::updateAddress(std::string newAddy)
{
    address = newAddy;
}

//! A normal member taking one argument and does not return anything.
/*!
      \param newNumOfPets number of the pets.
    */
void shelter::updateNumOfPets(int newNumOfPets)
{
    numberOfPets = newNumOfPets;
}

//! A normal member taking one argument and does not return anything.
/*!
      \param newNumber number of the shleter.
    */
void shelter::updateNumber(std::string newNumber)
{
    number = newNumber;
}

//! A normal member that does not take any argument and does not return anything,
//! and it will get the information of the shelter.
std::string shelter::getShelterInfo()
{
    std::string sheltInfo = "Address: " + address
            + ", Number of pets available: " + to_string(numberOfPets)
            + ", Phone Number: " + number + ". \n";
    return sheltInfo;
}
