
package com.prowidesoftware.swift.model.mx.dic;

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
 * Reason to reject the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionReason1", propOrder = {
    "rsn",
    "addtlInf",
    "lkdMsgPrvsRef",
    "lkdMsgOthrRef",
    "lkdMsgRltdRef"
})
public class RejectionReason1 {

    @XmlElement(name = "Rsn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageRejectedReason1Code rsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "LkdMsgPrvsRef")
    protected AdditionalReference2 lkdMsgPrvsRef;
    @XmlElement(name = "LkdMsgOthrRef")
    protected AdditionalReference2 lkdMsgOthrRef;
    @XmlElement(name = "LkdMsgRltdRef")
    protected AdditionalReference2 lkdMsgRltdRef;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageRejectedReason1Code }
     *     
     */
    public MessageRejectedReason1Code getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageRejectedReason1Code }
     *     
     */
    public RejectionReason1 setRsn(MessageRejectedReason1Code value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RejectionReason1 setAddtlInf(String value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the lkdMsgPrvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getLkdMsgPrvsRef() {
        return lkdMsgPrvsRef;
    }

    /**
     * Sets the value of the lkdMsgPrvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public RejectionReason1 setLkdMsgPrvsRef(AdditionalReference2 value) {
        this.lkdMsgPrvsRef = value;
        return this;
    }

    /**
     * Gets the value of the lkdMsgOthrRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getLkdMsgOthrRef() {
        return lkdMsgOthrRef;
    }

    /**
     * Sets the value of the lkdMsgOthrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public RejectionReason1 setLkdMsgOthrRef(AdditionalReference2 value) {
        this.lkdMsgOthrRef = value;
        return this;
    }

    /**
     * Gets the value of the lkdMsgRltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getLkdMsgRltdRef() {
        return lkdMsgRltdRef;
    }

    /**
     * Sets the value of the lkdMsgRltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public RejectionReason1 setLkdMsgRltdRef(AdditionalReference2 value) {
        this.lkdMsgRltdRef = value;
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
