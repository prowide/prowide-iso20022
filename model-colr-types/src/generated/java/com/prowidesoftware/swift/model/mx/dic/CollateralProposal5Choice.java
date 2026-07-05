
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
 * Provides details about the proposal for the variation margin and optionally the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralProposal5Choice", propOrder = {
    "collPrpslDtls",
    "sgrtdIndpdntAmt"
})
public class CollateralProposal5Choice {

    @XmlElement(name = "CollPrpslDtls")
    protected CollateralProposal6 collPrpslDtls;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected CollateralMovement10 sgrtdIndpdntAmt;

    /**
     * Gets the value of the collPrpslDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposal6 }
     *     
     */
    public CollateralProposal6 getCollPrpslDtls() {
        return collPrpslDtls;
    }

    /**
     * Sets the value of the collPrpslDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposal6 }
     *     
     */
    public CollateralProposal5Choice setCollPrpslDtls(CollateralProposal6 value) {
        this.collPrpslDtls = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMovement10 }
     *     
     */
    public CollateralMovement10 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMovement10 }
     *     
     */
    public CollateralProposal5Choice setSgrtdIndpdntAmt(CollateralMovement10 value) {
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
