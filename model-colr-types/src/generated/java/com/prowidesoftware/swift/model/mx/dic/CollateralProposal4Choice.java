
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
 * Provides details about the proposal for the variation margin and optionaly the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralProposal4Choice", propOrder = {
    "collPrpslDtls",
    "sgrtdIndpdntAmt"
})
public class CollateralProposal4Choice {

    @XmlElement(name = "CollPrpslDtls")
    protected CollateralProposal5 collPrpslDtls;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected CollateralMovement7 sgrtdIndpdntAmt;

    /**
     * Gets the value of the collPrpslDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposal5 }
     *     
     */
    public CollateralProposal5 getCollPrpslDtls() {
        return collPrpslDtls;
    }

    /**
     * Sets the value of the collPrpslDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposal5 }
     *     
     */
    public CollateralProposal4Choice setCollPrpslDtls(CollateralProposal5 value) {
        this.collPrpslDtls = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMovement7 }
     *     
     */
    public CollateralMovement7 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMovement7 }
     *     
     */
    public CollateralProposal4Choice setSgrtdIndpdntAmt(CollateralMovement7 value) {
        this.sgrtdIndpdntAmt = value;
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
