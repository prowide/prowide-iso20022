
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
 * Provides pre-allocation details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreAllocation1", propOrder = {
    "allcnId",
    "indvAllcnId",
    "allctdQty",
    "allctdSttlmCcy",
    "allcnAcctDtls"
})
public class PreAllocation1 {

    @XmlElement(name = "AllcnId")
    protected String allcnId;
    @XmlElement(name = "IndvAllcnId")
    protected String indvAllcnId;
    @XmlElement(name = "AllctdQty")
    protected FinancialInstrumentQuantityChoice allctdQty;
    @XmlElement(name = "AllctdSttlmCcy")
    protected String allctdSttlmCcy;
    @XmlElement(name = "AllcnAcctDtls")
    protected SecuritiesAccount2 allcnAcctDtls;

    /**
     * Gets the value of the allcnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllcnId() {
        return allcnId;
    }

    /**
     * Sets the value of the allcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PreAllocation1 setAllcnId(String value) {
        this.allcnId = value;
        return this;
    }

    /**
     * Gets the value of the indvAllcnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndvAllcnId() {
        return indvAllcnId;
    }

    /**
     * Sets the value of the indvAllcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PreAllocation1 setIndvAllcnId(String value) {
        this.indvAllcnId = value;
        return this;
    }

    /**
     * Gets the value of the allctdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getAllctdQty() {
        return allctdQty;
    }

    /**
     * Sets the value of the allctdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public PreAllocation1 setAllctdQty(FinancialInstrumentQuantityChoice value) {
        this.allctdQty = value;
        return this;
    }

    /**
     * Gets the value of the allctdSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllctdSttlmCcy() {
        return allctdSttlmCcy;
    }

    /**
     * Sets the value of the allctdSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PreAllocation1 setAllctdSttlmCcy(String value) {
        this.allctdSttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the allcnAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public SecuritiesAccount2 getAllcnAcctDtls() {
        return allcnAcctDtls;
    }

    /**
     * Sets the value of the allcnAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public PreAllocation1 setAllcnAcctDtls(SecuritiesAccount2 value) {
        this.allcnAcctDtls = value;
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
