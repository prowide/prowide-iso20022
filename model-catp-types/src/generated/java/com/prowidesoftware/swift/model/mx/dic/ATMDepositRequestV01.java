
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
 * The ATMDepositRequest message is sent by an ATM to an acquirer or its agent to request the approval of a deposit transaction at an ATM, before or after deposit media inside the ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDepositRequestV01", propOrder = {
    "hdr",
    "prtctdATMDpstReq",
    "atmDpstReq",
    "sctyTrlr"
})
public class ATMDepositRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMDpstReq")
    protected ContentInformationType10 prtctdATMDpstReq;
    @XmlElement(name = "ATMDpstReq")
    protected ATMDepositRequest1 atmDpstReq;
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
    public ATMDepositRequestV01 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMDpstReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMDpstReq() {
        return prtctdATMDpstReq;
    }

    /**
     * Sets the value of the prtctdATMDpstReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMDepositRequestV01 setPrtctdATMDpstReq(ContentInformationType10 value) {
        this.prtctdATMDpstReq = value;
        return this;
    }

    /**
     * Gets the value of the atmDpstReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDepositRequest1 }
     *     
     */
    public ATMDepositRequest1 getATMDpstReq() {
        return atmDpstReq;
    }

    /**
     * Sets the value of the atmDpstReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDepositRequest1 }
     *     
     */
    public ATMDepositRequestV01 setATMDpstReq(ATMDepositRequest1 value) {
        this.atmDpstReq = value;
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
    public ATMDepositRequestV01 setSctyTrlr(ContentInformationType15 value) {
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
