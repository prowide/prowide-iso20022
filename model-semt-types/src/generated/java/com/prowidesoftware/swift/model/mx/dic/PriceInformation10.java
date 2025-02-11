
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
@XmlType(name = "PriceInformation10", propOrder = {
    "curPric",
    "tp",
    "prvsPric",
    "amtOfChng"
})
public class PriceInformation10 {

    @XmlElement(name = "CurPric", required = true)
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount curPric;
    @XmlElement(name = "Tp", required = true)
    protected TypeOfPrice27Choice tp;
    @XmlElement(name = "PrvsPric")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount prvsPric;
    @XmlElement(name = "AmtOfChng")
    protected PriceValueAndRate4 amtOfChng;

    /**
     * Gets the value of the curPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getCurPric() {
        return curPric;
    }

    /**
     * Sets the value of the curPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public PriceInformation10 setCurPric(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.curPric = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice27Choice }
     *     
     */
    public TypeOfPrice27Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice27Choice }
     *     
     */
    public PriceInformation10 setTp(TypeOfPrice27Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the prvsPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getPrvsPric() {
        return prvsPric;
    }

    /**
     * Sets the value of the prvsPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public PriceInformation10 setPrvsPric(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.prvsPric = value;
        return this;
    }

    /**
     * Gets the value of the amtOfChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueAndRate4 }
     *     
     */
    public PriceValueAndRate4 getAmtOfChng() {
        return amtOfChng;
    }

    /**
     * Sets the value of the amtOfChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueAndRate4 }
     *     
     */
    public PriceInformation10 setAmtOfChng(PriceValueAndRate4 value) {
        this.amtOfChng = value;
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
