package com.bitwise.Elevator.Test;

import com.bitwise.Elevator.Elevator;
import com.bitwise.Elevator.Floor;
import com.bitwise.Elevator.FloorButton;
import com.sun.xml.internal.bind.v2.model.core.EnumLeafInfo;
import org.junit.Assert;

/**
 * Created by ashokk on 1/22/2016.
 */
public class FloorTest {

    public  void itShouldRequestFromValidFloor()
    {
        Floor floor=new Floor();
        FloorButton floorButton=new FloorButton();
        Elevator elevator= new Elevator();
        elevator.setBottomNTopFloor(0,7);
        floor.floorRequest(3);
        Assert.assertTrue(floorButton.getFloorButton()> elevator.bottomfloor && floorButton.getFloorButton()<elevator.topfloor);
    }
}
