TEMPLATE = app
CONFIG += console c++11
CONFIG -= app_bundle
##CONFIG -= qt


QT += core
QT += sql
QT += uitools


SOURCES += main.cpp
        ### add the following lines

        # if you have pthread errors, comment/uncomment the next line
        LIBS += -pthread
        SOURCES += ../../gtest/googletest/src/gtest-all.cc

        INCLUDEPATH += ../../gtest \
         ../../gtest/googletest \
         ../../gtest/googletest/include \
         ../../gtest/googletest/include/gtest
        ### add any other source or header files you may need

SOURCES += \
../pairpal/pet.cpp \
../pairpal/ppdatabase.cpp \
../pairpal/shelter.cpp \
../pairpal/user.cpp

HEADERS += \
../pairpal/pet.h \
../pairpal/ppdatabase.h \
../pairpal/shelter.h \
../pairpal/user.h
