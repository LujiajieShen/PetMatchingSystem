#include "ppdatabase.h"

//! A constructor.
/*!
      The constructor has no parameter, and it
      will set up the database.
    */
PPdatabase::PPdatabase() {

    idNum = 2000;
    QSqlDatabase defaultPP =  QSqlDatabase::addDatabase("QSQLITE");

    QString path = "pairPal.db";
    defaultPP.setDatabaseName(path);

    if(!defaultPP.open()){
        std::cerr << "Database does not open -- "
                  << defaultPP.lastError().text().toStdString()
                  << std::endl;

        std::cerr << "  File -- " << path.toStdString() << std::endl;
        exit(0);
    }else{
        std::cerr << "Opened database successfully\n";
    }
}

//! A destructor.
/*!
      It will close the database.
    */
PPdatabase::~PPdatabase() {

    //std::cerr << "closing object\n";
    curr_db->close();
    curr_db = NULL;
}

/** Method that will open the provided database.
 */
int PPdatabase::open_db() {

    int retCode = 1;

    std::string full_name =db_location + "/" + db_name;

    // open the database --------------------

    QSqlDatabase db = QSqlDatabase::addDatabase("QSQLITE");
    db.setDatabaseName(QString::fromStdString(full_name));
    //    db.setDatabaseName(":memory:"); use to create temporary in-memory db

    if(!db.open()){
        std::cerr << "Database does not open -- "
                  << db.lastError().text().toStdString()
                  << std::endl;

        std::cerr << "  File -- " << full_name << std::endl;
        exit(0);
    }else{
        std::cerr << "Opened database successfully\n";
    }

    return retCode;
}

//! A normal member that does not take any argument and does not return anything,
//! and it will display all the shelters.
void PPdatabase::allShelters()
{
    QSqlQuery query;
    query.exec("SELECT * FROM shelter;");

    while (query.next())
    {
        QString result = "Shelter: " + query.value(1).toString() + ", " +
                "Address: " + query.value(2).toString() + ", " +
                "Store Hours: " + query.value(3).toString() ;
        qDebug() << result;
    }

}

//! A normal member that does not take any argument and does not return anything,
//! and it will display all the clients.
void PPdatabase::allClients()
{
    QSqlQuery query;
    query.exec("SELECT * FROM client;");

    while (query.next())
    {
        QString result = "Name: " + query.value(1).toString() + ", " +
                "Age:" + query.value(8).toString() + ", " +
                "Email: " + query.value(2).toString() + ", " +
                "Phone Number: " + query.value(3).toString() + ", " +
                "Address: " + query.value(4).toString() + ", " +
                "Date of Birth: " + query.value(5).toString() + ", " +
                "Salary: " + query.value(6).toString() + ", " +
                "Allergies: " + query.value(7).toString() + ", " +
                "Password: " + query.value(9).toString();
        qDebug() << result;
    }
}

//! A normal member that does not take any argument and does not return anything,
//! and it will display all the pets.
void PPdatabase::allPets()
{
    QSqlQuery query;
    query.exec("SELECT * FROM pet ORDER BY value DESC;");

    while (query.next())
    {
        QString result = "Name: " + query.value(1).toString() + ", " +
                "Date of Birth: " + query.value(2).toString() + ", " +
                "Pet Gender: " + query.value(3).toString() + ", "
                "Pet Type: " + query.value(4).toString() + ", "
                "Breed: " + query.value(5).toString() + ", " +
                "Condition: " + query.value(6).toString() + ", " +
                "Value: " + query.value(8).toString()+ ", " +
                " ID: " + query.value(0).toString();


        qDebug() << result;
    }

}

//! A normal member that does not take any argument and does not return anything,
//! and it will display all the appointments.
void PPdatabase::allAppointments()
{
    QSqlQuery query;
    query.exec("SELECT * FROM appointment;");

    while (query.next())
    {
        QString result = "Month: " + query.value(1).toString() + ", " +
                "Day: " + query.value(2).toString() + ", " +
                "Year: " + query.value(3).toString() + ", "
                "Time: " + query.value(4).toString();

        qDebug() << result;
    }

}



//will insert to the different tables
//! A normal member that takes nine arguments and does not return anything,
/*!
      \param name name of the client.
      \param email email of the client.
      \param number number of the client.
      \param address address of the client.
      \param dob date of birth of the client.
      \param salary salary of the client.
      \param allergies allergies of the client.
      \param age age of the client
      \param password password of the client.
    */
void PPdatabase::insertUser(QString name, QString email, int number, QString address,
                            QString dob, int salary, QString allergies, int age, QString password)
{
    QSqlQuery query;
    query.prepare("INSERT INTO client (userID, name, email, number, address, DOB, salary, allergies, age, password) "
                              "VALUES (?, ?, ?, ?, ?, ? , ?, ?, ?, ?)");


    QVariant qname = name;
    QVariant qmail = email;
    QVariant addy = address;
    QVariant DOB = dob;
    QVariant allG = allergies;
    QVariant qPass = password;

    updateID();
    query.addBindValue(idNum);
    query.addBindValue(qname);
    query.addBindValue(qmail);
    query.addBindValue(number);
    query.addBindValue(addy);
    query.addBindValue(DOB);
    query.addBindValue(salary);
    query.addBindValue(allG);
    query.addBindValue(age);
    query.addBindValue(qPass);
    query.exec();

    //qDebug() << query.lastError().text();

}

//! A normal member that takes five arguments and does not return anything,
/*!
      \param shelterName name of the shelter.
      \param shelterAddress address of the shelter.
      \param shelterHours working hours of the shelter.
      \param email email of the shelter.
      \param password password of the shelter.
    */
void PPdatabase::insertShelter(QString shelterName, QString shelterAddress,
                               QString shelterHours, QString email, QString password)
{
    QSqlQuery query;
    query.prepare("INSERT INTO shelter (shelterID, name, address, hours, email, password) "
                     "VALUES (?, ?, ?, ?, ?, ?)");

    QVariant qname = shelterName;
    QVariant addy = shelterAddress;
    QVariant hours = shelterHours;
    QVariant qmail = email;
    QVariant qPass = password;


    updateID();
    query.addBindValue(idNum);
    query.addBindValue(qname);
    query.addBindValue(addy);
    query.addBindValue(hours);
    query.addBindValue(qmail);
    query.addBindValue(qPass);
    query.exec();


}

//! A normal member that takes seven arguments and does not return anything,
/*!
      \param name name of the pet.
      \param dob date of birth of the pet.
      \param gender gender of the pet.
      \param petType type of the pet.
      \param breed breed of the pet.
      \param health health of the pet
      \param shelterID ID of the shelter that the pet belongs.
    */
void PPdatabase::insertPets(QString name, QString dob, QString gender,
                            QString petType, QString breed, QString health, int shelterID)
{
    QSqlQuery query;
    query.prepare("INSERT INTO pet ( petID, name, DOB, gender, petType, breed, healthconditions, shelterID, value)"
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

    updateID();
    query.addBindValue(idNum);
    QVariant name1 = name;
    QVariant dob1 = dob;
    QVariant gender1 = gender;
    QVariant petStat = petType;
    QVariant breed1 =  breed;
    QVariant health1 = health;

    query.addBindValue(name1);
    query.addBindValue(dob1);
    query.addBindValue(gender1);
    query.addBindValue(petStat);
    query.addBindValue(breed1);
    query.addBindValue(health1);
    query.addBindValue(shelterID);

    if (health == "Terminal") {
        value = 10;
    }
    else if (health == "Mild allergies" ||
             health == "medication needed" ||
             health == "needs physical therapy")
    {
        value = 5;
    }
    else value = 1;
    query.addBindValue(value);

    query.exec();
}

//! A normal member that takes five arguments and does not return anything,
/*!
      \param username name of the client who wants to make appointments.
      \param month month of the appointment.
      \param day day of the appointment.
      \param year year of the appointment.
      \param time time of the appointment.
    */
void PPdatabase::insertAppointment(QString username, QString month, QString day,
                               QString year, QString time)
{
    QSqlQuery query;
    query.prepare("INSERT INTO appointment (username, month, day, year, time) "
                     "VALUES (?, ?, ?, ?, ?)");

    QVariant quserName = username;
    QVariant qmonth = month;
    QVariant qday = day;
    QVariant qyear = year;
    QVariant qtime = time;

    query.addBindValue(quserName);
    query.addBindValue(qmonth);
    query.addBindValue(qday);
    query.addBindValue(qyear);
    query.addBindValue(qtime);
    query.exec();


}

//! A normal member that takes one argument and does not return anything,
/*!
      \param address address of the specific client.
    */
void PPdatabase::printSpecificClient(QString address)
{
    QSqlQuery query;
    QString executing = "SELECT * FROM client where address = " + address + ";" ;
    query.exec(executing);

}

//! A normal member that takes one argument and does not return anything,
/*!
      \param address address of the specific shelter.
    */
void PPdatabase::printSpecificShelter(QString address)
{
    QSqlQuery query;
    QString executing = "SELECT * FROM client where address = " + address + ";" ;
    query.exec(executing);
}

//! A normal member that takes two argument and does not return anything,
/*!
      \param name name of the specific pet.
      \param dob date of birth of the specific pet.
    */
void PPdatabase::printSpecificPet(QString name, QString dob)
{
    QSqlQuery query;
    QString executing = "SELECT * FROM client where name = " + name + "and DOB =" + dob +";";
    query.exec(executing);
}

//! A normal member that takes one argument and does not return anything,
/*!
      \param userName user name of the specific appointment.
    */
void PPdatabase::printSpecificAppointment(QString userName)
{
    QSqlQuery query;
    QString executing = "SELECT * FROM appointment where username = " + userName + ";";
    query.exec(executing);
}


//! A normal member that does not take any argument and does not return anything,
//! and it will update the ID.
void PPdatabase::updateID(){
    QSqlQuery query;

    QString executing = "SELECT * FROM client ORDER BY userID DESC LIMIT 1";
    query.exec(executing);

    int maxID = 0;

    while (query.next())
    {
        int result = query.value(0).toInt();
        //qDebug() << result;
        if(maxID < result){
            maxID = result;
        }
    }

    executing = "SELECT * FROM shelter ORDER BY shelterID DESC LIMIT 1";
    query.exec(executing);
    while(query.next()){

        int result = query.value(0).toInt();
        if(maxID < result){
            maxID = result;
        }
    }

    executing = "SELECT * FROM pet ORDER BY petID DESC LIMIT 1";
    query.exec(executing);
    while(query.next()){

        int result = query.value(0).toInt();
        if(maxID < result){
            maxID = result;
        }
    }

    idNum = maxID + 1;
}

//! A normal member that does not take any argument and does not return anything,
//! and it will clear the client table.
void PPdatabase::clearClientTable()
{
    QSqlQuery query1;
    query1.exec("DELETE FROM client;");
}

//! A normal member that does not take any argument and does not return anything,
//! and it will clear the shelter table.
void PPdatabase::clearShelterTable()
{
    QSqlQuery query1;
    query1.exec("DELETE FROM shelter;");

}

//! A normal member that does not take any argument and does not return anything,
//! and it will clear the pet table.
void PPdatabase::clearPetTable()
{
    QSqlQuery query1;
    query1.exec("DELETE FROM pet;");
}

//! A normal member that does not take any argument and does not return anything,
//! and it will clear the appointment table.
void PPdatabase::clearAppointmentTable()
{
    QSqlQuery query1;
    query1.exec("DELETE FROM appointment;");
}

//! A normal member that takes two argument and does not return anything,
/*!
      \param petName new name of the pet.
      \param newHealth new health condition of the pet.
    */
void PPdatabase::updatingPet(QString petName, QString newHealth)
{

    QSqlQuery updating;

    int newVal;
    //will need to indicate that they should use these key words

    if (newHealth == "Terminal") {
        newVal = 10;
    }
    else if (newHealth == "Mild allergies" ||
             newHealth == "medication needed" ||
             newHealth == "needs physical therapy")
    {
        newVal = 5;
    }
    else newVal = 1;


    //updating.exec( "UPDATE pet SET healthconditions='" + newHealth + "', value="+ newVal + " WHERE name='" + petName + "';");
    //QVariant newHealth1 = newHealth;
    //QVariant name = petName;
    updating.exec( "UPDATE pet SET healthconditions='"+ newHealth + "'WHERE name='" + petName + "';");

    QString s = QString::number(newVal);
    updating.exec("UPDATE pet SET value = '" + s + " 'WHERE name = '"+ petName+"';");

    while (updating.next())
    {
        QString result = "Name: " + updating.value(1).toString() + ", " +
                "Date of Birth: " + updating.value(2).toString() + ", " +
                "Pet Gender: " + updating.value(3).toString() + ", "
                "Pet Type: " + updating.value(4).toString() + ", "
                "Breed: " + updating.value(5).toString() + ", " +
                "Condition: " + updating.value(6).toString() + ", " +
                "Value: " + updating.value(8).toString()+ ", " +
                " ID: " + updating.value(0).toString();


        qDebug() << result;
    }

}


