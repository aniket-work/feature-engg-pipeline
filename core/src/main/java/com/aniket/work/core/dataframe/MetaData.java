package com.aniket.work.core.dataframe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class MetaData {

    private Long number;
    private String source;
    private LocalDateTime bornDateTime;
}
