
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
@XmlType(name = "CashCollateralResponse3", propOrder = {
    "rspnTp",
    "collId",
    "asstNb",
    "cshAcctId",
    "rjctnRsn",
    "rjctnInf"
})
public class CashCollateralResponse3 {

    @XmlElement(name = "RspnTp", required = true)
    @XmlSchemaType(name = "string")
    protected Status4Code rspnTp;
    @XmlElement(name = "CollId")
    protected String collId;
    @XmlElement(name = "AsstNb")
    protected String asstNb;
    @XmlElement(name = "CshAcctId")
    protected AccountIdentification4Choice cshAcctId;
    @XmlElement(name = "RjctnRsn")
    @XmlSchemaType(name = "string")
    protected RejectionReason68Code rjctnRsn;
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
    public CashCollateralResponse3 setRspnTp(Status4Code value) {
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
    public CashCollateralResponse3 setCollId(String value) {
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
    public CashCollateralResponse3 setAsstNb(String value) {
        this.asstNb = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCshAcctId() {
        return cshAcctId;
    }

    /**
     * Sets the value of the cshAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public CashCollateralResponse3 setCshAcctId(AccountIdentification4Choice value) {
        this.cshAcctId = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason68Code }
     *     
     */
    public RejectionReason68Code getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason68Code }
     *     
     */
    public CashCollateralResponse3 setRjctnRsn(RejectionReason68Code value) {
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
    public CashCollateralResponse3 setRjctnInf(String value) {
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
