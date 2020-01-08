/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tolearn.entities;

import java.io.Serializable;
import java.util.Collection;



/**
 *
 * @author Andoni
 */
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    
    private String name;

    private Collection<Department> departments;

    private Collection<Document> documents;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the departments
     */
    
    public Collection<Department> getDepartments() {
        return departments;
    }
    /**
     * @param departments the departments to set
     */
    public void setDepartments(Collection<Department> departments) {
        this.departments = departments;
    }
    /**
     * @return the documents
     */
    
    public Collection<Document> getDocuments() {
        return documents;
    }
    /**
     * @param documents the documents to set
     */
    public void setDocuments(Collection<Document> documents) {
        this.documents = documents;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Area)) {
            return false;
        }
        Area other = (Area) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }   
    
    @Override
    public String toString() {
        return "entitiesJPA.Area[ id=" + id + " ]";
    }
}