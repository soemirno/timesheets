package org.soemirno.timesheets;

public interface Employee {
    void register(Action codingWork);

    void open(TimeSheet timeSheet);
}
