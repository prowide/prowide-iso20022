
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Limit details of one particular limit set by the member and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitStructure6", propOrder = {
    "lmtId",
    "startDtTm",
    "amt",
    "cdtDbtInd"
})
public class LimitStructure6 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentification8 lmtId;
    @XmlElement(name = "StartDtTm")
    protected DateAndDateTime2Choice startDtTm;
    @XmlElement(name = "Amt", required = true)
    protected Amount2Choice amt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;

    /**
     * Gets the value of the lmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification8 }
     *     
     */
    public LimitIdentification8 getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification8 }
     *     
     */
    public LimitStructure6 setLmtId(LimitIdentification8 value) {
        this.lmtId = value;
        return this;
    }

    /**
     * Gets the value of the startDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getStartDtTm() {
        return startDtTm;
    }

    /**
     * Sets the value of the startDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public LimitStructure6 setStartDtTm(DateAndDateTime2Choice value) {
        this.startDtTm = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public LimitStructure6 setAmt(Amount2Choice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public LimitStructure6 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
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
