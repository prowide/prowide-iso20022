
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
 * Choice element between specific and general collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralType22Choice", propOrder = {
    "gnlColl",
    "spcfcColl"
})
public class CollateralType22Choice {

    @XmlElement(name = "GnlColl")
    protected GeneralCollateral4 gnlColl;
    @XmlElement(name = "SpcfcColl")
    protected SpecificCollateral3 spcfcColl;

    /**
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralCollateral4 }
     *     
     */
    public GeneralCollateral4 getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralCollateral4 }
     *     
     */
    public CollateralType22Choice setGnlColl(GeneralCollateral4 value) {
        this.gnlColl = value;
        return this;
    }

    /**
     * Gets the value of the spcfcColl property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificCollateral3 }
     *     
     */
    public SpecificCollateral3 getSpcfcColl() {
        return spcfcColl;
    }

    /**
     * Sets the value of the spcfcColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificCollateral3 }
     *     
     */
    public CollateralType22Choice setSpcfcColl(SpecificCollateral3 value) {
        this.spcfcColl = value;
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
