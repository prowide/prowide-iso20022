
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
 * Detailed statistics on reports.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedReportStatistics6", propOrder = {
    "ttlNbOfRpts",
    "ttlNbOfRptsAccptd",
    "ttlNbOfRptsRjctd",
    "nbOfRptsRjctdPerErr"
})
public class DetailedReportStatistics6 {

    @XmlElement(name = "TtlNbOfRpts", required = true)
    protected String ttlNbOfRpts;
    @XmlElement(name = "TtlNbOfRptsAccptd", required = true)
    protected String ttlNbOfRptsAccptd;
    @XmlElement(name = "TtlNbOfRptsRjctd", required = true)
    protected String ttlNbOfRptsRjctd;
    @XmlElement(name = "NbOfRptsRjctdPerErr")
    protected List<NumberOfTransactionsPerValidationRule6> nbOfRptsRjctdPerErr;

    /**
     * Gets the value of the ttlNbOfRpts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfRpts() {
        return ttlNbOfRpts;
    }

    /**
     * Sets the value of the ttlNbOfRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedReportStatistics6 setTtlNbOfRpts(String value) {
        this.ttlNbOfRpts = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfRptsAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfRptsAccptd() {
        return ttlNbOfRptsAccptd;
    }

    /**
     * Sets the value of the ttlNbOfRptsAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedReportStatistics6 setTtlNbOfRptsAccptd(String value) {
        this.ttlNbOfRptsAccptd = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfRptsRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfRptsRjctd() {
        return ttlNbOfRptsRjctd;
    }

    /**
     * Sets the value of the ttlNbOfRptsRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedReportStatistics6 setTtlNbOfRptsRjctd(String value) {
        this.ttlNbOfRptsRjctd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfRptsRjctdPerErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nbOfRptsRjctdPerErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfRptsRjctdPerErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfTransactionsPerValidationRule6 }
     * 
     * 
     */
    public List<NumberOfTransactionsPerValidationRule6> getNbOfRptsRjctdPerErr() {
        if (nbOfRptsRjctdPerErr == null) {
            nbOfRptsRjctdPerErr = new ArrayList<NumberOfTransactionsPerValidationRule6>();
        }
        return this.nbOfRptsRjctdPerErr;
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
     * Adds a new item to the nbOfRptsRjctdPerErr list.
     * @see #getNbOfRptsRjctdPerErr()
     * 
     */
    public DetailedReportStatistics6 addNbOfRptsRjctdPerErr(NumberOfTransactionsPerValidationRule6 nbOfRptsRjctdPerErr) {
        getNbOfRptsRjctdPerErr().add(nbOfRptsRjctdPerErr);
        return this;
    }

}
