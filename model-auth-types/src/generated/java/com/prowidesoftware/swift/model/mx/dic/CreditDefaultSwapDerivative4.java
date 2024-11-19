
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
 * Credit default swap derivative specific for reporting derivatives on a single name.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapDerivative4", propOrder = {
    "undrlygNmId",
    "oblgtnId",
    "snglNm"
})
public class CreditDefaultSwapDerivative4 {

    @XmlElement(name = "UndrlygNmId")
    protected String undrlygNmId;
    @XmlElement(name = "OblgtnId", required = true)
    protected String oblgtnId;
    @XmlElement(name = "SnglNm", required = true)
    protected CreditDefaultSwapSingleName2 snglNm;

    /**
     * Gets the value of the undrlygNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndrlygNmId() {
        return undrlygNmId;
    }

    /**
     * Sets the value of the undrlygNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDefaultSwapDerivative4 setUndrlygNmId(String value) {
        this.undrlygNmId = value;
        return this;
    }

    /**
     * Gets the value of the oblgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblgtnId() {
        return oblgtnId;
    }

    /**
     * Sets the value of the oblgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDefaultSwapDerivative4 setOblgtnId(String value) {
        this.oblgtnId = value;
        return this;
    }

    /**
     * Gets the value of the snglNm property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapSingleName2 }
     *     
     */
    public CreditDefaultSwapSingleName2 getSnglNm() {
        return snglNm;
    }

    /**
     * Sets the value of the snglNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapSingleName2 }
     *     
     */
    public CreditDefaultSwapDerivative4 setSnglNm(CreditDefaultSwapSingleName2 value) {
        this.snglNm = value;
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
