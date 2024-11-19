
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
 * Total eligible balance for the corporate action and full and part way period units.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalEligibleBalanceFormat4", propOrder = {
    "bal",
    "fullPrdUnits",
    "partWayPrdUnits"
})
public class TotalEligibleBalanceFormat4 {

    @XmlElement(name = "Bal")
    protected Quantity15Choice bal;
    @XmlElement(name = "FullPrdUnits")
    protected SignedQuantityFormat5 fullPrdUnits;
    @XmlElement(name = "PartWayPrdUnits")
    protected SignedQuantityFormat5 partWayPrdUnits;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity15Choice }
     *     
     */
    public Quantity15Choice getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity15Choice }
     *     
     */
    public TotalEligibleBalanceFormat4 setBal(Quantity15Choice value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the fullPrdUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat5 }
     *     
     */
    public SignedQuantityFormat5 getFullPrdUnits() {
        return fullPrdUnits;
    }

    /**
     * Sets the value of the fullPrdUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat5 }
     *     
     */
    public TotalEligibleBalanceFormat4 setFullPrdUnits(SignedQuantityFormat5 value) {
        this.fullPrdUnits = value;
        return this;
    }

    /**
     * Gets the value of the partWayPrdUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat5 }
     *     
     */
    public SignedQuantityFormat5 getPartWayPrdUnits() {
        return partWayPrdUnits;
    }

    /**
     * Sets the value of the partWayPrdUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat5 }
     *     
     */
    public TotalEligibleBalanceFormat4 setPartWayPrdUnits(SignedQuantityFormat5 value) {
        this.partWayPrdUnits = value;
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
