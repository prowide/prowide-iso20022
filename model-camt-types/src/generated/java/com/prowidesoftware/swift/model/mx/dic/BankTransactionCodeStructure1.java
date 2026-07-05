
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
 * Set of elements to fully identify the type of the bank transaction entry.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransactionCodeStructure1", propOrder = {
    "domn",
    "prtry"
})
public class BankTransactionCodeStructure1 {

    @XmlElement(name = "Domn")
    protected BankTransactionCodeStructure2 domn;
    @XmlElement(name = "Prtry")
    protected ProprietaryBankTransactionCodeStructure1 prtry;

    /**
     * Gets the value of the domn property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure2 }
     *     
     */
    public BankTransactionCodeStructure2 getDomn() {
        return domn;
    }

    /**
     * Sets the value of the domn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure2 }
     *     
     */
    public BankTransactionCodeStructure1 setDomn(BankTransactionCodeStructure2 value) {
        this.domn = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryBankTransactionCodeStructure1 }
     *     
     */
    public ProprietaryBankTransactionCodeStructure1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryBankTransactionCodeStructure1 }
     *     
     */
    public BankTransactionCodeStructure1 setPrtry(ProprietaryBankTransactionCodeStructure1 value) {
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
