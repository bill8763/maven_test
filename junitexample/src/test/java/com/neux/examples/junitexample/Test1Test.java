package com.neux.examples.junitexample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Test1Test 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Test1Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Test1Test.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Test1 test1 = new Test1();
    	Test2 test2 = new Test2();
    	// expeceted, actural
        assertEquals( "Hello Word", test1.hello());
        assertEquals( "Hello Word", test2.hello());
    }
}
