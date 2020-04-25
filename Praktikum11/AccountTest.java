// File AccountTest.java
public class AccountTest {
  public AccountTest() {
     // Tidak melakukan apa-apa
  }

  public void test() {
     // Melakukan tes terhadap method transfer.
     // Asumsikan method lainnya benar.
     Account a = AccountFactory.withBalance(20);
     Account b = AccountFactory.withBalance(40);
     
     int transA = a.getNumOfTransaction();
     int transB = b.getNumOfTransaction();

     try {
     	a.transfer(b,20);
     } catch (Exception e) {
     	assert false;
     }

     assert a.getBalance() == 0;
     assert b.getBalance() == 60;
     assert a.getNumOfTransaction() == transA + 1;
     assert b.getNumOfTransaction() == transB + 1;

     try {
     	a.transfer(b,20);
     	assert false;
     } catch (InvalidAmountException e) {} catch (Exception e){
     	assert false;
     }

     assert a.getBalance() == 0;
     assert b.getBalance() == 60;
     assert a.getNumOfTransaction() == transA + 1;
     assert b.getNumOfTransaction() == transB + 1;
  }
}