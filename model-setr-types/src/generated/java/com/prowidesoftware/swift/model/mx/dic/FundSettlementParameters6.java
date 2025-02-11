
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
@XmlType(name = "FundSettlementParameters6", propOrder = {
    "sttlmPlc",
    "rcvgSdDtls",
    "dlvrgSdDtls"
})
public class FundSettlementParameters6 {

    @XmlElement(name = "SttlmPlc", required = true)
    protected PartyIdentification26Choice sttlmPlc;
    @XmlElement(name = "RcvgSdDtls", required = true)
    protected ReceivingPartiesAndAccount5 rcvgSdDtls;
    @XmlElement(name = "DlvrgSdDtls")
    protected DeliveringPartiesAndAccount6 dlvrgSdDtls;

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
    public FundSettlementParameters6 setSttlmPlc(PartyIdentification26Choice value) {
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
    public FundSettlementParameters6 setRcvgSdDtls(ReceivingPartiesAndAccount5 value) {
        this.rcvgSdDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount6 }
     *     
     */
    public DeliveringPartiesAndAccount6 getDlvrgSdDtls() {
        return dlvrgSdDtls;
    }

    /**
     * Sets the value of the dlvrgSdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount6 }
     *     
     */
    public FundSettlementParameters6 setDlvrgSdDtls(DeliveringPartiesAndAccount6 value) {
        this.dlvrgSdDtls = value;
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
