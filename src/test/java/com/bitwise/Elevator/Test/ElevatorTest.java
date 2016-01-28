package com.bitwise.Elevator.Test;

import com.bitwise.Elevator.Elevator;
import com.bitwise.Elevator.ElevatorButton;
import com.bitwise.Elevator.Floor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ashokk on 1/20/2016.
 */
public class ElevatorTest {

    @Test
    public void itShouldAcceptValidFloorRequests()
    {
        Elevator elevator= new Elevator();
        elevator.setBottomNTopFloor(0,7);
        ElevatorButton elevatorButton=new ElevatorButton();
        elevator.acceptValidRequests(2);
        elevatorButton.setButton(3);
        Assert.assertTrue(elevatorButton.getElevatorButton()<=7 && elevatorButton.getElevatorButton()>=0);

    }
    public void itShouldAcceptMultipleResquests()
    {
        Elevator elevator= new Elevator();
        elevator.setBottomNTopFloor(0,7);
        ElevatorButton elevatorButton=new ElevatorButton();
        elevator.acceptValidRequests(2);
        elevator.acceptValidRequests(3);
        elevator.acceptValidRequests(6);
        elevator.acceptValidRequests(4);


    }
    public void itShouldMoveLiftUp()
    {
        Elevator elevator= new Elevator();
        elevator.setBottomNTopFloor(0,7);
        ElevatorButton elevatorButton=new ElevatorButton();
        elevator.acceptValidRequests(2);

    }
    public void itShouldMoveLiftDown()
    {
        Elevator elevator= new Elevator();
        elevator.setBottomNTopFloor(0,7);
        ElevatorButton elevatorButton=new ElevatorButton();
        Floor floor=new Floor();
        floor.currentFloor=7;
        elevatorButton.setButton(4);
        elevator.moveLiftDown();
    }

}
