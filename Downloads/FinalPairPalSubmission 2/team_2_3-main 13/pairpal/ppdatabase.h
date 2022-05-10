#ifndef PPDATABASE_H
#define PPDATABASE_H
#include <iostream>
#include <QtSql>


/**
 * @brief Taken from DB Demo from Professor Smith
 */

class PPdatabase {

private:

    /// Name of the database.
    std::string db_name;

    /// Location of the database in the file structure.
    std::string db_location;

    QSqlDatabase *curr_db;



public:

    int idNum;

    int value;
    int newVal;


    //updateidNum
    void updateID();

    // Constructor that if called will cause the program to exit
    // indicating that more information should be provided.
    PPdatabase();

    // Destructor that will cause the database to be closed storing
    // the updated contents of the sqlite file.
    ~PPdatabase();

    // Used to manually open the file, and called by each of the
    // constructors.
    int open_db();

    void clearClientTable();
    void clearShelterTable();
    void clearPetTable();
    void clearAppointmentTable();

    // prints state of database
    void print(std::ostream &sout);

    // provides a state check to determine if database is available
    bool db_open() { return curr_db ? true : false; }

    //will insert to the different tables
    void insertUser(QString name, QString email, int number, QString address,
                                QString dob, int salary, QString allergies, int age, QString password);

    void insertShelter(QString shelterName, QString shelterAddress,
                                   QString shelterHours, QString email, QString password);

    void insertPets(QString name, QString dob, QString gender, QString petType,
                    QString breed, QString health, int shelterID);

    void insertAppointment(QString username,QString month, QString day,
                                   QString year, QString time);

    //print tables
    void allClients();
    void allPets();
    void allShelters();
    void allAppointments();

    //questionnare
    void questionarre();

    void printSpecificClient(QString address);
    void printSpecificShelter(QString address);
    void printSpecificPet(QString name, QString dob);
    void printSpecificAppointment(QString userName);

    void updatingPet(QString petName, QString newHealth);
    void makeVal(QString condition);

    // Returns a pointer to the current database, only
    // used when absolutely necessary!
    QSqlDatabase * db_ref(){ return curr_db; }

    void closeDatabase();
    void opendatabase();


};

#endif // PPDATABASE_H
