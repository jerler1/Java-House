package com.house;

import com.house.bed.Bed;

import java.util.Objects;

public class Bedroom {

    private double squareFeet;
    private double roomLength;
    private double roomWidth;
    private String floorType;
    private double ceilingHeight;
    private Bed bed;

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

    public Double getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(Double ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bedroom bedroom = (Bedroom) o;
        return Double.compare(bedroom.squareFeet, squareFeet) == 0 && Double.compare(bedroom.roomLength, roomLength) == 0 && Double.compare(bedroom.roomWidth, roomWidth) == 0 && Objects.equals(floorType, bedroom.floorType) && Objects.equals(ceilingHeight, bedroom.ceilingHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(squareFeet, roomLength, roomWidth, floorType, ceilingHeight);
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "squareFeet=" + squareFeet +
                ", roomLength=" + roomLength +
                ", roomWidth=" + roomWidth +
                ", floorType='" + floorType + '\'' +
                ", ceilingHeight=" + ceilingHeight +
                '}';
    }
}
