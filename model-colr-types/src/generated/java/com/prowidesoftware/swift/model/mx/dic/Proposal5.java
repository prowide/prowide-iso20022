
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "Proposal5", propOrder = {
    "collPrpslTp",
    "collPrpsl"
})
public class Proposal5 {

    @XmlElement(name = "CollPrpslTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProposalType1Code collPrpslTp;
    @XmlElement(name = "CollPrpsl", required = true)
    protected CollateralProposal5Choice collPrpsl;

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
    public Proposal5 setCollPrpslTp(ProposalType1Code value) {
        this.collPrpslTp = value;
        return this;
    }

    /**
     * Gets the value of the collPrpsl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposal5Choice }
     *     
     */
    public CollateralProposal5Choice getCollPrpsl() {
        return collPrpsl;
    }

    /**
     * Sets the value of the collPrpsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposal5Choice }
     *     
     */
    public Proposal5 setCollPrpsl(CollateralProposal5Choice value) {
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
