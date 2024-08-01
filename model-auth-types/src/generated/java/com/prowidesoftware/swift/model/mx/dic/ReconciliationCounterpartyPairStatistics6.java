
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
 * Detailed statistics on derivatives submitted for reconciliation per counterparty pair.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationCounterpartyPairStatistics6", propOrder = {
    "ctrPtyId",
    "ttlNbOfTxs",
    "rcncltnRpt"
})
public class ReconciliationCounterpartyPairStatistics6 {

    @XmlElement(name = "CtrPtyId", required = true)
    protected CounterpartyData91 ctrPtyId;
    @XmlElement(name = "TtlNbOfTxs", required = true)
    protected BigDecimal ttlNbOfTxs;
    @XmlElement(name = "RcncltnRpt", required = true)
    protected List<ReconciliationReport14> rcncltnRpt;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData91 }
     *     
     */
    public CounterpartyData91 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData91 }
     *     
     */
    public ReconciliationCounterpartyPairStatistics6 setCtrPtyId(CounterpartyData91 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTxs() {
        return ttlNbOfTxs;
    }

    /**
     * Sets the value of the ttlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ReconciliationCounterpartyPairStatistics6 setTtlNbOfTxs(BigDecimal value) {
        this.ttlNbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcncltnRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcncltnRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReconciliationReport14 }
     * 
     * 
     * @return
     *     The value of the rcncltnRpt property.
     */
    public List<ReconciliationReport14> getRcncltnRpt() {
        if (rcncltnRpt == null) {
            rcncltnRpt = new ArrayList<>();
        }
        return this.rcncltnRpt;
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
     * Adds a new item to the rcncltnRpt list.
     * @see #getRcncltnRpt()
     * 
     */
    public ReconciliationCounterpartyPairStatistics6 addRcncltnRpt(ReconciliationReport14 rcncltnRpt) {
        getRcncltnRpt().add(rcncltnRpt);
        return this;
    }

}
