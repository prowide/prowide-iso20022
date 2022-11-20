
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
 * Specifies the details on the settlement fails split per instruction types.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsDailyInstructionType3", propOrder = {
    "dlvryVrssPmt",
    "dlvryWthPmt",
    "pmtFreeOfDlvry",
    "freeOfPmt"
})
public class SettlementFailsDailyInstructionType3 {

    @XmlElement(name = "DlvryVrssPmt", required = true)
    protected SettlementDailyFailureReason1Choice dlvryVrssPmt;
    @XmlElement(name = "DlvryWthPmt", required = true)
    protected SettlementDailyFailureReason1Choice dlvryWthPmt;
    @XmlElement(name = "PmtFreeOfDlvry", required = true)
    protected SettlementDailyFailureReason1Choice pmtFreeOfDlvry;
    @XmlElement(name = "FreeOfPmt", required = true)
    protected SettlementDailyFailureReason1Choice freeOfPmt;

    /**
     * Gets the value of the dlvryVrssPmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementDailyFailureReason1Choice getDlvryVrssPmt() {
        return dlvryVrssPmt;
    }

    /**
     * Sets the value of the dlvryVrssPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementFailsDailyInstructionType3 setDlvryVrssPmt(SettlementDailyFailureReason1Choice value) {
        this.dlvryVrssPmt = value;
        return this;
    }

    /**
     * Gets the value of the dlvryWthPmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementDailyFailureReason1Choice getDlvryWthPmt() {
        return dlvryWthPmt;
    }

    /**
     * Sets the value of the dlvryWthPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementFailsDailyInstructionType3 setDlvryWthPmt(SettlementDailyFailureReason1Choice value) {
        this.dlvryWthPmt = value;
        return this;
    }

    /**
     * Gets the value of the pmtFreeOfDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementDailyFailureReason1Choice getPmtFreeOfDlvry() {
        return pmtFreeOfDlvry;
    }

    /**
     * Sets the value of the pmtFreeOfDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementFailsDailyInstructionType3 setPmtFreeOfDlvry(SettlementDailyFailureReason1Choice value) {
        this.pmtFreeOfDlvry = value;
        return this;
    }

    /**
     * Gets the value of the freeOfPmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementDailyFailureReason1Choice getFreeOfPmt() {
        return freeOfPmt;
    }

    /**
     * Sets the value of the freeOfPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementFailsDailyInstructionType3 setFreeOfPmt(SettlementDailyFailureReason1Choice value) {
        this.freeOfPmt = value;
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
