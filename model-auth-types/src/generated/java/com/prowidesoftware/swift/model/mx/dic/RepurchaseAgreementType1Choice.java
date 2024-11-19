
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
 * Specifies the choice between the major categories of repurchase agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepurchaseAgreementType1Choice", propOrder = {
    "spcfcColl",
    "gnlColl"
})
public class RepurchaseAgreementType1Choice {

    @XmlElement(name = "SpcfcColl")
    protected SpecificCollateral2 spcfcColl;
    @XmlElement(name = "GnlColl")
    protected GeneralCollateral2 gnlColl;

    /**
     * Gets the value of the spcfcColl property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificCollateral2 }
     *     
     */
    public SpecificCollateral2 getSpcfcColl() {
        return spcfcColl;
    }

    /**
     * Sets the value of the spcfcColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificCollateral2 }
     *     
     */
    public RepurchaseAgreementType1Choice setSpcfcColl(SpecificCollateral2 value) {
        this.spcfcColl = value;
        return this;
    }

    /**
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralCollateral2 }
     *     
     */
    public GeneralCollateral2 getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralCollateral2 }
     *     
     */
    public RepurchaseAgreementType1Choice setGnlColl(GeneralCollateral2 value) {
        this.gnlColl = value;
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
