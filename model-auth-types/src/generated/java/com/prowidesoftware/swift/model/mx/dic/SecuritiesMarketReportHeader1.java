
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the securities market transaction report related header details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesMarketReportHeader1", propOrder = {
    "rptgNtty",
    "rptgPrd",
    "submissnDtTm"
})
public class SecuritiesMarketReportHeader1 {

    @XmlElement(name = "RptgNtty", required = true)
    protected TradingVenueIdentification1Choice rptgNtty;
    @XmlElement(name = "RptgPrd", required = true)
    protected Period4Choice rptgPrd;
    @XmlElement(name = "SubmissnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissnDtTm;

    /**
     * Gets the value of the rptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueIdentification1Choice }
     *     
     */
    public TradingVenueIdentification1Choice getRptgNtty() {
        return rptgNtty;
    }

    /**
     * Sets the value of the rptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueIdentification1Choice }
     *     
     */
    public SecuritiesMarketReportHeader1 setRptgNtty(TradingVenueIdentification1Choice value) {
        this.rptgNtty = value;
        return this;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public SecuritiesMarketReportHeader1 setRptgPrd(Period4Choice value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the submissnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getSubmissnDtTm() {
        return submissnDtTm;
    }

    /**
     * Sets the value of the submissnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesMarketReportHeader1 setSubmissnDtTm(XMLGregorianCalendar value) {
        this.submissnDtTm = value;
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
