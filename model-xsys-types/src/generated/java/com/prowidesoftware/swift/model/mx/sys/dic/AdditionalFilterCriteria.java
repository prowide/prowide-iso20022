
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for AdditionalFilterCriteria complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFilterCriteria", propOrder = {
    "srvc",
    "rqstTpPttrn",
    "rqstrPttrn",
    "rspdrPttrn",
    "rqstRefPttrn",
    "snlId"
})
public class AdditionalFilterCriteria {

    @XmlElement(name = "Srvc")
    protected String srvc;
    @XmlElement(name = "RqstTpPttrn")
    protected String rqstTpPttrn;
    @XmlElement(name = "RqstrPttrn")
    protected String rqstrPttrn;
    @XmlElement(name = "RspdrPttrn")
    protected String rspdrPttrn;
    @XmlElement(name = "RqstRefPttrn")
    protected String rqstRefPttrn;
    @XmlElement(name = "SNLId")
    protected String snlId;

    /**
     * Gets the value of the srvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvc() {
        return srvc;
    }

    /**
     * Sets the value of the srvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFilterCriteria setSrvc(String value) {
        this.srvc = value;
        return this;
    }

    /**
     * Gets the value of the rqstTpPttrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstTpPttrn() {
        return rqstTpPttrn;
    }

    /**
     * Sets the value of the rqstTpPttrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFilterCriteria setRqstTpPttrn(String value) {
        this.rqstTpPttrn = value;
        return this;
    }

    /**
     * Gets the value of the rqstrPttrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstrPttrn() {
        return rqstrPttrn;
    }

    /**
     * Sets the value of the rqstrPttrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFilterCriteria setRqstrPttrn(String value) {
        this.rqstrPttrn = value;
        return this;
    }

    /**
     * Gets the value of the rspdrPttrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspdrPttrn() {
        return rspdrPttrn;
    }

    /**
     * Sets the value of the rspdrPttrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFilterCriteria setRspdrPttrn(String value) {
        this.rspdrPttrn = value;
        return this;
    }

    /**
     * Gets the value of the rqstRefPttrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstRefPttrn() {
        return rqstRefPttrn;
    }

    /**
     * Sets the value of the rqstRefPttrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFilterCriteria setRqstRefPttrn(String value) {
        this.rqstRefPttrn = value;
        return this;
    }

    /**
     * Gets the value of the snlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLId() {
        return snlId;
    }

    /**
     * Sets the value of the snlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFilterCriteria setSNLId(String value) {
        this.snlId = value;
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
