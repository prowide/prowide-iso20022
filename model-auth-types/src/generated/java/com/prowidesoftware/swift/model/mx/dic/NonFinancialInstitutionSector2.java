
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
 * Provides detailed information concerning non financial counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonFinancialInstitutionSector2", propOrder = {
    "sctr",
    "clrThrshld",
    "drctlyLkdActvty"
})
public class NonFinancialInstitutionSector2 {

    @XmlElement(name = "Sctr")
    protected List<String> sctr;
    @XmlElement(name = "ClrThrshld")
    protected Boolean clrThrshld;
    @XmlElement(name = "DrctlyLkdActvty")
    protected Boolean drctlyLkdActvty;

    /**
     * Gets the value of the sctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the sctr property.
     */
    public List<String> getSctr() {
        if (sctr == null) {
            sctr = new ArrayList<>();
        }
        return this.sctr;
    }

    /**
     * Gets the value of the clrThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClrThrshld() {
        return clrThrshld;
    }

    /**
     * Sets the value of the clrThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public NonFinancialInstitutionSector2 setClrThrshld(Boolean value) {
        this.clrThrshld = value;
        return this;
    }

    /**
     * Gets the value of the drctlyLkdActvty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrctlyLkdActvty() {
        return drctlyLkdActvty;
    }

    /**
     * Sets the value of the drctlyLkdActvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public NonFinancialInstitutionSector2 setDrctlyLkdActvty(Boolean value) {
        this.drctlyLkdActvty = value;
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
     * Adds a new item to the sctr list.
     * @see #getSctr()
     * 
     */
    public NonFinancialInstitutionSector2 addSctr(String sctr) {
        getSctr().add(sctr);
        return this;
    }

}
