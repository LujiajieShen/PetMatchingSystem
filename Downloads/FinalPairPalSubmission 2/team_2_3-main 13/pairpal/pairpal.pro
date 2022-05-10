TEMPLATE = app
CONFIG += console c++11
CONFIG -= app_bundle

QT += core
QT += sql
QT += uitools


SOURCES += \
        main.cpp \
        pet.cpp \
        ppdatabase.cpp \
        shelter.cpp \
        user.cpp

HEADERS += \
    pet.h \
    ppdatabase.h \
    shelter.h \
    user.h
