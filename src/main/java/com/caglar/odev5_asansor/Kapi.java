package com.caglar.odev5_asansor;

public class Kapi {
    private boolean acik;

    public Kapi() {
        this.acik = false;
    }

    public void ac() {
        acik = true;
    }

    public void kapat() {
        acik = false;
    }

    public boolean isAcik() {
        return acik;
    }
}
