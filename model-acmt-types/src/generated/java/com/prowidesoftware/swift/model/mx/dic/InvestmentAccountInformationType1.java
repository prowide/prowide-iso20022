
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
 * Select the type(s) of information to be retrieved about a registered investment account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccountInformationType1", propOrder = {
    "invstmtAcct",
    "acctPties",
    "intrmies",
    "invstmtPlan",
    "cshSttlm",
    "svcLvlAgrmt"
})
public class InvestmentAccountInformationType1 {

    @XmlElement(name = "InvstmtAcct")
    protected boolean invstmtAcct;
    @XmlElement(name = "AcctPties")
    protected boolean acctPties;
    @XmlElement(name = "Intrmies")
    protected boolean intrmies;
    @XmlElement(name = "InvstmtPlan")
    protected boolean invstmtPlan;
    @XmlElement(name = "CshSttlm")
    protected boolean cshSttlm;
    @XmlElement(name = "SvcLvlAgrmt")
    protected boolean svcLvlAgrmt;

    /**
     * Gets the value of the invstmtAcct property.
     * 
     */
    public boolean isInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     */
    public InvestmentAccountInformationType1 setInvstmtAcct(boolean value) {
        this.invstmtAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctPties property.
     * 
     */
    public boolean isAcctPties() {
        return acctPties;
    }

    /**
     * Sets the value of the acctPties property.
     * 
     */
    public InvestmentAccountInformationType1 setAcctPties(boolean value) {
        this.acctPties = value;
        return this;
    }

    /**
     * Gets the value of the intrmies property.
     * 
     */
    public boolean isIntrmies() {
        return intrmies;
    }

    /**
     * Sets the value of the intrmies property.
     * 
     */
    public InvestmentAccountInformationType1 setIntrmies(boolean value) {
        this.intrmies = value;
        return this;
    }

    /**
     * Gets the value of the invstmtPlan property.
     * 
     */
    public boolean isInvstmtPlan() {
        return invstmtPlan;
    }

    /**
     * Sets the value of the invstmtPlan property.
     * 
     */
    public InvestmentAccountInformationType1 setInvstmtPlan(boolean value) {
        this.invstmtPlan = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlm property.
     * 
     */
    public boolean isCshSttlm() {
        return cshSttlm;
    }

    /**
     * Sets the value of the cshSttlm property.
     * 
     */
    public InvestmentAccountInformationType1 setCshSttlm(boolean value) {
        this.cshSttlm = value;
        return this;
    }

    /**
     * Gets the value of the svcLvlAgrmt property.
     * 
     */
    public boolean isSvcLvlAgrmt() {
        return svcLvlAgrmt;
    }

    /**
     * Sets the value of the svcLvlAgrmt property.
     * 
     */
    public InvestmentAccountInformationType1 setSvcLvlAgrmt(boolean value) {
        this.svcLvlAgrmt = value;
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
