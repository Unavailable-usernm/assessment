import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterviewTests extends TestsSetup {


    @Test
    public void test1() {
        //Make this test pass
        Homepage homepage = new Homepage();
        Assertions.assertEquals("Log in", homepage.loginBtn.getText());
    }

    @Test
    public void test2() {
        /*
        1. Get the number of categories from the Demoblaze homepage (using WebElements).
           Add assertion for checking that there are 3 category items.
        2. Add assertion that the list of categories retrieved from the GUI is equal to the following
           list: Phones, Laptops, Monitors. There should be only one assertion checking that the lists are equal.
        */
    }

    @Test
    public void test3() {
        /*
        Do the following:
        1. Open Demoblaze homepage
        2. Click on Phones category
        3. Choose one of the phones (for example the Nexus 6 phone) in order to save its name and price
        4. Click on the chosen phone in order to open the product details page
        5. Check that the name and the price of the product are equal to the name and price displayed in step 3
        Note1: Use Assertions.assertEquals() for both validations and do not use hardcoded values in the assertions
        Note2: You can use either Thread.sleep or the method from ElementWaiting.java for waiting for WebElements to be displayed.
         */

    }


}
