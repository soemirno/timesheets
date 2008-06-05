package org.soemirno.timesheets;

import java.util.List;
import java.util.ArrayList;

public class TimeSheetImpl implements TimeSheet {
    private List<Loggable> logs = new ArrayList<Loggable>();

    public void add(Employee employee, Loggable loggable) {
        logs.add(loggable);
    }

    public void each(Applyable applyable) {
        for (Loggable log : logs) {
            applyable.each(log);
        }
    }
}
