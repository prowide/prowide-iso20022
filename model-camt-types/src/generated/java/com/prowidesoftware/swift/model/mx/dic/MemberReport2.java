
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
 * Reports either on a member or a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberReport2", propOrder = {
    "mmbId",
    "bizErr",
    "mmbInf"
})
public class MemberReport2 {

    @XmlElement(name = "MmbId", required = true)
    protected MemberIdentificationChoice mmbId;
    @XmlElement(name = "BizErr")
    protected ErrorHandling3 bizErr;
    @XmlElement(name = "MmbInf")
    protected MemberDetails mmbInf;

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link MemberIdentificationChoice }
     *     
     */
    public MemberIdentificationChoice getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberIdentificationChoice }
     *     
     */
    public MemberReport2 setMmbId(MemberIdentificationChoice value) {
        this.mmbId = value;
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
    public MemberReport2 setBizErr(ErrorHandling3 value) {
        this.bizErr = value;
        return this;
    }

    /**
     * Gets the value of the mmbInf property.
     * 
     * @return
     *     possible object is
     *     {@link MemberDetails }
     *     
     */
    public MemberDetails getMmbInf() {
        return mmbInf;
    }

    /**
     * Sets the value of the mmbInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberDetails }
     *     
     */
    public MemberReport2 setMmbInf(MemberDetails value) {
        this.mmbInf = value;
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
