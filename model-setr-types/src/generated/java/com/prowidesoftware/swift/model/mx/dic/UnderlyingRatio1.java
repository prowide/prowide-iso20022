
package com.prowidesoftware.swift.model.mx.dic;

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
 * Related financial instrument into which the security can be converted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingRatio1", propOrder = {
    "undrlygQtyDnmtr",
    "undrlygQtyNmrtr",
    "rltdFinInstrmId"
})
public class UnderlyingRatio1 {

    @XmlElement(name = "UndrlygQtyDnmtr", required = true)
    protected FinancialInstrumentQuantity1Choice undrlygQtyDnmtr;
    @XmlElement(name = "UndrlygQtyNmrtr", required = true)
    protected FinancialInstrumentQuantity1Choice undrlygQtyNmrtr;
    @XmlElement(name = "RltdFinInstrmId")
    protected List<SecurityIdentification14> rltdFinInstrmId;

    /**
     * Gets the value of the undrlygQtyDnmtr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getUndrlygQtyDnmtr() {
        return undrlygQtyDnmtr;
    }

    /**
     * Sets the value of the undrlygQtyDnmtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public UnderlyingRatio1 setUndrlygQtyDnmtr(FinancialInstrumentQuantity1Choice value) {
        this.undrlygQtyDnmtr = value;
        return this;
    }

    /**
     * Gets the value of the undrlygQtyNmrtr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getUndrlygQtyNmrtr() {
        return undrlygQtyNmrtr;
    }

    /**
     * Sets the value of the undrlygQtyNmrtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public UnderlyingRatio1 setUndrlygQtyNmrtr(FinancialInstrumentQuantity1Choice value) {
        this.undrlygQtyNmrtr = value;
        return this;
    }

    /**
     * Gets the value of the rltdFinInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdFinInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification14 }
     * 
     * 
     * @return
     *     The value of the rltdFinInstrmId property.
     */
    public List<SecurityIdentification14> getRltdFinInstrmId() {
        if (rltdFinInstrmId == null) {
            rltdFinInstrmId = new ArrayList<>();
        }
        return this.rltdFinInstrmId;
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
     * Adds a new item to the rltdFinInstrmId list.
     * @see #getRltdFinInstrmId()
     * 
     */
    public UnderlyingRatio1 addRltdFinInstrmId(SecurityIdentification14 rltdFinInstrmId) {
        getRltdFinInstrmId().add(rltdFinInstrmId);
        return this;
    }

}
