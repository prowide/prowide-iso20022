
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * It is used by financial institutions, with their own offices, or with other financial institutions with which they have established bilateral agreements. It is used as an envelope for a specified message included in it.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pain.998.001.01", propOrder = {
    "msgId",
    "rela",
    "prev",
    "othr",
    "prtryDt"
})
public class Pain99800101 {

    @XmlElement(name = "MsgId")
    protected MessageReference msgId;
    @XmlElement(name = "Rela")
    protected MessageReference rela;
    @XmlElement(name = "Prev")
    protected MessageReference prev;
    @XmlElement(name = "Othr")
    protected MessageReference othr;
    @XmlElement(name = "PrtryDt", required = true)
    protected ProprietaryData prtryDt;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public Pain99800101 setMsgId(MessageReference value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rela property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getRela() {
        return rela;
    }

    /**
     * Sets the value of the rela property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public Pain99800101 setRela(MessageReference value) {
        this.rela = value;
        return this;
    }

    /**
     * Gets the value of the prev property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getPrev() {
        return prev;
    }

    /**
     * Sets the value of the prev property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public Pain99800101 setPrev(MessageReference value) {
        this.prev = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public Pain99800101 setOthr(MessageReference value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the prtryDt property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryData }
     *     
     */
    public ProprietaryData getPrtryDt() {
        return prtryDt;
    }

    /**
     * Sets the value of the prtryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryData }
     *     
     */
    public Pain99800101 setPrtryDt(ProprietaryData value) {
        this.prtryDt = value;
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
