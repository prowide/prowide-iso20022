
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
 * Delivery information for the purpose of a retrieval fulfilment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryInformation2", propOrder = {
    "ctct",
    "pstlAdr"
})
public class DeliveryInformation2 {

    @XmlElement(name = "Ctct")
    protected Contact7 ctct;
    @XmlElement(name = "PstlAdr")
    protected Address1 pstlAdr;

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact7 }
     *     
     */
    public Contact7 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact7 }
     *     
     */
    public DeliveryInformation2 setCtct(Contact7 value) {
        this.ctct = value;
        return this;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address1 }
     *     
     */
    public Address1 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address1 }
     *     
     */
    public DeliveryInformation2 setPstlAdr(Address1 value) {
        this.pstlAdr = value;
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
