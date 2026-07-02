
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
 * Credit default swap derivative specific for reporting derivatives on a single name.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapDerivative6", propOrder = {
    "undrlygCdtDfltSwpId",
    "oblgtnId",
    "snglNm"
})
public class CreditDefaultSwapDerivative6 {

    @XmlElement(name = "UndrlygCdtDfltSwpId")
    protected String undrlygCdtDfltSwpId;
    @XmlElement(name = "OblgtnId", required = true)
    protected String oblgtnId;
    @XmlElement(name = "SnglNm", required = true)
    protected CreditDefaultSwapSingleName2 snglNm;

    /**
     * Gets the value of the undrlygCdtDfltSwpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndrlygCdtDfltSwpId() {
        return undrlygCdtDfltSwpId;
    }

    /**
     * Sets the value of the undrlygCdtDfltSwpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDefaultSwapDerivative6 setUndrlygCdtDfltSwpId(String value) {
        this.undrlygCdtDfltSwpId = value;
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
    public CreditDefaultSwapDerivative6 setOblgtnId(String value) {
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
    public CreditDefaultSwapDerivative6 setSnglNm(CreditDefaultSwapSingleName2 value) {
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
