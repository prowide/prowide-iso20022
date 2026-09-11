
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Contains detail information of the recurring payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringPaymentData1", propOrder = {
    "tp",
    "perTxAmtInd",
    "nbOfRcrngPmt",
    "frqcy",
    "regnRefNb",
    "maxRcrngPmtAmt",
    "vldtnInd",
    "prvtData",
    "ntlData"
})
public class RecurringPaymentData1 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "PerTxAmtInd")
    protected String perTxAmtInd;
    @XmlElement(name = "NbOfRcrngPmt")
    protected String nbOfRcrngPmt;
    @XmlElement(name = "Frqcy")
    protected String frqcy;
    @XmlElement(name = "RegnRefNb")
    protected String regnRefNb;
    @XmlElement(name = "MaxRcrngPmtAmt")
    protected BigDecimal maxRcrngPmtAmt;
    @XmlElement(name = "VldtnInd")
    protected String vldtnInd;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecurringPaymentData1 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the perTxAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerTxAmtInd() {
        return perTxAmtInd;
    }

    /**
     * Sets the value of the perTxAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecurringPaymentData1 setPerTxAmtInd(String value) {
        this.perTxAmtInd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfRcrngPmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfRcrngPmt() {
        return nbOfRcrngPmt;
    }

    /**
     * Sets the value of the nbOfRcrngPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecurringPaymentData1 setNbOfRcrngPmt(String value) {
        this.nbOfRcrngPmt = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecurringPaymentData1 setFrqcy(String value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the regnRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnRefNb() {
        return regnRefNb;
    }

    /**
     * Sets the value of the regnRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecurringPaymentData1 setRegnRefNb(String value) {
        this.regnRefNb = value;
        return this;
    }

    /**
     * Gets the value of the maxRcrngPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxRcrngPmtAmt() {
        return maxRcrngPmtAmt;
    }

    /**
     * Sets the value of the maxRcrngPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RecurringPaymentData1 setMaxRcrngPmtAmt(BigDecimal value) {
        this.maxRcrngPmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the vldtnInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVldtnInd() {
        return vldtnInd;
    }

    /**
     * Sets the value of the vldtnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecurringPaymentData1 setVldtnInd(String value) {
        this.vldtnInd = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public RecurringPaymentData1 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public RecurringPaymentData1 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
