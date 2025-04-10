
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Proprietary quantity format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryQuantity2", propOrder = {
    "qty",
    "qtyTp",
    "issr",
    "schmeNm"
})
public class ProprietaryQuantity2 {

    @XmlElement(name = "Qty", required = true)
    protected BigDecimal qty;
    @XmlElement(name = "QtyTp", required = true)
    protected String qtyTp;
    @XmlElement(name = "Issr", required = true)
    protected String issr;
    @XmlElement(name = "SchmeNm")
    protected String schmeNm;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ProprietaryQuantity2 setQty(BigDecimal value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the qtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtyTp() {
        return qtyTp;
    }

    /**
     * Sets the value of the qtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProprietaryQuantity2 setQtyTp(String value) {
        this.qtyTp = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProprietaryQuantity2 setIssr(String value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the schmeNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmeNm() {
        return schmeNm;
    }

    /**
     * Sets the value of the schmeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProprietaryQuantity2 setSchmeNm(String value) {
        this.schmeNm = value;
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
