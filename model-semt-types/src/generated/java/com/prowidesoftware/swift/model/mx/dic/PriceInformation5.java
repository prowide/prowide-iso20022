
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
@XmlType(name = "PriceInformation5", propOrder = {
    "tp",
    "val",
    "valTp",
    "srcOfPric",
    "qtnDt"
})
public class PriceInformation5 {

    @XmlElement(name = "Tp", required = true)
    protected TypeOfPrice4Choice tp;
    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmountOrUnknownChoice val;
    @XmlElement(name = "ValTp", required = true)
    protected YieldedOrValueType1Choice valTp;
    @XmlElement(name = "SrcOfPric")
    protected MarketIdentification6 srcOfPric;
    @XmlElement(name = "QtnDt")
    protected DateAndDateTimeChoice qtnDt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice4Choice }
     *     
     */
    public TypeOfPrice4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice4Choice }
     *     
     */
    public PriceInformation5 setTp(TypeOfPrice4Choice value) {
        this.tp = value;
        return this;
    }

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
    public PriceInformation5 setVal(PriceRateOrAmountOrUnknownChoice value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the valTp property.
     * 
     * @return
     *     possible object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public YieldedOrValueType1Choice getValTp() {
        return valTp;
    }

    /**
     * Sets the value of the valTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public PriceInformation5 setValTp(YieldedOrValueType1Choice value) {
        this.valTp = value;
        return this;
    }

    /**
     * Gets the value of the srcOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification6 }
     *     
     */
    public MarketIdentification6 getSrcOfPric() {
        return srcOfPric;
    }

    /**
     * Sets the value of the srcOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification6 }
     *     
     */
    public PriceInformation5 setSrcOfPric(MarketIdentification6 value) {
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
    public PriceInformation5 setQtnDt(DateAndDateTimeChoice value) {
        this.qtnDt = value;
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
