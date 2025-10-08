
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "UnderlyingRatio2", propOrder = {
    "undrlygQtyDnmtr",
    "undrlygQtyNmrtr",
    "rltdFinInstrmId"
})
public class UnderlyingRatio2 {

    @XmlElement(name = "UndrlygQtyDnmtr", required = true)
    protected FinancialInstrumentQuantity1Choice undrlygQtyDnmtr;
    @XmlElement(name = "UndrlygQtyNmrtr", required = true)
    protected FinancialInstrumentQuantity1Choice undrlygQtyNmrtr;
    @XmlElement(name = "RltdFinInstrmId")
    protected List<SecurityIdentification19> rltdFinInstrmId;

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
    public UnderlyingRatio2 setUndrlygQtyDnmtr(FinancialInstrumentQuantity1Choice value) {
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
    public UnderlyingRatio2 setUndrlygQtyNmrtr(FinancialInstrumentQuantity1Choice value) {
        this.undrlygQtyNmrtr = value;
        return this;
    }

    /**
     * Gets the value of the rltdFinInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdFinInstrmId property.
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
     * {@link SecurityIdentification19 }
     * 
     * 
     */
    public List<SecurityIdentification19> getRltdFinInstrmId() {
        if (rltdFinInstrmId == null) {
            rltdFinInstrmId = new ArrayList<SecurityIdentification19>();
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
    public UnderlyingRatio2 addRltdFinInstrmId(SecurityIdentification19 rltdFinInstrmId) {
        getRltdFinInstrmId().add(rltdFinInstrmId);
        return this;
    }

}
