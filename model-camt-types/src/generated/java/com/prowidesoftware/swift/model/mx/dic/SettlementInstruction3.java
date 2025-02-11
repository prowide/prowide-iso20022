
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
 * Provides further details on the settlement of the instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInstruction3", propOrder = {
    "instgRmbrsmntAgt",
    "instgRmbrsmntAgtAcct",
    "instdRmbrsmntAgt",
    "instdRmbrsmntAgtAcct"
})
public class SettlementInstruction3 {

    @XmlElement(name = "InstgRmbrsmntAgt")
    protected BranchAndFinancialInstitutionIdentification5 instgRmbrsmntAgt;
    @XmlElement(name = "InstgRmbrsmntAgtAcct")
    protected CashAccount24 instgRmbrsmntAgtAcct;
    @XmlElement(name = "InstdRmbrsmntAgt")
    protected BranchAndFinancialInstitutionIdentification5 instdRmbrsmntAgt;
    @XmlElement(name = "InstdRmbrsmntAgtAcct")
    protected CashAccount24 instdRmbrsmntAgtAcct;

    /**
     * Gets the value of the instgRmbrsmntAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getInstgRmbrsmntAgt() {
        return instgRmbrsmntAgt;
    }

    /**
     * Sets the value of the instgRmbrsmntAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public SettlementInstruction3 setInstgRmbrsmntAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.instgRmbrsmntAgt = value;
        return this;
    }

    /**
     * Gets the value of the instgRmbrsmntAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getInstgRmbrsmntAgtAcct() {
        return instgRmbrsmntAgtAcct;
    }

    /**
     * Sets the value of the instgRmbrsmntAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public SettlementInstruction3 setInstgRmbrsmntAgtAcct(CashAccount24 value) {
        this.instgRmbrsmntAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the instdRmbrsmntAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getInstdRmbrsmntAgt() {
        return instdRmbrsmntAgt;
    }

    /**
     * Sets the value of the instdRmbrsmntAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public SettlementInstruction3 setInstdRmbrsmntAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.instdRmbrsmntAgt = value;
        return this;
    }

    /**
     * Gets the value of the instdRmbrsmntAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getInstdRmbrsmntAgtAcct() {
        return instdRmbrsmntAgtAcct;
    }

    /**
     * Sets the value of the instdRmbrsmntAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public SettlementInstruction3 setInstdRmbrsmntAgtAcct(CashAccount24 value) {
        this.instdRmbrsmntAgtAcct = value;
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
