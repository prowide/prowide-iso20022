
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
@XmlType(name = "SecurityIdentification3Choice", propOrder = {
    "isin",
    "sedol",
    "cusip",
    "ric",
    "tckrSymb",
    "blmbrg",
    "cta",
    "quick",
    "wrtppr",
    "dtch",
    "vlrn",
    "scvm",
    "belgn",
    "cmon",
    "othrPrtryId"
})
public class SecurityIdentification3Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "SEDOL")
    protected String sedol;
    @XmlElement(name = "CUSIP")
    protected String cusip;
    @XmlElement(name = "RIC")
    protected String ric;
    @XmlElement(name = "TckrSymb")
    protected String tckrSymb;
    @XmlElement(name = "Blmbrg")
    protected String blmbrg;
    @XmlElement(name = "CTA")
    protected String cta;
    @XmlElement(name = "QUICK")
    protected String quick;
    @XmlElement(name = "Wrtppr")
    protected String wrtppr;
    @XmlElement(name = "Dtch")
    protected String dtch;
    @XmlElement(name = "Vlrn")
    protected String vlrn;
    @XmlElement(name = "SCVM")
    protected String scvm;
    @XmlElement(name = "Belgn")
    protected String belgn;
    @XmlElement(name = "Cmon")
    protected String cmon;
    @XmlElement(name = "OthrPrtryId")
    protected AlternateSecurityIdentification1 othrPrtryId;

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
    public SecurityIdentification3Choice setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the sedol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDOL() {
        return sedol;
    }

    /**
     * Sets the value of the sedol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification3Choice setSEDOL(String value) {
        this.sedol = value;
        return this;
    }

    /**
     * Gets the value of the cusip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSIP() {
        return cusip;
    }

    /**
     * Sets the value of the cusip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification3Choice setCUSIP(String value) {
        this.cusip = value;
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
    public SecurityIdentification3Choice setRIC(String value) {
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
    public SecurityIdentification3Choice setTckrSymb(String value) {
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
    public SecurityIdentification3Choice setBlmbrg(String value) {
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
    public SecurityIdentification3Choice setCTA(String value) {
        this.cta = value;
        return this;
    }

    /**
     * Gets the value of the quick property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUICK() {
        return quick;
    }

    /**
     * Sets the value of the quick property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification3Choice setQUICK(String value) {
        this.quick = value;
        return this;
    }

    /**
     * Gets the value of the wrtppr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrtppr() {
        return wrtppr;
    }

    /**
     * Sets the value of the wrtppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification3Choice setWrtppr(String value) {
        this.wrtppr = value;
        return this;
    }

    /**
     * Gets the value of the dtch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtch() {
        return dtch;
    }

    /**
     * Sets the value of the dtch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification3Choice setDtch(String value) {
        this.dtch = value;
        return this;
    }

    /**
     * Gets the value of the vlrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlrn() {
        return vlrn;
    }

    /**
     * Sets the value of the vlrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification3Choice setVlrn(String value) {
        this.vlrn = value;
        return this;
    }

    /**
     * Gets the value of the scvm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCVM() {
        return scvm;
    }

    /**
     * Sets the value of the scvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification3Choice setSCVM(String value) {
        this.scvm = value;
        return this;
    }

    /**
     * Gets the value of the belgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgn() {
        return belgn;
    }

    /**
     * Sets the value of the belgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification3Choice setBelgn(String value) {
        this.belgn = value;
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
    public SecurityIdentification3Choice setCmon(String value) {
        this.cmon = value;
        return this;
    }

    /**
     * Gets the value of the othrPrtryId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateSecurityIdentification1 }
     *     
     */
    public AlternateSecurityIdentification1 getOthrPrtryId() {
        return othrPrtryId;
    }

    /**
     * Sets the value of the othrPrtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateSecurityIdentification1 }
     *     
     */
    public SecurityIdentification3Choice setOthrPrtryId(AlternateSecurityIdentification1 value) {
        this.othrPrtryId = value;
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
