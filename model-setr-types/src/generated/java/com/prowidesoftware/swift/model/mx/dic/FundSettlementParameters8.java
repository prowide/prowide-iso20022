
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
 * Parameters applied to the settlement of a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundSettlementParameters8", propOrder = {
    "sttlmPlc",
    "rcvgSdDtls"
})
public class FundSettlementParameters8 {

    @XmlElement(name = "SttlmPlc", required = true)
    protected PartyIdentification26Choice sttlmPlc;
    @XmlElement(name = "RcvgSdDtls", required = true)
    protected ReceivingPartiesAndAccount5 rcvgSdDtls;

    /**
     * Gets the value of the sttlmPlc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26Choice }
     *     
     */
    public PartyIdentification26Choice getSttlmPlc() {
        return sttlmPlc;
    }

    /**
     * Sets the value of the sttlmPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26Choice }
     *     
     */
    public FundSettlementParameters8 setSttlmPlc(PartyIdentification26Choice value) {
        this.sttlmPlc = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount5 }
     *     
     */
    public ReceivingPartiesAndAccount5 getRcvgSdDtls() {
        return rcvgSdDtls;
    }

    /**
     * Sets the value of the rcvgSdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount5 }
     *     
     */
    public FundSettlementParameters8 setRcvgSdDtls(ReceivingPartiesAndAccount5 value) {
        this.rcvgSdDtls = value;
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
