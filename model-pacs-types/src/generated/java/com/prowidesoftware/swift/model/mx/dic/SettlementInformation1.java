
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
 * Further information required for the settlement the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInformation1", propOrder = {
    "sttlmMtd",
    "sttlmAcct",
    "clrSys",
    "instgRmbrsmntAgt",
    "instgRmbrsmntAgtAcct",
    "instdRmbrsmntAgt",
    "instdRmbrsmntAgtAcct",
    "thrdRmbrsmntAgt",
    "thrdRmbrsmntAgtAcct"
})
public class SettlementInformation1 {

    @XmlElement(name = "SttlmMtd", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementMethod1Code sttlmMtd;
    @XmlElement(name = "SttlmAcct")
    protected CashAccount7 sttlmAcct;
    @XmlElement(name = "ClrSys")
    protected ClearingSystemIdentification1Choice clrSys;
    @XmlElement(name = "InstgRmbrsmntAgt")
    protected BranchAndFinancialInstitutionIdentification3 instgRmbrsmntAgt;
    @XmlElement(name = "InstgRmbrsmntAgtAcct")
    protected CashAccount7 instgRmbrsmntAgtAcct;
    @XmlElement(name = "InstdRmbrsmntAgt")
    protected BranchAndFinancialInstitutionIdentification3 instdRmbrsmntAgt;
    @XmlElement(name = "InstdRmbrsmntAgtAcct")
    protected CashAccount7 instdRmbrsmntAgtAcct;
    @XmlElement(name = "ThrdRmbrsmntAgt")
    protected BranchAndFinancialInstitutionIdentification3 thrdRmbrsmntAgt;
    @XmlElement(name = "ThrdRmbrsmntAgtAcct")
    protected CashAccount7 thrdRmbrsmntAgtAcct;

    /**
     * Gets the value of the sttlmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementMethod1Code }
     *     
     */
    public SettlementMethod1Code getSttlmMtd() {
        return sttlmMtd;
    }

    /**
     * Sets the value of the sttlmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementMethod1Code }
     *     
     */
    public SettlementInformation1 setSttlmMtd(SettlementMethod1Code value) {
        this.sttlmMtd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getSttlmAcct() {
        return sttlmAcct;
    }

    /**
     * Sets the value of the sttlmAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public SettlementInformation1 setSttlmAcct(CashAccount7 value) {
        this.sttlmAcct = value;
        return this;
    }

    /**
     * Gets the value of the clrSys property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemIdentification1Choice }
     *     
     */
    public ClearingSystemIdentification1Choice getClrSys() {
        return clrSys;
    }

    /**
     * Sets the value of the clrSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemIdentification1Choice }
     *     
     */
    public SettlementInformation1 setClrSys(ClearingSystemIdentification1Choice value) {
        this.clrSys = value;
        return this;
    }

    /**
     * Gets the value of the instgRmbrsmntAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getInstgRmbrsmntAgt() {
        return instgRmbrsmntAgt;
    }

    /**
     * Sets the value of the instgRmbrsmntAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public SettlementInformation1 setInstgRmbrsmntAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.instgRmbrsmntAgt = value;
        return this;
    }

    /**
     * Gets the value of the instgRmbrsmntAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getInstgRmbrsmntAgtAcct() {
        return instgRmbrsmntAgtAcct;
    }

    /**
     * Sets the value of the instgRmbrsmntAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public SettlementInformation1 setInstgRmbrsmntAgtAcct(CashAccount7 value) {
        this.instgRmbrsmntAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the instdRmbrsmntAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getInstdRmbrsmntAgt() {
        return instdRmbrsmntAgt;
    }

    /**
     * Sets the value of the instdRmbrsmntAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public SettlementInformation1 setInstdRmbrsmntAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.instdRmbrsmntAgt = value;
        return this;
    }

    /**
     * Gets the value of the instdRmbrsmntAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getInstdRmbrsmntAgtAcct() {
        return instdRmbrsmntAgtAcct;
    }

    /**
     * Sets the value of the instdRmbrsmntAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public SettlementInformation1 setInstdRmbrsmntAgtAcct(CashAccount7 value) {
        this.instdRmbrsmntAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the thrdRmbrsmntAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getThrdRmbrsmntAgt() {
        return thrdRmbrsmntAgt;
    }

    /**
     * Sets the value of the thrdRmbrsmntAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public SettlementInformation1 setThrdRmbrsmntAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.thrdRmbrsmntAgt = value;
        return this;
    }

    /**
     * Gets the value of the thrdRmbrsmntAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getThrdRmbrsmntAgtAcct() {
        return thrdRmbrsmntAgtAcct;
    }

    /**
     * Sets the value of the thrdRmbrsmntAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public SettlementInformation1 setThrdRmbrsmntAgtAcct(CashAccount7 value) {
        this.thrdRmbrsmntAgtAcct = value;
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
