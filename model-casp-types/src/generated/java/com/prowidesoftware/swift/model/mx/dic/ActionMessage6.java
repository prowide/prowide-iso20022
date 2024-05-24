
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "ActionMessage6", propOrder = {
    "msgDstn",
    "infQlfr",
    "frmt",
    "msgCntt",
    "msgCnttSgntr",
    "outptBrcd",
    "rspnReqrdFlg",
    "minDispTm"
})
public class ActionMessage6 {

    @XmlElement(name = "MsgDstn", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface4Code msgDstn;
    @XmlElement(name = "InfQlfr")
    @XmlSchemaType(name = "string")
    protected InformationQualify1Code infQlfr;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat3Code frmt;
    @XmlElement(name = "MsgCntt", required = true)
    protected String msgCntt;
    @XmlElement(name = "MsgCnttSgntr")
    protected ContentInformationType18 msgCnttSgntr;
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
    public ActionMessage6 setMsgDstn(UserInterface4Code value) {
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
    public ActionMessage6 setInfQlfr(InformationQualify1Code value) {
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
    public ActionMessage6 setFrmt(OutputFormat3Code value) {
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
    public ActionMessage6 setMsgCntt(String value) {
        this.msgCntt = value;
        return this;
    }

    /**
     * Gets the value of the msgCnttSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType18 }
     *     
     */
    public ContentInformationType18 getMsgCnttSgntr() {
        return msgCnttSgntr;
    }

    /**
     * Sets the value of the msgCnttSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType18 }
     *     
     */
    public ActionMessage6 setMsgCnttSgntr(ContentInformationType18 value) {
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
    public ActionMessage6 setOutptBrcd(OutputBarcode1 value) {
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
    public ActionMessage6 setRspnReqrdFlg(Boolean value) {
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
    public ActionMessage6 setMinDispTm(BigDecimal value) {
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
