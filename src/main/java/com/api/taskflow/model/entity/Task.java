package com.api.taskflow.model.entity;

import com.api.taskflow.model.enums.Priority;
import com.api.taskflow.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "taskflow", name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "user_Id")
    private Long userId;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "start_Date")
    private Date startDate;
    @Column(name = "end_Date")
    private Date endDate;
    @Column(name = "priority")
    private Priority priority;
    @Column(name = "status")
    private Status status;

}
