
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
 * Provides information about a movement that failed the settlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailedMovement1", propOrder = {
    "cshAmt",
    "sctiesQty",
    "sctyId",
    "rsn"
})
public class FailedMovement1 {

    @XmlElement(name = "CshAmt")
    protected ActiveCurrencyAndAmount cshAmt;
    @XmlElement(name = "SctiesQty")
    protected UnitOrFaceAmount1Choice sctiesQty;
    @XmlElement(name = "SctyId")
    protected SecurityIdentification7 sctyId;
    @XmlElement(name = "Rsn", required = true)
    protected FailedSettlementReason1FormatChoice rsn;

    /**
     * Gets the value of the cshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmt() {
        return cshAmt;
    }

    /**
     * Sets the value of the cshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public FailedMovement1 setCshAmt(ActiveCurrencyAndAmount value) {
        this.cshAmt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public FailedMovement1 setSctiesQty(UnitOrFaceAmount1Choice value) {
        this.sctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public FailedMovement1 setSctyId(SecurityIdentification7 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link FailedSettlementReason1FormatChoice }
     *     
     */
    public FailedSettlementReason1FormatChoice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedSettlementReason1FormatChoice }
     *     
     */
    public FailedMovement1 setRsn(FailedSettlementReason1FormatChoice value) {
        this.rsn = value;
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
