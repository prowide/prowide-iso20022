
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates the type of proposal and if the proposal is for the variation margin and the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proposal6", propOrder = {
    "collPrpslTp",
    "collPrpsl"
})
public class Proposal6 {

    @XmlElement(name = "CollPrpslTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProposalType1Code collPrpslTp;
    @XmlElement(name = "CollPrpsl", required = true)
    protected CollateralProposal6Choice collPrpsl;

    /**
     * Gets the value of the collPrpslTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalType1Code }
     *     
     */
    public ProposalType1Code getCollPrpslTp() {
        return collPrpslTp;
    }

    /**
     * Sets the value of the collPrpslTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalType1Code }
     *     
     */
    public Proposal6 setCollPrpslTp(ProposalType1Code value) {
        this.collPrpslTp = value;
        return this;
    }

    /**
     * Gets the value of the collPrpsl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposal6Choice }
     *     
     */
    public CollateralProposal6Choice getCollPrpsl() {
        return collPrpsl;
    }

    /**
     * Sets the value of the collPrpsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposal6Choice }
     *     
     */
    public Proposal6 setCollPrpsl(CollateralProposal6Choice value) {
        this.collPrpsl = value;
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
