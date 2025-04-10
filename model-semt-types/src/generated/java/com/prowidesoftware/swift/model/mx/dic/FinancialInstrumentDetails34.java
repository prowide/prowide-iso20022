
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
 * Reporting per financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentDetails34", propOrder = {
    "finInstrmId",
    "finInstrmAttrbts",
    "subBal"
})
public class FinancialInstrumentDetails34 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes92 finInstrmAttrbts;
    @XmlElement(name = "SubBal", required = true)
    protected List<IntraPositionDetails51> subBal;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public FinancialInstrumentDetails34 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes92 }
     *     
     */
    public FinancialInstrumentAttributes92 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes92 }
     *     
     */
    public FinancialInstrumentDetails34 setFinInstrmAttrbts(FinancialInstrumentAttributes92 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the subBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraPositionDetails51 }
     * 
     * 
     * @return
     *     The value of the subBal property.
     */
    public List<IntraPositionDetails51> getSubBal() {
        if (subBal == null) {
            subBal = new ArrayList<>();
        }
        return this.subBal;
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
     * Adds a new item to the subBal list.
     * @see #getSubBal()
     * 
     */
    public FinancialInstrumentDetails34 addSubBal(IntraPositionDetails51 subBal) {
        getSubBal().add(subBal);
        return this;
    }

}
