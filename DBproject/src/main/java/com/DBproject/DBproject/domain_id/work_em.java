package com.DBproject.DBproject.domain_id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class work_em implements Serializable {
    private int employee;
    private String project;

}
