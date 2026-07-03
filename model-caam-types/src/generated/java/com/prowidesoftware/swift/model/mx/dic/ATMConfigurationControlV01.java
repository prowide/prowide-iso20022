
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
 * Information related to the protocol management on a segment of the path from the ATM to the acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMConfigurationControlV01", propOrder = {
    "hdr",
    "prtctdATMCfgtnCtrl",
    "atmCfgtnCtrl",
    "sctyTrlr"
})
public class ATMConfigurationControlV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMCfgtnCtrl")
    protected ContentInformationType10 prtctdATMCfgtnCtrl;
    @XmlElement(name = "ATMCfgtnCtrl")
    protected ATMConfigurationControlComponent1 atmCfgtnCtrl;
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
    public ATMConfigurationControlV01 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMCfgtnCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMCfgtnCtrl() {
        return prtctdATMCfgtnCtrl;
    }

    /**
     * Sets the value of the prtctdATMCfgtnCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMConfigurationControlV01 setPrtctdATMCfgtnCtrl(ContentInformationType10 value) {
        this.prtctdATMCfgtnCtrl = value;
        return this;
    }

    /**
     * Gets the value of the atmCfgtnCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ATMConfigurationControlComponent1 }
     *     
     */
    public ATMConfigurationControlComponent1 getATMCfgtnCtrl() {
        return atmCfgtnCtrl;
    }

    /**
     * Sets the value of the atmCfgtnCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMConfigurationControlComponent1 }
     *     
     */
    public ATMConfigurationControlV01 setATMCfgtnCtrl(ATMConfigurationControlComponent1 value) {
        this.atmCfgtnCtrl = value;
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
    public ATMConfigurationControlV01 setSctyTrlr(ContentInformationType15 value) {
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
