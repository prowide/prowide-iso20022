
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
 * Provides detailed information concerning financial counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionSector1", propOrder = {
    "sctr",
    "clrThrshld"
})
public class FinancialInstitutionSector1 {

    @XmlElement(name = "Sctr", required = true)
    protected List<FinancialPartyClassification2Choice> sctr;
    @XmlElement(name = "ClrThrshld")
    protected Boolean clrThrshld;

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
     * {@link FinancialPartyClassification2Choice }
     * 
     * 
     */
    public List<FinancialPartyClassification2Choice> getSctr() {
        if (sctr == null) {
            sctr = new ArrayList<FinancialPartyClassification2Choice>();
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
    public FinancialInstitutionSector1 setClrThrshld(Boolean value) {
        this.clrThrshld = value;
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
    public FinancialInstitutionSector1 addSctr(FinancialPartyClassification2Choice sctr) {
        getSctr().add(sctr);
        return this;
    }

}
