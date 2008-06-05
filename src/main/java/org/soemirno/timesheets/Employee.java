package org.soemirno.timesheets;

public interface Employee {
    void register(Loggable codingWork);

    void open(TimeSheet timeSheet);
}
