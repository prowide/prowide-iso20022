
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
 * Owner and account number of the guarantee fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeFundInformation1", propOrder = {
    "grntFndAcct",
    "grntFndAcctOwnr"
})
public class GuaranteeFundInformation1 {

    @XmlElement(name = "GrntFndAcct", required = true)
    protected CashAccount24 grntFndAcct;
    @XmlElement(name = "GrntFndAcctOwnr", required = true)
    protected FinancialInstitutionIdentification9 grntFndAcctOwnr;

    /**
     * Gets the value of the grntFndAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getGrntFndAcct() {
        return grntFndAcct;
    }

    /**
     * Sets the value of the grntFndAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public GuaranteeFundInformation1 setGrntFndAcct(CashAccount24 value) {
        this.grntFndAcct = value;
        return this;
    }

    /**
     * Gets the value of the grntFndAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public FinancialInstitutionIdentification9 getGrntFndAcctOwnr() {
        return grntFndAcctOwnr;
    }

    /**
     * Sets the value of the grntFndAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public GuaranteeFundInformation1 setGrntFndAcctOwnr(FinancialInstitutionIdentification9 value) {
        this.grntFndAcctOwnr = value;
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
