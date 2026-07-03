
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
 * Provides details related to the status of the order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAndReason10", propOrder = {
    "affirmSts",
    "uaffrmdRsn",
    "addtlRsnInf"
})
public class StatusAndReason10 {

    @XmlElement(name = "AffirmSts", required = true)
    protected AffirmationStatus7Choice affirmSts;
    @XmlElement(name = "UaffrmdRsn")
    protected UnaffirmedReason2Choice uaffrmdRsn;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus7Choice }
     *     
     */
    public AffirmationStatus7Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus7Choice }
     *     
     */
    public StatusAndReason10 setAffirmSts(AffirmationStatus7Choice value) {
        this.affirmSts = value;
        return this;
    }

    /**
     * Gets the value of the uaffrmdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link UnaffirmedReason2Choice }
     *     
     */
    public UnaffirmedReason2Choice getUaffrmdRsn() {
        return uaffrmdRsn;
    }

    /**
     * Sets the value of the uaffrmdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnaffirmedReason2Choice }
     *     
     */
    public StatusAndReason10 setUaffrmdRsn(UnaffirmedReason2Choice value) {
        this.uaffrmdRsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Sets the value of the addtlRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusAndReason10 setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
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
