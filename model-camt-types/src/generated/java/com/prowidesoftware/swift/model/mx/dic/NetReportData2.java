
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the meta data associated with a net report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetReportData2", propOrder = {
    "msgId",
    "creDtTm",
    "netgCutOffTm",
    "rptDt",
    "valDt",
    "rptTp",
    "netRptSvcr",
    "netSvcTp",
    "msgPgntn"
})
public class NetReportData2 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "NetgCutOffTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar netgCutOffTm;
    @XmlElement(name = "RptDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rptDt;
    @XmlElement(name = "ValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "RptTp")
    protected String rptTp;
    @XmlElement(name = "NetRptSvcr")
    protected PartyIdentification242Choice netRptSvcr;
    @XmlElement(name = "NetSvcTp")
    protected String netSvcTp;
    @XmlElement(name = "MsgPgntn")
    protected Pagination1 msgPgntn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetReportData2 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetReportData2 setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the netgCutOffTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getNetgCutOffTm() {
        return netgCutOffTm;
    }

    /**
     * Sets the value of the netgCutOffTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetReportData2 setNetgCutOffTm(XMLGregorianCalendar value) {
        this.netgCutOffTm = value;
        return this;
    }

    /**
     * Gets the value of the rptDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRptDt() {
        return rptDt;
    }

    /**
     * Sets the value of the rptDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetReportData2 setRptDt(XMLGregorianCalendar value) {
        this.rptDt = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetReportData2 setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the rptTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptTp() {
        return rptTp;
    }

    /**
     * Sets the value of the rptTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetReportData2 setRptTp(String value) {
        this.rptTp = value;
        return this;
    }

    /**
     * Gets the value of the netRptSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getNetRptSvcr() {
        return netRptSvcr;
    }

    /**
     * Sets the value of the netRptSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public NetReportData2 setNetRptSvcr(PartyIdentification242Choice value) {
        this.netRptSvcr = value;
        return this;
    }

    /**
     * Gets the value of the netSvcTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetSvcTp() {
        return netSvcTp;
    }

    /**
     * Sets the value of the netSvcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetReportData2 setNetSvcTp(String value) {
        this.netSvcTp = value;
        return this;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public NetReportData2 setMsgPgntn(Pagination1 value) {
        this.msgPgntn = value;
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
