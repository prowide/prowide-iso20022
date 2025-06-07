
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
 * Provides details on the status (that is accept or reject) of the CollateralManagementCancellationRequest message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralCancellationStatus2", propOrder = {
    "collStsCd",
    "addtlInf",
    "rjctnDtls"
})
public class CollateralCancellationStatus2 {

    @XmlElement(name = "CollStsCd", required = true)
    @XmlSchemaType(name = "string")
    protected Status4Code collStsCd;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "RjctnDtls")
    protected RejectionStatus3 rjctnDtls;

    /**
     * Gets the value of the collStsCd property.
     * 
     * @return
     *     possible object is
     *     {@link Status4Code }
     *     
     */
    public Status4Code getCollStsCd() {
        return collStsCd;
    }

    /**
     * Sets the value of the collStsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status4Code }
     *     
     */
    public CollateralCancellationStatus2 setCollStsCd(Status4Code value) {
        this.collStsCd = value;
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
    public CollateralCancellationStatus2 setAddtlInf(String value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the rjctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus3 }
     *     
     */
    public RejectionStatus3 getRjctnDtls() {
        return rjctnDtls;
    }

    /**
     * Sets the value of the rjctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus3 }
     *     
     */
    public CollateralCancellationStatus2 setRjctnDtls(RejectionStatus3 value) {
        this.rjctnDtls = value;
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
