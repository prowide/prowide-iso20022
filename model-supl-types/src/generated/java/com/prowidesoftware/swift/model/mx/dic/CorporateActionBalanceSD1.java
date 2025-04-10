
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
 * Provides additional information regarding corporate action balance details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionBalanceSD1", propOrder = {
    "plcAndNm",
    "orgnlBal",
    "adjstdBal",
    "upldgdBal",
    "invstmtUpldgdBal",
    "invstmtPldgdBal"
})
public class CorporateActionBalanceSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "OrgnlBal")
    protected SignedQuantityFormat4 orgnlBal;
    @XmlElement(name = "AdjstdBal")
    protected SignedQuantityFormat4 adjstdBal;
    @XmlElement(name = "UpldgdBal")
    protected SignedQuantityFormat4 upldgdBal;
    @XmlElement(name = "InvstmtUpldgdBal")
    protected SignedQuantityFormat4 invstmtUpldgdBal;
    @XmlElement(name = "InvstmtPldgdBal")
    protected SignedQuantityFormat4 invstmtPldgdBal;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionBalanceSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getOrgnlBal() {
        return orgnlBal;
    }

    /**
     * Sets the value of the orgnlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionBalanceSD1 setOrgnlBal(SignedQuantityFormat4 value) {
        this.orgnlBal = value;
        return this;
    }

    /**
     * Gets the value of the adjstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getAdjstdBal() {
        return adjstdBal;
    }

    /**
     * Sets the value of the adjstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionBalanceSD1 setAdjstdBal(SignedQuantityFormat4 value) {
        this.adjstdBal = value;
        return this;
    }

    /**
     * Gets the value of the upldgdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getUpldgdBal() {
        return upldgdBal;
    }

    /**
     * Sets the value of the upldgdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionBalanceSD1 setUpldgdBal(SignedQuantityFormat4 value) {
        this.upldgdBal = value;
        return this;
    }

    /**
     * Gets the value of the invstmtUpldgdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getInvstmtUpldgdBal() {
        return invstmtUpldgdBal;
    }

    /**
     * Sets the value of the invstmtUpldgdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionBalanceSD1 setInvstmtUpldgdBal(SignedQuantityFormat4 value) {
        this.invstmtUpldgdBal = value;
        return this;
    }

    /**
     * Gets the value of the invstmtPldgdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getInvstmtPldgdBal() {
        return invstmtPldgdBal;
    }

    /**
     * Sets the value of the invstmtPldgdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionBalanceSD1 setInvstmtPldgdBal(SignedQuantityFormat4 value) {
        this.invstmtPldgdBal = value;
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
