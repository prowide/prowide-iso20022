
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
 * Provides information on the status of a trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeData10", propOrder = {
    "msgId",
    "stsOrgtr",
    "curSts",
    "curStsSubTp",
    "curStsDtTm",
    "prvsSts",
    "prvsStsSubTp",
    "pdctTp"
})
public class TradeData10 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "StsOrgtr")
    protected String stsOrgtr;
    @XmlElement(name = "CurSts", required = true)
    protected StatusAndSubStatus1 curSts;
    @XmlElement(name = "CurStsSubTp")
    @XmlSchemaType(name = "string")
    protected StatusSubType1Code curStsSubTp;
    @XmlElement(name = "CurStsDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar curStsDtTm;
    @XmlElement(name = "PrvsSts")
    protected Status5Choice prvsSts;
    @XmlElement(name = "PrvsStsSubTp")
    @XmlSchemaType(name = "string")
    protected StatusSubType1Code prvsStsSubTp;
    @XmlElement(name = "PdctTp")
    protected String pdctTp;

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
    public TradeData10 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the stsOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsOrgtr() {
        return stsOrgtr;
    }

    /**
     * Sets the value of the stsOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData10 setStsOrgtr(String value) {
        this.stsOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the curSts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAndSubStatus1 }
     *     
     */
    public StatusAndSubStatus1 getCurSts() {
        return curSts;
    }

    /**
     * Sets the value of the curSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAndSubStatus1 }
     *     
     */
    public TradeData10 setCurSts(StatusAndSubStatus1 value) {
        this.curSts = value;
        return this;
    }

    /**
     * Gets the value of the curStsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatusSubType1Code }
     *     
     */
    public StatusSubType1Code getCurStsSubTp() {
        return curStsSubTp;
    }

    /**
     * Sets the value of the curStsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusSubType1Code }
     *     
     */
    public TradeData10 setCurStsSubTp(StatusSubType1Code value) {
        this.curStsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the curStsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurStsDtTm() {
        return curStsDtTm;
    }

    /**
     * Sets the value of the curStsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TradeData10 setCurStsDtTm(XMLGregorianCalendar value) {
        this.curStsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the prvsSts property.
     * 
     * @return
     *     possible object is
     *     {@link Status5Choice }
     *     
     */
    public Status5Choice getPrvsSts() {
        return prvsSts;
    }

    /**
     * Sets the value of the prvsSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status5Choice }
     *     
     */
    public TradeData10 setPrvsSts(Status5Choice value) {
        this.prvsSts = value;
        return this;
    }

    /**
     * Gets the value of the prvsStsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatusSubType1Code }
     *     
     */
    public StatusSubType1Code getPrvsStsSubTp() {
        return prvsStsSubTp;
    }

    /**
     * Sets the value of the prvsStsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusSubType1Code }
     *     
     */
    public TradeData10 setPrvsStsSubTp(StatusSubType1Code value) {
        this.prvsStsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the pdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctTp() {
        return pdctTp;
    }

    /**
     * Sets the value of the pdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData10 setPdctTp(String value) {
        this.pdctTp = value;
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
