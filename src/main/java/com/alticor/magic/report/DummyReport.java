package com.alticor.magic.report;

import io.swarmauto.driverextended.Report;

public class DummyReport implements Report {
    @Override
    public void prepReporting() {}

    @Override
    public void validate(String s, boolean b, boolean b1, byte[] bytes) {}

    @Override
    public void validate(String s, boolean b, boolean b1) {}

    @Override
    public void validate(String s, boolean b) {}

    @Override
    public void writeStep(String s) {}

    @Override
    public void writeReport() {}
}
