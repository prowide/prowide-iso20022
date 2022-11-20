
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information to display, print or store.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionMessage9", propOrder = {
    "msgDstn",
    "infQlfr",
    "frmt",
    "msgCntt",
    "msgCnttSgntr",
    "outptBrcd",
    "rspnReqrdFlg",
    "minDispTm"
})
public class ActionMessage9 {

    @XmlElement(name = "MsgDstn", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface4Code msgDstn;
    @XmlElement(name = "InfQlfr")
    @XmlSchemaType(name = "string")
    protected InformationQualify1Code infQlfr;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat3Code frmt;
    @XmlElement(name = "MsgCntt")
    protected String msgCntt;
    @XmlElement(name = "MsgCnttSgntr")
    protected ContentInformationType29 msgCnttSgntr;
    @XmlElement(name = "OutptBrcd")
    protected OutputBarcode1 outptBrcd;
    @XmlElement(name = "RspnReqrdFlg")
    protected Boolean rspnReqrdFlg;
    @XmlElement(name = "MinDispTm")
    protected BigDecimal minDispTm;

    /**
     * Gets the value of the msgDstn property.
     * 
     * @return
     *     possible object is
     *     {@link UserInterface4Code }
     *     
     */
    public UserInterface4Code getMsgDstn() {
        return msgDstn;
    }

    /**
     * Sets the value of the msgDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInterface4Code }
     *     
     */
    public ActionMessage9 setMsgDstn(UserInterface4Code value) {
        this.msgDstn = value;
        return this;
    }

    /**
     * Gets the value of the infQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link InformationQualify1Code }
     *     
     */
    public InformationQualify1Code getInfQlfr() {
        return infQlfr;
    }

    /**
     * Sets the value of the infQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationQualify1Code }
     *     
     */
    public ActionMessage9 setInfQlfr(InformationQualify1Code value) {
        this.infQlfr = value;
        return this;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat3Code }
     *     
     */
    public OutputFormat3Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat3Code }
     *     
     */
    public ActionMessage9 setFrmt(OutputFormat3Code value) {
        this.frmt = value;
        return this;
    }

    /**
     * Gets the value of the msgCntt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgCntt() {
        return msgCntt;
    }

    /**
     * Sets the value of the msgCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ActionMessage9 setMsgCntt(String value) {
        this.msgCntt = value;
        return this;
    }

    /**
     * Gets the value of the msgCnttSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType29 }
     *     
     */
    public ContentInformationType29 getMsgCnttSgntr() {
        return msgCnttSgntr;
    }

    /**
     * Sets the value of the msgCnttSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType29 }
     *     
     */
    public ActionMessage9 setMsgCnttSgntr(ContentInformationType29 value) {
        this.msgCnttSgntr = value;
        return this;
    }

    /**
     * Gets the value of the outptBrcd property.
     * 
     * @return
     *     possible object is
     *     {@link OutputBarcode1 }
     *     
     */
    public OutputBarcode1 getOutptBrcd() {
        return outptBrcd;
    }

    /**
     * Sets the value of the outptBrcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputBarcode1 }
     *     
     */
    public ActionMessage9 setOutptBrcd(OutputBarcode1 value) {
        this.outptBrcd = value;
        return this;
    }

    /**
     * Gets the value of the rspnReqrdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRspnReqrdFlg() {
        return rspnReqrdFlg;
    }

    /**
     * Sets the value of the rspnReqrdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ActionMessage9 setRspnReqrdFlg(Boolean value) {
        this.rspnReqrdFlg = value;
        return this;
    }

    /**
     * Gets the value of the minDispTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinDispTm() {
        return minDispTm;
    }

    /**
     * Sets the value of the minDispTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ActionMessage9 setMinDispTm(BigDecimal value) {
        this.minDispTm = value;
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
