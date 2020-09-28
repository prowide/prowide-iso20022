
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
 * Traded venue related fields.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingVenueAttributes1", propOrder = {
    "id",
    "issrReq",
    "admssnApprvlDtByIssr",
    "reqForAdmssnDt",
    "frstTradDt",
    "termntnDt"
})
public class TradingVenueAttributes1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IssrReq")
    protected boolean issrReq;
    @XmlElement(name = "AdmssnApprvlDtByIssr")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar admssnApprvlDtByIssr;
    @XmlElement(name = "ReqForAdmssnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqForAdmssnDt;
    @XmlElement(name = "FrstTradDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frstTradDt;
    @XmlElement(name = "TermntnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar termntnDt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingVenueAttributes1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the issrReq property.
     * 
     */
    public boolean isIssrReq() {
        return issrReq;
    }

    /**
     * Sets the value of the issrReq property.
     * 
     */
    public TradingVenueAttributes1 setIssrReq(boolean value) {
        this.issrReq = value;
        return this;
    }

    /**
     * Gets the value of the admssnApprvlDtByIssr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdmssnApprvlDtByIssr() {
        return admssnApprvlDtByIssr;
    }

    /**
     * Sets the value of the admssnApprvlDtByIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TradingVenueAttributes1 setAdmssnApprvlDtByIssr(XMLGregorianCalendar value) {
        this.admssnApprvlDtByIssr = value;
        return this;
    }

    /**
     * Gets the value of the reqForAdmssnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqForAdmssnDt() {
        return reqForAdmssnDt;
    }

    /**
     * Sets the value of the reqForAdmssnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TradingVenueAttributes1 setReqForAdmssnDt(XMLGregorianCalendar value) {
        this.reqForAdmssnDt = value;
        return this;
    }

    /**
     * Gets the value of the frstTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrstTradDt() {
        return frstTradDt;
    }

    /**
     * Sets the value of the frstTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TradingVenueAttributes1 setFrstTradDt(XMLGregorianCalendar value) {
        this.frstTradDt = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TradingVenueAttributes1 setTermntnDt(XMLGregorianCalendar value) {
        this.termntnDt = value;
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
