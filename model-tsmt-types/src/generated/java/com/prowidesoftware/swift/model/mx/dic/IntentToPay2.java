
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the details of an intention to pay based on purchase orders or commercial invoice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntentToPay2", propOrder = {
    "brkdwn",
    "xpctdPmtDt",
    "sttlmTerms"
})
public class IntentToPay2 {

    @XmlElement(name = "Brkdwn", required = true)
    protected BreakDown1Choice brkdwn;
    @XmlElement(name = "XpctdPmtDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar xpctdPmtDt;
    @XmlElement(name = "SttlmTerms")
    protected SettlementTerms3 sttlmTerms;

    /**
     * Gets the value of the brkdwn property.
     * 
     * @return
     *     possible object is
     *     {@link BreakDown1Choice }
     *     
     */
    public BreakDown1Choice getBrkdwn() {
        return brkdwn;
    }

    /**
     * Sets the value of the brkdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakDown1Choice }
     *     
     */
    public IntentToPay2 setBrkdwn(BreakDown1Choice value) {
        this.brkdwn = value;
        return this;
    }

    /**
     * Gets the value of the xpctdPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getXpctdPmtDt() {
        return xpctdPmtDt;
    }

    /**
     * Sets the value of the xpctdPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IntentToPay2 setXpctdPmtDt(Calendar value) {
        this.xpctdPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTerms3 }
     *     
     */
    public SettlementTerms3 getSttlmTerms() {
        return sttlmTerms;
    }

    /**
     * Sets the value of the sttlmTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTerms3 }
     *     
     */
    public IntentToPay2 setSttlmTerms(SettlementTerms3 value) {
        this.sttlmTerms = value;
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
