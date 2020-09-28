
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
 * Further information on the reversal reason of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalReasonInformation4", propOrder = {
    "rvslOrgtr",
    "rvslRsn"
})
public class ReversalReasonInformation4 {

    @XmlElement(name = "RvslOrgtr", required = true)
    protected PartyIdentification14 rvslOrgtr;
    @XmlElement(name = "RvslRsn", required = true)
    protected ReversalReason3Choice rvslRsn;

    /**
     * Gets the value of the rvslOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification14 }
     *     
     */
    public PartyIdentification14 getRvslOrgtr() {
        return rvslOrgtr;
    }

    /**
     * Sets the value of the rvslOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification14 }
     *     
     */
    public ReversalReasonInformation4 setRvslOrgtr(PartyIdentification14 value) {
        this.rvslOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the rvslRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalReason3Choice }
     *     
     */
    public ReversalReason3Choice getRvslRsn() {
        return rvslRsn;
    }

    /**
     * Sets the value of the rvslRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalReason3Choice }
     *     
     */
    public ReversalReasonInformation4 setRvslRsn(ReversalReason3Choice value) {
        this.rvslRsn = value;
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
