
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
 * Details on the reservation audit trail.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationAuditTrail2", propOrder = {
    "rsvatnId",
    "sysId",
    "tp",
    "amt",
    "sts"
})
public class ReservationAuditTrail2 {

    @XmlElement(name = "RsvatnId")
    protected String rsvatnId;
    @XmlElement(name = "SysId")
    protected SystemIdentification2Choice sysId;
    @XmlElement(name = "Tp")
    protected ReservationType1Choice tp;
    @XmlElement(name = "Amt")
    protected UpdateLogAmount1Choice amt;
    @XmlElement(name = "Sts")
    protected UpdateLogReservationStatus1 sts;

    /**
     * Gets the value of the rsvatnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsvatnId() {
        return rsvatnId;
    }

    /**
     * Sets the value of the rsvatnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReservationAuditTrail2 setRsvatnId(String value) {
        this.rsvatnId = value;
        return this;
    }

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
    public ReservationAuditTrail2 setSysId(SystemIdentification2Choice value) {
        this.sysId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationType1Choice }
     *     
     */
    public ReservationType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationType1Choice }
     *     
     */
    public ReservationAuditTrail2 setTp(ReservationType1Choice value) {
        this.tp = value;
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
    public ReservationAuditTrail2 setAmt(UpdateLogAmount1Choice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogReservationStatus1 }
     *     
     */
    public UpdateLogReservationStatus1 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogReservationStatus1 }
     *     
     */
    public ReservationAuditTrail2 setSts(UpdateLogReservationStatus1 value) {
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
