/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tolearn.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Francisco Romero Alonso
 */

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String login;
    private String email;

    private String fullname;

    private UserStatus status;

    private UserPrivilege privilege;

    private String password;

    private byte[] photo;

    private Date lastAccess;

    private Date lastPassWordChange;

    private Date bDate;

    private Company company;

    private Collection<Document> documents;

    /**
     * 
     */
    public User() {
    }

    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }
    
/**
 * 
 * @param id 
 */
    public void setId(int id) {
        this.id = id;
    }
    
/**
 * 
 * @return 
 */
    public String getLogin() {
        return login;
    }
    
/**
 * 
 * @param login 
 */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * 
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return 
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * 
     * @param fullname 
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * 
     * @return 
     */
    public Company getCompany() {
        return company;
    }

    /**
     * 
     * @param company 
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * 
     * @return 
     */

    public Collection<Document> getDocuments() {
        return documents;
    }

    /**
     * 
     * @param documents 
     */
    public void setDocuments(Collection<Document> documents) {
        this.documents = documents;
    }

    /**
     * 
     * @return 
     */
    public UserStatus getStatus() {
        return status;
    }

    /**
     * 
     * @param status 
     */
    public void setStatus(UserStatus status) {
        this.status = status;
    }

    /**
     * 
     * @return 
     */
    public UserPrivilege getPrivilege() {
        return privilege;
    }

    /**
     * 
     * @param privilege 
     */
    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

    /**
     * 
     * @return 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * @return 
     */
    public Date getLastAccess() {
        return lastAccess;
    }

    /**
     * 
     * @param lastAccess 
     */
    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    /**
     * 
     * @return 
     */
    public Date getLastPassWordChange() {
        return lastPassWordChange;
    }

    /**
     * 
     * @param lastPassWordChange 
     */
    public void setLastPassWordChange(Date lastPassWordChange) {
        this.lastPassWordChange = lastPassWordChange;
    }
    
    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    /**
     * 
     * @return 
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * 
     * @param photo 
     */
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    /**
     * 
     * @param object
     * @return 
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "entitiesJPA.User[ id=" + id + " ]";
    }

}
