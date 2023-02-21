
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Taxonomy for financial and non financial counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateSectorCriteria4", propOrder = {
    "fiSctr",
    "nfiSctr",
    "notRptd"
})
public class CorporateSectorCriteria4 {

    @XmlElement(name = "FISctr")
    @XmlSchemaType(name = "string")
    protected List<FinancialPartySectorType2Code> fiSctr;
    @XmlElement(name = "NFISctr")
    protected List<String> nfiSctr;
    @XmlElement(name = "NotRptd")
    @XmlSchemaType(name = "string")
    protected NotReported1Code notRptd;

    /**
     * Gets the value of the fiSctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiSctr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFISctr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialPartySectorType2Code }
     * 
     * 
     */
    public List<FinancialPartySectorType2Code> getFISctr() {
        if (fiSctr == null) {
            fiSctr = new ArrayList<FinancialPartySectorType2Code>();
        }
        return this.fiSctr;
    }

    /**
     * Gets the value of the nfiSctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nfiSctr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNFISctr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNFISctr() {
        if (nfiSctr == null) {
            nfiSctr = new ArrayList<String>();
        }
        return this.nfiSctr;
    }

    /**
     * Gets the value of the notRptd property.
     * 
     * @return
     *     possible object is
     *     {@link NotReported1Code }
     *     
     */
    public NotReported1Code getNotRptd() {
        return notRptd;
    }

    /**
     * Sets the value of the notRptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotReported1Code }
     *     
     */
    public CorporateSectorCriteria4 setNotRptd(NotReported1Code value) {
        this.notRptd = value;
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
     * Adds a new item to the fISctr list.
     * @see #getFISctr()
     * 
     */
    public CorporateSectorCriteria4 addFISctr(FinancialPartySectorType2Code fISctr) {
        getFISctr().add(fISctr);
        return this;
    }

    /**
     * Adds a new item to the nFISctr list.
     * @see #getNFISctr()
     * 
     */
    public CorporateSectorCriteria4 addNFISctr(String nFISctr) {
        getNFISctr().add(nFISctr);
        return this;
    }

}
