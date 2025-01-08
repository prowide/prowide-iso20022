
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
 * Provides further details on the reason of the cheque presentment cancellation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChequeCancellationReason1", propOrder = {
    "orgtr",
    "rsn",
    "addtlInf"
})
public class ChequeCancellationReason1 {

    @XmlElement(name = "Orgtr")
    @XmlSchemaType(name = "string")
    protected ChequePartyRole1Code orgtr;
    @XmlElement(name = "Rsn", required = true)
    protected ChequeCancellationReason1Choice rsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link ChequePartyRole1Code }
     *     
     */
    public ChequePartyRole1Code getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequePartyRole1Code }
     *     
     */
    public ChequeCancellationReason1 setOrgtr(ChequePartyRole1Code value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeCancellationReason1Choice }
     *     
     */
    public ChequeCancellationReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeCancellationReason1Choice }
     *     
     */
    public ChequeCancellationReason1 setRsn(ChequeCancellationReason1Choice value) {
        this.rsn = value;
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
    public ChequeCancellationReason1 setAddtlInf(String value) {
        this.addtlInf = value;
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
