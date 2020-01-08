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
 * @author Ruben
 */

public class Document implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private String description;

    private User user;

    private Collection<Area> areas;

    private Date uploadDate;

    private Boolean visibility;

    private Byte[] documentContent;

    private DocumentStatus status;

    public Document() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Collection<Area> getAreas() {
        return areas;
    }

    public void setAreas(Collection<Area> areas) {
        this.areas = areas;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public Byte[] getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(Byte[] documentContent) {
        this.documentContent = documentContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DocumentStatus getStatus() {
        return status;
    }

    public void setStatus(DocumentStatus status) {
        this.status = status;
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
        if (!(object instanceof Document)) {
            return false;
        }
        Document other = (Document) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiesJPA.Document[ id=" + id + " ]";
    }

}
