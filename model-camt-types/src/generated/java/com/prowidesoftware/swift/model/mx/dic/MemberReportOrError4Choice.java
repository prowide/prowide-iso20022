
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
 * Reports either on a member or a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberReportOrError4Choice", propOrder = {
    "mmb",
    "bizErr"
})
public class MemberReportOrError4Choice {

    @XmlElement(name = "Mmb")
    protected Member4 mmb;
    @XmlElement(name = "BizErr")
    protected ErrorHandling3 bizErr;

    /**
     * Gets the value of the mmb property.
     * 
     * @return
     *     possible object is
     *     {@link Member4 }
     *     
     */
    public Member4 getMmb() {
        return mmb;
    }

    /**
     * Sets the value of the mmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member4 }
     *     
     */
    public MemberReportOrError4Choice setMmb(Member4 value) {
        this.mmb = value;
        return this;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public MemberReportOrError4Choice setBizErr(ErrorHandling3 value) {
        this.bizErr = value;
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
