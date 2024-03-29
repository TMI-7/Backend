package tech.csm.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
//@ToString(exclude = "addresses")
@Entity
@Table(name = "t_student_master")
public class Student2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "roll_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rollNo;

	@Column(name = "name")
	private String studentName;

	@Column(name = "email")
	private String email;

	@Column(name = "dob")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;

	@Column(name = "cgpa")
	private Double cgpa;

	@Column(name = "yroa")
	private Integer yearOfAddmission;

	@ManyToOne()
	@JoinColumn(name = "branch_id")
	private Branch branch;

	@ManyToMany
	@JoinTable(name = "t_student_course", joinColumns = @JoinColumn(name = "roll_no"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<Course> courses;

	@OneToMany(mappedBy = "student")
	private List<Address> addresses;
}

