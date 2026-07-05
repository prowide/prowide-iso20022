
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
 * Report information about party reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAuditTrailReport4", propOrder = {
    "ptyAudtTrlOrErr",
    "dtPrd",
    "ptyId"
})
public class PartyAuditTrailReport4 {

    @XmlElement(name = "PtyAudtTrlOrErr", required = true)
    protected PartyAuditTrailOrError4Choice ptyAudtTrlOrErr;
    @XmlElement(name = "DtPrd")
    protected DatePeriod3Choice dtPrd;
    @XmlElement(name = "PtyId", required = true)
    protected SystemPartyIdentification8 ptyId;

    /**
     * Gets the value of the ptyAudtTrlOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAuditTrailOrError4Choice }
     *     
     */
    public PartyAuditTrailOrError4Choice getPtyAudtTrlOrErr() {
        return ptyAudtTrlOrErr;
    }

    /**
     * Sets the value of the ptyAudtTrlOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAuditTrailOrError4Choice }
     *     
     */
    public PartyAuditTrailReport4 setPtyAudtTrlOrErr(PartyAuditTrailOrError4Choice value) {
        this.ptyAudtTrlOrErr = value;
        return this;
    }

    /**
     * Gets the value of the dtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod3Choice }
     *     
     */
    public DatePeriod3Choice getDtPrd() {
        return dtPrd;
    }

    /**
     * Sets the value of the dtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod3Choice }
     *     
     */
    public PartyAuditTrailReport4 setDtPrd(DatePeriod3Choice value) {
        this.dtPrd = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public PartyAuditTrailReport4 setPtyId(SystemPartyIdentification8 value) {
        this.ptyId = value;
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
