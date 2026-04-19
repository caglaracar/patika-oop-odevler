package com.caglar.odev5_asansor;

public class Saat {
    private int tick;

    public Saat() {
        this.tick = 0;
    }

    public void ilerle() {
        tick++;
    }

    public int getTick() {
        return tick;
    }

    public String damga() {
        return "[t=" + tick + "]";
    }
}
