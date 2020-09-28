
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Payment transaction with an aggregated amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregationTransaction2", propOrder = {
    "frstPmtDtTm",
    "lastPmtDtTm",
    "nbOfPmts",
    "indvPmt"
})
public class AggregationTransaction2 {

    @XmlElement(name = "FrstPmtDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frstPmtDtTm;
    @XmlElement(name = "LastPmtDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPmtDtTm;
    @XmlElement(name = "NbOfPmts")
    protected BigDecimal nbOfPmts;
    @XmlElement(name = "IndvPmt")
    protected List<DetailedAmount14> indvPmt;

    /**
     * Gets the value of the frstPmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrstPmtDtTm() {
        return frstPmtDtTm;
    }

    /**
     * Sets the value of the frstPmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public AggregationTransaction2 setFrstPmtDtTm(XMLGregorianCalendar value) {
        this.frstPmtDtTm = value;
        return this;
    }

    /**
     * Gets the value of the lastPmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPmtDtTm() {
        return lastPmtDtTm;
    }

    /**
     * Sets the value of the lastPmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public AggregationTransaction2 setLastPmtDtTm(XMLGregorianCalendar value) {
        this.lastPmtDtTm = value;
        return this;
    }

    /**
     * Gets the value of the nbOfPmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfPmts() {
        return nbOfPmts;
    }

    /**
     * Sets the value of the nbOfPmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AggregationTransaction2 setNbOfPmts(BigDecimal value) {
        this.nbOfPmts = value;
        return this;
    }

    /**
     * Gets the value of the indvPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvPmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvPmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount14 }
     * 
     * 
     */
    public List<DetailedAmount14> getIndvPmt() {
        if (indvPmt == null) {
            indvPmt = new ArrayList<DetailedAmount14>();
        }
        return this.indvPmt;
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
     * Adds a new item to the indvPmt list.
     * @see #getIndvPmt()
     * 
     */
    public AggregationTransaction2 addIndvPmt(DetailedAmount14 indvPmt) {
        getIndvPmt().add(indvPmt);
        return this;
    }

}
