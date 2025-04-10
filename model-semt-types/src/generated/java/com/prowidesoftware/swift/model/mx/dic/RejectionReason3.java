
package com.prowidesoftware.swift.model.mx.dic;

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
 * Reason to reject the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionReason3", propOrder = {
    "rsn",
    "addtlInf",
    "lkdMsgPrvsRef",
    "lkdMsgOthrRef",
    "lkdMsgRltdRef"
})
public class RejectionReason3 {

    @XmlElement(name = "Rsn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageRejectedReason1Code rsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "LkdMsgPrvsRef")
    protected AdditionalReference3 lkdMsgPrvsRef;
    @XmlElement(name = "LkdMsgOthrRef")
    protected AdditionalReference3 lkdMsgOthrRef;
    @XmlElement(name = "LkdMsgRltdRef")
    protected AdditionalReference3 lkdMsgRltdRef;

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
    public RejectionReason3 setRsn(MessageRejectedReason1Code value) {
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
    public RejectionReason3 setAddtlInf(String value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the lkdMsgPrvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getLkdMsgPrvsRef() {
        return lkdMsgPrvsRef;
    }

    /**
     * Sets the value of the lkdMsgPrvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public RejectionReason3 setLkdMsgPrvsRef(AdditionalReference3 value) {
        this.lkdMsgPrvsRef = value;
        return this;
    }

    /**
     * Gets the value of the lkdMsgOthrRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getLkdMsgOthrRef() {
        return lkdMsgOthrRef;
    }

    /**
     * Sets the value of the lkdMsgOthrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public RejectionReason3 setLkdMsgOthrRef(AdditionalReference3 value) {
        this.lkdMsgOthrRef = value;
        return this;
    }

    /**
     * Gets the value of the lkdMsgRltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getLkdMsgRltdRef() {
        return lkdMsgRltdRef;
    }

    /**
     * Sets the value of the lkdMsgRltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public RejectionReason3 setLkdMsgRltdRef(AdditionalReference3 value) {
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
