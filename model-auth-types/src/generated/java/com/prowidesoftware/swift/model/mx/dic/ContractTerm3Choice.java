
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
 * Specifies whether the transaction is open term, that is. has no fixed maturity date, or fixed term with a contractually agreed maturity date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractTerm3Choice", propOrder = {
    "opn",
    "fxd"
})
public class ContractTerm3Choice {

    @XmlElement(name = "Opn")
    @XmlSchemaType(name = "string")
    protected RepoTerminationOption2Code opn;
    @XmlElement(name = "Fxd")
    protected FixedTermContract2 fxd;

    /**
     * Gets the value of the opn property.
     * 
     * @return
     *     possible object is
     *     {@link RepoTerminationOption2Code }
     *     
     */
    public RepoTerminationOption2Code getOpn() {
        return opn;
    }

    /**
     * Sets the value of the opn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoTerminationOption2Code }
     *     
     */
    public ContractTerm3Choice setOpn(RepoTerminationOption2Code value) {
        this.opn = value;
        return this;
    }

    /**
     * Gets the value of the fxd property.
     * 
     * @return
     *     possible object is
     *     {@link FixedTermContract2 }
     *     
     */
    public FixedTermContract2 getFxd() {
        return fxd;
    }

    /**
     * Sets the value of the fxd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedTermContract2 }
     *     
     */
    public ContractTerm3Choice setFxd(FixedTermContract2 value) {
        this.fxd = value;
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
