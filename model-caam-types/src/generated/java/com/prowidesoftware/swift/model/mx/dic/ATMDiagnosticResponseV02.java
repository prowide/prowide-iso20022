
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
 * The ATMDiagnosticResponse message is sent by an acquirer to an ATM in response to an ATMDiagnosticRequest message ensuring the availability and the validity of the parameters.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDiagnosticResponseV02", propOrder = {
    "hdr",
    "prtctdATMDgnstcRspn",
    "atmDgnstcRspn",
    "sctyTrlr"
})
public class ATMDiagnosticResponseV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMDgnstcRspn")
    protected ContentInformationType10 prtctdATMDgnstcRspn;
    @XmlElement(name = "ATMDgnstcRspn")
    protected ATMDiagnosticResponse2 atmDgnstcRspn;
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
    public ATMDiagnosticResponseV02 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMDgnstcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMDgnstcRspn() {
        return prtctdATMDgnstcRspn;
    }

    /**
     * Sets the value of the prtctdATMDgnstcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMDiagnosticResponseV02 setPrtctdATMDgnstcRspn(ContentInformationType10 value) {
        this.prtctdATMDgnstcRspn = value;
        return this;
    }

    /**
     * Gets the value of the atmDgnstcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDiagnosticResponse2 }
     *     
     */
    public ATMDiagnosticResponse2 getATMDgnstcRspn() {
        return atmDgnstcRspn;
    }

    /**
     * Sets the value of the atmDgnstcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDiagnosticResponse2 }
     *     
     */
    public ATMDiagnosticResponseV02 setATMDgnstcRspn(ATMDiagnosticResponse2 value) {
        this.atmDgnstcRspn = value;
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
    public ATMDiagnosticResponseV02 setSctyTrlr(ContentInformationType15 value) {
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
