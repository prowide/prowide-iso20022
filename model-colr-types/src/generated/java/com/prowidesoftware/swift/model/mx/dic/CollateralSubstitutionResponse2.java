
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
 * Provides details about the rejected collateral substitution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralSubstitutionResponse2", propOrder = {
    "collSbstitnReqId",
    "rjctdAmt",
    "rjctnRsn",
    "rjctnRsnInf"
})
public class CollateralSubstitutionResponse2 {

    @XmlElement(name = "CollSbstitnReqId", required = true)
    protected String collSbstitnReqId;
    @XmlElement(name = "RjctdAmt", required = true)
    protected ActiveCurrencyAndAmount rjctdAmt;
    @XmlElement(name = "RjctnRsn", required = true)
    @XmlSchemaType(name = "string")
    protected RejectionReasonV021Code rjctnRsn;
    @XmlElement(name = "RjctnRsnInf")
    protected String rjctnRsnInf;

    /**
     * Gets the value of the collSbstitnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnReqId() {
        return collSbstitnReqId;
    }

    /**
     * Sets the value of the collSbstitnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralSubstitutionResponse2 setCollSbstitnReqId(String value) {
        this.collSbstitnReqId = value;
        return this;
    }

    /**
     * Gets the value of the rjctdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRjctdAmt() {
        return rjctdAmt;
    }

    /**
     * Sets the value of the rjctdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralSubstitutionResponse2 setRjctdAmt(ActiveCurrencyAndAmount value) {
        this.rjctdAmt = value;
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
    public CollateralSubstitutionResponse2 setRjctnRsn(RejectionReasonV021Code value) {
        this.rjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctnRsnInf() {
        return rjctnRsnInf;
    }

    /**
     * Sets the value of the rjctnRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralSubstitutionResponse2 setRjctnRsnInf(String value) {
        this.rjctnRsnInf = value;
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
