
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
 * Further information on the return reason of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnReasonInformation4", propOrder = {
    "rtrOrgtr",
    "rtrRsn"
})
public class ReturnReasonInformation4 {

    @XmlElement(name = "RtrOrgtr", required = true)
    protected PartyIdentification14 rtrOrgtr;
    @XmlElement(name = "RtrRsn", required = true)
    protected ReturnReason3Choice rtrRsn;

    /**
     * Gets the value of the rtrOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification14 }
     *     
     */
    public PartyIdentification14 getRtrOrgtr() {
        return rtrOrgtr;
    }

    /**
     * Sets the value of the rtrOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification14 }
     *     
     */
    public ReturnReasonInformation4 setRtrOrgtr(PartyIdentification14 value) {
        this.rtrOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the rtrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnReason3Choice }
     *     
     */
    public ReturnReason3Choice getRtrRsn() {
        return rtrRsn;
    }

    /**
     * Sets the value of the rtrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnReason3Choice }
     *     
     */
    public ReturnReasonInformation4 setRtrRsn(ReturnReason3Choice value) {
        this.rtrRsn = value;
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
