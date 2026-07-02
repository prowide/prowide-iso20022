
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
 * Provides the collateral proposal response for the variation margin and the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralProposalResponse1Choice", propOrder = {
    "collPrpslDtls",
    "sgrtdIndpdntAmt"
})
public class CollateralProposalResponse1Choice {

    @XmlElement(name = "CollPrpslDtls")
    protected CollateralProposalResponse1 collPrpslDtls;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected CollateralProposalResponseType1 sgrtdIndpdntAmt;

    /**
     * Gets the value of the collPrpslDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponse1 }
     *     
     */
    public CollateralProposalResponse1 getCollPrpslDtls() {
        return collPrpslDtls;
    }

    /**
     * Sets the value of the collPrpslDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponse1 }
     *     
     */
    public CollateralProposalResponse1Choice setCollPrpslDtls(CollateralProposalResponse1 value) {
        this.collPrpslDtls = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponseType1 }
     *     
     */
    public CollateralProposalResponseType1 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponseType1 }
     *     
     */
    public CollateralProposalResponse1Choice setSgrtdIndpdntAmt(CollateralProposalResponseType1 value) {
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
