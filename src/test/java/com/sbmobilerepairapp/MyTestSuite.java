package com.sbmobilerepairapp;

import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@SuiteClasses({SbMobileRepairAppApplicationTests.class,UserTest.class})
public class MyTestSuite {

}
