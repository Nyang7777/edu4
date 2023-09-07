package com.ict.edu4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataVo {
    private boolean success;
    private String message;
    private Object data;
}
