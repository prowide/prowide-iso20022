
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
 * Details about the entity involved in the tax paid or to be paid.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxParty3", propOrder = {
    "taxId",
    "taxTp",
    "regnId",
    "taxXmptnRsn"
})
public class TaxParty3 {

    @XmlElement(name = "TaxId")
    protected String taxId;
    @XmlElement(name = "TaxTp")
    protected String taxTp;
    @XmlElement(name = "RegnId")
    protected String regnId;
    @XmlElement(name = "TaxXmptnRsn")
    protected List<TaxExemptionReasonFormatChoice> taxXmptnRsn;

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxParty3 setTaxId(String value) {
        this.taxId = value;
        return this;
    }

    /**
     * Gets the value of the taxTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTp() {
        return taxTp;
    }

    /**
     * Sets the value of the taxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxParty3 setTaxTp(String value) {
        this.taxTp = value;
        return this;
    }

    /**
     * Gets the value of the regnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnId() {
        return regnId;
    }

    /**
     * Sets the value of the regnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxParty3 setRegnId(String value) {
        this.regnId = value;
        return this;
    }

    /**
     * Gets the value of the taxXmptnRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxXmptnRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxXmptnRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptionReasonFormatChoice }
     * 
     * 
     */
    public List<TaxExemptionReasonFormatChoice> getTaxXmptnRsn() {
        if (taxXmptnRsn == null) {
            taxXmptnRsn = new ArrayList<TaxExemptionReasonFormatChoice>();
        }
        return this.taxXmptnRsn;
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
     * Adds a new item to the taxXmptnRsn list.
     * @see #getTaxXmptnRsn()
     * 
     */
    public TaxParty3 addTaxXmptnRsn(TaxExemptionReasonFormatChoice taxXmptnRsn) {
        getTaxXmptnRsn().add(taxXmptnRsn);
        return this;
    }

}
