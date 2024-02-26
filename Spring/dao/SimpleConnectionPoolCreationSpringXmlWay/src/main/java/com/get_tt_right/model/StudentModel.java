package com.get_tt_right.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class StudentModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer sId;
	private String name;
	private String email;
	private String address;
}
