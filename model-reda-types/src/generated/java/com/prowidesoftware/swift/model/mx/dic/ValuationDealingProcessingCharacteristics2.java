
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Valuation dealing processing characteristics linked to the instrument, ie, not to  the market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationDealingProcessingCharacteristics2", propOrder = {
    "valtnFrqcy",
    "valtnFrqcyDesc",
    "dcmlstnUnits",
    "dcmlstnPric",
    "dualFndInd",
    "pricMtd",
    "pricCcy"
})
public class ValuationDealingProcessingCharacteristics2 {

    @XmlElement(name = "ValtnFrqcy", required = true)
    @XmlSchemaType(name = "string")
    protected EventFrequency5Code valtnFrqcy;
    @XmlElement(name = "ValtnFrqcyDesc", required = true)
    protected String valtnFrqcyDesc;
    @XmlElement(name = "DcmlstnUnits", required = true)
    protected BigDecimal dcmlstnUnits;
    @XmlElement(name = "DcmlstnPric", required = true)
    protected BigDecimal dcmlstnPric;
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
     *     {@link EventFrequency5Code }
     *     
     */
    public EventFrequency5Code getValtnFrqcy() {
        return valtnFrqcy;
    }

    /**
     * Sets the value of the valtnFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency5Code }
     *     
     */
    public ValuationDealingProcessingCharacteristics2 setValtnFrqcy(EventFrequency5Code value) {
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
    public ValuationDealingProcessingCharacteristics2 setValtnFrqcyDesc(String value) {
        this.valtnFrqcyDesc = value;
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
    public ValuationDealingProcessingCharacteristics2 setDcmlstnUnits(BigDecimal value) {
        this.dcmlstnUnits = value;
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
    public ValuationDealingProcessingCharacteristics2 setDcmlstnPric(BigDecimal value) {
        this.dcmlstnPric = value;
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
    public ValuationDealingProcessingCharacteristics2 setDualFndInd(boolean value) {
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
    public ValuationDealingProcessingCharacteristics2 setPricMtd(PriceMethod1Code value) {
        this.pricMtd = value;
        return this;
    }

    /**
     * Gets the value of the pricCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricCcy property.
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
     */
    public List<String> getPricCcy() {
        if (pricCcy == null) {
            pricCcy = new ArrayList<String>();
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
    public ValuationDealingProcessingCharacteristics2 addPricCcy(String pricCcy) {
        getPricCcy().add(pricCcy);
        return this;
    }

}
