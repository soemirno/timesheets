package org.soemirno.timesheets;

public interface TimeSheet {
    public void add(Employee employee, Loggable loggable);
    void each(Applyable applyable);
}
