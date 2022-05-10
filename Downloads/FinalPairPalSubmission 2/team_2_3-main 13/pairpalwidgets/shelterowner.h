#ifndef SHELTEROWNER_H
#define SHELTEROWNER_H

#include <QDialog>
#include <QMainWindow>
#include <QMessageBox>
#include <QtSql>
#include <QSqlDatabase>
#include <QSqlQuery>
#include <QDebug>
#include "../pairpal/ppdatabase.h"

namespace Ui {
class shelterOwner;
}

class shelterOwner : public QDialog
{
    Q_OBJECT

public:
    explicit shelterOwner(QWidget *parent = nullptr);
    ~shelterOwner();
    //PPdatabase *newSession;
    QString petName;
    QString DOB;
    QString petStatus;
    QString breed;
    QString health;
    QString shelterID;
    QString sex;
    QString type;


    QString updateThisPet;
    QString newHealth;

    int value = 0;
    PPdatabase *newSession = new PPdatabase;


private slots:
    void on_Add_clicked();

    void on_Delete_clicked();

    void on_NextPage_clicked();

    void on_pushButton_clicked();

    void on_updateBackButton_clicked();

    void on_addDeletePet_clicked();

    void on_updatePetButton_clicked();

private:
    Ui::shelterOwner *ui;
};

#endif // SHELTEROWNER_H
