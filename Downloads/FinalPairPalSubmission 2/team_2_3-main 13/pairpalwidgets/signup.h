#ifndef SIGNUP_H
#define SIGNUP_H
#include "mainwindow.h"
#include <QDialog>
#include <QMainWindow>
#include <QtSql>
#include <QSqlDatabase>
#include <QSqlQuery>
#include <QDebug>
#include "../pairpal/ppdatabase.h"

namespace Ui {
class signUp;
}

class signUp : public QDialog
{
    Q_OBJECT

public:
    explicit signUp(QWidget *parent = nullptr);
    ~signUp();

    PPdatabase *newSession;

    QString sheltName;
    QString sheltAddy;
    QString sheltEmail;
    QString sheltPassword;
    QString sheltHours;

    QString useName;
    QString useMail;
    QString useAddy;
    QString useDOB;
    QString useAllerg;
    QString usePassw;


private slots:
    void on_client_clicked();

    void on_shelter_clicked();

    void on_Next_clicked();

    void on_Next_2_clicked();

protected:
    Ui::signUp *ui;
};

#endif // SIGNUP_H
