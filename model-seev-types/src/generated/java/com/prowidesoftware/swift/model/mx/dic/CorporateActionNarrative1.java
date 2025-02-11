
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
 * Provides addtional information such as the taxation conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative1", propOrder = {
    "infConds",
    "infToCmplyWth",
    "taxtnConds",
    "newCpnyNm",
    "offerr",
    "urlAdr",
    "addtlTxt"
})
public class CorporateActionNarrative1 {

    @XmlElement(name = "InfConds")
    protected String infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected String infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected String taxtnConds;
    @XmlElement(name = "NewCpnyNm")
    protected String newCpnyNm;
    @XmlElement(name = "Offerr")
    protected PartyIdentification2Choice offerr;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "AddtlTxt")
    protected String addtlTxt;

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNarrative1 setInfConds(String value) {
        this.infConds = value;
        return this;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNarrative1 setInfToCmplyWth(String value) {
        this.infToCmplyWth = value;
        return this;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNarrative1 setTaxtnConds(String value) {
        this.taxtnConds = value;
        return this;
    }

    /**
     * Gets the value of the newCpnyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCpnyNm() {
        return newCpnyNm;
    }

    /**
     * Sets the value of the newCpnyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNarrative1 setNewCpnyNm(String value) {
        this.newCpnyNm = value;
        return this;
    }

    /**
     * Gets the value of the offerr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getOfferr() {
        return offerr;
    }

    /**
     * Sets the value of the offerr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public CorporateActionNarrative1 setOfferr(PartyIdentification2Choice value) {
        this.offerr = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNarrative1 setURLAdr(String value) {
        this.urlAdr = value;
        return this;
    }

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNarrative1 setAddtlTxt(String value) {
        this.addtlTxt = value;
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
