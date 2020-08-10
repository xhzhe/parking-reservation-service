package com.oocl.parkingreservationservice.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer fetchNumber;
    private String startTime;
    private String endTime;
    private Integer userId;
    private Integer parkingLotId;
    private String createTime;
    private Integer status;
    private String carNumber;

}
