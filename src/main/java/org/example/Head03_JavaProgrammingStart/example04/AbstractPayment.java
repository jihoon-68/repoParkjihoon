package org.example.Head03_JavaProgrammingStart.example04;

import org.example.Head03_JavaProgrammingStart.example01.Payment;

public abstract class AbstractPayment {
    public abstract void pay(double amount);
    public abstract void cancel(double amount);
}
