
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
 * Details of the derivative contract not included in the general financial instrument attributes component.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeBasicAttributes1", propOrder = {
    "ntnlCcyAndAmt",
    "intrstInclInPric"
})
public class DerivativeBasicAttributes1 {

    @XmlElement(name = "NtnlCcyAndAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount ntnlCcyAndAmt;
    @XmlElement(name = "IntrstInclInPric")
    protected Boolean intrstInclInPric;

    /**
     * Gets the value of the ntnlCcyAndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getNtnlCcyAndAmt() {
        return ntnlCcyAndAmt;
    }

    /**
     * Sets the value of the ntnlCcyAndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public DerivativeBasicAttributes1 setNtnlCcyAndAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ntnlCcyAndAmt = value;
        return this;
    }

    /**
     * Gets the value of the intrstInclInPric property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrstInclInPric() {
        return intrstInclInPric;
    }

    /**
     * Sets the value of the intrstInclInPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DerivativeBasicAttributes1 setIntrstInclInPric(Boolean value) {
        this.intrstInclInPric = value;
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
