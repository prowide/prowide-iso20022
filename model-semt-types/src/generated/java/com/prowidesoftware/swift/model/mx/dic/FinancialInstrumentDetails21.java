
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
 * Reporting per financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentDetails21", propOrder = {
    "finInstrmId",
    "finInstrmAttrbts",
    "subBal"
})
public class FinancialInstrumentDetails21 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes63 finInstrmAttrbts;
    @XmlElement(name = "SubBal", required = true)
    protected List<IntraPositionDetails32> subBal;

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
    public FinancialInstrumentDetails21 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes63 }
     *     
     */
    public FinancialInstrumentAttributes63 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes63 }
     *     
     */
    public FinancialInstrumentDetails21 setFinInstrmAttrbts(FinancialInstrumentAttributes63 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the subBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subBal property.
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
     * {@link IntraPositionDetails32 }
     * 
     * 
     */
    public List<IntraPositionDetails32> getSubBal() {
        if (subBal == null) {
            subBal = new ArrayList<IntraPositionDetails32>();
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
    public FinancialInstrumentDetails21 addSubBal(IntraPositionDetails32 subBal) {
        getSubBal().add(subBal);
        return this;
    }

}
