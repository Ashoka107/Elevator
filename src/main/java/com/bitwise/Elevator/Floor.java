package com.bitwise.Elevator;

/**
 * Created by ashokk on 1/22/2016.
 */
public class Floor {

    public int currentFloor=0;
    public boolean blinkbutton=false;
    FloorButton floorButton=new FloorButton();
    Floor floor=new Floor();
    Elevator elevator=new Elevator();


    public void floorRequest(int floorbutton) {

        floorButton.setButton(floorbutton);
        validationOfRequest();



    }

    private void validationOfRequest() {
        if(floorButton.getFloorButton()> elevator.bottomfloor && floorButton.getFloorButton()<elevator.topfloor)
        {
            blinkbutton=true;
            callingElevator();
        }
    }

    private void callingElevator() {
        if(floor.currentFloor<floorButton.getFloorButton())
        {
            elevator.moveLiftUp();
        }
        if(floor.currentFloor>floorButton.getFloorButton())
        {
            elevator.moveLiftDown();
        }

    }
}
