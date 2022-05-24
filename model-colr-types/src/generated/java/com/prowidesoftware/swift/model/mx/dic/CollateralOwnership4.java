
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
 * Indicates whether the collateral is proprietarily owned or client owned.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralOwnership4", propOrder = {
    "prtry",
    "clntNm"
})
public class CollateralOwnership4 {

    @XmlElement(name = "Prtry")
    protected boolean prtry;
    @XmlElement(name = "ClntNm")
    protected PartyIdentification178Choice clntNm;

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
    public CollateralOwnership4 setPrtry(boolean value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the clntNm property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getClntNm() {
        return clntNm;
    }

    /**
     * Sets the value of the clntNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public CollateralOwnership4 setClntNm(PartyIdentification178Choice value) {
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
