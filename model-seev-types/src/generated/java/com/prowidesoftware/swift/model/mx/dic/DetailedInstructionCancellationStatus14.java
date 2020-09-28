
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
 * Status applying to individual cancellation instructions of a meeting instruction cancellation request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedInstructionCancellationStatus14", propOrder = {
    "snglInstrCxlId",
    "acctId",
    "subAcctId",
    "instrCxlSts"
})
public class DetailedInstructionCancellationStatus14 {

    @XmlElement(name = "SnglInstrCxlId", required = true)
    protected String snglInstrCxlId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "SubAcctId")
    protected String subAcctId;
    @XmlElement(name = "InstrCxlSts", required = true)
    protected CancellationStatus26Choice instrCxlSts;

    /**
     * Gets the value of the snglInstrCxlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnglInstrCxlId() {
        return snglInstrCxlId;
    }

    /**
     * Sets the value of the snglInstrCxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedInstructionCancellationStatus14 setSnglInstrCxlId(String value) {
        this.snglInstrCxlId = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedInstructionCancellationStatus14 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the subAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAcctId() {
        return subAcctId;
    }

    /**
     * Sets the value of the subAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedInstructionCancellationStatus14 setSubAcctId(String value) {
        this.subAcctId = value;
        return this;
    }

    /**
     * Gets the value of the instrCxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus26Choice }
     *     
     */
    public CancellationStatus26Choice getInstrCxlSts() {
        return instrCxlSts;
    }

    /**
     * Sets the value of the instrCxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus26Choice }
     *     
     */
    public DetailedInstructionCancellationStatus14 setInstrCxlSts(CancellationStatus26Choice value) {
        this.instrCxlSts = value;
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
