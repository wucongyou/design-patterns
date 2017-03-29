package com.echo.designpattern.mediator;

public class Client {

    public static void main(String[] args) {
        IMediator mediator = new Mediator("Greeting mediator");
        IColleague tom = new Colleague("Tom");
        IColleague mary = new Colleague("Mary");
        IColleague mike = new Colleague("Mike");
        mediator.attach(tom);
        mediator.attach(mary);
        mediator.attach(mike);

        Action action = new Action("Hi,there!", "Hi");
        tom.act(action);

        System.out.println();
        mary.act(action);

        System.out.println();
        mike.act(action);
    }

}
