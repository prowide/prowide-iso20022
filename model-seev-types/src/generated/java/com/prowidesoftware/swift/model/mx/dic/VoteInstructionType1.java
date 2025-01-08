
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
 * Vote options for a resolution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteInstructionType1", propOrder = {
    "voteInstrTpCd",
    "addtlInf"
})
public class VoteInstructionType1 {

    @XmlElement(name = "VoteInstrTpCd", required = true)
    protected VoteInstructionType1Choice voteInstrTpCd;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the voteInstrTpCd property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstructionType1Choice }
     *     
     */
    public VoteInstructionType1Choice getVoteInstrTpCd() {
        return voteInstrTpCd;
    }

    /**
     * Sets the value of the voteInstrTpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstructionType1Choice }
     *     
     */
    public VoteInstructionType1 setVoteInstrTpCd(VoteInstructionType1Choice value) {
        this.voteInstrTpCd = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VoteInstructionType1 setAddtlInf(String value) {
        this.addtlInf = value;
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
