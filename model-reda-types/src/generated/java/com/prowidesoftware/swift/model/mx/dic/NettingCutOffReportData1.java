
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Specifies the meta data associated with a netting cut off report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NettingCutOffReportData1", propOrder = {
    "msgId",
    "creDtTm",
    "rptTp",
    "actvtnDt",
    "netSvcPtcptId",
    "rptSvcr",
    "netSvcTp",
    "msgPgntn"
})
public class NettingCutOffReportData1 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creDtTm;
    @XmlElement(name = "RptTp", required = true)
    protected String rptTp;
    @XmlElement(name = "ActvtnDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar actvtnDt;
    @XmlElement(name = "NetSvcPtcptId")
    protected PartyIdentification73Choice netSvcPtcptId;
    @XmlElement(name = "RptSvcr")
    protected PartyIdentification73Choice rptSvcr;
    @XmlElement(name = "NetSvcTp")
    protected String netSvcTp;
    @XmlElement(name = "MsgPgntn")
    protected Pagination msgPgntn;

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
    public NettingCutOffReportData1 setMsgId(String value) {
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
    public Calendar getCreDtTm() {
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
    public NettingCutOffReportData1 setCreDtTm(Calendar value) {
        this.creDtTm = value;
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
    public NettingCutOffReportData1 setRptTp(String value) {
        this.rptTp = value;
        return this;
    }

    /**
     * Gets the value of the actvtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getActvtnDt() {
        return actvtnDt;
    }

    /**
     * Sets the value of the actvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NettingCutOffReportData1 setActvtnDt(Calendar value) {
        this.actvtnDt = value;
        return this;
    }

    /**
     * Gets the value of the netSvcPtcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getNetSvcPtcptId() {
        return netSvcPtcptId;
    }

    /**
     * Sets the value of the netSvcPtcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public NettingCutOffReportData1 setNetSvcPtcptId(PartyIdentification73Choice value) {
        this.netSvcPtcptId = value;
        return this;
    }

    /**
     * Gets the value of the rptSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getRptSvcr() {
        return rptSvcr;
    }

    /**
     * Sets the value of the rptSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public NettingCutOffReportData1 setRptSvcr(PartyIdentification73Choice value) {
        this.rptSvcr = value;
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
    public NettingCutOffReportData1 setNetSvcTp(String value) {
        this.netSvcTp = value;
        return this;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public NettingCutOffReportData1 setMsgPgntn(Pagination value) {
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
