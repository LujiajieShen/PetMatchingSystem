QT += core gui sql
QT += sql

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

CONFIG += c++11

# You can make your code fail to compile if it uses deprecated APIs.
# In order to do so, uncomment the following line.
#DEFINES += QT_DISABLE_DEPRECATED_BEFORE=0x060000    # disables all the APIs deprecated before Qt 6.0.0

SOURCES += \
    login.cpp \
    main.cpp \
    mainwindow.cpp \
    shelterowner.cpp \
    signup.cpp \
    ../pairpal/pet.cpp \
    ../pairpal/ppdatabase.cpp \
    ../pairpal/shelter.cpp \
    ../pairpal/user.cpp


HEADERS += \
    login.h \
    mainwindow.h \
    shelterowner.h \
    signup.h \
    ../pairpal/pet.h \
    ../pairpal/ppdatabase.h \
    ../pairpal/shelter.h \
    ../pairpal/user.h


FORMS += \
    login.ui \
    mainwindow.ui \
    shelterowner.ui \
    signup.ui

# Default rules for deployment.
qnx: target.path = /tmp/$${TARGET}/bin
else: unix:!android: target.path = /opt/$${TARGET}/bin
!isEmpty(target.path): INSTALLS += target
