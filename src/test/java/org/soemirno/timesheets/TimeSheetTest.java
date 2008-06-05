package org.soemirno.timesheets;

import org.junit.Before;
import org.junit.Test;
import org.jmock.Mockery;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnit4Mockery;

public class TimeSheetTest {
    TimeSheet timeSheet;
    private Loggable codingWork;
    private Mockery context = new JUnit4Mockery();
    private Loggable studying;

    @Before
    public void Setup() {
        Employee james = context.mock(Employee.class);
        codingWork = context.mock(Loggable.class, "coding");
        studying = context.mock(Loggable.class, "studying");
        timeSheet = new TimeSheetImpl();        
        timeSheet.add(james, codingWork);
        timeSheet.add(james, studying);
    }

    @Test
    public void each() {

        context.checking(new Expectations() {
            {
                one(codingWork).description();
                will(returnValue("Did some fancy coding."));
                one(studying).description();
                will(returnValue("Did heavy studying."));
            }
        });

        timeSheet.each(new Applyable() {
            public void each(Object log) {
                System.out.println(((Loggable)log).description());
            }
        });

        context.assertIsSatisfied();
    }
}
