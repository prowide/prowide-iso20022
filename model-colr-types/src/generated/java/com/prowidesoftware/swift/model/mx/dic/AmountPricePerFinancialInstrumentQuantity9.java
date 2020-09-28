
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies a ratio: amount price and price fixing date per financial instrument quantity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPricePerFinancialInstrumentQuantity9", propOrder = {
    "amtPricTp",
    "pricVal",
    "finInstrmQty",
    "pricFxgDt"
})
public class AmountPricePerFinancialInstrumentQuantity9 {

    @XmlElement(name = "AmtPricTp", required = true)
    protected YieldedOrValueType1Choice amtPricTp;
    @XmlElement(name = "PricVal", required = true)
    protected PriceRateOrAmount3Choice pricVal;
    @XmlElement(name = "FinInstrmQty", required = true)
    protected FinancialInstrumentQuantity1Choice finInstrmQty;
    @XmlElement(name = "PricFxgDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pricFxgDt;

    /**
     * Gets the value of the amtPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public YieldedOrValueType1Choice getAmtPricTp() {
        return amtPricTp;
    }

    /**
     * Sets the value of the amtPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity9 setAmtPricTp(YieldedOrValueType1Choice value) {
        this.amtPricTp = value;
        return this;
    }

    /**
     * Gets the value of the pricVal property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public PriceRateOrAmount3Choice getPricVal() {
        return pricVal;
    }

    /**
     * Sets the value of the pricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity9 setPricVal(PriceRateOrAmount3Choice value) {
        this.pricVal = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getFinInstrmQty() {
        return finInstrmQty;
    }

    /**
     * Sets the value of the finInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity9 setFinInstrmQty(FinancialInstrumentQuantity1Choice value) {
        this.finInstrmQty = value;
        return this;
    }

    /**
     * Gets the value of the pricFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPricFxgDt() {
        return pricFxgDt;
    }

    /**
     * Sets the value of the pricFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity9 setPricFxgDt(XMLGregorianCalendar value) {
        this.pricFxgDt = value;
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
