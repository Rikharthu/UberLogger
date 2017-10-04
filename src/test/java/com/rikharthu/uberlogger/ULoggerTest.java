package com.rikharthu.uberlogger;

import org.junit.Test;

public class ULoggerTest {

    @Test
    public void testLogsMessages() {
        System.out.printf("%d %s", 3, "Sas");

        ULog.init(ULog.LogLevel.DEBUG);
        ULog.d("%d %.9f %s", 13, 0.1337, "Hello");
    }
}
