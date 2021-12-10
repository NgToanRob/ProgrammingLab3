package core.actors;

import core.actions.MakeMagnifying;
import core.actions.MakeTelescope;
import core.sources.BrokenBottles;
import core.sources.Magnifying;
import core.sources.Telescope;
import utility.Human;


public class Astronomer extends Human {
    private  String name;

    public Astronomer(String name) {
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println(name + " join in story");
    }

    public void becomeAstronomer(){
        System.out.println(name + " became an astronomer");
    }

    public void lookThroughBrokenBottles(){
        BrokenBottles brokenBottles = new BrokenBottles();
        brokenBottles.lookThrough(name);
    }

    public void makeMagnifying(){
        MakeMagnifying action = new MakeMagnifying();
        action.make(name);
    }

    public void lookThroughMagnifying(){
        Magnifying magnifying = new Magnifying();
        magnifying.lookThrough(name);
    }

    public void makeTelescope(){
        MakeTelescope action = new MakeTelescope();
        action.make(name);
    }

    public void lookThroughTelescope(){
        Telescope telescope = new Telescope();
        telescope.lookThrough(name);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        return name +" was a famous astronomer";
    }

    @Override
    public String getName() {
        return name;
    }
}
