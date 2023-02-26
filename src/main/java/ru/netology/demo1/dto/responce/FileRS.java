package ru.netology.demo1.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileRS {

    private String filename;
    private Long size;
}
