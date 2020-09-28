
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
 * Reports either on the risk management limit or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditTrailReport2", propOrder = {
    "acctId",
    "acctOwnr",
    "dtPrd",
    "audtTrlOrErr"
})
public class AuditTrailReport2 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentification4Choice acctId;
    @XmlElement(name = "AcctOwnr")
    protected BranchAndFinancialInstitutionIdentification6 acctOwnr;
    @XmlElement(name = "DtPrd")
    protected DatePeriodSearch1Choice dtPrd;
    @XmlElement(name = "AudtTrlOrErr", required = true)
    protected AuditTrailOrBusinessError5Choice audtTrlOrErr;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AuditTrailReport2 setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public AuditTrailReport2 setAcctOwnr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the dtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getDtPrd() {
        return dtPrd;
    }

    /**
     * Sets the value of the dtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public AuditTrailReport2 setDtPrd(DatePeriodSearch1Choice value) {
        this.dtPrd = value;
        return this;
    }

    /**
     * Gets the value of the audtTrlOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTrailOrBusinessError5Choice }
     *     
     */
    public AuditTrailOrBusinessError5Choice getAudtTrlOrErr() {
        return audtTrlOrErr;
    }

    /**
     * Sets the value of the audtTrlOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTrailOrBusinessError5Choice }
     *     
     */
    public AuditTrailReport2 setAudtTrlOrErr(AuditTrailOrBusinessError5Choice value) {
        this.audtTrlOrErr = value;
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
