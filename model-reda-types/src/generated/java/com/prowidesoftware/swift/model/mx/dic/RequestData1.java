
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
 * Contains the meta data for a netting cut off update request: message identification, request servicer and a request type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestData1", propOrder = {
    "msgId",
    "reqTp",
    "reqdActvtnDt",
    "reqSvcr",
    "netSvcPtcptId",
    "netSvcTp"
})
public class RequestData1 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "ReqTp", required = true)
    protected String reqTp;
    @XmlElement(name = "ReqdActvtnDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdActvtnDt;
    @XmlElement(name = "ReqSvcr")
    protected PartyIdentification73Choice reqSvcr;
    @XmlElement(name = "NetSvcPtcptId", required = true)
    protected PartyIdentification73Choice netSvcPtcptId;
    @XmlElement(name = "NetSvcTp")
    protected String netSvcTp;

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
    public RequestData1 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the reqTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqTp() {
        return reqTp;
    }

    /**
     * Sets the value of the reqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestData1 setReqTp(String value) {
        this.reqTp = value;
        return this;
    }

    /**
     * Gets the value of the reqdActvtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdActvtnDt() {
        return reqdActvtnDt;
    }

    /**
     * Sets the value of the reqdActvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public RequestData1 setReqdActvtnDt(XMLGregorianCalendar value) {
        this.reqdActvtnDt = value;
        return this;
    }

    /**
     * Gets the value of the reqSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getReqSvcr() {
        return reqSvcr;
    }

    /**
     * Sets the value of the reqSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public RequestData1 setReqSvcr(PartyIdentification73Choice value) {
        this.reqSvcr = value;
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
    public RequestData1 setNetSvcPtcptId(PartyIdentification73Choice value) {
        this.netSvcPtcptId = value;
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
    public RequestData1 setNetSvcTp(String value) {
        this.netSvcTp = value;
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
