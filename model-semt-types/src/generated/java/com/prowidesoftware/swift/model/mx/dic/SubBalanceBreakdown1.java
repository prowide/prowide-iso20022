
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
 * Net position of a segregated holding of a single financial instrument within the overall position held in the securities account, for example, sub-balance per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubBalanceBreakdown1", propOrder = {
    "subBalTp",
    "qty"
})
public class SubBalanceBreakdown1 {

    @XmlElement(name = "SubBalTp", required = true)
    protected SubBalanceType9Choice subBalTp;
    @XmlElement(name = "Qty", required = true)
    protected SubBalanceQuantity5Choice qty;

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceType9Choice }
     *     
     */
    public SubBalanceType9Choice getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceType9Choice }
     *     
     */
    public SubBalanceBreakdown1 setSubBalTp(SubBalanceType9Choice value) {
        this.subBalTp = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceQuantity5Choice }
     *     
     */
    public SubBalanceQuantity5Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceQuantity5Choice }
     *     
     */
    public SubBalanceBreakdown1 setQty(SubBalanceQuantity5Choice value) {
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
