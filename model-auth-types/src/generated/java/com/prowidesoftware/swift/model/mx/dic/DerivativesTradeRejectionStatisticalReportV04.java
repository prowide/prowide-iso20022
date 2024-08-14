
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
 * The DerivativesTradeRejectionStatisticalReport message is sent by the trade repository (TR) to the report submitting entity, identifying the transactions rejected and the reasons for a rejection.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativesTradeRejectionStatisticalReportV04", propOrder = {
    "rjctnSttstcs",
    "splmtryData"
})
public class DerivativesTradeRejectionStatisticalReportV04 {

    @XmlElement(name = "RjctnSttstcs", required = true)
    protected StatisticsPerCounterparty18Choice rjctnSttstcs;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rjctnSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerCounterparty18Choice }
     *     
     */
    public StatisticsPerCounterparty18Choice getRjctnSttstcs() {
        return rjctnSttstcs;
    }

    /**
     * Sets the value of the rjctnSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerCounterparty18Choice }
     *     
     */
    public DerivativesTradeRejectionStatisticalReportV04 setRjctnSttstcs(StatisticsPerCounterparty18Choice value) {
        this.rjctnSttstcs = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public DerivativesTradeRejectionStatisticalReportV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
