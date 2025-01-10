package com.example.order_management.business.responses;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutletResponse {
    private String id;
    private String outletCode;
    private String address;
    private String signName;
    private double longitude;
    private double latitude;
}