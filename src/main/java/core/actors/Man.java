package core.actors;

import utility.Human;

import java.util.Objects;

public class Man extends Human {
    private String name;

    public Man(String name) {
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println(name + " join in story");
    }

    @Override
    public String getName() {
        return name;
    }

    public void goHome(){
        System.out.println(name + " went home");
    }
    public void meet(Astronomer astronomer){
        System.out.println(name + " meet " + astronomer.getName());
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Man man = (Man) object;
        return Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
