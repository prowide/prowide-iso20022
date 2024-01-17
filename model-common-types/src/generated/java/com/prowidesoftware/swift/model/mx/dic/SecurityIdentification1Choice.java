
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
 * Choice between formats for the identification of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification1Choice", propOrder = {
    "isin",
    "altrnId",
    "ric",
    "tckrSymb",
    "blmbrg",
    "cta",
    "cmon"
})
public class SecurityIdentification1Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "AltrnId")
    protected AlternateSecurityIdentification1 altrnId;
    @XmlElement(name = "RIC")
    protected String ric;
    @XmlElement(name = "TckrSymb")
    protected String tckrSymb;
    @XmlElement(name = "Blmbrg")
    protected String blmbrg;
    @XmlElement(name = "CTA")
    protected String cta;
    @XmlElement(name = "Cmon")
    protected String cmon;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification1Choice setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateSecurityIdentification1 }
     *     
     */
    public AlternateSecurityIdentification1 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateSecurityIdentification1 }
     *     
     */
    public SecurityIdentification1Choice setAltrnId(AlternateSecurityIdentification1 value) {
        this.altrnId = value;
        return this;
    }

    /**
     * Gets the value of the ric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIC() {
        return ric;
    }

    /**
     * Sets the value of the ric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification1Choice setRIC(String value) {
        this.ric = value;
        return this;
    }

    /**
     * Gets the value of the tckrSymb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTckrSymb() {
        return tckrSymb;
    }

    /**
     * Sets the value of the tckrSymb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification1Choice setTckrSymb(String value) {
        this.tckrSymb = value;
        return this;
    }

    /**
     * Gets the value of the blmbrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlmbrg() {
        return blmbrg;
    }

    /**
     * Sets the value of the blmbrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification1Choice setBlmbrg(String value) {
        this.blmbrg = value;
        return this;
    }

    /**
     * Gets the value of the cta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTA() {
        return cta;
    }

    /**
     * Sets the value of the cta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification1Choice setCTA(String value) {
        this.cta = value;
        return this;
    }

    /**
     * Gets the value of the cmon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmon() {
        return cmon;
    }

    /**
     * Sets the value of the cmon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification1Choice setCmon(String value) {
        this.cmon = value;
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
