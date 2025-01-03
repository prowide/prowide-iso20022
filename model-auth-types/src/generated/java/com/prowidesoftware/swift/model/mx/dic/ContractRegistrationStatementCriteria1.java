
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
 * Provides the list of criteria to be returned in the contract registration statement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRegistrationStatementCriteria1", propOrder = {
    "txJrnl",
    "spprtgDocJrnl",
    "addtlSpprtgDocJrnl",
    "rgltryRuleVldtn"
})
public class ContractRegistrationStatementCriteria1 {

    @XmlElement(name = "TxJrnl")
    protected Boolean txJrnl;
    @XmlElement(name = "SpprtgDocJrnl")
    protected Boolean spprtgDocJrnl;
    @XmlElement(name = "AddtlSpprtgDocJrnl")
    protected Boolean addtlSpprtgDocJrnl;
    @XmlElement(name = "RgltryRuleVldtn")
    protected Boolean rgltryRuleVldtn;

    /**
     * Gets the value of the txJrnl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxJrnl() {
        return txJrnl;
    }

    /**
     * Sets the value of the txJrnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ContractRegistrationStatementCriteria1 setTxJrnl(Boolean value) {
        this.txJrnl = value;
        return this;
    }

    /**
     * Gets the value of the spprtgDocJrnl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpprtgDocJrnl() {
        return spprtgDocJrnl;
    }

    /**
     * Sets the value of the spprtgDocJrnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ContractRegistrationStatementCriteria1 setSpprtgDocJrnl(Boolean value) {
        this.spprtgDocJrnl = value;
        return this;
    }

    /**
     * Gets the value of the addtlSpprtgDocJrnl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddtlSpprtgDocJrnl() {
        return addtlSpprtgDocJrnl;
    }

    /**
     * Sets the value of the addtlSpprtgDocJrnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ContractRegistrationStatementCriteria1 setAddtlSpprtgDocJrnl(Boolean value) {
        this.addtlSpprtgDocJrnl = value;
        return this;
    }

    /**
     * Gets the value of the rgltryRuleVldtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRgltryRuleVldtn() {
        return rgltryRuleVldtn;
    }

    /**
     * Sets the value of the rgltryRuleVldtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ContractRegistrationStatementCriteria1 setRgltryRuleVldtn(Boolean value) {
        this.rgltryRuleVldtn = value;
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
