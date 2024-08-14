
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
 * Parameters of a physical delivery.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryParameters2", propOrder = {
    "regdAdrInd",
    "nmAndAdr"
})
public class DeliveryParameters2 {

    @XmlElement(name = "RegdAdrInd")
    protected boolean regdAdrInd;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress1 nmAndAdr;

    /**
     * Gets the value of the regdAdrInd property.
     * 
     */
    public boolean isRegdAdrInd() {
        return regdAdrInd;
    }

    /**
     * Sets the value of the regdAdrInd property.
     * 
     */
    public DeliveryParameters2 setRegdAdrInd(boolean value) {
        this.regdAdrInd = value;
        return this;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress1 }
     *     
     */
    public NameAndAddress1 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress1 }
     *     
     */
    public DeliveryParameters2 setNmAndAdr(NameAndAddress1 value) {
        this.nmAndAdr = value;
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
