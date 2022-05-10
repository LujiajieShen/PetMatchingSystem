#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "signup.h"
#include "login.h"
#include "shelterowner.h"

//! A constructor.
/*!
      The constructor has one parameter, and it
      will display the default widgets.
    */
MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    newsession = new PPdatabase;
}

//! A destructor.
/*!
      It will delete UI.
    */
MainWindow::~MainWindow()
{
    delete ui;
}

//! A normal member taking no argument and does not return anything.
//! It will read the text and do certain operations.
void MainWindow::on_logIn_clicked()
{
    //getDB();
    QString username, password;
    username = ui->ID->text();
    password = ui->password->text();
    //if(){
    //qDebug()<<"Failed to open!";
    //}
    QSqlQuery q;
    //first check in the client table
    if(q.exec("select * from client where email='"+username+"' and password='"+password+"'")){
        int count=0;
        while(q.next()){
            count++;
        }
        if(count==1){
            QMessageBox::information(this,"Log In","Log In Success");
            this->close();
            logIn l;
            l.setModal(true);
            l.exec();
        }
        else{
            if(q.exec("SELECT * FROM shelter WHERE email='"+username+"' and password='"+password+"'")){
                int count=0;
                while(q.next()){
                    count++;
                }
                if(count==1){
                    QMessageBox::information(this,"Log In","Log In Success");
                    this->close();
                    shelterOwner s;
                    s.setModal(true);
                    s.exec();
                }
                //if not found in either
                else{
                    QMessageBox::information(this,"Not Log In","Username or password not found!");
                }
            }        }
    }

}

//! A normal member taking no argument and does not return anything.
//! It will go to the sign up page.
void MainWindow::on_signUp_clicked()
{
    signUp s;
    s.setModal(true);
    s.exec();

}
