
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
 * Set of elements used to provide summary information on entries.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalTransactions4", propOrder = {
    "ttlNtries",
    "ttlCdtNtries",
    "ttlDbtNtries",
    "ttlNtriesPerBkTxCd"
})
public class TotalTransactions4 {

    @XmlElement(name = "TtlNtries")
    protected NumberAndSumOfTransactions4 ttlNtries;
    @XmlElement(name = "TtlCdtNtries")
    protected NumberAndSumOfTransactions1 ttlCdtNtries;
    @XmlElement(name = "TtlDbtNtries")
    protected NumberAndSumOfTransactions1 ttlDbtNtries;
    @XmlElement(name = "TtlNtriesPerBkTxCd")
    protected List<TotalsPerBankTransactionCode3> ttlNtriesPerBkTxCd;

    /**
     * Gets the value of the ttlNtries property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions4 }
     *     
     */
    public NumberAndSumOfTransactions4 getTtlNtries() {
        return ttlNtries;
    }

    /**
     * Sets the value of the ttlNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions4 }
     *     
     */
    public TotalTransactions4 setTtlNtries(NumberAndSumOfTransactions4 value) {
        this.ttlNtries = value;
        return this;
    }

    /**
     * Gets the value of the ttlCdtNtries property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public NumberAndSumOfTransactions1 getTtlCdtNtries() {
        return ttlCdtNtries;
    }

    /**
     * Sets the value of the ttlCdtNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public TotalTransactions4 setTtlCdtNtries(NumberAndSumOfTransactions1 value) {
        this.ttlCdtNtries = value;
        return this;
    }

    /**
     * Gets the value of the ttlDbtNtries property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public NumberAndSumOfTransactions1 getTtlDbtNtries() {
        return ttlDbtNtries;
    }

    /**
     * Sets the value of the ttlDbtNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public TotalTransactions4 setTtlDbtNtries(NumberAndSumOfTransactions1 value) {
        this.ttlDbtNtries = value;
        return this;
    }

    /**
     * Gets the value of the ttlNtriesPerBkTxCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlNtriesPerBkTxCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlNtriesPerBkTxCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalsPerBankTransactionCode3 }
     * 
     * 
     */
    public List<TotalsPerBankTransactionCode3> getTtlNtriesPerBkTxCd() {
        if (ttlNtriesPerBkTxCd == null) {
            ttlNtriesPerBkTxCd = new ArrayList<TotalsPerBankTransactionCode3>();
        }
        return this.ttlNtriesPerBkTxCd;
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
     * Adds a new item to the ttlNtriesPerBkTxCd list.
     * @see #getTtlNtriesPerBkTxCd()
     * 
     */
    public TotalTransactions4 addTtlNtriesPerBkTxCd(TotalsPerBankTransactionCode3 ttlNtriesPerBkTxCd) {
        getTtlNtriesPerBkTxCd().add(ttlNtriesPerBkTxCd);
        return this;
    }

}
