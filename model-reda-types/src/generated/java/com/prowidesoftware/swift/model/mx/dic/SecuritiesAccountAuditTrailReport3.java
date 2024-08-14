
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
 * Report information about securities account reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountAuditTrailReport3", propOrder = {
    "sctiesAcctAudtTrlOrErr",
    "dtPrd",
    "sctiesAcctId"
})
public class SecuritiesAccountAuditTrailReport3 {

    @XmlElement(name = "SctiesAcctAudtTrlOrErr", required = true)
    protected AuditTrailOrBusinessError6Choice sctiesAcctAudtTrlOrErr;
    @XmlElement(name = "DtPrd")
    protected DatePeriodSearch1Choice dtPrd;
    @XmlElement(name = "SctiesAcctId", required = true)
    protected SecuritiesAccount19 sctiesAcctId;

    /**
     * Gets the value of the sctiesAcctAudtTrlOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTrailOrBusinessError6Choice }
     *     
     */
    public AuditTrailOrBusinessError6Choice getSctiesAcctAudtTrlOrErr() {
        return sctiesAcctAudtTrlOrErr;
    }

    /**
     * Sets the value of the sctiesAcctAudtTrlOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTrailOrBusinessError6Choice }
     *     
     */
    public SecuritiesAccountAuditTrailReport3 setSctiesAcctAudtTrlOrErr(AuditTrailOrBusinessError6Choice value) {
        this.sctiesAcctAudtTrlOrErr = value;
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
    public SecuritiesAccountAuditTrailReport3 setDtPrd(DatePeriodSearch1Choice value) {
        this.dtPrd = value;
        return this;
    }

    /**
     * Gets the value of the sctiesAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSctiesAcctId() {
        return sctiesAcctId;
    }

    /**
     * Sets the value of the sctiesAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccountAuditTrailReport3 setSctiesAcctId(SecuritiesAccount19 value) {
        this.sctiesAcctId = value;
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
