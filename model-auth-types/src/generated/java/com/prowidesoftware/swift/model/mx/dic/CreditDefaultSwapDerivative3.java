
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
 * Credit default swap derivative specific for reporting derivatives on a credit default swap index.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapDerivative3", propOrder = {
    "undrlygIndxId",
    "indxNm",
    "indx"
})
public class CreditDefaultSwapDerivative3 {

    @XmlElement(name = "UndrlygIndxId")
    protected String undrlygIndxId;
    @XmlElement(name = "IndxNm", required = true)
    protected String indxNm;
    @XmlElement(name = "Indx", required = true)
    protected CreditDefaultSwapIndex2 indx;

    /**
     * Gets the value of the undrlygIndxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndrlygIndxId() {
        return undrlygIndxId;
    }

    /**
     * Sets the value of the undrlygIndxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDefaultSwapDerivative3 setUndrlygIndxId(String value) {
        this.undrlygIndxId = value;
        return this;
    }

    /**
     * Gets the value of the indxNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndxNm() {
        return indxNm;
    }

    /**
     * Sets the value of the indxNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDefaultSwapDerivative3 setIndxNm(String value) {
        this.indxNm = value;
        return this;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapIndex2 }
     *     
     */
    public CreditDefaultSwapIndex2 getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapIndex2 }
     *     
     */
    public CreditDefaultSwapDerivative3 setIndx(CreditDefaultSwapIndex2 value) {
        this.indx = value;
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
