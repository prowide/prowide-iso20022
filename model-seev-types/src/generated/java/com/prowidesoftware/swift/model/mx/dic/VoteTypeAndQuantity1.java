
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Type of vote that can be provided for a resolution in a general meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteTypeAndQuantity1", propOrder = {
    "voteInstrTp",
    "voteQty"
})
public class VoteTypeAndQuantity1 {

    @XmlElement(name = "VoteInstrTp", required = true)
    protected VoteInstructionType1Choice voteInstrTp;
    @XmlElement(name = "VoteQty", required = true)
    protected BigDecimal voteQty;

    /**
     * Gets the value of the voteInstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstructionType1Choice }
     *     
     */
    public VoteInstructionType1Choice getVoteInstrTp() {
        return voteInstrTp;
    }

    /**
     * Sets the value of the voteInstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstructionType1Choice }
     *     
     */
    public VoteTypeAndQuantity1 setVoteInstrTp(VoteInstructionType1Choice value) {
        this.voteInstrTp = value;
        return this;
    }

    /**
     * Gets the value of the voteQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoteQty() {
        return voteQty;
    }

    /**
     * Sets the value of the voteQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public VoteTypeAndQuantity1 setVoteQty(BigDecimal value) {
        this.voteQty = value;
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
