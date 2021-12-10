package core.actions;

import utility.Makable;

public class MakeTelescope implements Makable {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void make(String name) {
        System.out.println("From several such magnifying glasses, " + name + " made a large telescope");
    }
}
