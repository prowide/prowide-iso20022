
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
 * Variables used to quantify the different calculations for position sets and currency position sets reports.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetBuyerAndSeller2", propOrder = {
    "buyr",
    "sellr"
})
public class PositionSetBuyerAndSeller2 {

    @XmlElement(name = "Buyr")
    protected PositionSetTotal2 buyr;
    @XmlElement(name = "Sellr")
    protected PositionSetTotal2 sellr;

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetTotal2 }
     *     
     */
    public PositionSetTotal2 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetTotal2 }
     *     
     */
    public PositionSetBuyerAndSeller2 setBuyr(PositionSetTotal2 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetTotal2 }
     *     
     */
    public PositionSetTotal2 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetTotal2 }
     *     
     */
    public PositionSetBuyerAndSeller2 setSellr(PositionSetTotal2 value) {
        this.sellr = value;
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
