#ifndef MAINWINDOW_H
#define MAINWINDOW_H
#include <QString>
#include <QtSql>
#include <QSqlDatabase>
#include <QMessageBox>
#include "../pairpal/ppdatabase.h"


#include <QMainWindow>

QT_BEGIN_NAMESPACE
namespace Ui { class MainWindow; }
QT_END_NAMESPACE

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    MainWindow(QWidget *parent = nullptr);
    ~MainWindow();
    int idNum = 2000;
    PPdatabase *newsession;
    //void setppdb(PPdatabase *newsession1);
    //PPdatabase getDB();
    //void openppDB();


private slots:
    void on_logIn_clicked();

    void on_signUp_clicked();


private:
    Ui::MainWindow *ui;
    //QSqlDatabase db;
};
#endif // MAINWINDOW_H
