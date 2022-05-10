#include <iostream>
#include "pet.h"
#include "shelter.h"
#include "user.h"
#include "ppdatabase.h"
#include <QString>

using namespace std;

int main(int argc, char* argv[])
{
    QCoreApplication a(argc, argv); //Need to initialize
    //QCoreApp to use DBs

    //unit-testing
    PPdatabase *newSession = new PPdatabase;

    //clearDB(just in case values are in before testing)
    newSession->clearAppointmentTable();
    newSession->clearClientTable();
    newSession->clearPetTable();
    newSession->clearShelterTable();

    //opening DB

    if (newSession->db_open() == 1){
        std::cerr << "D A T A B A S E - O P E N S !" << std::endl;
    }

    //making sure DB is empty

    newSession->allClients();
    std::cerr << " ----- client is empty -----" << std::endl;
    newSession->allShelters();
    std::cerr << " ----- shelter is empty -----" << std::endl;
    newSession->allPets();
    std::cerr << " ----- pet is empty -----" << std::endl;
    newSession->allAppointments();
    std::cerr << " ----- appointments is empty -----" << std::endl;

    //inserting clients into DB
    //newSession->insertUser();
    newSession->insertUser("Abiola", "abiola@email.com", 1234567890, "W Newark St", "May 22 2000", 1000000, "n/a", 21, "abc123");
    newSession->insertUser("Yessi", "yramirez@email.com", 329328232,"N Milwaukee", "April 15 2001",2000000, "Kiwi", 20, "def456");
    newSession->insertUser("Lujiajie", "lujiajie@email.com", 390000222,"N McKinley Ave", "Jan 28 2000",2000000, "N/A", 21, "ghi789");
    newSession->insertUser("Jack", "jackjill@email.com", 1234567890, "W Hill St", "May 21 1989", 300000, "n/a", 21, "asdfg");
    newSession->insertUser("Jill", "jilljack@email.com",329328232,"N Pail St", "May 21 1989",700000, "Kiwi", 20, "jklasd");
    newSession->insertUser("Humpty Dumpty", "humptyd@email.com",390000222,"N Egg Blvd", "Jan 1 2000",60000, "N/A", 21, "qwerty");
    newSession->insertUser("Snow", "whitesnow@email.com", 1234567890, "W Seventh St", "June 13 1999", 300000, "n/a", 21, "asdfg");
    newSession->insertUser("Queen", "evilqueen@email.com",329328232,"N Mirror St", "October 31 1945",700000, "Kiwi", 20, "jklasd");
    newSession->insertUser("Robin", "robinhood@email.com",390000222,"N Rich Blvd", "Jan 5 2000",60000, "N/A", 21, "qwerty");
    newSession->insertUser("Cindy", "cinderealla@email.com", 1234567890, "W Ball St", "April 21 1999", 300000, "n/a", 21, "asdfg");
    newSession->insertUser("Belle", "belle@email.com",329328232,"N Beauty St", "Feb 21 1995",700000, "Kiwi", 20, "jklasd");
    newSession->insertUser("Pinocchio", "pinocchio@email.com",390000222,"Long Nose Blvd", "August 6 2000",60000, "N/A", 21, "qwerty");
    newSession->insertUser("Ariel", "ariel@email.com", 1234567890, "Under the Sea", "March 10 1976", 300000, "n/a", 21, "asdfg");
    newSession->insertUser("Prince", "princecharming@email.com",329328232,"N Charming St", "October 5 1999",700000, "Kiwi", 20, "jklasd");
    newSession->insertUser("Aladdin", "princeali@email.com",390000222,"N Genie Blvd", "Jan 19 2000",60000, "N/A", 21, "qwerty");
    newSession->insertUser("Jasmine", "jasmine@email.com", 1234567890, "W Carpet St", "May 21 2000", 300000, "n/a", 21, "asdfg");
    newSession->insertUser("Peter", "peterpan@email.com",329328232,"N Neverland St", "Dec 21 2000",700000, "Kiwi", 20, "jklasd");
    newSession->insertUser("Captain", "hookc@email.com",390000222,"N Croc Blvd", "Jan 13 1967",60000, "N/A", 21, "qwerty");
    newSession->insertUser("Jack", "jackbeanstalk@email.com", 1234567890, "W Giant St", "Septemebr 21 1992", 300000, "n/a", 21, "asdfg");
    newSession->insertUser("Hansel", "hanselgret@email.com",329328232,"N Sugar St", "May 22 1985",700000, "Kiwi", 20, "jklasd");
    newSession->insertUser("Gretel", "gretelhans@email.com",390000222,"N Witch Blvd", "May 22 1989",60000, "N/A", 21, "qwerty");

    //inserting shelters into DB
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "dogncat@email.com", "1111");
    newSession->insertShelter("Home for Pets", "N West St", "9am - 5pm", "catndog@email", "2222cat");
    newSession->insertShelter("Pet Adoption", "N West St", "9am - 5pm", "cats@email.com", "3333cat");
    newSession->insertShelter("Perfect Match", "N West St", "9am - 5pm", "dogs@email.com", "5555ncat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "ham@email.com", "5555dogncat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "dt@email.com", "7777dogncat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "dgnct@email.com", "99999dogncat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "ttt@email.com", "dogncat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "aaa@email.com", "dojacat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "eee@email.com", "dcat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "rrr@email.com", "dat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "lll@email.com", "dt");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "mmm@email.com", "cat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "yyy@email.com", "loldogncat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "iii@email.com", "dogncatttt");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "rtrrtrtr@email.com", "dogncattt");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "wewe@email.com", "dogncaaat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "lololol@email.com", "dogncccat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "yuyuyuyuy@email.com", "dogggncat");
    newSession->insertShelter("Dogs n Cats", "N West St", "9am - 5pm", "papapapapa@email.com", "dooogncat");



    //inserting pets into DB
    newSession->insertPets("Max", "010101", "Male", "Dog", "Chihuahua", "N/A", 1);
    newSession->insertPets("Bolt", "010101", "Female", "Dog", "Bulldog", "N/A", 1);
    newSession->insertPets("Dwight", "010101", "Male", "Hamster", "Chinese", "N/A", 1);
    newSession->insertPets("Bob", "010101", "Male", "Parrot", "Cacatoo", "N/A", 1);
    newSession->insertPets("Ruby", "010101", "Female", "Bunny", "Dutch", "N/A", 1);
    newSession->insertPets("Alex", "010101", "Female", "Cat", "Persian", "N/A", 1);
    newSession->insertPets("Diva", "010101", "Female", "Cat", "Siamese", "N/A", 1);
    newSession->insertPets("Murray", "010101", "Male", "Parrot", "Sun Conure", "N/A", 1);
    newSession->insertPets("Washinigton", "010101", "Male", "Bunny", "English Lop", "N/A", 1);
    newSession->insertPets("Aiden", "010101", "Male", "Snake", "Ringneck", "N/A", 1);
    newSession->insertPets("Frida", "010101", "Female", "Snake", "Rainbow Boa", "N/A", 1);
    newSession->insertPets("Chad", "010101", "Male", "Fish", "Clownfish", "N/A", 1);
    newSession->insertPets("Del", "010101", "Female", "Fish", "Goldfish", "N/A", 1);
    newSession->insertPets("Butter", "010101", "Female", "Dog", "Poodle", "N/A", 1);
    newSession->insertPets("Bill", "010101", "Female", "Cat", "Siamese", "N/A", 1);
    newSession->insertPets("William", "010101", "Female", "Hamster", "Syrian", "N/A", 1);
    newSession->insertPets("Nao", "010101", "Female", "Parrot", "Scarlet Macaw", "N/A", 1);
    newSession->insertPets("Franklin", "010101", "Male", "Turtle", "African Sideneck", "N/A", 1);
    newSession->insertPets("Ally", "010101", "Female", "Turtle", "Eastern Box", "N/A", 1);
    newSession->insertPets("Bella", "010101", "Female", "Bunny", "Netherland Dwarf", "N/A", 1);


    //inserting appointments in DB
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");
    newSession->insertAppointment("abiola@email.com", "May", "05", "2021", "10:00am");




    newSession->updatingPet("Max", "Terminal");
    newSession->updatingPet("Frida", "Terminal");
    newSession->updatingPet("Bolt", "Terminal");
    newSession->updatingPet("Dwight", "Terminal");
    newSession->updatingPet("Bella", "Terminal");


    newSession->updatingPet("Ruby", "needs physical therapy");
    newSession->updatingPet("Alex", "Mild allergies");
    newSession->updatingPet("Diva", "Mild allergies");
    newSession->updatingPet("Murray", "medication needed");
    newSession->updatingPet("Washinigton", "needs physical therapy");

    //printing tables in DB
    newSession->allClients();
    std::cerr << " ----- end of clients -----" << std::endl;
    newSession->allShelters();
    std::cerr << " ----- end of shelters -----" << std::endl;
    newSession->allPets();
    std::cerr << " ----- end of pets -----" << std::endl;
    newSession->allAppointments();
    std::cerr << " ----- end of appointments -----" << std::endl;

    //finding specific people


    //editing petHealth
    //newSession->updatingPet("Max", "needs physical therapy");

    //clear tables
    //newSession->clearAppointmentTable();
    //newSession->clearClientTable();
    //newSession->clearPetTable();
    //newSession->clearShelterTable();
/*
    std::cerr << " D A T A B A S E - W I L L - N O W - B E - C L E A R E D" << std::endl;

    newSession->allClients();
    std::cerr << " ----- client is empty -----" << std::endl;
    newSession->allShelters();
    std::cerr << " ----- shelter is empty -----" << std::endl;
    newSession->allPets();
    std::cerr << " ----- pet is empty -----" << std::endl;
    newSession->allAppointments();
    std::cerr << " ----- appointments is empty -----" << std::endl;



    //newSession->insertPets("Max", "010101", "Female", "Dog", "Chihuahua", "N/A", 1);
    //newSession->clearPetTable();
    //newSession->updatingPet("Max", "needs physical therapy");
    //newSession->allPets();

*/
    return 0;

}
