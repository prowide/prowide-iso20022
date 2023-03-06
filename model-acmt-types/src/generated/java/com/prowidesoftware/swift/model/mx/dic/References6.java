
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
@XmlType(name = "References6", propOrder = {
    "rjctdReqTp",
    "rjctnRsn",
    "rjctdReqId",
    "msgId",
    "prcId",
    "attchdDocNm"
})
public class References6 {

    @XmlElement(name = "RjctdReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected UseCases1Code rjctdReqTp;
    @XmlElement(name = "RjctnRsn", required = true)
    protected List<String> rjctnRsn;
    @XmlElement(name = "RjctdReqId", required = true)
    protected MessageIdentification1 rjctdReqId;
    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrcId", required = true)
    protected MessageIdentification1 prcId;
    @XmlElement(name = "AttchdDocNm")
    protected List<String> attchdDocNm;

    /**
     * Gets the value of the rjctdReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link UseCases1Code }
     *     
     */
    public UseCases1Code getRjctdReqTp() {
        return rjctdReqTp;
    }

    /**
     * Sets the value of the rjctdReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCases1Code }
     *     
     */
    public References6 setRjctdReqTp(UseCases1Code value) {
        this.rjctdReqTp = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rjctnRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctnRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRjctnRsn() {
        if (rjctnRsn == null) {
            rjctnRsn = new ArrayList<String>();
        }
        return this.rjctnRsn;
    }

    /**
     * Gets the value of the rjctdReqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRjctdReqId() {
        return rjctdReqId;
    }

    /**
     * Sets the value of the rjctdReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public References6 setRjctdReqId(MessageIdentification1 value) {
        this.rjctdReqId = value;
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
    public References6 setMsgId(MessageIdentification1 value) {
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
    public References6 setPrcId(MessageIdentification1 value) {
        this.prcId = value;
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
     * Adds a new item to the rjctnRsn list.
     * @see #getRjctnRsn()
     * 
     */
    public References6 addRjctnRsn(String rjctnRsn) {
        getRjctnRsn().add(rjctnRsn);
        return this;
    }

    /**
     * Adds a new item to the attchdDocNm list.
     * @see #getAttchdDocNm()
     * 
     */
    public References6 addAttchdDocNm(String attchdDocNm) {
        getAttchdDocNm().add(attchdDocNm);
        return this;
    }

}
