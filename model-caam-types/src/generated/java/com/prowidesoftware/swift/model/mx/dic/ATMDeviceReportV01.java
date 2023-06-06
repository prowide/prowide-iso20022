
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
 * The ATMDeviceReport message is sent to an acquirer by an ATM, or forwarded by an agent, to report:
 * - The result of maintenance commands performed by the ATM,
 * - The components of the ATM,
 * - The status of the ATM components.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDeviceReportV01", propOrder = {
    "hdr",
    "prtctdATMDvcRpt",
    "atmDvcRpt",
    "sctyTrlr"
})
public class ATMDeviceReportV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header20 hdr;
    @XmlElement(name = "PrtctdATMDvcRpt")
    protected ContentInformationType10 prtctdATMDvcRpt;
    @XmlElement(name = "ATMDvcRpt")
    protected ATMDeviceReport1 atmDvcRpt;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType13 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header20 }
     *     
     */
    public Header20 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header20 }
     *     
     */
    public ATMDeviceReportV01 setHdr(Header20 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMDvcRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMDvcRpt() {
        return prtctdATMDvcRpt;
    }

    /**
     * Sets the value of the prtctdATMDvcRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMDeviceReportV01 setPrtctdATMDvcRpt(ContentInformationType10 value) {
        this.prtctdATMDvcRpt = value;
        return this;
    }

    /**
     * Gets the value of the atmDvcRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDeviceReport1 }
     *     
     */
    public ATMDeviceReport1 getATMDvcRpt() {
        return atmDvcRpt;
    }

    /**
     * Sets the value of the atmDvcRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDeviceReport1 }
     *     
     */
    public ATMDeviceReportV01 setATMDvcRpt(ATMDeviceReport1 value) {
        this.atmDvcRpt = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType13 }
     *     
     */
    public ContentInformationType13 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType13 }
     *     
     */
    public ATMDeviceReportV01 setSctyTrlr(ContentInformationType13 value) {
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
