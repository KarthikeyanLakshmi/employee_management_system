package com.synapse.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table (name = "Employees")
@Data

public class Employee_Details {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Employee_ID")
    private Long employeeId;

    @NotBlank(message = "Employee Name is required")
    @Column(name = "Employee_Name", nullable = false)
    private String employeeName;

    @NotNull(message = "Date of Birth is required")
    @Past(message = "Date of Birth must be in the past")
    @Column(name = "DoB", nullable = false)
    private LocalDate dob;

    @Column(name = "Marital_Status")
    private String maritalStatus;

    @Pattern(regexp = "^\\d{10}$", message = "Contact No must be 10 digits")
    @Column(name = "Contact_No")
    private String contactNo;

    @Size(max = 255, message = "Address cannot exceed 255 characters")
    @Column(name = "Address")
    private String address;

    @Email(message = "Invalid email format")
    @Column(name = "Personal_email")
    private String personalEmail;

    @Column(name = "Department")
    private String department;

    @Column(name = "Branch")
    private String branch;

}
