
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Specifies the frequency of the trade query execution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeQueryExecutionFrequency1Choice", propOrder = {
    "daly",
    "wkly",
    "mnthly"
})
public class TradeQueryExecutionFrequency1Choice {

    @XmlElement(name = "Daly")
    @XmlSchemaType(name = "string")
    protected NoReasonCode daly;
    @XmlElement(name = "Wkly")
    @XmlSchemaType(name = "string")
    protected WeekDay2Code wkly;
    @XmlElement(name = "Mnthly")
    protected BigDecimal mnthly;

    /**
     * Gets the value of the daly property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getDaly() {
        return daly;
    }

    /**
     * Sets the value of the daly property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public TradeQueryExecutionFrequency1Choice setDaly(NoReasonCode value) {
        this.daly = value;
        return this;
    }

    /**
     * Gets the value of the wkly property.
     * 
     * @return
     *     possible object is
     *     {@link WeekDay2Code }
     *     
     */
    public WeekDay2Code getWkly() {
        return wkly;
    }

    /**
     * Sets the value of the wkly property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekDay2Code }
     *     
     */
    public TradeQueryExecutionFrequency1Choice setWkly(WeekDay2Code value) {
        this.wkly = value;
        return this;
    }

    /**
     * Gets the value of the mnthly property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMnthly() {
        return mnthly;
    }

    /**
     * Sets the value of the mnthly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TradeQueryExecutionFrequency1Choice setMnthly(BigDecimal value) {
        this.mnthly = value;
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
