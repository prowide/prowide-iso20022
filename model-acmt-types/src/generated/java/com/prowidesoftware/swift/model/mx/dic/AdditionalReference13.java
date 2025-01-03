
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
 * Reference to a related message or transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalReference13", propOrder = {
    "ref",
    "refIssr",
    "msgNm"
})
public class AdditionalReference13 {

    @XmlElement(name = "Ref", required = true)
    protected String ref;
    @XmlElement(name = "RefIssr")
    protected PartyIdentification125Choice refIssr;
    @XmlElement(name = "MsgNm")
    protected String msgNm;

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
    public AdditionalReference13 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the refIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getRefIssr() {
        return refIssr;
    }

    /**
     * Sets the value of the refIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public AdditionalReference13 setRefIssr(PartyIdentification125Choice value) {
        this.refIssr = value;
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
    public AdditionalReference13 setMsgNm(String value) {
        this.msgNm = value;
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
