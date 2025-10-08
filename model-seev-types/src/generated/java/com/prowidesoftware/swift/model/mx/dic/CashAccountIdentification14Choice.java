
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
 * Unique identifier of an account, as assigned by the account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountIdentification14Choice", propOrder = {
    "iban",
    "blckChainCshWllt",
    "prtry"
})
public class CashAccountIdentification14Choice {

    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BlckChainCshWllt")
    protected BlockChainAddressWallet11 blckChainCshWllt;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccountIdentification14Choice setIBAN(String value) {
        this.iban = value;
        return this;
    }

    /**
     * Gets the value of the blckChainCshWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet11 }
     *     
     */
    public BlockChainAddressWallet11 getBlckChainCshWllt() {
        return blckChainCshWllt;
    }

    /**
     * Sets the value of the blckChainCshWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet11 }
     *     
     */
    public CashAccountIdentification14Choice setBlckChainCshWllt(BlockChainAddressWallet11 value) {
        this.blckChainCshWllt = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccountIdentification14Choice setPrtry(String value) {
        this.prtry = value;
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
