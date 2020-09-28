
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
 * Provides details about the proposal for the variation margin and optionaly the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralProposal2Choice", propOrder = {
    "collPrpslDtls",
    "sgrtdIndpdntAmt"
})
public class CollateralProposal2Choice {

    @XmlElement(name = "CollPrpslDtls")
    protected CollateralProposal3 collPrpslDtls;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected CollateralMovement4 sgrtdIndpdntAmt;

    /**
     * Gets the value of the collPrpslDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposal3 }
     *     
     */
    public CollateralProposal3 getCollPrpslDtls() {
        return collPrpslDtls;
    }

    /**
     * Sets the value of the collPrpslDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposal3 }
     *     
     */
    public CollateralProposal2Choice setCollPrpslDtls(CollateralProposal3 value) {
        this.collPrpslDtls = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMovement4 }
     *     
     */
    public CollateralMovement4 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMovement4 }
     *     
     */
    public CollateralProposal2Choice setSgrtdIndpdntAmt(CollateralMovement4 value) {
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
