
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides more details on the response such as the response type, the collateral identification, and optionally further details in case of rejection.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCollateralResponse2", propOrder = {
    "rspnTp",
    "collId",
    "asstNb",
    "rjctnRsn",
    "rjctnInf"
})
public class OtherCollateralResponse2 {

    @XmlElement(name = "RspnTp", required = true)
    @XmlSchemaType(name = "string")
    protected Status4Code rspnTp;
    @XmlElement(name = "CollId")
    protected String collId;
    @XmlElement(name = "AsstNb")
    protected String asstNb;
    @XmlElement(name = "RjctnRsn")
    @XmlSchemaType(name = "string")
    protected RejectionReasonV021Code rjctnRsn;
    @XmlElement(name = "RjctnInf")
    protected String rjctnInf;

    /**
     * Gets the value of the rspnTp property.
     * 
     * @return
     *     possible object is
     *     {@link Status4Code }
     *     
     */
    public Status4Code getRspnTp() {
        return rspnTp;
    }

    /**
     * Sets the value of the rspnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status4Code }
     *     
     */
    public OtherCollateralResponse2 setRspnTp(Status4Code value) {
        this.rspnTp = value;
        return this;
    }

    /**
     * Gets the value of the collId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollId() {
        return collId;
    }

    /**
     * Sets the value of the collId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherCollateralResponse2 setCollId(String value) {
        this.collId = value;
        return this;
    }

    /**
     * Gets the value of the asstNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsstNb() {
        return asstNb;
    }

    /**
     * Sets the value of the asstNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherCollateralResponse2 setAsstNb(String value) {
        this.asstNb = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReasonV021Code }
     *     
     */
    public RejectionReasonV021Code getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReasonV021Code }
     *     
     */
    public OtherCollateralResponse2 setRjctnRsn(RejectionReasonV021Code value) {
        this.rjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctnInf() {
        return rjctnInf;
    }

    /**
     * Sets the value of the rjctnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherCollateralResponse2 setRjctnInf(String value) {
        this.rjctnInf = value;
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
