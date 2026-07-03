
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
 * Defines the criteria used to report on the cash balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBalanceReturnCriteria2", propOrder = {
    "tpInd",
    "stsInd",
    "valDtInd",
    "prcgDtInd",
    "nbOfPmtsInd"
})
public class CashBalanceReturnCriteria2 {

    @XmlElement(name = "TpInd")
    protected boolean tpInd;
    @XmlElement(name = "StsInd")
    protected boolean stsInd;
    @XmlElement(name = "ValDtInd")
    protected boolean valDtInd;
    @XmlElement(name = "PrcgDtInd")
    protected boolean prcgDtInd;
    @XmlElement(name = "NbOfPmtsInd")
    protected boolean nbOfPmtsInd;

    /**
     * Gets the value of the tpInd property.
     * 
     */
    public boolean isTpInd() {
        return tpInd;
    }

    /**
     * Sets the value of the tpInd property.
     * 
     */
    public CashBalanceReturnCriteria2 setTpInd(boolean value) {
        this.tpInd = value;
        return this;
    }

    /**
     * Gets the value of the stsInd property.
     * 
     */
    public boolean isStsInd() {
        return stsInd;
    }

    /**
     * Sets the value of the stsInd property.
     * 
     */
    public CashBalanceReturnCriteria2 setStsInd(boolean value) {
        this.stsInd = value;
        return this;
    }

    /**
     * Gets the value of the valDtInd property.
     * 
     */
    public boolean isValDtInd() {
        return valDtInd;
    }

    /**
     * Sets the value of the valDtInd property.
     * 
     */
    public CashBalanceReturnCriteria2 setValDtInd(boolean value) {
        this.valDtInd = value;
        return this;
    }

    /**
     * Gets the value of the prcgDtInd property.
     * 
     */
    public boolean isPrcgDtInd() {
        return prcgDtInd;
    }

    /**
     * Sets the value of the prcgDtInd property.
     * 
     */
    public CashBalanceReturnCriteria2 setPrcgDtInd(boolean value) {
        this.prcgDtInd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfPmtsInd property.
     * 
     */
    public boolean isNbOfPmtsInd() {
        return nbOfPmtsInd;
    }

    /**
     * Sets the value of the nbOfPmtsInd property.
     * 
     */
    public CashBalanceReturnCriteria2 setNbOfPmtsInd(boolean value) {
        this.nbOfPmtsInd = value;
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
