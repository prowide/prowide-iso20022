
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
 * The ATMConfigurationReport is sent by an ATM to a maintenance host to report the version of the configuration which is active.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMConfigurationReportV01", propOrder = {
    "hdr",
    "prtctdATMCfgtnRpt",
    "atmCfgtnRpt",
    "sctyTrlr"
})
public class ATMConfigurationReportV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMCfgtnRpt")
    protected ContentInformationType10 prtctdATMCfgtnRpt;
    @XmlElement(name = "ATMCfgtnRpt")
    protected ATMConfigurationReportComponent1 atmCfgtnRpt;
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
    public ATMConfigurationReportV01 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMCfgtnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMCfgtnRpt() {
        return prtctdATMCfgtnRpt;
    }

    /**
     * Sets the value of the prtctdATMCfgtnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMConfigurationReportV01 setPrtctdATMCfgtnRpt(ContentInformationType10 value) {
        this.prtctdATMCfgtnRpt = value;
        return this;
    }

    /**
     * Gets the value of the atmCfgtnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMConfigurationReportComponent1 }
     *     
     */
    public ATMConfigurationReportComponent1 getATMCfgtnRpt() {
        return atmCfgtnRpt;
    }

    /**
     * Sets the value of the atmCfgtnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMConfigurationReportComponent1 }
     *     
     */
    public ATMConfigurationReportV01 setATMCfgtnRpt(ATMConfigurationReportComponent1 value) {
        this.atmCfgtnRpt = value;
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
    public ATMConfigurationReportV01 setSctyTrlr(ContentInformationType15 value) {
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
