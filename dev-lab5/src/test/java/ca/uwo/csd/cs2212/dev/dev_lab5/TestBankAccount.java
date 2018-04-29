package ca.uwo.csd.cs2212.dev.dev_lab5;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
//import org.junit.Before;
//import org.junit.Test;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class TestBankAccount 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    public TestBankAccount( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestBankAccount.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
