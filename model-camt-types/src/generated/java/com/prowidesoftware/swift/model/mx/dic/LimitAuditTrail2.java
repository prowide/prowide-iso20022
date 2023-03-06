
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
 * Details on the limit audit trail.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitAuditTrail2", propOrder = {
    "sysId",
    "tp",
    "bilLmtCtrPtyId",
    "amt",
    "sts"
})
public class LimitAuditTrail2 {

    @XmlElement(name = "SysId")
    protected SystemIdentification2Choice sysId;
    @XmlElement(name = "Tp")
    protected LimitType1Choice tp;
    @XmlElement(name = "BilLmtCtrPtyId")
    protected BranchAndFinancialInstitutionIdentification6 bilLmtCtrPtyId;
    @XmlElement(name = "Amt")
    protected UpdateLogAmount1Choice amt;
    @XmlElement(name = "Sts")
    protected UpdateLogLimitStatus1 sts;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public SystemIdentification2Choice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public LimitAuditTrail2 setSysId(SystemIdentification2Choice value) {
        this.sysId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link LimitType1Choice }
     *     
     */
    public LimitType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitType1Choice }
     *     
     */
    public LimitAuditTrail2 setTp(LimitType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the bilLmtCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getBilLmtCtrPtyId() {
        return bilLmtCtrPtyId;
    }

    /**
     * Sets the value of the bilLmtCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public LimitAuditTrail2 setBilLmtCtrPtyId(BranchAndFinancialInstitutionIdentification6 value) {
        this.bilLmtCtrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogAmount1Choice }
     *     
     */
    public UpdateLogAmount1Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogAmount1Choice }
     *     
     */
    public LimitAuditTrail2 setAmt(UpdateLogAmount1Choice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogLimitStatus1 }
     *     
     */
    public UpdateLogLimitStatus1 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogLimitStatus1 }
     *     
     */
    public LimitAuditTrail2 setSts(UpdateLogLimitStatus1 value) {
        this.sts = value;
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
