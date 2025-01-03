
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
 * Business reference(s) to one or more relevant messages previously sent by other parties, or by the same party issuing this message.
 * 
 * .
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalMessageAndIssuer1", propOrder = {
    "msgId",
    "msgNmId",
    "orgtrNm"
})
public class OriginalMessageAndIssuer1 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "MsgNmId")
    protected String msgNmId;
    @XmlElement(name = "OrgtrNm")
    protected String orgtrNm;

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
    public OriginalMessageAndIssuer1 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the msgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNmId() {
        return msgNmId;
    }

    /**
     * Sets the value of the msgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalMessageAndIssuer1 setMsgNmId(String value) {
        this.msgNmId = value;
        return this;
    }

    /**
     * Gets the value of the orgtrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrNm() {
        return orgtrNm;
    }

    /**
     * Sets the value of the orgtrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalMessageAndIssuer1 setOrgtrNm(String value) {
        this.orgtrNm = value;
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
