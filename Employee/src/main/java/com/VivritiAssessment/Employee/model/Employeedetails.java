package com.VivritiAssessment.Employee.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
public class Employeedetails {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long userId;
        @Column(name = "firstname")
        private String firstName;
        @Column(name = "lastname")
        private String lastName;
        @Column(name = "mobilenumber")
        private String mobileNumber;
        @Column(name = "address")
        private String Address;
        @Column(name = "department")
        private String Department;

        public long getUserId() {
                return userId;
        }

        public void setUserId(long userId) {
                this.userId = userId;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getMobileNumber() {
                return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
                this.mobileNumber = mobileNumber;
        }

        public String getAddress() {
                return Address;
        }

        public void setAddress(String address) {
                this.Address = address;
        }

        public String getDepartment() {
                return Department;
        }

        public void setDepartment(String department) {
                this.Department = department;
        }
}
