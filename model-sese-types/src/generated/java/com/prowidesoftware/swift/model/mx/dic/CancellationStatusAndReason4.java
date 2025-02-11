
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
 * Status of a transfer cancellation instruction and reason for the status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationStatusAndReason4", propOrder = {
    "mstrRef",
    "trfRef",
    "clntRef",
    "cxlRef",
    "sts",
    "stsInitr"
})
public class CancellationStatusAndReason4 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference7 clntRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "Sts", required = true)
    protected Status21Choice sts;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification113 stsInitr;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationStatusAndReason4 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationStatusAndReason4 setTrfRef(String value) {
        this.trfRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference7 }
     *     
     */
    public AdditionalReference7 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference7 }
     *     
     */
    public CancellationStatusAndReason4 setClntRef(AdditionalReference7 value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationStatusAndReason4 setCxlRef(String value) {
        this.cxlRef = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status21Choice }
     *     
     */
    public Status21Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status21Choice }
     *     
     */
    public CancellationStatusAndReason4 setSts(Status21Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public CancellationStatusAndReason4 setStsInitr(PartyIdentification113 value) {
        this.stsInitr = value;
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
