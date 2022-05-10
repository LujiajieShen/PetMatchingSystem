#include "mainwindow.h"
#include "ui_login.h"
#include "login.h"
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <QPixmap>
using namespace std;

//! A constructor.
/*!
      The constructor has one parameter, and it
      will display the default widgets.
    */
logIn::logIn(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::logIn)
{
    valid = false;
    ui->setupUi(this);
    ui->stackedWidget->setCurrentIndex(0);
//    QPixmap pix("../download.jpeg");
//    ui->label_19->setPixmap(pix.scaled(300,200,Qt::KeepAspectRatio));
//    ui->label_19->setScaledContents( true );
//    ui->label_19->setSizePolicy( QSizePolicy::Ignored, QSizePolicy::Ignored );
//    QPixmap pix1("../download\ \(1\).jpeg");
//    ui->label_21->setPixmap(pix1.scaled(300,200,Qt::KeepAspectRatio));
//    ui->label_21->setScaledContents( true );
//    ui->label_21->setSizePolicy( QSizePolicy::Ignored, QSizePolicy::Ignored );
    newSession = new PPdatabase;
}

//! A destructor.
/*!
      It will delete UI.
    */
logIn::~logIn()
{
    delete ui;
}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stacked widget.
void logIn::on_quiz_clicked()
{
    ui->stackedWidget->setCurrentIndex(1);
}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stacked widget and display recommended pets.
void logIn::on_NextQuiz_clicked()
{
    int addVal = 0;

    ui->stackedWidget->setCurrentIndex(3);
    QSqlQuery q;
    q.prepare("select * from pet where petID = ");
    if(q.exec()){
        while(q.next()){
            ui->label_22->setText(q.value(1).toString());
            ui->label_23->setText(q.value(2).toString());
            ui->label_24->setText(q.value(5).toString());
            ui->label_25->setText(q.value(6).toString());
            ui->label_26->setText(q.value(7).toString());
        }
    }
    ui->radioButton_8->setVisible(false);
    ui->radioButton_10->setVisible(false);
    ui->radioButton_11->setVisible(false);
    ui->confirm->setVisible(false);
    ui->app_user->setVisible(false);
    ui->lineEdit_3->setVisible(false);

    QString preferredBreed = ui->lineEdit_2->text();

    if(dogButtonClicked == true){
       preferredType = "dog";
    }
    else if(catButtonClicked == true){
        preferredType = "cat";
    }
    else if(hamButtonClicked == true){
        preferredType = "hamster";

    }
    else{
       preferredType = ui->lineEdit->text();
    }


    QSqlQuery query;
    query.exec("SELECT * FROM pet where breed='" + preferredBreed + "', "
               "type='"+ preferredType +"', gender='" + preferredGender + "';");

    while (query.next())
    {
        int current = query.value(0).toInt();
        current = current + 3;
        QString s = QString::number(current);

        query.exec("UPDATE pet SET value = '" + s + "';");

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

    dogButtonClicked = false;
    catButtonClicked = false;
    hamButtonClicked = false;

}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stacked widget
void logIn::on_pushButton_clicked()
{
    ui->stackedWidget->setCurrentIndex(4);
}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stacked widget
void logIn::on_pushButton_4_clicked()
{
    ui->stackedWidget->setCurrentIndex(5);
}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stacked widget
void logIn::on_pushButton_5_clicked()
{
    ui->stackedWidget->setCurrentIndex(6);
}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stacked widget
void logIn::on_pushButton_2_clicked()
{
    ui->stackedWidget->setCurrentIndex(4);
}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stacked widget
void logIn::on_pushButton_3_clicked()
{
    ui->stackedWidget->setCurrentIndex(4);

}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stacked widget and display appointment slots.
void logIn::on_search_clicked()
{
    date = ui->appDate->text();
    string date1 = date.toUtf8().constData();
    cout<<date1<<endl;
    try{
        //int date2 = stoi(date1);
        string month = date1.substr (0,2);
        cout << month << endl;
        string day = date1.substr (2,2);
        string year = date1.substr (4,4);
        int m = stoi(month);
        int d = stoi(day);
        int y = stoi(year);
        if(m>=1 && m<=12 && d>=1 && d<=31 && y>=2021){
            m1 = QString::fromStdString(month);
            d1 = QString::fromStdString(day);
            y1 = QString::fromStdString(year);
            int range = 17-8+1;
            int time1 = 0;
            int time2 = 0;
            int time3 = 0;
            while(time1 == time2 || time1 == time3 || time2 == time3){
                time1 = rand() % range + 8;
                time2 = rand() % range + 8;
                time3 = rand() % range + 8;
            }
            time4 = QString::number(time1);
            time5 = QString::number(time2);
            time6 = QString::number(time3);
            QString result1 = m1+"/"+d1+"/"+y1+"/"+" at "+time4+" : 00";
            QString result2 = m1+"/"+d1+"/"+y1+"/"+" at "+time5+" : 00";
            QString result3 = m1+"/"+d1+"/"+y1+"/"+" at "+time6+" : 00";
            ui->label_7->setText(result1);
            ui->label_8->setText(result2);
            ui->label_9->setText(result3);
            valid = true;
            ui->radioButton_8->setVisible(true);
            ui->radioButton_10->setVisible(true);
            ui->radioButton_11->setVisible(true);
            ui->app_user->setVisible(true);
            ui->lineEdit_3->setVisible(true);
            ui->confirm->setVisible(true);

        }else{
            QMessageBox::information(this,"Not Valid","Date is not valid");
        }
    }catch(...){
        QMessageBox::information(this,"Not Valid","Date is not valid");

    }
}

//! A normal member taking no argument and does not return anything.
//! It will go to the next stacked widget and add appointments to database.
void logIn::on_confirm_clicked()
{
    valid = false;
    QString name = ui->lineEdit_3->text();
    QSqlQuery query;
    if(query.exec("select * from client where email = '"+name+ "';")){
        int count=0;
        while(query.next()){
            count++;
        }
        if(count == 1){
            valid = true;
        }else{
            QMessageBox::information(this,"Not Valid","Usesrname does not exist!");
        }
    }
    if(valid){
        ui->label_10->setText("success");
        newSession->insertAppointment(name, m1, d1, y1,resultTime );
        newSession->allAppointments();

    }
}

//! A normal member taking no argument and does not return anything.
void logIn::on_radioButton_clicked()
{
    dogButtonClicked = true;
}

//! A normal member taking no argument and does not return anything.
void logIn::on_radioButton_2_clicked()
{
    catButtonClicked = true;
}

//! A normal member taking no argument and does not return anything.
void logIn::on_radioButton_3_clicked()
{
    hamButtonClicked = true;
}

//! A normal member taking no argument and does not return anything.
void logIn::on_radioButton_8_clicked()
{
    resultTime = time4;
}

//! A normal member taking no argument and does not return anything.
void logIn::on_radioButton_9_clicked()
{
    resultTime = time5;
}

//! A normal member taking no argument and does not return anything.
void logIn::on_radioButton_10_clicked()
{
    resultTime = time6;
}

//! A normal member taking no argument and does not return anything.
void logIn::on_appBackButton_clicked()
{
    ui->stackedWidget->setCurrentIndex(4);
}

//! A normal member taking no argument and does not return anything.
void logIn::on_goBack_clicked()
{
    ui->stackedWidget->setCurrentIndex(4);
}
