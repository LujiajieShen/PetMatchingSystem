#include <iostream>
#include "gtest/gtest.h"
#include "../pairpal/ppdatabase.h"


// The fixture for testing class Foo.
class FooTest : public ::testing::Test {
 protected:
 // You can remove any or all of the following functions if its body
 // is empty.

    FooTest() {
    // You can do set-up work for each test here.
    }
    virtual ~FooTest() {
    // You can do clean-up work that doesn't throw exceptions here.
    }
    // If the constructor and destructor are not enough for setting up
    // and cleaning up each test, you can define the following methods:

    virtual void SetUp() {
    // Code here will be called immediately after the constructor (right
    // before each test).
    }
    virtual void TearDown() {
    // Code here will be called immediately after each test (right
    // before the destructor).
    }
    // Objects declared here can be used by all tests in the test case for Foo.

    /** replace with your own **/
    PPdatabase s1;
    PPdatabase s2;
   };
   TEST(general, TESTSIMPLE) {
    /** replace with your own **/
    PPdatabase s1;
    PPdatabase s2;
    ASSERT_EQ("testing", "testing")  << " should match!";
   }
   TEST_F(FooTest, TESTFIXTURE) { //TEST_F allows you to access objects from the shared FooTest Class
    /** replace with your own **/
    ASSERT_EQ("testing", "testing") << "These should match!";


   }
   int main(int argc, char **argv) {
    ::testing::InitGoogleTest(&argc, argv);
    return RUN_ALL_TESTS();
   }
