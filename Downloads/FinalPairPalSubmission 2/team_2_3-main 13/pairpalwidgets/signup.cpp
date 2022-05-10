#include "mainwindow.h"
#include "signup.h"
#include "ui_signup.h"

//! A constructor.
/*!
      The constructor has one parameter, and it
      will display the default widgets.
    */
signUp::signUp(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::signUp)
{
    ui->setupUi(this);
    ui->stackedWidget->setCurrentIndex(0);
    newSession = new PPdatabase;
}

//! A destructor.
/*!
      It will delete UI.
    */
signUp::~signUp()
{
    delete ui;
}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stackedWdiget.
void signUp::on_client_clicked()
{
    ui->stackedWidget->setCurrentIndex(1);
}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stackedWdiget.
void signUp::on_shelter_clicked()
{
    ui->stackedWidget->setCurrentIndex(2);

}

//! A normal member taking no argument and does not return anything.
//! It will add the client to the databse.
void signUp::on_Next_clicked()
{

    //this->newSession = new PPdatabase;
    useName = ui->lineEdit->text();
    useMail = ui->lineEdit_9->text();
    useAddy =  ui->lineEdit_17->text();
    useDOB = ui->lineEdit_8->text();
    useAllerg = ui->lineEdit_11->text();
    usePassw =  ui->lineEdit_14->text();


    std::string info = useName.toStdString() + ", " + useMail.toStdString() + ", " + useAddy.toStdString() + ", " + useAllerg.toStdString() + ", " + useDOB.toStdString() + ", " + usePassw.toStdString() + ".";
    std::cout << info;



    newSession->insertUser(useName, useMail, 123, useAddy, useDOB, 124, useAllerg, 123, usePassw);
    newSession->allClients();


    this->close();

}

//! A normal member taking no argument and does not return anything.
//! It will add the shelter to the databse.
void signUp::on_Next_2_clicked()
{

    //this->newSession = new PPdatabase;
    sheltName = ui->lineEdit_16->text();
    sheltAddy =  ui->lineEdit_17->text();
    sheltEmail = ui->lineEdit_21->text();
    sheltPassword = ui->lineEdit_20->text();
    sheltHours = ui->lineEdit_18->text();
    /*
    std::string info = sheltName.toStdString() + ", " + sheltAddy.toStdString() + ", " + sheltEmail.toStdString() + ", " + sheltPassword.toStdString() + ", " + sheltHours.toStdString() + ".";
    std::cout << info;
    */
    //newSession->clearShelterTable();
    newSession->insertShelter(sheltName, sheltAddy, sheltHours, sheltEmail, sheltPassword);
    newSession->allShelters();


    this->close();
}
