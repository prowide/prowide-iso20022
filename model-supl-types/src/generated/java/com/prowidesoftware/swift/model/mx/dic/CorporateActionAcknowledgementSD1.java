
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
 * Acknowledgement information relative to corporate action reorganisation instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAcknowledgementSD1", propOrder = {
    "termsAckInd",
    "cond1Ind",
    "cond2Ind",
    "cond3Ind",
    "cond4Ind",
    "cond5Ind",
    "cond6Ind",
    "adjdctnOfIncmptncyAckInd",
    "lglDcmnttnThrtyMnthsRtntnAckInd",
    "instrDeltnAckInd",
    "potntlLossAckInd"
})
public class CorporateActionAcknowledgementSD1 {

    @XmlElement(name = "TermsAckInd")
    protected Boolean termsAckInd;
    @XmlElement(name = "Cond1Ind")
    protected Boolean cond1Ind;
    @XmlElement(name = "Cond2Ind")
    protected Boolean cond2Ind;
    @XmlElement(name = "Cond3Ind")
    protected Boolean cond3Ind;
    @XmlElement(name = "Cond4Ind")
    protected Boolean cond4Ind;
    @XmlElement(name = "Cond5Ind")
    protected Boolean cond5Ind;
    @XmlElement(name = "Cond6Ind")
    protected Boolean cond6Ind;
    @XmlElement(name = "AdjdctnOfIncmptncyAckInd")
    protected Boolean adjdctnOfIncmptncyAckInd;
    @XmlElement(name = "LglDcmnttnThrtyMnthsRtntnAckInd")
    protected Boolean lglDcmnttnThrtyMnthsRtntnAckInd;
    @XmlElement(name = "InstrDeltnAckInd")
    protected Boolean instrDeltnAckInd;
    @XmlElement(name = "PotntlLossAckInd")
    protected Boolean potntlLossAckInd;

    /**
     * Gets the value of the termsAckInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTermsAckInd() {
        return termsAckInd;
    }

    /**
     * Sets the value of the termsAckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAcknowledgementSD1 setTermsAckInd(Boolean value) {
        this.termsAckInd = value;
        return this;
    }

    /**
     * Gets the value of the cond1Ind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCond1Ind() {
        return cond1Ind;
    }

    /**
     * Sets the value of the cond1Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAcknowledgementSD1 setCond1Ind(Boolean value) {
        this.cond1Ind = value;
        return this;
    }

    /**
     * Gets the value of the cond2Ind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCond2Ind() {
        return cond2Ind;
    }

    /**
     * Sets the value of the cond2Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAcknowledgementSD1 setCond2Ind(Boolean value) {
        this.cond2Ind = value;
        return this;
    }

    /**
     * Gets the value of the cond3Ind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCond3Ind() {
        return cond3Ind;
    }

    /**
     * Sets the value of the cond3Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAcknowledgementSD1 setCond3Ind(Boolean value) {
        this.cond3Ind = value;
        return this;
    }

    /**
     * Gets the value of the cond4Ind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCond4Ind() {
        return cond4Ind;
    }

    /**
     * Sets the value of the cond4Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAcknowledgementSD1 setCond4Ind(Boolean value) {
        this.cond4Ind = value;
        return this;
    }

    /**
     * Gets the value of the cond5Ind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCond5Ind() {
        return cond5Ind;
    }

    /**
     * Sets the value of the cond5Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAcknowledgementSD1 setCond5Ind(Boolean value) {
        this.cond5Ind = value;
        return this;
    }

    /**
     * Gets the value of the cond6Ind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCond6Ind() {
        return cond6Ind;
    }

    /**
     * Sets the value of the cond6Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAcknowledgementSD1 setCond6Ind(Boolean value) {
        this.cond6Ind = value;
        return this;
    }

    /**
     * Gets the value of the adjdctnOfIncmptncyAckInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjdctnOfIncmptncyAckInd() {
        return adjdctnOfIncmptncyAckInd;
    }

    /**
     * Sets the value of the adjdctnOfIncmptncyAckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAcknowledgementSD1 setAdjdctnOfIncmptncyAckInd(Boolean value) {
        this.adjdctnOfIncmptncyAckInd = value;
        return this;
    }

    /**
     * Gets the value of the lglDcmnttnThrtyMnthsRtntnAckInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLglDcmnttnThrtyMnthsRtntnAckInd() {
        return lglDcmnttnThrtyMnthsRtntnAckInd;
    }

    /**
     * Sets the value of the lglDcmnttnThrtyMnthsRtntnAckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAcknowledgementSD1 setLglDcmnttnThrtyMnthsRtntnAckInd(Boolean value) {
        this.lglDcmnttnThrtyMnthsRtntnAckInd = value;
        return this;
    }

    /**
     * Gets the value of the instrDeltnAckInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstrDeltnAckInd() {
        return instrDeltnAckInd;
    }

    /**
     * Sets the value of the instrDeltnAckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAcknowledgementSD1 setInstrDeltnAckInd(Boolean value) {
        this.instrDeltnAckInd = value;
        return this;
    }

    /**
     * Gets the value of the potntlLossAckInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPotntlLossAckInd() {
        return potntlLossAckInd;
    }

    /**
     * Sets the value of the potntlLossAckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAcknowledgementSD1 setPotntlLossAckInd(Boolean value) {
        this.potntlLossAckInd = value;
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
