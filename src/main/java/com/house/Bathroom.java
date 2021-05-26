package com.house;

import java.util.Objects;

public class Bathroom {

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
        Bathroom bathroom = (Bathroom) o;
        return Double.compare(bathroom.squareFeet, squareFeet) == 0 && Double.compare(bathroom.roomLength, roomLength) == 0 && Double.compare(bathroom.roomWidth, roomWidth) == 0 && Double.compare(bathroom.ceilingHeight, ceilingHeight) == 0 && Objects.equals(floorType, bathroom.floorType) && Objects.equals(otherDetails, bathroom.otherDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(squareFeet, roomLength, roomWidth, floorType, ceilingHeight, otherDetails);
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "squareFeet=" + squareFeet +
                ", roomLength=" + roomLength +
                ", roomWidth=" + roomWidth +
                ", floorType='" + floorType + '\'' +
                ", ceilingHeight=" + ceilingHeight +
                ", otherDetails='" + otherDetails + '\'' +
                '}';
    }
}
