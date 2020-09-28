
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
 * Indicates the type of proposal and if the proposal is  for the variation margin and the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proposal1", propOrder = {
    "prpslTp",
    "prpslDtls"
})
public class Proposal1 {

    @XmlElement(name = "PrpslTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProposalType1Code prpslTp;
    @XmlElement(name = "PrpslDtls", required = true)
    protected CollateralProposal1Choice prpslDtls;

    /**
     * Gets the value of the prpslTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalType1Code }
     *     
     */
    public ProposalType1Code getPrpslTp() {
        return prpslTp;
    }

    /**
     * Sets the value of the prpslTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalType1Code }
     *     
     */
    public Proposal1 setPrpslTp(ProposalType1Code value) {
        this.prpslTp = value;
        return this;
    }

    /**
     * Gets the value of the prpslDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposal1Choice }
     *     
     */
    public CollateralProposal1Choice getPrpslDtls() {
        return prpslDtls;
    }

    /**
     * Sets the value of the prpslDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposal1Choice }
     *     
     */
    public Proposal1 setPrpslDtls(CollateralProposal1Choice value) {
        this.prpslDtls = value;
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
