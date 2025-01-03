
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
 * Status report of the individual orders of a bulk or multiple order that was previously received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualOrderStatusAndReason1", propOrder = {
    "sts",
    "canc",
    "condlyAccptd",
    "inRpr",
    "rjctd",
    "sspd",
    "rprdConds",
    "ordrRef",
    "stsInitr",
    "invstmtAcctOrFinInstrm",
    "newDtls"
})
public class IndividualOrderStatusAndReason1 {

    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected OrderStatus2Code sts;
    @XmlElement(name = "Canc")
    protected CancelledStatus1 canc;
    @XmlElement(name = "CondlyAccptd")
    protected ConditionallyAcceptedStatus1 condlyAccptd;
    @XmlElement(name = "InRpr")
    protected InRepairStatus1 inRpr;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus3 rjctd;
    @XmlElement(name = "Sspd")
    protected SuspendedStatus1 sspd;
    @XmlElement(name = "RprdConds")
    protected RepairedConditions2 rprdConds;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification2Choice stsInitr;
    @XmlElement(name = "InvstmtAcctOrFinInstrm")
    protected InvestmentAccountOrFinancialInstrument1Choice invstmtAcctOrFinInstrm;
    @XmlElement(name = "NewDtls")
    protected ExpectedExecutionDetails1 newDtls;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus2Code }
     *     
     */
    public OrderStatus2Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus2Code }
     *     
     */
    public IndividualOrderStatusAndReason1 setSts(OrderStatus2Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus1 }
     *     
     */
    public CancelledStatus1 getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus1 }
     *     
     */
    public IndividualOrderStatusAndReason1 setCanc(CancelledStatus1 value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the condlyAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionallyAcceptedStatus1 }
     *     
     */
    public ConditionallyAcceptedStatus1 getCondlyAccptd() {
        return condlyAccptd;
    }

    /**
     * Sets the value of the condlyAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionallyAcceptedStatus1 }
     *     
     */
    public IndividualOrderStatusAndReason1 setCondlyAccptd(ConditionallyAcceptedStatus1 value) {
        this.condlyAccptd = value;
        return this;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link InRepairStatus1 }
     *     
     */
    public InRepairStatus1 getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InRepairStatus1 }
     *     
     */
    public IndividualOrderStatusAndReason1 setInRpr(InRepairStatus1 value) {
        this.inRpr = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus3 }
     *     
     */
    public RejectedStatus3 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus3 }
     *     
     */
    public IndividualOrderStatusAndReason1 setRjctd(RejectedStatus3 value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the sspd property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendedStatus1 }
     *     
     */
    public SuspendedStatus1 getSspd() {
        return sspd;
    }

    /**
     * Sets the value of the sspd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendedStatus1 }
     *     
     */
    public IndividualOrderStatusAndReason1 setSspd(SuspendedStatus1 value) {
        this.sspd = value;
        return this;
    }

    /**
     * Gets the value of the rprdConds property.
     * 
     * @return
     *     possible object is
     *     {@link RepairedConditions2 }
     *     
     */
    public RepairedConditions2 getRprdConds() {
        return rprdConds;
    }

    /**
     * Sets the value of the rprdConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairedConditions2 }
     *     
     */
    public IndividualOrderStatusAndReason1 setRprdConds(RepairedConditions2 value) {
        this.rprdConds = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualOrderStatusAndReason1 setOrdrRef(String value) {
        this.ordrRef = value;
        return this;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public IndividualOrderStatusAndReason1 setStsInitr(PartyIdentification2Choice value) {
        this.stsInitr = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctOrFinInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOrFinancialInstrument1Choice }
     *     
     */
    public InvestmentAccountOrFinancialInstrument1Choice getInvstmtAcctOrFinInstrm() {
        return invstmtAcctOrFinInstrm;
    }

    /**
     * Sets the value of the invstmtAcctOrFinInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOrFinancialInstrument1Choice }
     *     
     */
    public IndividualOrderStatusAndReason1 setInvstmtAcctOrFinInstrm(InvestmentAccountOrFinancialInstrument1Choice value) {
        this.invstmtAcctOrFinInstrm = value;
        return this;
    }

    /**
     * Gets the value of the newDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedExecutionDetails1 }
     *     
     */
    public ExpectedExecutionDetails1 getNewDtls() {
        return newDtls;
    }

    /**
     * Sets the value of the newDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedExecutionDetails1 }
     *     
     */
    public IndividualOrderStatusAndReason1 setNewDtls(ExpectedExecutionDetails1 value) {
        this.newDtls = value;
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
