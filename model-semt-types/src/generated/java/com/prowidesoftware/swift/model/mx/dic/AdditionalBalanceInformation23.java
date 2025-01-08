
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
 * Sub-balances providing additional information on a specific position but that is not to be accounted for in the building of the aggregate balance, for example, registered.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalBalanceInformation23", propOrder = {
    "subBalTp",
    "qty",
    "subBalAddtlDtls"
})
public class AdditionalBalanceInformation23 {

    @XmlElement(name = "SubBalTp", required = true)
    protected SubBalanceType14Choice subBalTp;
    @XmlElement(name = "Qty", required = true)
    protected SubBalanceQuantity9Choice qty;
    @XmlElement(name = "SubBalAddtlDtls")
    protected String subBalAddtlDtls;

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceType14Choice }
     *     
     */
    public SubBalanceType14Choice getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceType14Choice }
     *     
     */
    public AdditionalBalanceInformation23 setSubBalTp(SubBalanceType14Choice value) {
        this.subBalTp = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceQuantity9Choice }
     *     
     */
    public SubBalanceQuantity9Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceQuantity9Choice }
     *     
     */
    public AdditionalBalanceInformation23 setQty(SubBalanceQuantity9Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the subBalAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBalAddtlDtls() {
        return subBalAddtlDtls;
    }

    /**
     * Sets the value of the subBalAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalBalanceInformation23 setSubBalAddtlDtls(String value) {
        this.subBalAddtlDtls = value;
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
