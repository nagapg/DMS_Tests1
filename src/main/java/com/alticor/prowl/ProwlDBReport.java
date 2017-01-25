package com.alticor.prowl;

import io.swarmauto.driverextended.Report;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by harolddost on 4/15/16.
 */
public class ProwlDBReport implements Report  {

    private static final int TIMEOUT = 10;

    private Connection connection;

    @Override public void prepReporting() {
        connection = getConnection();
    }

    private Connection getConnection() {
        return null; // TODO: Finish writing this.
    }

    @Override public void validate(String s, boolean b, boolean b1, byte[] bytes) {

    }

    @Override public void validate(String s, boolean b, boolean b1) {

    }

    @Override public void validate(String s, boolean b) {

    }

    @Override public void writeStep(String s) {
        String statement = "";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(statement);

            ps.setEscapeProcessing(true);
            ps.setQueryTimeout(TIMEOUT);
            ps.setString(1, "");
            ps.setString(2, "");
            ResultSet rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override public void writeReport() {

    }
}
