
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
 * Provides the resulting amounts following a margin settlement approved request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginSettlementAmount1", propOrder = {
    "newRsltntXcss",
    "newSttlmAmt"
})
public class MarginSettlementAmount1 {

    @XmlElement(name = "NewRsltntXcss", required = true)
    protected AmountAndDirection52 newRsltntXcss;
    @XmlElement(name = "NewSttlmAmt", required = true)
    protected AmountAndDirection52 newSttlmAmt;

    /**
     * Gets the value of the newRsltntXcss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public AmountAndDirection52 getNewRsltntXcss() {
        return newRsltntXcss;
    }

    /**
     * Sets the value of the newRsltntXcss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public MarginSettlementAmount1 setNewRsltntXcss(AmountAndDirection52 value) {
        this.newRsltntXcss = value;
        return this;
    }

    /**
     * Gets the value of the newSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public AmountAndDirection52 getNewSttlmAmt() {
        return newSttlmAmt;
    }

    /**
     * Sets the value of the newSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public MarginSettlementAmount1 setNewSttlmAmt(AmountAndDirection52 value) {
        this.newSttlmAmt = value;
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
