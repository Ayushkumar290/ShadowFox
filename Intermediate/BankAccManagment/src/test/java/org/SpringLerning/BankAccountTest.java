package org.SpringLerning;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

// used Junit 4 for the testing

// for making Squrence of test execution
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BankAccountTest {
    static BankAccount account ;

    // before tesing it will set all the requirments
    @BeforeClass
    public static  void initAccount(){
        account = new BankAccount("Naveen",120000);

    }
    //testing deposit function
    @Test
    public void test1Deposit(){
        account.depositAmount(5000);
        assertEquals(125000.0,account.getBalance());
    }
    //testing withdrawal function
    @Test
    public void test2Withdraw(){
        account.withdrawAmount(5000);
        assertEquals(120000.0,account.getBalance());
    }
    // tesing getter of balance
    @Test
    public void test3GetBalance(){
        assertEquals(120000.0, account.getBalance());
    }
    //tesing accountHolder getter
    @Test
    public void test4GetAccountHolder(){
        assertEquals("Naveen",account.getAccountHolder());
    }

    // tesing transection historty (getHistory) function
    @Test
    public void test5GetHistory(){

        List<Transection> actualHistory = account.getHistory();

        assertEquals(3,actualHistory.size());
    }


}