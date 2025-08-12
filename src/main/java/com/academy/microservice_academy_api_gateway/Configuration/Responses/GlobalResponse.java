package com.academy.microservice_academy_api_gateway.Configuration.Responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalResponse<T> {
    private Boolean success;
    private String message;
    private T data;
}
