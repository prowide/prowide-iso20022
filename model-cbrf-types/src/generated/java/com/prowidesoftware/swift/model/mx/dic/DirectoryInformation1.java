
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Participant details from National BIC directory.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectoryInformation1", propOrder = {
    "ptcptInf",
    "ptcptSwiftIdrsList",
    "accts"
})
public class DirectoryInformation1 {

    @XmlElement(name = "PtcptInf", required = true)
    protected DirectoryParticipantInformation1 ptcptInf;
    @XmlElement(name = "PtcptSwiftIdrsList")
    protected List<String> ptcptSwiftIdrsList;
    @XmlElement(name = "Accts")
    protected List<DirectoryAccountInformation1> accts;

    /**
     * Gets the value of the ptcptInf property.
     * 
     * @return
     *     possible object is
     *     {@link DirectoryParticipantInformation1 }
     *     
     */
    public DirectoryParticipantInformation1 getPtcptInf() {
        return ptcptInf;
    }

    /**
     * Sets the value of the ptcptInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectoryParticipantInformation1 }
     *     
     */
    public DirectoryInformation1 setPtcptInf(DirectoryParticipantInformation1 value) {
        this.ptcptInf = value;
        return this;
    }

    /**
     * Gets the value of the ptcptSwiftIdrsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ptcptSwiftIdrsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtcptSwiftIdrsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ptcptSwiftIdrsList property.
     */
    public List<String> getPtcptSwiftIdrsList() {
        if (ptcptSwiftIdrsList == null) {
            ptcptSwiftIdrsList = new ArrayList<>();
        }
        return this.ptcptSwiftIdrsList;
    }

    /**
     * Gets the value of the accts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the accts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectoryAccountInformation1 }
     * 
     * 
     * @return
     *     The value of the accts property.
     */
    public List<DirectoryAccountInformation1> getAccts() {
        if (accts == null) {
            accts = new ArrayList<>();
        }
        return this.accts;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the ptcptSwiftIdrsList list.
     * @see #getPtcptSwiftIdrsList()
     * 
     */
    public DirectoryInformation1 addPtcptSwiftIdrsList(String ptcptSwiftIdrsList) {
        getPtcptSwiftIdrsList().add(ptcptSwiftIdrsList);
        return this;
    }

    /**
     * Adds a new item to the accts list.
     * @see #getAccts()
     * 
     */
    public DirectoryInformation1 addAccts(DirectoryAccountInformation1 accts) {
        getAccts().add(accts);
        return this;
    }

}
