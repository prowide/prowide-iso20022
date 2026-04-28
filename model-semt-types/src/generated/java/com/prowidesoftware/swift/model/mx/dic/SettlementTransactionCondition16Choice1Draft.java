
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of format for the settlement transaction conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTransactionCondition16Choice__1", propOrder = {
    "cd",
    "prtry"
})
public class SettlementTransactionCondition16Choice1Draft {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition10Code cd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification301Draft prtry;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTransactionCondition10Code }
     *     
     */
    public SettlementTransactionCondition10Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTransactionCondition10Code }
     *     
     */
    public SettlementTransactionCondition16Choice1Draft setCd(SettlementTransactionCondition10Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification301Draft }
     *     
     */
    public GenericIdentification301Draft getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification301Draft }
     *     
     */
    public SettlementTransactionCondition16Choice1Draft setPrtry(GenericIdentification301Draft value) {
        this.prtry = value;
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
