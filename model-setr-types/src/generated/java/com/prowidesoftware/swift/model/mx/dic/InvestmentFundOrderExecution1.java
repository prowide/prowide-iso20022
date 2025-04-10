
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
 * Reference of an order, deal reference, client reference and master reference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundOrderExecution1", propOrder = {
    "mstrRef",
    "amdmntInd",
    "ordrRefs"
})
public class InvestmentFundOrderExecution1 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "AmdmntInd")
    protected boolean amdmntInd;
    @XmlElement(name = "OrdrRefs", required = true)
    protected List<InvestmentFundOrderExecution2> ordrRefs;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundOrderExecution1 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the amdmntInd property.
     * 
     */
    public boolean isAmdmntInd() {
        return amdmntInd;
    }

    /**
     * Sets the value of the amdmntInd property.
     * 
     */
    public InvestmentFundOrderExecution1 setAmdmntInd(boolean value) {
        this.amdmntInd = value;
        return this;
    }

    /**
     * Gets the value of the ordrRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordrRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundOrderExecution2 }
     * 
     * 
     */
    public List<InvestmentFundOrderExecution2> getOrdrRefs() {
        if (ordrRefs == null) {
            ordrRefs = new ArrayList<InvestmentFundOrderExecution2>();
        }
        return this.ordrRefs;
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
     * Adds a new item to the ordrRefs list.
     * @see #getOrdrRefs()
     * 
     */
    public InvestmentFundOrderExecution1 addOrdrRefs(InvestmentFundOrderExecution2 ordrRefs) {
        getOrdrRefs().add(ordrRefs);
        return this;
    }

}
