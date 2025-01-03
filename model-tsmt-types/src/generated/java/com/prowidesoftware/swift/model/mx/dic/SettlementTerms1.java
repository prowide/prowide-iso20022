
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
 * Specifies the beneficiary's account information for the settlement of a purchase of goods or services.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTerms1", propOrder = {
    "fnlAgt",
    "bnfcryAcct"
})
public class SettlementTerms1 {

    @XmlElement(name = "FnlAgt")
    protected FinancialInstitutionIdentification4Choice fnlAgt;
    @XmlElement(name = "BnfcryAcct", required = true)
    protected AccountIdentificationOrNameChoice bnfcryAcct;

    /**
     * Gets the value of the fnlAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification4Choice }
     *     
     */
    public FinancialInstitutionIdentification4Choice getFnlAgt() {
        return fnlAgt;
    }

    /**
     * Sets the value of the fnlAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification4Choice }
     *     
     */
    public SettlementTerms1 setFnlAgt(FinancialInstitutionIdentification4Choice value) {
        this.fnlAgt = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationOrNameChoice }
     *     
     */
    public AccountIdentificationOrNameChoice getBnfcryAcct() {
        return bnfcryAcct;
    }

    /**
     * Sets the value of the bnfcryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationOrNameChoice }
     *     
     */
    public SettlementTerms1 setBnfcryAcct(AccountIdentificationOrNameChoice value) {
        this.bnfcryAcct = value;
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
