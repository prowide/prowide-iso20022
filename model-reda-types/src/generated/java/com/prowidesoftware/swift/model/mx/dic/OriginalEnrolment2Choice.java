
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
 * Specifies the enrolment details which is referenced.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalEnrolment2Choice", propOrder = {
    "orgnlCdtrId",
    "orgnlEnrlmntData"
})
public class OriginalEnrolment2Choice {

    @XmlElement(name = "OrgnlCdtrId")
    protected Party49Choice orgnlCdtrId;
    @XmlElement(name = "OrgnlEnrlmntData")
    protected CreditorEnrolment3 orgnlEnrlmntData;

    /**
     * Gets the value of the orgnlCdtrId property.
     * 
     * @return
     *     possible object is
     *     {@link Party49Choice }
     *     
     */
    public Party49Choice getOrgnlCdtrId() {
        return orgnlCdtrId;
    }

    /**
     * Sets the value of the orgnlCdtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party49Choice }
     *     
     */
    public OriginalEnrolment2Choice setOrgnlCdtrId(Party49Choice value) {
        this.orgnlCdtrId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlEnrlmntData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorEnrolment3 }
     *     
     */
    public CreditorEnrolment3 getOrgnlEnrlmntData() {
        return orgnlEnrlmntData;
    }

    /**
     * Sets the value of the orgnlEnrlmntData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorEnrolment3 }
     *     
     */
    public OriginalEnrolment2Choice setOrgnlEnrlmntData(CreditorEnrolment3 value) {
        this.orgnlEnrlmntData = value;
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
