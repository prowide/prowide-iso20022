
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
 * Net position of a segregated holding, in a single security, within the overall position held in a securities account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityPosition4", propOrder = {
    "subAcct",
    "voteInstr"
})
public class SecurityPosition4 {

    @XmlElement(name = "SubAcct", required = true)
    protected EligiblePosition1 subAcct;
    @XmlElement(name = "VoteInstr", required = true)
    protected VoteInstruction1 voteInstr;

    /**
     * Gets the value of the subAcct property.
     * 
     * @return
     *     possible object is
     *     {@link EligiblePosition1 }
     *     
     */
    public EligiblePosition1 getSubAcct() {
        return subAcct;
    }

    /**
     * Sets the value of the subAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligiblePosition1 }
     *     
     */
    public SecurityPosition4 setSubAcct(EligiblePosition1 value) {
        this.subAcct = value;
        return this;
    }

    /**
     * Gets the value of the voteInstr property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstruction1 }
     *     
     */
    public VoteInstruction1 getVoteInstr() {
        return voteInstr;
    }

    /**
     * Sets the value of the voteInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstruction1 }
     *     
     */
    public SecurityPosition4 setVoteInstr(VoteInstruction1 value) {
        this.voteInstr = value;
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
