
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Set of elements for the identification of the message and related references.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References5", propOrder = {
    "reqTp",
    "msgId",
    "prcId",
    "ackdMsgId",
    "sts",
    "attchdDocNm"
})
public class References5 {

    @XmlElement(name = "ReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected UseCases1Code reqTp;
    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrcId", required = true)
    protected MessageIdentification1 prcId;
    @XmlElement(name = "AckdMsgId")
    protected List<MessageIdentification1> ackdMsgId;
    @XmlElement(name = "Sts")
    protected String sts;
    @XmlElement(name = "AttchdDocNm")
    protected List<String> attchdDocNm;

    /**
     * Gets the value of the reqTp property.
     * 
     * @return
     *     possible object is
     *     {@link UseCases1Code }
     *     
     */
    public UseCases1Code getReqTp() {
        return reqTp;
    }

    /**
     * Sets the value of the reqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCases1Code }
     *     
     */
    public References5 setReqTp(UseCases1Code value) {
        this.reqTp = value;
        return this;
    }

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public References5 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the prcId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getPrcId() {
        return prcId;
    }

    /**
     * Sets the value of the prcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public References5 setPrcId(MessageIdentification1 value) {
        this.prcId = value;
        return this;
    }

    /**
     * Gets the value of the ackdMsgId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ackdMsgId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAckdMsgId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageIdentification1 }
     * 
     * 
     */
    public List<MessageIdentification1> getAckdMsgId() {
        if (ackdMsgId == null) {
            ackdMsgId = new ArrayList<MessageIdentification1>();
        }
        return this.ackdMsgId;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References5 setSts(String value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the attchdDocNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attchdDocNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdDocNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttchdDocNm() {
        if (attchdDocNm == null) {
            attchdDocNm = new ArrayList<String>();
        }
        return this.attchdDocNm;
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

    /**
     * Adds a new item to the ackdMsgId list.
     * @see #getAckdMsgId()
     * 
     */
    public References5 addAckdMsgId(MessageIdentification1 ackdMsgId) {
        getAckdMsgId().add(ackdMsgId);
        return this;
    }

    /**
     * Adds a new item to the attchdDocNm list.
     * @see #getAttchdDocNm()
     * 
     */
    public References5 addAttchdDocNm(String attchdDocNm) {
        getAttchdDocNm().add(attchdDocNm);
        return this;
    }

}
