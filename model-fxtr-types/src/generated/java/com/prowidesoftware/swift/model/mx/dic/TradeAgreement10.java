
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
 * Date and identification of a trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAgreement10", propOrder = {
    "tradDt",
    "orgtrRef",
    "cmonRef",
    "oprTp",
    "oprScp",
    "sttlmSsnIdr",
    "pmtVrssPmtInd"
})
public class TradeAgreement10 {

    @XmlElement(name = "TradDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "OrgtrRef", required = true)
    protected String orgtrRef;
    @XmlElement(name = "CmonRef")
    protected String cmonRef;
    @XmlElement(name = "OprTp")
    protected String oprTp;
    @XmlElement(name = "OprScp")
    protected String oprScp;
    @XmlElement(name = "SttlmSsnIdr")
    protected String sttlmSsnIdr;
    @XmlElement(name = "PmtVrssPmtInd")
    protected Boolean pmtVrssPmtInd;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TradeAgreement10 setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the orgtrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrRef() {
        return orgtrRef;
    }

    /**
     * Sets the value of the orgtrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement10 setOrgtrRef(String value) {
        this.orgtrRef = value;
        return this;
    }

    /**
     * Gets the value of the cmonRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonRef() {
        return cmonRef;
    }

    /**
     * Sets the value of the cmonRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement10 setCmonRef(String value) {
        this.cmonRef = value;
        return this;
    }

    /**
     * Gets the value of the oprTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprTp() {
        return oprTp;
    }

    /**
     * Sets the value of the oprTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement10 setOprTp(String value) {
        this.oprTp = value;
        return this;
    }

    /**
     * Gets the value of the oprScp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprScp() {
        return oprScp;
    }

    /**
     * Sets the value of the oprScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement10 setOprScp(String value) {
        this.oprScp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSsnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmSsnIdr() {
        return sttlmSsnIdr;
    }

    /**
     * Sets the value of the sttlmSsnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement10 setSttlmSsnIdr(String value) {
        this.sttlmSsnIdr = value;
        return this;
    }

    /**
     * Gets the value of the pmtVrssPmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtVrssPmtInd() {
        return pmtVrssPmtInd;
    }

    /**
     * Sets the value of the pmtVrssPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeAgreement10 setPmtVrssPmtInd(Boolean value) {
        this.pmtVrssPmtInd = value;
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
