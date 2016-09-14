interface displayModule{
    // displayModule interface
    public void display();
}

class Monitor implements displayModule{
    //concerete monitor display module
    public void display(){
        System.out.println("Display through monitor");
    }
}

class Projector implements displayModule{
    // concrete projector display module
    public void display(){
        System.out.println("Display through projector");
    }
}


public class Computer {
    // computer system
    displayModule dm;

    public void setDisplayModule(displayModule dm){
        // dynamically set display module
        this.dm = dm;
    }

    public void display(){
        // hide away concrete implementation of the display module
        this.dm.display();
    }

    public static void main(String args[]){
        Computer comp = new Computer();
        displayModule monitor = new Monitor();
        displayModule projector = new Projector();

        // display to monitor
        comp.setDisplayModule(monitor);
        comp.display();


        // display to projector
        comp.setDisplayModule(projector);
        comp.display();
    }
}
