#include "shelterowner.h"
#include "ui_shelterowner.h"

//! A constructor.
/*!
      The constructor has one parameter, and it
      will display the default widgets.
    */
shelterOwner::shelterOwner(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::shelterOwner)
{
    ui->setupUi(this);
}

//! A destructor.
/*!
      It will delete UI.
    */
shelterOwner::~shelterOwner()
{
    delete ui;
}

//! A normal member taking no argument and does not return anything.
//! It will add the pet from the database.
void shelterOwner::on_Add_clicked()
{
    this->newSession = new PPdatabase;
    petName = ui->Name->text();
    DOB = ui->DOB->text();
    petStatus = ui->Status->text();
    breed = ui->Breed->text();
    health = ui->Health->text();
    shelterID = ui->shelterNum->text();
    type = ui->petType->text();
    sex = ui->Sex->text();

    int sID;
    sID = shelterID.toInt();
    this->newSession->insertPets(petName,DOB,sex,petStatus,breed,health,sID);
    this->newSession->allPets();


}

//! A normal member taking no argument and does not return anything.
//! It will delete the pet from the database.
void shelterOwner::on_Delete_clicked()
{
    this->newSession = new PPdatabase;
    petName = ui->Name->text();
    QSqlQuery q;
    q.exec("DELETE FROM pet WHERE name = "+petName);
    //newSession->removePets(petName,DOB,petStatus,breed,health);
    //newSession->allPets();
}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stackedWidget.
void shelterOwner::on_NextPage_clicked()
{
    ui->stackedWidget->setCurrentIndex(0);

}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stackedWidget.
void shelterOwner::on_pushButton_clicked()
{
    ui->stackedWidget->setCurrentIndex(2);
}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stackedWidget.
void shelterOwner::on_updateBackButton_clicked()
{
    ui->stackedWidget->setCurrentIndex(0);

}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stackedWidget.
void shelterOwner::on_addDeletePet_clicked()
{
    ui->stackedWidget->setCurrentIndex(1);
}

//! A normal member taking no argument and does not return anything.
//! It will update the information about the pet.
void shelterOwner::on_updatePetButton_clicked()
{
    updateThisPet = ui->lineEdit_4->text();
    newHealth = ui->lineEdit_3->text();

    newSession->updatingPet(updateThisPet, newHealth);
    newSession->allPets();

}
