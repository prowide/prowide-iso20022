
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
 * The ATMDepositResponse message is sent by an ATM manager or its agent to inform the ATM of the approval or decline of the deposit transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDepositResponseV01", propOrder = {
    "hdr",
    "prtctdATMDpstRspn",
    "atmDpstRspn",
    "sctyTrlr"
})
public class ATMDepositResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMDpstRspn")
    protected ContentInformationType10 prtctdATMDpstRspn;
    @XmlElement(name = "ATMDpstRspn")
    protected ATMDepositResponse1 atmDpstRspn;
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
    public ATMDepositResponseV01 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMDpstRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMDpstRspn() {
        return prtctdATMDpstRspn;
    }

    /**
     * Sets the value of the prtctdATMDpstRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMDepositResponseV01 setPrtctdATMDpstRspn(ContentInformationType10 value) {
        this.prtctdATMDpstRspn = value;
        return this;
    }

    /**
     * Gets the value of the atmDpstRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDepositResponse1 }
     *     
     */
    public ATMDepositResponse1 getATMDpstRspn() {
        return atmDpstRspn;
    }

    /**
     * Sets the value of the atmDpstRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDepositResponse1 }
     *     
     */
    public ATMDepositResponseV01 setATMDpstRspn(ATMDepositResponse1 value) {
        this.atmDpstRspn = value;
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
    public ATMDepositResponseV01 setSctyTrlr(ContentInformationType15 value) {
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
