
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contains the details related to an individual trip. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripInformation1", propOrder = {
    "tripNb",
    "jobNb",
    "workOrdr",
    "invcNb",
    "bllgId",
    "ctrlNb",
    "dlvryTcktNb"
})
public class TripInformation1 {

    @XmlElement(name = "TripNb")
    protected String tripNb;
    @XmlElement(name = "JobNb")
    protected String jobNb;
    @XmlElement(name = "WorkOrdr")
    protected String workOrdr;
    @XmlElement(name = "InvcNb")
    protected String invcNb;
    @XmlElement(name = "BllgId")
    protected String bllgId;
    @XmlElement(name = "CtrlNb")
    protected String ctrlNb;
    @XmlElement(name = "DlvryTcktNb")
    protected String dlvryTcktNb;

    /**
     * Gets the value of the tripNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripNb() {
        return tripNb;
    }

    /**
     * Sets the value of the tripNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripInformation1 setTripNb(String value) {
        this.tripNb = value;
        return this;
    }

    /**
     * Gets the value of the jobNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNb() {
        return jobNb;
    }

    /**
     * Sets the value of the jobNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripInformation1 setJobNb(String value) {
        this.jobNb = value;
        return this;
    }

    /**
     * Gets the value of the workOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrdr() {
        return workOrdr;
    }

    /**
     * Sets the value of the workOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripInformation1 setWorkOrdr(String value) {
        this.workOrdr = value;
        return this;
    }

    /**
     * Gets the value of the invcNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcNb() {
        return invcNb;
    }

    /**
     * Sets the value of the invcNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripInformation1 setInvcNb(String value) {
        this.invcNb = value;
        return this;
    }

    /**
     * Gets the value of the bllgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBllgId() {
        return bllgId;
    }

    /**
     * Sets the value of the bllgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripInformation1 setBllgId(String value) {
        this.bllgId = value;
        return this;
    }

    /**
     * Gets the value of the ctrlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrlNb() {
        return ctrlNb;
    }

    /**
     * Sets the value of the ctrlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripInformation1 setCtrlNb(String value) {
        this.ctrlNb = value;
        return this;
    }

    /**
     * Gets the value of the dlvryTcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryTcktNb() {
        return dlvryTcktNb;
    }

    /**
     * Sets the value of the dlvryTcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripInformation1 setDlvryTcktNb(String value) {
        this.dlvryTcktNb = value;
        return this;
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

}
