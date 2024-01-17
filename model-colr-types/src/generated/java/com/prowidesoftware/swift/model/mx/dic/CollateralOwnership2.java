
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
 * Indicates whether the collateral is proprietarily owned or client owned.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralOwnership2", propOrder = {
    "prtry",
    "clntNm"
})
public class CollateralOwnership2 {

    @XmlElement(name = "Prtry")
    protected boolean prtry;
    @XmlElement(name = "ClntNm")
    protected PartyIdentification100Choice clntNm;

    /**
     * Gets the value of the prtry property.
     * 
     */
    public boolean isPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     */
    public CollateralOwnership2 setPrtry(boolean value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the clntNm property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public PartyIdentification100Choice getClntNm() {
        return clntNm;
    }

    /**
     * Sets the value of the clntNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public CollateralOwnership2 setClntNm(PartyIdentification100Choice value) {
        this.clntNm = value;
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
