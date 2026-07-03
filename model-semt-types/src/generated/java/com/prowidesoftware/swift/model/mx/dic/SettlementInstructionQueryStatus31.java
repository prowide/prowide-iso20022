
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
 * Defines the settlement instruction status query criteria including the status period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInstructionQueryStatus3__1", propOrder = {
    "tp",
    "dtPrd"
})
public class SettlementInstructionQueryStatus31 {

    @XmlElement(name = "Tp", required = true)
    protected SettlementTransactionStatusType21 tp;
    @XmlElement(name = "DtPrd")
    protected DateAndDateTimeSearch5Choice1 dtPrd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTransactionStatusType21 }
     *     
     */
    public SettlementTransactionStatusType21 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTransactionStatusType21 }
     *     
     */
    public SettlementInstructionQueryStatus31 setTp(SettlementTransactionStatusType21 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the dtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public DateAndDateTimeSearch5Choice1 getDtPrd() {
        return dtPrd;
    }

    /**
     * Sets the value of the dtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public SettlementInstructionQueryStatus31 setDtPrd(DateAndDateTimeSearch5Choice1 value) {
        this.dtPrd = value;
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
