
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Business reference(s) to one or more relevant messages previously sent by other parties, or by the same party issuing this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageReference1", propOrder = {
    "ref",
    "msgNm",
    "refIssr"
})
public class MessageReference1 {

    @XmlElement(name = "Ref", required = true)
    protected String ref;
    @XmlElement(name = "MsgNm")
    protected String msgNm;
    @XmlElement(name = "RefIssr")
    protected PartyIdentification136 refIssr;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageReference1 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the msgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNm() {
        return msgNm;
    }

    /**
     * Sets the value of the msgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageReference1 setMsgNm(String value) {
        this.msgNm = value;
        return this;
    }

    /**
     * Gets the value of the refIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getRefIssr() {
        return refIssr;
    }

    /**
     * Sets the value of the refIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public MessageReference1 setRefIssr(PartyIdentification136 value) {
        this.refIssr = value;
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
