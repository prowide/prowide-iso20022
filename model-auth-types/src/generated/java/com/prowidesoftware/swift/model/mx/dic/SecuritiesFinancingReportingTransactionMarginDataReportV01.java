
package com.prowidesoftware.swift.model.mx.dic;

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
 * The SecuritiesFinancingReportingTransactionMarginDataReport message is sent by the report submitting entity to the trade repository (TR) to report the margins exchanged in relation to the CCP-cleared securities financing transactions or sent by the trade repository (TR) to the authority or made available by the trade repository (TR) to the report submitting entity and the reporting counterparty as well as the entity responsible for reporting, if applicable.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingReportingTransactionMarginDataReportV01", propOrder = {
    "tradData",
    "splmtryData"
})
public class SecuritiesFinancingReportingTransactionMarginDataReportV01 {

    @XmlElement(name = "TradData", required = true)
    protected TradeData6Choice tradData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the tradData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData6Choice }
     *     
     */
    public TradeData6Choice getTradData() {
        return tradData;
    }

    /**
     * Sets the value of the tradData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData6Choice }
     *     
     */
    public SecuritiesFinancingReportingTransactionMarginDataReportV01 setTradData(TradeData6Choice value) {
        this.tradData = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public SecuritiesFinancingReportingTransactionMarginDataReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
