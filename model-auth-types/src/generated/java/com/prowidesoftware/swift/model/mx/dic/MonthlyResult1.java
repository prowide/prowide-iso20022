
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Results of backtesting analysis used to test the performance of a risk model.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyResult1", propOrder = {
    "nbOfObsrvtns",
    "nbOfXcptns",
    "cvrg",
    "lrgstXcptn",
    "avrgXcptn",
    "lrgstXcptnId"
})
public class MonthlyResult1 {

    @XmlElement(name = "NbOfObsrvtns", required = true)
    protected BigDecimal nbOfObsrvtns;
    @XmlElement(name = "NbOfXcptns", required = true)
    protected BigDecimal nbOfXcptns;
    @XmlElement(name = "Cvrg", required = true)
    protected BigDecimal cvrg;
    @XmlElement(name = "LrgstXcptn", required = true)
    protected ActiveCurrencyAndAmount lrgstXcptn;
    @XmlElement(name = "AvrgXcptn", required = true)
    protected ActiveCurrencyAndAmount avrgXcptn;
    @XmlElement(name = "LrgstXcptnId")
    protected GenericIdentification165 lrgstXcptnId;

    /**
     * Gets the value of the nbOfObsrvtns property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfObsrvtns() {
        return nbOfObsrvtns;
    }

    /**
     * Sets the value of the nbOfObsrvtns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MonthlyResult1 setNbOfObsrvtns(BigDecimal value) {
        this.nbOfObsrvtns = value;
        return this;
    }

    /**
     * Gets the value of the nbOfXcptns property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfXcptns() {
        return nbOfXcptns;
    }

    /**
     * Sets the value of the nbOfXcptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MonthlyResult1 setNbOfXcptns(BigDecimal value) {
        this.nbOfXcptns = value;
        return this;
    }

    /**
     * Gets the value of the cvrg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCvrg() {
        return cvrg;
    }

    /**
     * Sets the value of the cvrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MonthlyResult1 setCvrg(BigDecimal value) {
        this.cvrg = value;
        return this;
    }

    /**
     * Gets the value of the lrgstXcptn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLrgstXcptn() {
        return lrgstXcptn;
    }

    /**
     * Sets the value of the lrgstXcptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MonthlyResult1 setLrgstXcptn(ActiveCurrencyAndAmount value) {
        this.lrgstXcptn = value;
        return this;
    }

    /**
     * Gets the value of the avrgXcptn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAvrgXcptn() {
        return avrgXcptn;
    }

    /**
     * Sets the value of the avrgXcptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MonthlyResult1 setAvrgXcptn(ActiveCurrencyAndAmount value) {
        this.avrgXcptn = value;
        return this;
    }

    /**
     * Gets the value of the lrgstXcptnId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getLrgstXcptnId() {
        return lrgstXcptnId;
    }

    /**
     * Sets the value of the lrgstXcptnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public MonthlyResult1 setLrgstXcptnId(GenericIdentification165 value) {
        this.lrgstXcptnId = value;
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
