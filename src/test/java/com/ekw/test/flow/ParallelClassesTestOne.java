package com.ekw.test.flow;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(FlowTimeReport.class)
public class ParallelClassesTestOne
{
    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
       // System.out.println("Before test-class. Thread id is: " + id);
    }
 
    @Test
    public void testMethodOneA() {
        long id = Thread.currentThread().getId();
       // System.out.println("Sample test-method One. Thread id is: " + id);
    }
 
    @Test
    public void testMethodTwoA() {
        long id = Thread.currentThread().getId();
      //  System.out.println("Sample test-method Two. Thread id is: " + id);
    }
 
    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
       // System.out.println("After test-class. Thread id is: " + id);
    }
}