
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
@XmlType(name = "PriceInformation22", propOrder = {
    "tp",
    "val",
    "valTp",
    "srcOfPric",
    "qtnDt"
})
public class PriceInformation22 {

    @XmlElement(name = "Tp", required = true)
    protected TypeOfPrice33Choice tp;
    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmountOrUnknown3Choice val;
    @XmlElement(name = "ValTp", required = true)
    protected YieldedOrValueType1Choice valTp;
    @XmlElement(name = "SrcOfPric")
    protected MarketIdentification91 srcOfPric;
    @XmlElement(name = "QtnDt")
    protected DateAndDateTime2Choice qtnDt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice33Choice }
     *     
     */
    public TypeOfPrice33Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice33Choice }
     *     
     */
    public PriceInformation22 setTp(TypeOfPrice33Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountOrUnknown3Choice }
     *     
     */
    public PriceRateOrAmountOrUnknown3Choice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountOrUnknown3Choice }
     *     
     */
    public PriceInformation22 setVal(PriceRateOrAmountOrUnknown3Choice value) {
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
    public PriceInformation22 setValTp(YieldedOrValueType1Choice value) {
        this.valTp = value;
        return this;
    }

    /**
     * Gets the value of the srcOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification91 }
     *     
     */
    public MarketIdentification91 getSrcOfPric() {
        return srcOfPric;
    }

    /**
     * Sets the value of the srcOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification91 }
     *     
     */
    public PriceInformation22 setSrcOfPric(MarketIdentification91 value) {
        this.srcOfPric = value;
        return this;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public PriceInformation22 setQtnDt(DateAndDateTime2Choice value) {
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
