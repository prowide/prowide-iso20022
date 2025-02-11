
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
 * Set of elements used to provide information on the settlement of the instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInformation14", propOrder = {
    "sttlmMtd",
    "sttlmAcct",
    "clrSys"
})
public class SettlementInformation14 {

    @XmlElement(name = "SttlmMtd", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementMethod2Code sttlmMtd;
    @XmlElement(name = "SttlmAcct")
    protected CashAccount16 sttlmAcct;
    @XmlElement(name = "ClrSys")
    protected ClearingSystemIdentification3Choice clrSys;

    /**
     * Gets the value of the sttlmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementMethod2Code }
     *     
     */
    public SettlementMethod2Code getSttlmMtd() {
        return sttlmMtd;
    }

    /**
     * Sets the value of the sttlmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementMethod2Code }
     *     
     */
    public SettlementInformation14 setSttlmMtd(SettlementMethod2Code value) {
        this.sttlmMtd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getSttlmAcct() {
        return sttlmAcct;
    }

    /**
     * Sets the value of the sttlmAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public SettlementInformation14 setSttlmAcct(CashAccount16 value) {
        this.sttlmAcct = value;
        return this;
    }

    /**
     * Gets the value of the clrSys property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemIdentification3Choice }
     *     
     */
    public ClearingSystemIdentification3Choice getClrSys() {
        return clrSys;
    }

    /**
     * Sets the value of the clrSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemIdentification3Choice }
     *     
     */
    public SettlementInformation14 setClrSys(ClearingSystemIdentification3Choice value) {
        this.clrSys = value;
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
