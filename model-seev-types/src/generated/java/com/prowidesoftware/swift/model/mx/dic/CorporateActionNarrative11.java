
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
 * Provides additional information such as the taxation conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative11", propOrder = {
    "addtlTxt",
    "nrrtvVrsn",
    "infConds",
    "infToCmplyWth",
    "taxtnConds",
    "dsclmr",
    "ptyCtctNrrtv",
    "dclrtnDtls",
    "regnDtls",
    "bsktOrIndxInf"
})
public class CorporateActionNarrative11 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation2 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation2 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation2 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation2 infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation2 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation2 dsclmr;
    @XmlElement(name = "PtyCtctNrrtv")
    protected UpdatedAdditionalInformation2 ptyCtctNrrtv;
    @XmlElement(name = "DclrtnDtls")
    protected UpdatedAdditionalInformation2 dclrtnDtls;
    @XmlElement(name = "RegnDtls")
    protected UpdatedAdditionalInformation2 regnDtls;
    @XmlElement(name = "BsktOrIndxInf")
    protected UpdatedAdditionalInformation2 bsktOrIndxInf;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public UpdatedAdditionalInformation2 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public CorporateActionNarrative11 setAddtlTxt(UpdatedAdditionalInformation2 value) {
        this.addtlTxt = value;
        return this;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public UpdatedAdditionalInformation2 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public CorporateActionNarrative11 setNrrtvVrsn(UpdatedAdditionalInformation2 value) {
        this.nrrtvVrsn = value;
        return this;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public UpdatedAdditionalInformation2 getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public CorporateActionNarrative11 setInfConds(UpdatedAdditionalInformation2 value) {
        this.infConds = value;
        return this;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public UpdatedAdditionalInformation2 getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public CorporateActionNarrative11 setInfToCmplyWth(UpdatedAdditionalInformation2 value) {
        this.infToCmplyWth = value;
        return this;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public UpdatedAdditionalInformation2 getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public CorporateActionNarrative11 setTaxtnConds(UpdatedAdditionalInformation2 value) {
        this.taxtnConds = value;
        return this;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public UpdatedAdditionalInformation2 getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public CorporateActionNarrative11 setDsclmr(UpdatedAdditionalInformation2 value) {
        this.dsclmr = value;
        return this;
    }

    /**
     * Gets the value of the ptyCtctNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public UpdatedAdditionalInformation2 getPtyCtctNrrtv() {
        return ptyCtctNrrtv;
    }

    /**
     * Sets the value of the ptyCtctNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public CorporateActionNarrative11 setPtyCtctNrrtv(UpdatedAdditionalInformation2 value) {
        this.ptyCtctNrrtv = value;
        return this;
    }

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public UpdatedAdditionalInformation2 getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public CorporateActionNarrative11 setDclrtnDtls(UpdatedAdditionalInformation2 value) {
        this.dclrtnDtls = value;
        return this;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public UpdatedAdditionalInformation2 getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public CorporateActionNarrative11 setRegnDtls(UpdatedAdditionalInformation2 value) {
        this.regnDtls = value;
        return this;
    }

    /**
     * Gets the value of the bsktOrIndxInf property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public UpdatedAdditionalInformation2 getBsktOrIndxInf() {
        return bsktOrIndxInf;
    }

    /**
     * Sets the value of the bsktOrIndxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation2 }
     *     
     */
    public CorporateActionNarrative11 setBsktOrIndxInf(UpdatedAdditionalInformation2 value) {
        this.bsktOrIndxInf = value;
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
