package com.neux.examples.junitexample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SumNumberTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SumNumberTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SumNumberTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	SumNumber sumNumber = new SumNumber();
    	// expeceted, actural
        assertEquals( 2+3, sumNumber.sum(2, 3));
    }
}
