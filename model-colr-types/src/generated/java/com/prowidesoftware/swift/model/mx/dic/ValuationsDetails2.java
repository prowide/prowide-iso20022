
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Valuation details for the cash position.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationsDetails2", propOrder = {
    "valtnDtlsAmt",
    "hrcut"
})
public class ValuationsDetails2 {

    @XmlElement(name = "ValtnDtlsAmt", required = true)
    protected List<CollateralAmount9> valtnDtlsAmt;
    @XmlElement(name = "Hrcut", required = true)
    protected BigDecimal hrcut;

    /**
     * Gets the value of the valtnDtlsAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valtnDtlsAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValtnDtlsAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralAmount9 }
     * 
     * 
     * @return
     *     The value of the valtnDtlsAmt property.
     */
    public List<CollateralAmount9> getValtnDtlsAmt() {
        if (valtnDtlsAmt == null) {
            valtnDtlsAmt = new ArrayList<>();
        }
        return this.valtnDtlsAmt;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ValuationsDetails2 setHrcut(BigDecimal value) {
        this.hrcut = value;
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

    /**
     * Adds a new item to the valtnDtlsAmt list.
     * @see #getValtnDtlsAmt()
     * 
     */
    public ValuationsDetails2 addValtnDtlsAmt(CollateralAmount9 valtnDtlsAmt) {
        getValtnDtlsAmt().add(valtnDtlsAmt);
        return this;
    }

}
