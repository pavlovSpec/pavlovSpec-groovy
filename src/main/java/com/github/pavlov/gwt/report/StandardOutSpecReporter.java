package com.github.pavlov.gwt.report;

public class StandardOutSpecReporter implements SpecReporter {
    @Override
    public void report(String report) {
        System.out.println(report);
    }
}