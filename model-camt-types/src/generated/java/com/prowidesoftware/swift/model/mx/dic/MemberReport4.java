
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
@XmlType(name = "MemberReport4", propOrder = {
    "mmbId",
    "mmbOrErr"
})
public class MemberReport4 {

    @XmlElement(name = "MmbId", required = true)
    protected MemberIdentification2Choice mmbId;
    @XmlElement(name = "MmbOrErr", required = true)
    protected MemberReportOrError4Choice mmbOrErr;

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link MemberIdentification2Choice }
     *     
     */
    public MemberIdentification2Choice getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberIdentification2Choice }
     *     
     */
    public MemberReport4 setMmbId(MemberIdentification2Choice value) {
        this.mmbId = value;
        return this;
    }

    /**
     * Gets the value of the mmbOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link MemberReportOrError4Choice }
     *     
     */
    public MemberReportOrError4Choice getMmbOrErr() {
        return mmbOrErr;
    }

    /**
     * Sets the value of the mmbOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberReportOrError4Choice }
     *     
     */
    public MemberReport4 setMmbOrErr(MemberReportOrError4Choice value) {
        this.mmbOrErr = value;
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
