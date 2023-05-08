
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "AggregationTransaction1", propOrder = {
    "frstPmtDtTm",
    "lastPmtDtTm",
    "nbOfPmts",
    "indvPmt"
})
public class AggregationTransaction1 {

    @XmlElement(name = "FrstPmtDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar frstPmtDtTm;
    @XmlElement(name = "LastPmtDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastPmtDtTm;
    @XmlElement(name = "NbOfPmts")
    protected BigDecimal nbOfPmts;
    @XmlElement(name = "IndvPmt")
    protected List<DetailedAmount6> indvPmt;

    /**
     * Gets the value of the frstPmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFrstPmtDtTm() {
        return frstPmtDtTm;
    }

    /**
     * Sets the value of the frstPmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AggregationTransaction1 setFrstPmtDtTm(Calendar value) {
        this.frstPmtDtTm = value;
        return this;
    }

    /**
     * Gets the value of the lastPmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastPmtDtTm() {
        return lastPmtDtTm;
    }

    /**
     * Sets the value of the lastPmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AggregationTransaction1 setLastPmtDtTm(Calendar value) {
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
    public AggregationTransaction1 setNbOfPmts(BigDecimal value) {
        this.nbOfPmts = value;
        return this;
    }

    /**
     * Gets the value of the indvPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvPmt property.
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
     * {@link DetailedAmount6 }
     * 
     * 
     * @return
     *     The value of the indvPmt property.
     */
    public List<DetailedAmount6> getIndvPmt() {
        if (indvPmt == null) {
            indvPmt = new ArrayList<>();
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
    public AggregationTransaction1 addIndvPmt(DetailedAmount6 indvPmt) {
        getIndvPmt().add(indvPmt);
        return this;
    }

}
