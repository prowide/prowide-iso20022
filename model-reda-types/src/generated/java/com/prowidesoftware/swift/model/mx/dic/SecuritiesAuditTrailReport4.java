
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
 * Report information about securities reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAuditTrailReport4", propOrder = {
    "sctiesAudtTrlOrErr",
    "dtPrd",
    "finInstrmId"
})
public class SecuritiesAuditTrailReport4 {

    @XmlElement(name = "SctiesAudtTrlOrErr", required = true)
    protected AuditTrailOrBusinessError6Choice sctiesAudtTrlOrErr;
    @XmlElement(name = "DtPrd")
    protected DatePeriodSearch1Choice dtPrd;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification39 finInstrmId;

    /**
     * Gets the value of the sctiesAudtTrlOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTrailOrBusinessError6Choice }
     *     
     */
    public AuditTrailOrBusinessError6Choice getSctiesAudtTrlOrErr() {
        return sctiesAudtTrlOrErr;
    }

    /**
     * Sets the value of the sctiesAudtTrlOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTrailOrBusinessError6Choice }
     *     
     */
    public SecuritiesAuditTrailReport4 setSctiesAudtTrlOrErr(AuditTrailOrBusinessError6Choice value) {
        this.sctiesAudtTrlOrErr = value;
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
    public SecuritiesAuditTrailReport4 setDtPrd(DatePeriodSearch1Choice value) {
        this.dtPrd = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecuritiesAuditTrailReport4 setFinInstrmId(SecurityIdentification39 value) {
        this.finInstrmId = value;
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
