
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
 * Identification of a supplementary data element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionSupplementaryIndicators1", propOrder = {
    "condlPmtAplblInd",
    "slctnDealrFeeInd",
    "srrndrShrsToAgtInd",
    "stepUpPrvlgInd",
    "rghtsOvrsbcptInd",
    "rghtsRndUpPrvlgInd",
    "rghtsTrfblInd",
    "escrwToMtrtyInd"
})
public class CorporateActionSupplementaryIndicators1 {

    @XmlElement(name = "CondlPmtAplblInd")
    protected Boolean condlPmtAplblInd;
    @XmlElement(name = "SlctnDealrFeeInd")
    protected Boolean slctnDealrFeeInd;
    @XmlElement(name = "SrrndrShrsToAgtInd")
    protected Boolean srrndrShrsToAgtInd;
    @XmlElement(name = "StepUpPrvlgInd")
    protected Boolean stepUpPrvlgInd;
    @XmlElement(name = "RghtsOvrsbcptInd")
    protected Boolean rghtsOvrsbcptInd;
    @XmlElement(name = "RghtsRndUpPrvlgInd")
    protected Boolean rghtsRndUpPrvlgInd;
    @XmlElement(name = "RghtsTrfblInd")
    protected Boolean rghtsTrfblInd;
    @XmlElement(name = "EscrwToMtrtyInd")
    protected Boolean escrwToMtrtyInd;

    /**
     * Gets the value of the condlPmtAplblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCondlPmtAplblInd() {
        return condlPmtAplblInd;
    }

    /**
     * Sets the value of the condlPmtAplblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSupplementaryIndicators1 setCondlPmtAplblInd(Boolean value) {
        this.condlPmtAplblInd = value;
        return this;
    }

    /**
     * Gets the value of the slctnDealrFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlctnDealrFeeInd() {
        return slctnDealrFeeInd;
    }

    /**
     * Sets the value of the slctnDealrFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSupplementaryIndicators1 setSlctnDealrFeeInd(Boolean value) {
        this.slctnDealrFeeInd = value;
        return this;
    }

    /**
     * Gets the value of the srrndrShrsToAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSrrndrShrsToAgtInd() {
        return srrndrShrsToAgtInd;
    }

    /**
     * Sets the value of the srrndrShrsToAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSupplementaryIndicators1 setSrrndrShrsToAgtInd(Boolean value) {
        this.srrndrShrsToAgtInd = value;
        return this;
    }

    /**
     * Gets the value of the stepUpPrvlgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStepUpPrvlgInd() {
        return stepUpPrvlgInd;
    }

    /**
     * Sets the value of the stepUpPrvlgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSupplementaryIndicators1 setStepUpPrvlgInd(Boolean value) {
        this.stepUpPrvlgInd = value;
        return this;
    }

    /**
     * Gets the value of the rghtsOvrsbcptInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRghtsOvrsbcptInd() {
        return rghtsOvrsbcptInd;
    }

    /**
     * Sets the value of the rghtsOvrsbcptInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSupplementaryIndicators1 setRghtsOvrsbcptInd(Boolean value) {
        this.rghtsOvrsbcptInd = value;
        return this;
    }

    /**
     * Gets the value of the rghtsRndUpPrvlgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRghtsRndUpPrvlgInd() {
        return rghtsRndUpPrvlgInd;
    }

    /**
     * Sets the value of the rghtsRndUpPrvlgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSupplementaryIndicators1 setRghtsRndUpPrvlgInd(Boolean value) {
        this.rghtsRndUpPrvlgInd = value;
        return this;
    }

    /**
     * Gets the value of the rghtsTrfblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRghtsTrfblInd() {
        return rghtsTrfblInd;
    }

    /**
     * Sets the value of the rghtsTrfblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSupplementaryIndicators1 setRghtsTrfblInd(Boolean value) {
        this.rghtsTrfblInd = value;
        return this;
    }

    /**
     * Gets the value of the escrwToMtrtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscrwToMtrtyInd() {
        return escrwToMtrtyInd;
    }

    /**
     * Sets the value of the escrwToMtrtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSupplementaryIndicators1 setEscrwToMtrtyInd(Boolean value) {
        this.escrwToMtrtyInd = value;
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
