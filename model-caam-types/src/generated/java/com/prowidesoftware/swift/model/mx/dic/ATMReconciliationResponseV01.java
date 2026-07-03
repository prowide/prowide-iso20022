
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The ATMReconciliationResponse is sent by a maintenance host to an ATM to identify counts that must be updated.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMReconciliationResponseV01", propOrder = {
    "hdr",
    "prtctdATMRcncltnRspn",
    "atmRcncltnRspn",
    "sctyTrlr"
})
public class ATMReconciliationResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMRcncltnRspn")
    protected ContentInformationType10 prtctdATMRcncltnRspn;
    @XmlElement(name = "ATMRcncltnRspn")
    protected ATMReconciliationRequestComponent1 atmRcncltnRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header31 }
     *     
     */
    public Header31 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header31 }
     *     
     */
    public ATMReconciliationResponseV01 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMRcncltnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMRcncltnRspn() {
        return prtctdATMRcncltnRspn;
    }

    /**
     * Sets the value of the prtctdATMRcncltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMReconciliationResponseV01 setPrtctdATMRcncltnRspn(ContentInformationType10 value) {
        this.prtctdATMRcncltnRspn = value;
        return this;
    }

    /**
     * Gets the value of the atmRcncltnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMReconciliationRequestComponent1 }
     *     
     */
    public ATMReconciliationRequestComponent1 getATMRcncltnRspn() {
        return atmRcncltnRspn;
    }

    /**
     * Sets the value of the atmRcncltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMReconciliationRequestComponent1 }
     *     
     */
    public ATMReconciliationResponseV01 setATMRcncltnRspn(ATMReconciliationRequestComponent1 value) {
        this.atmRcncltnRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ContentInformationType15 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ATMReconciliationResponseV01 setSctyTrlr(ContentInformationType15 value) {
        this.sctyTrlr = value;
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
