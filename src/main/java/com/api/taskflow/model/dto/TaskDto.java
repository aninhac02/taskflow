package com.api.taskflow.model.dto;

import com.api.taskflow.model.enums.Priority;
import com.api.taskflow.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    private Long id;
    private Long userId;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private Priority priority;
    private Status status;
}
