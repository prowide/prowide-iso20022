
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of confirmation in the CMU.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Confirmation1", propOrder = {
    "confSts",
    "confTm",
    "tradPtyConfTm",
    "initgPtyConfTm",
    "confTp",
    "reqId",
    "qryStartNb",
    "ttlNbOfRpts",
    "pgNb",
    "qryPgNb",
    "msgNbOfCurPg",
    "listOrdrNb",
    "lastPgInd",
    "lastRptReqd"
})
public class Confirmation1 {

    @XmlElement(name = "ConfSts", required = true)
    @XmlSchemaType(name = "string")
    protected TradeConfirmationStatus1Code confSts;
    @XmlElement(name = "ConfTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confTm;
    @XmlElement(name = "TradPtyConfTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradPtyConfTm;
    @XmlElement(name = "InitgPtyConfTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initgPtyConfTm;
    @XmlElement(name = "ConfTp", required = true)
    @XmlSchemaType(name = "string")
    protected ConfirmationRequest1Code confTp;
    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "QryStartNb", required = true)
    protected String qryStartNb;
    @XmlElement(name = "TtlNbOfRpts", required = true)
    protected BigDecimal ttlNbOfRpts;
    @XmlElement(name = "PgNb", required = true)
    protected String pgNb;
    @XmlElement(name = "QryPgNb", required = true)
    protected String qryPgNb;
    @XmlElement(name = "MsgNbOfCurPg", required = true)
    protected BigDecimal msgNbOfCurPg;
    @XmlElement(name = "ListOrdrNb", required = true)
    protected BigDecimal listOrdrNb;
    @XmlElement(name = "LastPgInd")
    protected boolean lastPgInd;
    @XmlElement(name = "LastRptReqd")
    protected boolean lastRptReqd;

    /**
     * Gets the value of the confSts property.
     * 
     * @return
     *     possible object is
     *     {@link TradeConfirmationStatus1Code }
     *     
     */
    public TradeConfirmationStatus1Code getConfSts() {
        return confSts;
    }

    /**
     * Sets the value of the confSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeConfirmationStatus1Code }
     *     
     */
    public Confirmation1 setConfSts(TradeConfirmationStatus1Code value) {
        this.confSts = value;
        return this;
    }

    /**
     * Gets the value of the confTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getConfTm() {
        return confTm;
    }

    /**
     * Sets the value of the confTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Confirmation1 setConfTm(XMLGregorianCalendar value) {
        this.confTm = value;
        return this;
    }

    /**
     * Gets the value of the tradPtyConfTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTradPtyConfTm() {
        return tradPtyConfTm;
    }

    /**
     * Sets the value of the tradPtyConfTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Confirmation1 setTradPtyConfTm(XMLGregorianCalendar value) {
        this.tradPtyConfTm = value;
        return this;
    }

    /**
     * Gets the value of the initgPtyConfTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getInitgPtyConfTm() {
        return initgPtyConfTm;
    }

    /**
     * Sets the value of the initgPtyConfTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Confirmation1 setInitgPtyConfTm(XMLGregorianCalendar value) {
        this.initgPtyConfTm = value;
        return this;
    }

    /**
     * Gets the value of the confTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationRequest1Code }
     *     
     */
    public ConfirmationRequest1Code getConfTp() {
        return confTp;
    }

    /**
     * Sets the value of the confTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationRequest1Code }
     *     
     */
    public Confirmation1 setConfTp(ConfirmationRequest1Code value) {
        this.confTp = value;
        return this;
    }

    /**
     * Gets the value of the reqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getReqId() {
        return reqId;
    }

    /**
     * Sets the value of the reqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Confirmation1 setReqId(MessageIdentification1 value) {
        this.reqId = value;
        return this;
    }

    /**
     * Gets the value of the qryStartNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryStartNb() {
        return qryStartNb;
    }

    /**
     * Sets the value of the qryStartNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Confirmation1 setQryStartNb(String value) {
        this.qryStartNb = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfRpts() {
        return ttlNbOfRpts;
    }

    /**
     * Sets the value of the ttlNbOfRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Confirmation1 setTtlNbOfRpts(BigDecimal value) {
        this.ttlNbOfRpts = value;
        return this;
    }

    /**
     * Gets the value of the pgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgNb() {
        return pgNb;
    }

    /**
     * Sets the value of the pgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Confirmation1 setPgNb(String value) {
        this.pgNb = value;
        return this;
    }

    /**
     * Gets the value of the qryPgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryPgNb() {
        return qryPgNb;
    }

    /**
     * Sets the value of the qryPgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Confirmation1 setQryPgNb(String value) {
        this.qryPgNb = value;
        return this;
    }

    /**
     * Gets the value of the msgNbOfCurPg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMsgNbOfCurPg() {
        return msgNbOfCurPg;
    }

    /**
     * Sets the value of the msgNbOfCurPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Confirmation1 setMsgNbOfCurPg(BigDecimal value) {
        this.msgNbOfCurPg = value;
        return this;
    }

    /**
     * Gets the value of the listOrdrNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getListOrdrNb() {
        return listOrdrNb;
    }

    /**
     * Sets the value of the listOrdrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Confirmation1 setListOrdrNb(BigDecimal value) {
        this.listOrdrNb = value;
        return this;
    }

    /**
     * Gets the value of the lastPgInd property.
     * 
     */
    public boolean isLastPgInd() {
        return lastPgInd;
    }

    /**
     * Sets the value of the lastPgInd property.
     * 
     */
    public Confirmation1 setLastPgInd(boolean value) {
        this.lastPgInd = value;
        return this;
    }

    /**
     * Gets the value of the lastRptReqd property.
     * 
     */
    public boolean isLastRptReqd() {
        return lastRptReqd;
    }

    /**
     * Sets the value of the lastRptReqd property.
     * 
     */
    public Confirmation1 setLastRptReqd(boolean value) {
        this.lastRptReqd = value;
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
