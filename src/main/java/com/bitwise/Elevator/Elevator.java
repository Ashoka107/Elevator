package com.bitwise.Elevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ashokk on 1/20/2016.
 */
public class Elevator {

    public int bottomfloor, topfloor;
    ElevatorButton elevatorButton = new ElevatorButton();
    Floor floor = new Floor();
    private List<Integer> requests = new ArrayList<>();
    private String direction = "";

    public void setBottomNTopFloor(int bottom, int top) {

        bottomfloor = bottom;
        topfloor = top;
    }

    public void acceptValidRequests(int elevatorbutton) {
        if (elevatorbutton <= topfloor && elevatorbutton >= bottomfloor) {

            elevatorButton.setButton(elevatorbutton);
            acceptRequest();
        }
    }
    public void acceptRequest() {

        requests.add(elevatorButton.getElevatorButton());
        if (elevatorButton.getElevatorButton() > floor.currentFloor)
            moveLiftUp();
        if (elevatorButton.getElevatorButton() < floor.currentFloor)
            moveLiftDown();
    }


    public void moveLiftUp() {

        Collections.sort(requests);
        setCurrentFloor();
        direction="upward";
    }

    public void moveLiftDown() {

        Collections.sort(requests,Collections.reverseOrder());
        setCurrentFloor();
        direction="downward";

        }

    private void setCurrentFloor() {

        floor.currentFloor=requests.get(0);
        floor.blinkbutton=false;
        serveMultipleRequests();
        requests.remove(0);
    }

    private void serveMultipleRequests() {
        for(int i=1;i<requests.size();)
        {

            requests.remove(i-1);
            floor.currentFloor=requests.get(i);
            floor.blinkbutton=false;
        }
    }
}



