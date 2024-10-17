package top.wpaint.entity;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseEntity implements Serializable {
    private Integer code;
    private String message;
    private String data;
}