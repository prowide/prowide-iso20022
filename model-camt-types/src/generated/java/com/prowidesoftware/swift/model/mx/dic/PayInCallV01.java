
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
 * Scope
 * The PayInCall message is used by a Central Settlement System to request funds from a trading party in order to facilitate settlement.
 * Usage
 * The PayInCall can list a number of currencies, any of which is accepted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayInCallV01", propOrder = {
    "ptyId",
    "rptData"
})
public class PayInCallV01 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification8Choice ptyId;
    @XmlElement(name = "RptData", required = true)
    protected ReportData1 rptData;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PartyIdentification8Choice getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PayInCallV01 setPtyId(PartyIdentification8Choice value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the rptData property.
     * 
     * @return
     *     possible object is
     *     {@link ReportData1 }
     *     
     */
    public ReportData1 getRptData() {
        return rptData;
    }

    /**
     * Sets the value of the rptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportData1 }
     *     
     */
    public PayInCallV01 setRptData(ReportData1 value) {
        this.rptData = value;
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
