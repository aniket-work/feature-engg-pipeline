package com.aniket.work.core.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Acknowledgment {

    private String messageId;
    private String receiverId;
    private String status;
}
