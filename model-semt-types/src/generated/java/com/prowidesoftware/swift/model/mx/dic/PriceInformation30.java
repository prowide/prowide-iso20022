
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
 * Amount of money for which goods or services are offered, sold, or bought.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInformation30", propOrder = {
    "tp",
    "valTp",
    "val",
    "srcOfPric",
    "qtnDt"
})
public class PriceInformation30 {

    @XmlElement(name = "Tp", required = true)
    protected TypeOfPrice48Choice tp;
    @XmlElement(name = "ValTp", required = true)
    protected YieldedOrValueType1Choice valTp;
    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmountOrUnknown2Choice val;
    @XmlElement(name = "SrcOfPric")
    protected MarketIdentification98 srcOfPric;
    @XmlElement(name = "QtnDt")
    protected DateAndDateTime2Choice qtnDt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice48Choice }
     *     
     */
    public TypeOfPrice48Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice48Choice }
     *     
     */
    public PriceInformation30 setTp(TypeOfPrice48Choice value) {
        this.tp = value;
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
    public PriceInformation30 setValTp(YieldedOrValueType1Choice value) {
        this.valTp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountOrUnknown2Choice }
     *     
     */
    public PriceRateOrAmountOrUnknown2Choice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountOrUnknown2Choice }
     *     
     */
    public PriceInformation30 setVal(PriceRateOrAmountOrUnknown2Choice value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the srcOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification98 }
     *     
     */
    public MarketIdentification98 getSrcOfPric() {
        return srcOfPric;
    }

    /**
     * Sets the value of the srcOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification98 }
     *     
     */
    public PriceInformation30 setSrcOfPric(MarketIdentification98 value) {
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
    public PriceInformation30 setQtnDt(DateAndDateTime2Choice value) {
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
