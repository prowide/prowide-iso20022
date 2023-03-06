
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
 * Results of a scenario used to test whether a legal entity or other financial construct has sufficient liquid resources to meet its obligations as they arise.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityStressTestResult1", propOrder = {
    "id",
    "scnroDfltrs",
    "lqdtyReqrdAndAvlbl"
})
public class LiquidityStressTestResult1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "ScnroDfltrs", required = true)
    protected CoverTwoDefaulters1 scnroDfltrs;
    @XmlElement(name = "LqdtyReqrdAndAvlbl", required = true)
    protected List<LiquidityRequiredAndAvailable1> lqdtyReqrdAndAvlbl;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LiquidityStressTestResult1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the scnroDfltrs property.
     * 
     * @return
     *     possible object is
     *     {@link CoverTwoDefaulters1 }
     *     
     */
    public CoverTwoDefaulters1 getScnroDfltrs() {
        return scnroDfltrs;
    }

    /**
     * Sets the value of the scnroDfltrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverTwoDefaulters1 }
     *     
     */
    public LiquidityStressTestResult1 setScnroDfltrs(CoverTwoDefaulters1 value) {
        this.scnroDfltrs = value;
        return this;
    }

    /**
     * Gets the value of the lqdtyReqrdAndAvlbl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lqdtyReqrdAndAvlbl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLqdtyReqrdAndAvlbl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidityRequiredAndAvailable1 }
     * 
     * 
     */
    public List<LiquidityRequiredAndAvailable1> getLqdtyReqrdAndAvlbl() {
        if (lqdtyReqrdAndAvlbl == null) {
            lqdtyReqrdAndAvlbl = new ArrayList<LiquidityRequiredAndAvailable1>();
        }
        return this.lqdtyReqrdAndAvlbl;
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
     * Adds a new item to the lqdtyReqrdAndAvlbl list.
     * @see #getLqdtyReqrdAndAvlbl()
     * 
     */
    public LiquidityStressTestResult1 addLqdtyReqrdAndAvlbl(LiquidityRequiredAndAvailable1 lqdtyReqrdAndAvlbl) {
        getLqdtyReqrdAndAvlbl().add(lqdtyReqrdAndAvlbl);
        return this;
    }

}
