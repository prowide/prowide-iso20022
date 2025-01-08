
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
 * Amount of money for which goods or services are offered, sold, or bought.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInformation3", propOrder = {
    "val",
    "pricTp",
    "srcOfPric",
    "qtnDt",
    "ylddInd"
})
public class PriceInformation3 {

    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmountOrUnknownChoice val;
    @XmlElement(name = "PricTp", required = true)
    protected UnitPriceType1Choice pricTp;
    @XmlElement(name = "SrcOfPric")
    protected PriceSourceFormatChoice srcOfPric;
    @XmlElement(name = "QtnDt")
    protected DateAndDateTimeChoice qtnDt;
    @XmlElement(name = "YlddInd")
    protected Boolean ylddInd;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountOrUnknownChoice }
     *     
     */
    public PriceRateOrAmountOrUnknownChoice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountOrUnknownChoice }
     *     
     */
    public PriceInformation3 setVal(PriceRateOrAmountOrUnknownChoice value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the pricTp property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPriceType1Choice }
     *     
     */
    public UnitPriceType1Choice getPricTp() {
        return pricTp;
    }

    /**
     * Sets the value of the pricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPriceType1Choice }
     *     
     */
    public PriceInformation3 setPricTp(UnitPriceType1Choice value) {
        this.pricTp = value;
        return this;
    }

    /**
     * Gets the value of the srcOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSourceFormatChoice }
     *     
     */
    public PriceSourceFormatChoice getSrcOfPric() {
        return srcOfPric;
    }

    /**
     * Sets the value of the srcOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSourceFormatChoice }
     *     
     */
    public PriceInformation3 setSrcOfPric(PriceSourceFormatChoice value) {
        this.srcOfPric = value;
        return this;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PriceInformation3 setQtnDt(DateAndDateTimeChoice value) {
        this.qtnDt = value;
        return this;
    }

    /**
     * Gets the value of the ylddInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYlddInd() {
        return ylddInd;
    }

    /**
     * Sets the value of the ylddInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PriceInformation3 setYlddInd(Boolean value) {
        this.ylddInd = value;
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
