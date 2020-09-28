
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
 * Total eligible balance for the corporate action and full and part way period units. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalEligibleBalanceFormat1", propOrder = {
    "bal",
    "fullPrdUnits",
    "partWayPrdUnits"
})
public class TotalEligibleBalanceFormat1 {

    @XmlElement(name = "Bal")
    protected Quantity3Choice bal;
    @XmlElement(name = "FullPrdUnits")
    protected SignedQuantityFormat2 fullPrdUnits;
    @XmlElement(name = "PartWayPrdUnits")
    protected SignedQuantityFormat2 partWayPrdUnits;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3Choice }
     *     
     */
    public Quantity3Choice getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3Choice }
     *     
     */
    public TotalEligibleBalanceFormat1 setBal(Quantity3Choice value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the fullPrdUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getFullPrdUnits() {
        return fullPrdUnits;
    }

    /**
     * Sets the value of the fullPrdUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public TotalEligibleBalanceFormat1 setFullPrdUnits(SignedQuantityFormat2 value) {
        this.fullPrdUnits = value;
        return this;
    }

    /**
     * Gets the value of the partWayPrdUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getPartWayPrdUnits() {
        return partWayPrdUnits;
    }

    /**
     * Sets the value of the partWayPrdUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public TotalEligibleBalanceFormat1 setPartWayPrdUnits(SignedQuantityFormat2 value) {
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
