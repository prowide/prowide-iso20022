
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between elements indicating the direction of the derivative transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Direction4Choice", propOrder = {
    "drctn",
    "ctrPtySd"
})
public class Direction4Choice {

    @XmlElement(name = "Drctn")
    protected Direction2 drctn;
    @XmlElement(name = "CtrPtySd")
    @XmlSchemaType(name = "string")
    protected OptionParty1Code ctrPtySd;

    /**
     * Gets the value of the drctn property.
     * 
     * @return
     *     possible object is
     *     {@link Direction2 }
     *     
     */
    public Direction2 getDrctn() {
        return drctn;
    }

    /**
     * Sets the value of the drctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction2 }
     *     
     */
    public Direction4Choice setDrctn(Direction2 value) {
        this.drctn = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySd property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty1Code }
     *     
     */
    public OptionParty1Code getCtrPtySd() {
        return ctrPtySd;
    }

    /**
     * Sets the value of the ctrPtySd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty1Code }
     *     
     */
    public Direction4Choice setCtrPtySd(OptionParty1Code value) {
        this.ctrPtySd = value;
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
