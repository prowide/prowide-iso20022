
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
 * Provides additional information such as the taxation conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative15", propOrder = {
    "addtlTxt",
    "nrrtvVrsn",
    "infConds",
    "infToCmplyWth",
    "sctyRstrctn",
    "taxtnConds",
    "dsclmr"
})
public class CorporateActionNarrative15 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation6 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation6 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation5 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation5 infToCmplyWth;
    @XmlElement(name = "SctyRstrctn")
    protected UpdatedAdditionalInformation5 sctyRstrctn;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation5 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation5 dsclmr;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation6 }
     *     
     */
    public UpdatedAdditionalInformation6 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation6 }
     *     
     */
    public CorporateActionNarrative15 setAddtlTxt(UpdatedAdditionalInformation6 value) {
        this.addtlTxt = value;
        return this;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation6 }
     *     
     */
    public UpdatedAdditionalInformation6 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation6 }
     *     
     */
    public CorporateActionNarrative15 setNrrtvVrsn(UpdatedAdditionalInformation6 value) {
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
    public CorporateActionNarrative15 setInfConds(UpdatedAdditionalInformation5 value) {
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
    public CorporateActionNarrative15 setInfToCmplyWth(UpdatedAdditionalInformation5 value) {
        this.infToCmplyWth = value;
        return this;
    }

    /**
     * Gets the value of the sctyRstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getSctyRstrctn() {
        return sctyRstrctn;
    }

    /**
     * Sets the value of the sctyRstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public CorporateActionNarrative15 setSctyRstrctn(UpdatedAdditionalInformation5 value) {
        this.sctyRstrctn = value;
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
    public CorporateActionNarrative15 setTaxtnConds(UpdatedAdditionalInformation5 value) {
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
    public CorporateActionNarrative15 setDsclmr(UpdatedAdditionalInformation5 value) {
        this.dsclmr = value;
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
