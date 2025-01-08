
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
 * Proprietary vote type and quantity voted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryVote1", propOrder = {
    "cd",
    "qty"
})
public class ProprietaryVote1 {

    @XmlElement(name = "Cd", required = true)
    protected GenericIdentification30 cd;
    @XmlElement(name = "Qty", required = true)
    protected QuantityOrCode1Choice qty;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public ProprietaryVote1 setCd(GenericIdentification30 value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public ProprietaryVote1 setQty(QuantityOrCode1Choice value) {
        this.qty = value;
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
