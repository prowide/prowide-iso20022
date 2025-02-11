
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
 * Provides the collateral proposal response for the variation margin and the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralProposalResponse4Choice", propOrder = {
    "collPrpsl",
    "sgrtdIndpdntAmt"
})
public class CollateralProposalResponse4Choice {

    @XmlElement(name = "CollPrpsl")
    protected CollateralProposalResponse4 collPrpsl;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected CollateralProposalResponseType4 sgrtdIndpdntAmt;

    /**
     * Gets the value of the collPrpsl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponse4 }
     *     
     */
    public CollateralProposalResponse4 getCollPrpsl() {
        return collPrpsl;
    }

    /**
     * Sets the value of the collPrpsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponse4 }
     *     
     */
    public CollateralProposalResponse4Choice setCollPrpsl(CollateralProposalResponse4 value) {
        this.collPrpsl = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponseType4 }
     *     
     */
    public CollateralProposalResponseType4 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponseType4 }
     *     
     */
    public CollateralProposalResponse4Choice setSgrtdIndpdntAmt(CollateralProposalResponseType4 value) {
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
