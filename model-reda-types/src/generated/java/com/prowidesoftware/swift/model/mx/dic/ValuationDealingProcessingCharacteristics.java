
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Valuation dealing processing characteristics linked to the instrument, ie, not to the market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationDealingProcessingCharacteristics", propOrder = {
    "valtnFrqcy",
    "valtnFrqcyDesc",
    "sbcptDealgFrqcy",
    "sbcptDealFrqcyDesc",
    "ltdSbcptPrd",
    "redDealgFrqcy",
    "redDealFrqcyDesc",
    "ltdRedPrd",
    "dcmlstnPric",
    "dcmlstnUnits",
    "dualFndInd",
    "pricMtd",
    "pricCcy"
})
public class ValuationDealingProcessingCharacteristics {

    @XmlElement(name = "ValtnFrqcy", required = true)
    @XmlSchemaType(name = "string")
    protected EventFrequency2Code valtnFrqcy;
    @XmlElement(name = "ValtnFrqcyDesc")
    protected String valtnFrqcyDesc;
    @XmlElement(name = "SbcptDealgFrqcy", required = true)
    @XmlSchemaType(name = "string")
    protected EventFrequency2Code sbcptDealgFrqcy;
    @XmlElement(name = "SbcptDealFrqcyDesc")
    protected String sbcptDealFrqcyDesc;
    @XmlElement(name = "LtdSbcptPrd")
    protected String ltdSbcptPrd;
    @XmlElement(name = "RedDealgFrqcy", required = true)
    @XmlSchemaType(name = "string")
    protected EventFrequency2Code redDealgFrqcy;
    @XmlElement(name = "RedDealFrqcyDesc")
    protected String redDealFrqcyDesc;
    @XmlElement(name = "LtdRedPrd")
    protected String ltdRedPrd;
    @XmlElement(name = "DcmlstnPric", required = true)
    protected BigDecimal dcmlstnPric;
    @XmlElement(name = "DcmlstnUnits", required = true)
    protected BigDecimal dcmlstnUnits;
    @XmlElement(name = "DualFndInd")
    protected boolean dualFndInd;
    @XmlElement(name = "PricMtd", required = true)
    @XmlSchemaType(name = "string")
    protected PriceMethod1Code pricMtd;
    @XmlElement(name = "PricCcy", required = true)
    protected List<String> pricCcy;

    /**
     * Gets the value of the valtnFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency2Code }
     *     
     */
    public EventFrequency2Code getValtnFrqcy() {
        return valtnFrqcy;
    }

    /**
     * Sets the value of the valtnFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency2Code }
     *     
     */
    public ValuationDealingProcessingCharacteristics setValtnFrqcy(EventFrequency2Code value) {
        this.valtnFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the valtnFrqcyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValtnFrqcyDesc() {
        return valtnFrqcyDesc;
    }

    /**
     * Sets the value of the valtnFrqcyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValuationDealingProcessingCharacteristics setValtnFrqcyDesc(String value) {
        this.valtnFrqcyDesc = value;
        return this;
    }

    /**
     * Gets the value of the sbcptDealgFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency2Code }
     *     
     */
    public EventFrequency2Code getSbcptDealgFrqcy() {
        return sbcptDealgFrqcy;
    }

    /**
     * Sets the value of the sbcptDealgFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency2Code }
     *     
     */
    public ValuationDealingProcessingCharacteristics setSbcptDealgFrqcy(EventFrequency2Code value) {
        this.sbcptDealgFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the sbcptDealFrqcyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbcptDealFrqcyDesc() {
        return sbcptDealFrqcyDesc;
    }

    /**
     * Sets the value of the sbcptDealFrqcyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValuationDealingProcessingCharacteristics setSbcptDealFrqcyDesc(String value) {
        this.sbcptDealFrqcyDesc = value;
        return this;
    }

    /**
     * Gets the value of the ltdSbcptPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtdSbcptPrd() {
        return ltdSbcptPrd;
    }

    /**
     * Sets the value of the ltdSbcptPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValuationDealingProcessingCharacteristics setLtdSbcptPrd(String value) {
        this.ltdSbcptPrd = value;
        return this;
    }

    /**
     * Gets the value of the redDealgFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency2Code }
     *     
     */
    public EventFrequency2Code getRedDealgFrqcy() {
        return redDealgFrqcy;
    }

    /**
     * Sets the value of the redDealgFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency2Code }
     *     
     */
    public ValuationDealingProcessingCharacteristics setRedDealgFrqcy(EventFrequency2Code value) {
        this.redDealgFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the redDealFrqcyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedDealFrqcyDesc() {
        return redDealFrqcyDesc;
    }

    /**
     * Sets the value of the redDealFrqcyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValuationDealingProcessingCharacteristics setRedDealFrqcyDesc(String value) {
        this.redDealFrqcyDesc = value;
        return this;
    }

    /**
     * Gets the value of the ltdRedPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtdRedPrd() {
        return ltdRedPrd;
    }

    /**
     * Sets the value of the ltdRedPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValuationDealingProcessingCharacteristics setLtdRedPrd(String value) {
        this.ltdRedPrd = value;
        return this;
    }

    /**
     * Gets the value of the dcmlstnPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDcmlstnPric() {
        return dcmlstnPric;
    }

    /**
     * Sets the value of the dcmlstnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ValuationDealingProcessingCharacteristics setDcmlstnPric(BigDecimal value) {
        this.dcmlstnPric = value;
        return this;
    }

    /**
     * Gets the value of the dcmlstnUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDcmlstnUnits() {
        return dcmlstnUnits;
    }

    /**
     * Sets the value of the dcmlstnUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ValuationDealingProcessingCharacteristics setDcmlstnUnits(BigDecimal value) {
        this.dcmlstnUnits = value;
        return this;
    }

    /**
     * Gets the value of the dualFndInd property.
     * 
     */
    public boolean isDualFndInd() {
        return dualFndInd;
    }

    /**
     * Sets the value of the dualFndInd property.
     * 
     */
    public ValuationDealingProcessingCharacteristics setDualFndInd(boolean value) {
        this.dualFndInd = value;
        return this;
    }

    /**
     * Gets the value of the pricMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMethod1Code }
     *     
     */
    public PriceMethod1Code getPricMtd() {
        return pricMtd;
    }

    /**
     * Sets the value of the pricMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMethod1Code }
     *     
     */
    public ValuationDealingProcessingCharacteristics setPricMtd(PriceMethod1Code value) {
        this.pricMtd = value;
        return this;
    }

    /**
     * Gets the value of the pricCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the pricCcy property.
     */
    public List<String> getPricCcy() {
        if (pricCcy == null) {
            pricCcy = new ArrayList<>();
        }
        return this.pricCcy;
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

    /**
     * Adds a new item to the pricCcy list.
     * @see #getPricCcy()
     * 
     */
    public ValuationDealingProcessingCharacteristics addPricCcy(String pricCcy) {
        getPricCcy().add(pricCcy);
        return this;
    }

}
