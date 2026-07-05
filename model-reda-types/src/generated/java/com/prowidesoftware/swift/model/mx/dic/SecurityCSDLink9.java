
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
 * Defines how the CSD is linked to the security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCSDLink9", propOrder = {
    "finInstrmId",
    "issrInvstrCSD",
    "vldFr"
})
public class SecurityCSDLink9 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "IssrInvstrCSD", required = true)
    protected IssuerOrInvestor2Choice issrInvstrCSD;
    @XmlElement(name = "VldFr", required = true)
    protected DateAndDateTime2Choice vldFr;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityCSDLink9 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the issrInvstrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerOrInvestor2Choice }
     *     
     */
    public IssuerOrInvestor2Choice getIssrInvstrCSD() {
        return issrInvstrCSD;
    }

    /**
     * Sets the value of the issrInvstrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerOrInvestor2Choice }
     *     
     */
    public SecurityCSDLink9 setIssrInvstrCSD(IssuerOrInvestor2Choice value) {
        this.issrInvstrCSD = value;
        return this;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public SecurityCSDLink9 setVldFr(DateAndDateTime2Choice value) {
        this.vldFr = value;
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
