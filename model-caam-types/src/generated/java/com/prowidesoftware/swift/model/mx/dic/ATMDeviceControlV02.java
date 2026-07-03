
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
 * The ATMDeviceControl message is sent by a maintenance host to an ATM in response to an ATMDeviceReport message. The message contains a sequence of maintenance commands the ATM must perform.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDeviceControlV02", propOrder = {
    "hdr",
    "prtctdATMDvcCtrl",
    "atmDvcCtrl",
    "sctyTrlr"
})
public class ATMDeviceControlV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMDvcCtrl")
    protected ContentInformationType10 prtctdATMDvcCtrl;
    @XmlElement(name = "ATMDvcCtrl")
    protected ATMDeviceControl1 atmDvcCtrl;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType13 sctyTrlr;

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
    public ATMDeviceControlV02 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMDvcCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMDvcCtrl() {
        return prtctdATMDvcCtrl;
    }

    /**
     * Sets the value of the prtctdATMDvcCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMDeviceControlV02 setPrtctdATMDvcCtrl(ContentInformationType10 value) {
        this.prtctdATMDvcCtrl = value;
        return this;
    }

    /**
     * Gets the value of the atmDvcCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDeviceControl1 }
     *     
     */
    public ATMDeviceControl1 getATMDvcCtrl() {
        return atmDvcCtrl;
    }

    /**
     * Sets the value of the atmDvcCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDeviceControl1 }
     *     
     */
    public ATMDeviceControlV02 setATMDvcCtrl(ATMDeviceControl1 value) {
        this.atmDvcCtrl = value;
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
    public ATMDeviceControlV02 setSctyTrlr(ContentInformationType13 value) {
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
