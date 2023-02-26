package ru.netology.demo1.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionRS {

    private String message;
    private Integer id;
}
