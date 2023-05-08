
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
 * Specifies the business item for which the audit trail is provided
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditTrailBusinessItem2Choice", propOrder = {
    "tx",
    "cdtLine",
    "lmt",
    "rsvatn",
    "othr"
})
public class AuditTrailBusinessItem2Choice {

    @XmlElement(name = "Tx")
    protected TransactionAuditTrail2 tx;
    @XmlElement(name = "CdtLine")
    protected CreditLineAuditTrail1 cdtLine;
    @XmlElement(name = "Lmt")
    protected LimitAuditTrail2 lmt;
    @XmlElement(name = "Rsvatn")
    protected ReservationAuditTrail2 rsvatn;
    @XmlElement(name = "Othr")
    protected UpdateLogProprietary1 othr;

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAuditTrail2 }
     *     
     */
    public TransactionAuditTrail2 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAuditTrail2 }
     *     
     */
    public AuditTrailBusinessItem2Choice setTx(TransactionAuditTrail2 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the cdtLine property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLineAuditTrail1 }
     *     
     */
    public CreditLineAuditTrail1 getCdtLine() {
        return cdtLine;
    }

    /**
     * Sets the value of the cdtLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLineAuditTrail1 }
     *     
     */
    public AuditTrailBusinessItem2Choice setCdtLine(CreditLineAuditTrail1 value) {
        this.cdtLine = value;
        return this;
    }

    /**
     * Gets the value of the lmt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitAuditTrail2 }
     *     
     */
    public LimitAuditTrail2 getLmt() {
        return lmt;
    }

    /**
     * Sets the value of the lmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitAuditTrail2 }
     *     
     */
    public AuditTrailBusinessItem2Choice setLmt(LimitAuditTrail2 value) {
        this.lmt = value;
        return this;
    }

    /**
     * Gets the value of the rsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationAuditTrail2 }
     *     
     */
    public ReservationAuditTrail2 getRsvatn() {
        return rsvatn;
    }

    /**
     * Sets the value of the rsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationAuditTrail2 }
     *     
     */
    public AuditTrailBusinessItem2Choice setRsvatn(ReservationAuditTrail2 value) {
        this.rsvatn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogProprietary1 }
     *     
     */
    public UpdateLogProprietary1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogProprietary1 }
     *     
     */
    public AuditTrailBusinessItem2Choice setOthr(UpdateLogProprietary1 value) {
        this.othr = value;
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
