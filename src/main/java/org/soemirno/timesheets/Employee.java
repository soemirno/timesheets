package org.soemirno.timesheets;

public class Employee {
    private TimeSheet timeSheet;

    public void register(Action codingWork) {
        timeSheet.add(this, codingWork);
    }

    public void open(TimeSheet timeSheet) {
        this.timeSheet = timeSheet;
    }
}
