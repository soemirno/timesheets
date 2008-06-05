package org.soemirno.timesheets;

import org.junit.*;
import org.jmock.Mockery;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnit4Mockery;

public class EmployeeTest {
    private Employee james;
    private Mockery context = new JUnit4Mockery();
    protected TimeSheet timeSheet;
    protected Loggable codingWork;

    @Before
    public void Setup() {
        codingWork = context.mock(Loggable.class);
        timeSheet = context.mock(TimeSheet.class);

        james = new EmployeeImpl();
        james.open(timeSheet);
    }

    @Test
    public void registerAction() {
        context.checking(new Expectations() {
            {
                one(timeSheet).add(james, codingWork);
            }
        });

        james.register(codingWork);

        context.assertIsSatisfied();
    }

}

