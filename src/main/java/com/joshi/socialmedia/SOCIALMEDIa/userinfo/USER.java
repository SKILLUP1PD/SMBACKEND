package com.joshi.socialmedia.SOCIALMEDIa.userinfo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@Table(name="user_info")
public class USER {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NotBlank(message="FirstName is mandatory")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "LastName is mandatory")
    @Column(name="last_name")
    private String lastName;

    @NotBlank(message = "Date of birth is mandatory")
    @Column(name="dob")
    private String dob;

    @NotBlank(message = "EmailAddress is mandatory")
    @Column(name="email_address")
    private String emailAddress;

    @NotBlank(message = "MESSAGE IS MANDATORY")
    @Column(name="mobile_number")
    private String mobileNumber;


    @NotBlank(message = "Desingation is mandatory")
    @Column(name = "designation")
    private String designation;

    @NotBlank(message = "Address is mandatory")
    @Column(name="address")
    private String address;

    @NotBlank(message = "Pincode is mandatory")
    @Column(name = "pincode")
    private String pincode;

    @NotBlank(message="Password is mandatory")
    @Column(name="password")
    private String password;

    public USER(int id, String firstName, String lastName, String dob, String emailAddress, String mobileNumber, String designation, String address, String pincode,String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;
        this.designation = designation;
        this.address = address;
        this.pincode = pincode;
        this.password=password;
    }

    public USER(){

    }
}
