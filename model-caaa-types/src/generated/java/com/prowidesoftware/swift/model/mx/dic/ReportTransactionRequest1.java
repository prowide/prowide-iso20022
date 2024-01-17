
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
 * Content of the Transaction Report Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportTransactionRequest1", propOrder = {
    "schCrit",
    "schOutptOrdr",
    "dscndgOrdr",
    "blckStart",
    "blckStop"
})
public class ReportTransactionRequest1 {

    @XmlElement(name = "SchCrit", required = true)
    protected List<SearchCriteria1> schCrit;
    @XmlElement(name = "SchOutptOrdr")
    protected SearchOutputOrder1 schOutptOrdr;
    @XmlElement(name = "DscndgOrdr")
    protected Boolean dscndgOrdr;
    @XmlElement(name = "BlckStart")
    protected BigDecimal blckStart;
    @XmlElement(name = "BlckStop")
    protected BigDecimal blckStop;

    /**
     * Gets the value of the schCrit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the schCrit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchCrit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchCriteria1 }
     * 
     * 
     * @return
     *     The value of the schCrit property.
     */
    public List<SearchCriteria1> getSchCrit() {
        if (schCrit == null) {
            schCrit = new ArrayList<>();
        }
        return this.schCrit;
    }

    /**
     * Gets the value of the schOutptOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOutputOrder1 }
     *     
     */
    public SearchOutputOrder1 getSchOutptOrdr() {
        return schOutptOrdr;
    }

    /**
     * Sets the value of the schOutptOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOutputOrder1 }
     *     
     */
    public ReportTransactionRequest1 setSchOutptOrdr(SearchOutputOrder1 value) {
        this.schOutptOrdr = value;
        return this;
    }

    /**
     * Gets the value of the dscndgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDscndgOrdr() {
        return dscndgOrdr;
    }

    /**
     * Sets the value of the dscndgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReportTransactionRequest1 setDscndgOrdr(Boolean value) {
        this.dscndgOrdr = value;
        return this;
    }

    /**
     * Gets the value of the blckStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBlckStart() {
        return blckStart;
    }

    /**
     * Sets the value of the blckStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ReportTransactionRequest1 setBlckStart(BigDecimal value) {
        this.blckStart = value;
        return this;
    }

    /**
     * Gets the value of the blckStop property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBlckStop() {
        return blckStop;
    }

    /**
     * Sets the value of the blckStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ReportTransactionRequest1 setBlckStop(BigDecimal value) {
        this.blckStop = value;
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
     * Adds a new item to the schCrit list.
     * @see #getSchCrit()
     * 
     */
    public ReportTransactionRequest1 addSchCrit(SearchCriteria1 schCrit) {
        getSchCrit().add(schCrit);
        return this;
    }

}
