
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
 * Trade venue related fields.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingVenueIdentification1Choice", propOrder = {
    "mktIdCd",
    "ntlCmptntAuthrty",
    "othr"
})
public class TradingVenueIdentification1Choice {

    @XmlElement(name = "MktIdCd")
    protected String mktIdCd;
    @XmlElement(name = "NtlCmptntAuthrty")
    protected String ntlCmptntAuthrty;
    @XmlElement(name = "Othr")
    protected TradingVenueIdentification2 othr;

    /**
     * Gets the value of the mktIdCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktIdCd() {
        return mktIdCd;
    }

    /**
     * Sets the value of the mktIdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingVenueIdentification1Choice setMktIdCd(String value) {
        this.mktIdCd = value;
        return this;
    }

    /**
     * Gets the value of the ntlCmptntAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlCmptntAuthrty() {
        return ntlCmptntAuthrty;
    }

    /**
     * Sets the value of the ntlCmptntAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingVenueIdentification1Choice setNtlCmptntAuthrty(String value) {
        this.ntlCmptntAuthrty = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueIdentification2 }
     *     
     */
    public TradingVenueIdentification2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueIdentification2 }
     *     
     */
    public TradingVenueIdentification1Choice setOthr(TradingVenueIdentification2 value) {
        this.othr = value;
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
