
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
@XmlType(name = "IntentToPay1", propOrder = {
    "byPurchsOrdr",
    "byComrclInvc",
    "xpctdPmtDt",
    "sttlmTerms"
})
public class IntentToPay1 {

    @XmlElement(name = "ByPurchsOrdr")
    protected ReportLine3 byPurchsOrdr;
    @XmlElement(name = "ByComrclInvc")
    protected ReportLine4 byComrclInvc;
    @XmlElement(name = "XpctdPmtDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdPmtDt;
    @XmlElement(name = "SttlmTerms")
    protected SettlementTerms2 sttlmTerms;

    /**
     * Gets the value of the byPurchsOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportLine3 }
     *     
     */
    public ReportLine3 getByPurchsOrdr() {
        return byPurchsOrdr;
    }

    /**
     * Sets the value of the byPurchsOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportLine3 }
     *     
     */
    public IntentToPay1 setByPurchsOrdr(ReportLine3 value) {
        this.byPurchsOrdr = value;
        return this;
    }

    /**
     * Gets the value of the byComrclInvc property.
     * 
     * @return
     *     possible object is
     *     {@link ReportLine4 }
     *     
     */
    public ReportLine4 getByComrclInvc() {
        return byComrclInvc;
    }

    /**
     * Sets the value of the byComrclInvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportLine4 }
     *     
     */
    public IntentToPay1 setByComrclInvc(ReportLine4 value) {
        this.byComrclInvc = value;
        return this;
    }

    /**
     * Gets the value of the xpctdPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdPmtDt() {
        return xpctdPmtDt;
    }

    /**
     * Sets the value of the xpctdPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public IntentToPay1 setXpctdPmtDt(XMLGregorianCalendar value) {
        this.xpctdPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTerms2 }
     *     
     */
    public SettlementTerms2 getSttlmTerms() {
        return sttlmTerms;
    }

    /**
     * Sets the value of the sttlmTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTerms2 }
     *     
     */
    public IntentToPay1 setSttlmTerms(SettlementTerms2 value) {
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
