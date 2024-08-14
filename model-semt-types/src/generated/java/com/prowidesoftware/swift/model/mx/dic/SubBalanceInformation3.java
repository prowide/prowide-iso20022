
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
 * Net position of a segregated holding of a single security within the overall position held in the securities account, eg, sub-balance per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubBalanceInformation3", propOrder = {
    "qty",
    "subBalTp"
})
public class SubBalanceInformation3 {

    @XmlElement(name = "Qty", required = true)
    protected SubBalanceQuantity1Choice qty;
    @XmlElement(name = "SubBalTp", required = true)
    protected SubBalanceType2Choice subBalTp;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceQuantity1Choice }
     *     
     */
    public SubBalanceQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceQuantity1Choice }
     *     
     */
    public SubBalanceInformation3 setQty(SubBalanceQuantity1Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceType2Choice }
     *     
     */
    public SubBalanceType2Choice getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceType2Choice }
     *     
     */
    public SubBalanceInformation3 setSubBalTp(SubBalanceType2Choice value) {
        this.subBalTp = value;
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
