package com.example.demo.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Book name can't be blank")
	private String name;
	private Boolean status = false;
	private LocalDate issueDate;
	private LocalDate returnDate;
	
	@ManyToOne
	@JoinColumn(name = "book_student_id", referencedColumnName = "id")
	@JsonIgnoreProperties("book_student_id")
	private Issued_Student student;

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Boolean getStatus() {
//		return status;
//	}
//
//	public void setStatus(Boolean status) {
//		this.status = status;
//	}
//
//	public LocalDate getIssueDate() {
//		return issueDate;
//	}
//
//	public void setIssueDate(LocalDate issueDate) {
//		this.issueDate = issueDate;
//	}
//
//	public LocalDate getReturnDate() {
//		return returnDate;
//	}
//
//	public void setReturnDate(LocalDate returnDate) {
//		this.returnDate = returnDate;
//	}
//
//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}


}