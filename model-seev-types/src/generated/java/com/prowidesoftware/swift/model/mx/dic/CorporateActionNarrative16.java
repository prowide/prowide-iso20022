
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
@XmlType(name = "CorporateActionNarrative16", propOrder = {
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
public class CorporateActionNarrative16 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation5 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation5 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation5 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation5 infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation5 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation5 dsclmr;
    @XmlElement(name = "PtyCtctNrrtv")
    protected UpdatedAdditionalInformation5 ptyCtctNrrtv;
    @XmlElement(name = "DclrtnDtls")
    protected UpdatedAdditionalInformation5 dclrtnDtls;
    @XmlElement(name = "RegnDtls")
    protected UpdatedAdditionalInformation5 regnDtls;
    @XmlElement(name = "BsktOrIndxInf")
    protected UpdatedAdditionalInformation5 bsktOrIndxInf;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public CorporateActionNarrative16 setAddtlTxt(UpdatedAdditionalInformation5 value) {
        this.addtlTxt = value;
        return this;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public CorporateActionNarrative16 setNrrtvVrsn(UpdatedAdditionalInformation5 value) {
        this.nrrtvVrsn = value;
        return this;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public CorporateActionNarrative16 setInfConds(UpdatedAdditionalInformation5 value) {
        this.infConds = value;
        return this;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public CorporateActionNarrative16 setInfToCmplyWth(UpdatedAdditionalInformation5 value) {
        this.infToCmplyWth = value;
        return this;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public CorporateActionNarrative16 setTaxtnConds(UpdatedAdditionalInformation5 value) {
        this.taxtnConds = value;
        return this;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public CorporateActionNarrative16 setDsclmr(UpdatedAdditionalInformation5 value) {
        this.dsclmr = value;
        return this;
    }

    /**
     * Gets the value of the ptyCtctNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getPtyCtctNrrtv() {
        return ptyCtctNrrtv;
    }

    /**
     * Sets the value of the ptyCtctNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public CorporateActionNarrative16 setPtyCtctNrrtv(UpdatedAdditionalInformation5 value) {
        this.ptyCtctNrrtv = value;
        return this;
    }

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public CorporateActionNarrative16 setDclrtnDtls(UpdatedAdditionalInformation5 value) {
        this.dclrtnDtls = value;
        return this;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public CorporateActionNarrative16 setRegnDtls(UpdatedAdditionalInformation5 value) {
        this.regnDtls = value;
        return this;
    }

    /**
     * Gets the value of the bsktOrIndxInf property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getBsktOrIndxInf() {
        return bsktOrIndxInf;
    }

    /**
     * Sets the value of the bsktOrIndxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public CorporateActionNarrative16 setBsktOrIndxInf(UpdatedAdditionalInformation5 value) {
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
