package org.SpringLerning;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transection {
    public String type;
    public double amount;
    public LocalDateTime timespan ;

    public Transection(String type, double amount, LocalDateTime timespan) {
        this.type = type;
        this.amount = amount;
        this.timespan = timespan;
    }

    public Transection(String transectionType) {
        this.amount = amount;
        this.timespan = LocalDateTime.now();
        this.type = transectionType;
    }

    public String getDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "[" + timespan.format(formatter) + "] " +type + amount;

    }
}
