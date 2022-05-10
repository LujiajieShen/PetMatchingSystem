#ifndef LOGIN_H
#define LOGIN_H

#include <QDialog>
#include "../pairpal/ppdatabase.h"

namespace Ui {
class logIn;
}

class logIn : public QDialog
{
    Q_OBJECT

public:
    explicit logIn(QWidget *parent = nullptr);
    ~logIn();


    PPdatabase *newSession;
    QString preferredBreed;
    QString preferredGender;
    QString preferredType;
    QString preferredShed;
    QString preferredHypo;
    QString m1;
    QString d1;
    QString y1;
    QString resultTime;
    QString time4;
    QString time5;
    QString time6;

    bool dogButtonClicked = false;
    bool catButtonClicked = false;
    bool hamButtonClicked = false;
    bool hairLess = false;
    bool hairFull = false;
    bool dontCareHair = false;
    bool hypoAllergenic = false;
    bool dontCareHypo = false;

private slots:
    void on_quiz_clicked();

    void on_NextQuiz_clicked();

    void on_pushButton_clicked();

    void on_pushButton_4_clicked();

    void on_pushButton_5_clicked();

    void on_pushButton_2_clicked();

    void on_pushButton_3_clicked();

    void on_search_clicked();

    void on_confirm_clicked();

    void on_radioButton_clicked();

    void on_radioButton_2_clicked();

    void on_radioButton_3_clicked();

    void on_radioButton_8_clicked();

    void on_radioButton_9_clicked();

    void on_radioButton_10_clicked();

    void on_appBackButton_clicked();

    void on_goBack_clicked();

private:
    Ui::logIn *ui;
    QString date;
    bool valid;
};

#endif // LOGIN_H
