
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
 * Obligations of a clearing member with respect to a central counterparty that are calculated based on end of day positions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndOfDayRequirement1", propOrder = {
    "initlMrgnRqrmnt",
    "vartnMrgnRqrmnt"
})
public class EndOfDayRequirement1 {

    @XmlElement(name = "InitlMrgnRqrmnt")
    protected ActiveCurrencyAndAmount initlMrgnRqrmnt;
    @XmlElement(name = "VartnMrgnRqrmnt")
    protected AmountAndDirection102 vartnMrgnRqrmnt;

    /**
     * Gets the value of the initlMrgnRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInitlMrgnRqrmnt() {
        return initlMrgnRqrmnt;
    }

    /**
     * Sets the value of the initlMrgnRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public EndOfDayRequirement1 setInitlMrgnRqrmnt(ActiveCurrencyAndAmount value) {
        this.initlMrgnRqrmnt = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getVartnMrgnRqrmnt() {
        return vartnMrgnRqrmnt;
    }

    /**
     * Sets the value of the vartnMrgnRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public EndOfDayRequirement1 setVartnMrgnRqrmnt(AmountAndDirection102 value) {
        this.vartnMrgnRqrmnt = value;
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
