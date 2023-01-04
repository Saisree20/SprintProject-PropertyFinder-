package com.property_finder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.property_finder.enums.Role;

@Entity
@Table(name="userlogin")
public class UserLoginEntity {


        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="userId")
        private long userId;
        @Column(name="username",unique = true)
        private String username;
        @Column(name="password")
        private String password;
        @Column(name="role")
        private Role role;
        @Column(name="mobilenumber")
        private long mobilenumber;

        public UserLoginEntity(long userId,String username, String password, Role role, long mobilenumber) {
            super();
            this.userId=userId;
            this.username = username;
            this.password = password;
            this.role = role;
            this.mobilenumber = mobilenumber;
        }
                    public long getUserId() {
                        return userId;
                    }
                    public void setUserId(long userId) {
                        this.userId = userId;
                    }
                    public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public Role getRole() {

            return role;
        }
        public void setRole(Role role) {
            this.role = role;
        }
        public long getMobilenumber() {
            return mobilenumber;
        }
        public void setMobilenumber(long mobilenumber) {
            this.mobilenumber = mobilenumber;
        }
        @Override
        public String toString() {
            return "UserLoginEntity [userId="+userId+",username=" + username + ", password=" + password + ", role=" + role + ", mobilenumber="
                    + mobilenumber + "]";
        }
        public UserLoginEntity() {
            super();
            // TODO Auto-generated constructor stub
        }



 

}

 