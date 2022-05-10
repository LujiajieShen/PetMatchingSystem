#include "mainwindow.h"

#include <QApplication>

int main(int argc, char *argv[])
{
    //PPdatabase *newsession1;
    QApplication a(argc, argv);
    MainWindow w;
    //w.setppdb(newsession1);
    //w.openppDB();
    w.show();
    return a.exec();


}
