
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
 * Choice between BIC and clearing system member identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberIdentificationChoice", propOrder = {
    "bic",
    "clrSysMmbId"
})
public class MemberIdentificationChoice {

    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "ClrSysMmbId")
    protected ClearingSystemMemberIdentificationChoice clrSysMmbId;

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MemberIdentificationChoice setBIC(String value) {
        this.bic = value;
        return this;
    }

    /**
     * Gets the value of the clrSysMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemMemberIdentificationChoice }
     *     
     */
    public ClearingSystemMemberIdentificationChoice getClrSysMmbId() {
        return clrSysMmbId;
    }

    /**
     * Sets the value of the clrSysMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemMemberIdentificationChoice }
     *     
     */
    public MemberIdentificationChoice setClrSysMmbId(ClearingSystemMemberIdentificationChoice value) {
        this.clrSysMmbId = value;
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
