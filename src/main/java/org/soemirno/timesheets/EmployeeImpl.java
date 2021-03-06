package org.soemirno.timesheets;

public class EmployeeImpl implements Employee {
    private TimeSheet timeSheet;

    public void register(Loggable codingWork) {
        timeSheet.add(this, codingWork);
    }

    public void open(TimeSheet timeSheet) {
        this.timeSheet = timeSheet;
    }
}
