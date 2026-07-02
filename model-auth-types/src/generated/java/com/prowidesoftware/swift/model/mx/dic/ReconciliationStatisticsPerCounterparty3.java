
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "ReconciliationStatisticsPerCounterparty3", propOrder = {
    "refDt",
    "rcncltnCtgrs",
    "ttlNbOfTxs",
    "txDtls"
})
public class ReconciliationStatisticsPerCounterparty3 {

    @XmlElement(name = "RefDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "RcncltnCtgrs", required = true)
    protected ReportingRequirement2Choice rcncltnCtgrs;
    @XmlElement(name = "TtlNbOfTxs")
    protected BigDecimal ttlNbOfTxs;
    @XmlElement(name = "TxDtls")
    protected List<ReconciliationCounterpartyPairStatistics6> txDtls;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRefDt() {
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
    public ReconciliationStatisticsPerCounterparty3 setRefDt(XMLGregorianCalendar value) {
        this.refDt = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnCtgrs property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingRequirement2Choice }
     *     
     */
    public ReportingRequirement2Choice getRcncltnCtgrs() {
        return rcncltnCtgrs;
    }

    /**
     * Sets the value of the rcncltnCtgrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingRequirement2Choice }
     *     
     */
    public ReconciliationStatisticsPerCounterparty3 setRcncltnCtgrs(ReportingRequirement2Choice value) {
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
    public ReconciliationStatisticsPerCounterparty3 setTtlNbOfTxs(BigDecimal value) {
        this.ttlNbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txDtls property.
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
     * {@link ReconciliationCounterpartyPairStatistics6 }
     * 
     * 
     */
    public List<ReconciliationCounterpartyPairStatistics6> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<ReconciliationCounterpartyPairStatistics6>();
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
    public ReconciliationStatisticsPerCounterparty3 addTxDtls(ReconciliationCounterpartyPairStatistics6 txDtls) {
        getTxDtls().add(txDtls);
        return this;
    }

}
