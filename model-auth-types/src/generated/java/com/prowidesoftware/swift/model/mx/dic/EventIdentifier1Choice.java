
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
 * Indicates an event identifier or post trade risk reduction identifier.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventIdentifier1Choice", propOrder = {
    "evtIdr",
    "pstTradRskRdctnIdr"
})
public class EventIdentifier1Choice {

    @XmlElement(name = "EvtIdr")
    protected String evtIdr;
    @XmlElement(name = "PstTradRskRdctnIdr")
    protected PostTradeRiskReductionIdentifier1 pstTradRskRdctnIdr;

    /**
     * Gets the value of the evtIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtIdr() {
        return evtIdr;
    }

    /**
     * Sets the value of the evtIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EventIdentifier1Choice setEvtIdr(String value) {
        this.evtIdr = value;
        return this;
    }

    /**
     * Gets the value of the pstTradRskRdctnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostTradeRiskReductionIdentifier1 }
     *     
     */
    public PostTradeRiskReductionIdentifier1 getPstTradRskRdctnIdr() {
        return pstTradRskRdctnIdr;
    }

    /**
     * Sets the value of the pstTradRskRdctnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostTradeRiskReductionIdentifier1 }
     *     
     */
    public EventIdentifier1Choice setPstTradRskRdctnIdr(PostTradeRiskReductionIdentifier1 value) {
        this.pstTradRskRdctnIdr = value;
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
