
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Detailed information on derivatives submitted for reconciliation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationStatisticsPerCounterparty4", propOrder = {
    "refDt",
    "rcncltnCtgrs",
    "ttlNbOfTxs",
    "txDtls"
})
public class ReconciliationStatisticsPerCounterparty4 {

    @XmlElement(name = "RefDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate refDt;
    @XmlElement(name = "RcncltnCtgrs", required = true)
    protected ReportingRequirement3Choice rcncltnCtgrs;
    @XmlElement(name = "TtlNbOfTxs")
    protected BigDecimal ttlNbOfTxs;
    @XmlElement(name = "TxDtls")
    protected List<ReconciliationCounterpartyPairStatistics7> txDtls;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReconciliationStatisticsPerCounterparty4 setRefDt(LocalDate value) {
        this.refDt = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnCtgrs property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingRequirement3Choice }
     *     
     */
    public ReportingRequirement3Choice getRcncltnCtgrs() {
        return rcncltnCtgrs;
    }

    /**
     * Sets the value of the rcncltnCtgrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingRequirement3Choice }
     *     
     */
    public ReconciliationStatisticsPerCounterparty4 setRcncltnCtgrs(ReportingRequirement3Choice value) {
        this.rcncltnCtgrs = value;
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
    public ReconciliationStatisticsPerCounterparty4 setTtlNbOfTxs(BigDecimal value) {
        this.ttlNbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReconciliationCounterpartyPairStatistics7 }
     * 
     * 
     * @return
     *     The value of the txDtls property.
     */
    public List<ReconciliationCounterpartyPairStatistics7> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<>();
        }
        return this.txDtls;
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
     * Adds a new item to the txDtls list.
     * @see #getTxDtls()
     * 
     */
    public ReconciliationStatisticsPerCounterparty4 addTxDtls(ReconciliationCounterpartyPairStatistics7 txDtls) {
        getTxDtls().add(txDtls);
        return this;
    }

}
