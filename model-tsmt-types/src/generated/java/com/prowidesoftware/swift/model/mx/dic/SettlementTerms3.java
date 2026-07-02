
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
 * Specifies the beneficiary's account information for the settlement of a purchase of goods or services.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTerms3", propOrder = {
    "cdtrAgt",
    "cdtrAcct"
})
public class SettlementTerms3 {

    @XmlElement(name = "CdtrAgt")
    protected FinancialInstitutionIdentification4Choice cdtrAgt;
    @XmlElement(name = "CdtrAcct", required = true)
    protected CashAccount24 cdtrAcct;

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification4Choice }
     *     
     */
    public FinancialInstitutionIdentification4Choice getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification4Choice }
     *     
     */
    public SettlementTerms3 setCdtrAgt(FinancialInstitutionIdentification4Choice value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public SettlementTerms3 setCdtrAcct(CashAccount24 value) {
        this.cdtrAcct = value;
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
