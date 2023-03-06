
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
 * Financing information and status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingInformationAndStatus1", propOrder = {
    "fincgAllwdSummry",
    "invcFincgDtls"
})
public class FinancingInformationAndStatus1 {

    @XmlElement(name = "FincgAllwdSummry", required = true)
    protected FinancingAllowedSummary1 fincgAllwdSummry;
    @XmlElement(name = "InvcFincgDtls", required = true)
    protected List<InvoiceFinancingDetails1> invcFincgDtls;

    /**
     * Gets the value of the fincgAllwdSummry property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingAllowedSummary1 }
     *     
     */
    public FinancingAllowedSummary1 getFincgAllwdSummry() {
        return fincgAllwdSummry;
    }

    /**
     * Sets the value of the fincgAllwdSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingAllowedSummary1 }
     *     
     */
    public FinancingInformationAndStatus1 setFincgAllwdSummry(FinancingAllowedSummary1 value) {
        this.fincgAllwdSummry = value;
        return this;
    }

    /**
     * Gets the value of the invcFincgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invcFincgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvcFincgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceFinancingDetails1 }
     * 
     * 
     */
    public List<InvoiceFinancingDetails1> getInvcFincgDtls() {
        if (invcFincgDtls == null) {
            invcFincgDtls = new ArrayList<InvoiceFinancingDetails1>();
        }
        return this.invcFincgDtls;
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
     * Adds a new item to the invcFincgDtls list.
     * @see #getInvcFincgDtls()
     * 
     */
    public FinancingInformationAndStatus1 addInvcFincgDtls(InvoiceFinancingDetails1 invcFincgDtls) {
        getInvcFincgDtls().add(invcFincgDtls);
        return this;
    }

}
