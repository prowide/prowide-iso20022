
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
 * Information about short positions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShortPositionsReportDetails1", propOrder = {
    "ptcptId",
    "ptcptAcct",
    "shrtPosAmt"
})
public class ShortPositionsReportDetails1 {

    @XmlElement(name = "PtcptId", required = true)
    protected BranchAndFinancialInstitutionIdentification5 ptcptId;
    @XmlElement(name = "PtcptAcct", required = true)
    protected CashAccount24 ptcptAcct;
    @XmlElement(name = "ShrtPosAmt", required = true)
    protected ActiveCurrencyAndAmount shrtPosAmt;

    /**
     * Gets the value of the ptcptId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getPtcptId() {
        return ptcptId;
    }

    /**
     * Sets the value of the ptcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public ShortPositionsReportDetails1 setPtcptId(BranchAndFinancialInstitutionIdentification5 value) {
        this.ptcptId = value;
        return this;
    }

    /**
     * Gets the value of the ptcptAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getPtcptAcct() {
        return ptcptAcct;
    }

    /**
     * Sets the value of the ptcptAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public ShortPositionsReportDetails1 setPtcptAcct(CashAccount24 value) {
        this.ptcptAcct = value;
        return this;
    }

    /**
     * Gets the value of the shrtPosAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getShrtPosAmt() {
        return shrtPosAmt;
    }

    /**
     * Sets the value of the shrtPosAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ShortPositionsReportDetails1 setShrtPosAmt(ActiveCurrencyAndAmount value) {
        this.shrtPosAmt = value;
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
