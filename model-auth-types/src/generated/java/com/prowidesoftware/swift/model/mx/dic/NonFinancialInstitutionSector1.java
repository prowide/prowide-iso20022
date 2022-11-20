
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
 * Provides detailed information concerning non financial counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonFinancialInstitutionSector1", propOrder = {
    "sctr",
    "clrThrshld",
    "drctlyLkdActvty"
})
public class NonFinancialInstitutionSector1 {

    @XmlElement(name = "Sctr")
    protected List<String> sctr;
    @XmlElement(name = "ClrThrshld")
    protected boolean clrThrshld;
    @XmlElement(name = "DrctlyLkdActvty")
    protected boolean drctlyLkdActvty;

    /**
     * Gets the value of the sctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctr property.
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
     */
    public List<String> getSctr() {
        if (sctr == null) {
            sctr = new ArrayList<String>();
        }
        return this.sctr;
    }

    /**
     * Gets the value of the clrThrshld property.
     * 
     */
    public boolean isClrThrshld() {
        return clrThrshld;
    }

    /**
     * Sets the value of the clrThrshld property.
     * 
     */
    public NonFinancialInstitutionSector1 setClrThrshld(boolean value) {
        this.clrThrshld = value;
        return this;
    }

    /**
     * Gets the value of the drctlyLkdActvty property.
     * 
     */
    public boolean isDrctlyLkdActvty() {
        return drctlyLkdActvty;
    }

    /**
     * Sets the value of the drctlyLkdActvty property.
     * 
     */
    public NonFinancialInstitutionSector1 setDrctlyLkdActvty(boolean value) {
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
    public NonFinancialInstitutionSector1 addSctr(String sctr) {
        getSctr().add(sctr);
        return this;
    }

}
