package com.oocl.parkingreservationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingOrder{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fetchNumber;
    private String parkingStartTime;
    private String parkingEndTime;
    private Integer userId;
    private Integer parkingLotId;
    private String createTime;
    private String status;
    private String carNumber;
    private Double price;

    public Boolean isSure(){
        return "ALREADY_SURE".equals(status);
    }
}


