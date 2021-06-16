
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
@XmlType(name = "MemberReport6", propOrder = {
    "mmbId",
    "mmbOrErr"
})
public class MemberReport6 {

    @XmlElement(name = "MmbId", required = true)
    protected MemberIdentification3Choice mmbId;
    @XmlElement(name = "MmbOrErr", required = true)
    protected MemberReportOrError8Choice mmbOrErr;

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link MemberIdentification3Choice }
     *     
     */
    public MemberIdentification3Choice getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberIdentification3Choice }
     *     
     */
    public MemberReport6 setMmbId(MemberIdentification3Choice value) {
        this.mmbId = value;
        return this;
    }

    /**
     * Gets the value of the mmbOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link MemberReportOrError8Choice }
     *     
     */
    public MemberReportOrError8Choice getMmbOrErr() {
        return mmbOrErr;
    }

    /**
     * Sets the value of the mmbOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberReportOrError8Choice }
     *     
     */
    public MemberReport6 setMmbOrErr(MemberReportOrError8Choice value) {
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
