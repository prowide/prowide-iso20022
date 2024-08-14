
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
 * Select the type(s) of information to be retrieved about a registered investment account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccountInformationType", propOrder = {
    "invstmtAcct",
    "acctPties",
    "intrmies",
    "invstmtPlan",
    "cshSttlm"
})
public class InvestmentAccountInformationType {

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
    public InvestmentAccountInformationType setInvstmtAcct(boolean value) {
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
    public InvestmentAccountInformationType setAcctPties(boolean value) {
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
    public InvestmentAccountInformationType setIntrmies(boolean value) {
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
    public InvestmentAccountInformationType setInvstmtPlan(boolean value) {
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
    public InvestmentAccountInformationType setCshSttlm(boolean value) {
        this.cshSttlm = value;
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
