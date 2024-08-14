
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
 * Payments to and from a concentration bank account of a central counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flows1", propOrder = {
    "pmtBkFlows",
    "invstmtFlows"
})
public class Flows1 {

    @XmlElement(name = "PmtBkFlows", required = true)
    protected AmountAndDirection102 pmtBkFlows;
    @XmlElement(name = "InvstmtFlows", required = true)
    protected AmountAndDirection102 invstmtFlows;

    /**
     * Gets the value of the pmtBkFlows property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getPmtBkFlows() {
        return pmtBkFlows;
    }

    /**
     * Sets the value of the pmtBkFlows property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public Flows1 setPmtBkFlows(AmountAndDirection102 value) {
        this.pmtBkFlows = value;
        return this;
    }

    /**
     * Gets the value of the invstmtFlows property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getInvstmtFlows() {
        return invstmtFlows;
    }

    /**
     * Sets the value of the invstmtFlows property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public Flows1 setInvstmtFlows(AmountAndDirection102 value) {
        this.invstmtFlows = value;
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
