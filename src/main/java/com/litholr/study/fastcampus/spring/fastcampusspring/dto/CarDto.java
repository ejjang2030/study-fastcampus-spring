package com.litholr.study.fastcampus.spring.fastcampusspring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

public class CarDto {

    @JsonProperty("name")
    private String carName;
    @JsonProperty("car_number")
    private String carNumber;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "carName='" + carName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
