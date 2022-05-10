#include "user.h"

//! A constructor.
/*!
      The constructor has four parameter, and it
      will initialize the parameters.
    */
user::user(std::string fl, std::string addy, int num, std::string allerg)
{
    firstAndLast = fl;
    address = addy;
    number = num;
    allergies = allerg;
}

//! A normal member taking one argument and does not return anything.
/*!
      \param newAddy new address of user.
    */
void user::updateAddress(std::string newAddy)
{
    address = newAddy;
}

//! A normal member taking one argument and does not return anything.
/*!
      \param newNumber new number of user.
    */
void user::updateNumber(int newNumber)
{
    number = newNumber;
}

//! A normal member taking one argument and does not return anything.
/*!
      \param upAllerg new allergy of user.
    */
void user::updateAllergies(int upAllerg)
{
    allergies = upAllerg;
}

//! A normal member that does not take any argument and does not return anything,
//! and it will get the information of the user.
std::string user::releaseInfo()
{
    std::string information = "Name: " + firstAndLast
            + ", Address: " + address
            + ", Number: " + to_string(number)
            + ", Allergies: " + allergies + ". \n";
    return information;
}
