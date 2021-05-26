package com.house;

import java.util.Objects;

public class Kitchen {

    private double squareFeet;
    private double roomLength;
    private double roomWidth;
    private String floorType;
    private double ceilingHeight;
    private String otherDetails;

    public double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(double squareFeet) {
        this.squareFeet = squareFeet;
    }

    public double getRoomLength() {
        return roomLength;
    }

    public void setRoomLength(double roomLength) {
        this.roomLength = roomLength;
    }

    public double getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(double roomWidth) {
        this.roomWidth = roomWidth;
    }

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    public double getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(double ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kitchen kitchen = (Kitchen) o;
        return Double.compare(kitchen.squareFeet, squareFeet) == 0 && Double.compare(kitchen.roomLength, roomLength) == 0 && Double.compare(kitchen.roomWidth, roomWidth) == 0 && Double.compare(kitchen.ceilingHeight, ceilingHeight) == 0 && Objects.equals(floorType, kitchen.floorType) && Objects.equals(otherDetails, kitchen.otherDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(squareFeet, roomLength, roomWidth, floorType, ceilingHeight, otherDetails);
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "squareFeet=" + squareFeet +
                ", roomLength=" + roomLength +
                ", roomWidth=" + roomWidth +
                ", floorType='" + floorType + '\'' +
                ", ceilingHeight=" + ceilingHeight +
                ", otherDetails='" + otherDetails + '\'' +
                '}';
    }
}
