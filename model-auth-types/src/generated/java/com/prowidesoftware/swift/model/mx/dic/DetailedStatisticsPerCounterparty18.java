
package com.prowidesoftware.swift.model.mx.dic;

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
 * Detailed information on statistics per combination of counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedStatisticsPerCounterparty18", propOrder = {
    "refDt",
    "ttlNbOfRpts",
    "ttlNbOfRptsAccptd",
    "ttlNbOfRptsRjctd",
    "ttlNbOfTxs",
    "ttlNbOfTxsAccptd",
    "ttlNbOfTxsRjctd",
    "ttlCrrctdRjctns",
    "rjctnSttstcs"
})
public class DetailedStatisticsPerCounterparty18 {

    @XmlElement(name = "RefDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate refDt;
    @XmlElement(name = "TtlNbOfRpts", required = true)
    protected String ttlNbOfRpts;
    @XmlElement(name = "TtlNbOfRptsAccptd", required = true)
    protected String ttlNbOfRptsAccptd;
    @XmlElement(name = "TtlNbOfRptsRjctd", required = true)
    protected String ttlNbOfRptsRjctd;
    @XmlElement(name = "TtlNbOfTxs", required = true)
    protected String ttlNbOfTxs;
    @XmlElement(name = "TtlNbOfTxsAccptd", required = true)
    protected StatisticsPerActionType1 ttlNbOfTxsAccptd;
    @XmlElement(name = "TtlNbOfTxsRjctd", required = true)
    protected StatisticsPerActionType1 ttlNbOfTxsRjctd;
    @XmlElement(name = "TtlCrrctdRjctns")
    protected StatisticsPerActionType1 ttlCrrctdRjctns;
    @XmlElement(name = "RjctnSttstcs", required = true)
    protected List<RejectionStatistics8> rjctnSttstcs;

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
    public DetailedStatisticsPerCounterparty18 setRefDt(LocalDate value) {
        this.refDt = value;
        return this;
    }

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
    public DetailedStatisticsPerCounterparty18 setTtlNbOfRpts(String value) {
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
    public DetailedStatisticsPerCounterparty18 setTtlNbOfRptsAccptd(String value) {
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
    public DetailedStatisticsPerCounterparty18 setTtlNbOfRptsRjctd(String value) {
        this.ttlNbOfRptsRjctd = value;
        return this;
    }

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
    public DetailedStatisticsPerCounterparty18 setTtlNbOfTxs(String value) {
        this.ttlNbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfTxsAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public StatisticsPerActionType1 getTtlNbOfTxsAccptd() {
        return ttlNbOfTxsAccptd;
    }

    /**
     * Sets the value of the ttlNbOfTxsAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public DetailedStatisticsPerCounterparty18 setTtlNbOfTxsAccptd(StatisticsPerActionType1 value) {
        this.ttlNbOfTxsAccptd = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfTxsRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public StatisticsPerActionType1 getTtlNbOfTxsRjctd() {
        return ttlNbOfTxsRjctd;
    }

    /**
     * Sets the value of the ttlNbOfTxsRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public DetailedStatisticsPerCounterparty18 setTtlNbOfTxsRjctd(StatisticsPerActionType1 value) {
        this.ttlNbOfTxsRjctd = value;
        return this;
    }

    /**
     * Gets the value of the ttlCrrctdRjctns property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public StatisticsPerActionType1 getTtlCrrctdRjctns() {
        return ttlCrrctdRjctns;
    }

    /**
     * Sets the value of the ttlCrrctdRjctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public DetailedStatisticsPerCounterparty18 setTtlCrrctdRjctns(StatisticsPerActionType1 value) {
        this.ttlCrrctdRjctns = value;
        return this;
    }

    /**
     * Gets the value of the rjctnSttstcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctnSttstcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctnSttstcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectionStatistics8 }
     * 
     * 
     * @return
     *     The value of the rjctnSttstcs property.
     */
    public List<RejectionStatistics8> getRjctnSttstcs() {
        if (rjctnSttstcs == null) {
            rjctnSttstcs = new ArrayList<>();
        }
        return this.rjctnSttstcs;
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
     * Adds a new item to the rjctnSttstcs list.
     * @see #getRjctnSttstcs()
     * 
     */
    public DetailedStatisticsPerCounterparty18 addRjctnSttstcs(RejectionStatistics8 rjctnSttstcs) {
        getRjctnSttstcs().add(rjctnSttstcs);
        return this;
    }

}
