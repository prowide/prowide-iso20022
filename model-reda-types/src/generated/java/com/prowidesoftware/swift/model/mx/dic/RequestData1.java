
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
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
    @XmlElement(name = "ReqdActvtnDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate reqdActvtnDt;
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
     *     {@link String }
     *     
     */
    public LocalDate getReqdActvtnDt() {
        return reqdActvtnDt;
    }

    /**
     * Sets the value of the reqdActvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestData1 setReqdActvtnDt(LocalDate value) {
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
