
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
 * Information about number of transactions accepted and rejected and the reasons of the rejections.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics6", propOrder = {
    "ttlNbOfTxs",
    "ttlNbOfTxsAccptd",
    "ttlNbOfTxsRjctd",
    "nbOfTxsRjctdPerErr"
})
public class DetailedTransactionStatistics6 {

    @XmlElement(name = "TtlNbOfTxs", required = true)
    protected String ttlNbOfTxs;
    @XmlElement(name = "TtlNbOfTxsAccptd", required = true)
    protected String ttlNbOfTxsAccptd;
    @XmlElement(name = "TtlNbOfTxsRjctd", required = true)
    protected String ttlNbOfTxsRjctd;
    @XmlElement(name = "NbOfTxsRjctdPerErr", required = true)
    protected List<NumberOfTransactionsPerValidationRule3> nbOfTxsRjctdPerErr;

    /**
     * Gets the value of the ttlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfTxs() {
        return ttlNbOfTxs;
    }

    /**
     * Sets the value of the ttlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedTransactionStatistics6 setTtlNbOfTxs(String value) {
        this.ttlNbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfTxsAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfTxsAccptd() {
        return ttlNbOfTxsAccptd;
    }

    /**
     * Sets the value of the ttlNbOfTxsAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedTransactionStatistics6 setTtlNbOfTxsAccptd(String value) {
        this.ttlNbOfTxsAccptd = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfTxsRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfTxsRjctd() {
        return ttlNbOfTxsRjctd;
    }

    /**
     * Sets the value of the ttlNbOfTxsRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedTransactionStatistics6 setTtlNbOfTxsRjctd(String value) {
        this.ttlNbOfTxsRjctd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfTxsRjctdPerErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nbOfTxsRjctdPerErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfTxsRjctdPerErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfTransactionsPerValidationRule3 }
     * 
     * 
     */
    public List<NumberOfTransactionsPerValidationRule3> getNbOfTxsRjctdPerErr() {
        if (nbOfTxsRjctdPerErr == null) {
            nbOfTxsRjctdPerErr = new ArrayList<NumberOfTransactionsPerValidationRule3>();
        }
        return this.nbOfTxsRjctdPerErr;
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
     * Adds a new item to the nbOfTxsRjctdPerErr list.
     * @see #getNbOfTxsRjctdPerErr()
     * 
     */
    public DetailedTransactionStatistics6 addNbOfTxsRjctdPerErr(NumberOfTransactionsPerValidationRule3 nbOfTxsRjctdPerErr) {
        getNbOfTxsRjctdPerErr().add(nbOfTxsRjctdPerErr);
        return this;
    }

}
