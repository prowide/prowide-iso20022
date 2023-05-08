
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
 * The CashObligationReportStatusAdvice message is sent by the settlement member to the settlement status to accept or reject the cash obligation report on the projeted or actual cash settlement obligations that will be submitted for settlement.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashObligationStatusAdviceV01", propOrder = {
    "stsHdr",
    "netPosSts",
    "splmtryData"
})
public class CashObligationStatusAdviceV01 {

    @XmlElement(name = "StsHdr", required = true)
    protected CashObligationHeader2 stsHdr;
    @XmlElement(name = "NetPosSts", required = true)
    protected List<CashObligationStatus1> netPosSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CashObligationHeader2 }
     *     
     */
    public CashObligationHeader2 getStsHdr() {
        return stsHdr;
    }

    /**
     * Sets the value of the stsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashObligationHeader2 }
     *     
     */
    public CashObligationStatusAdviceV01 setStsHdr(CashObligationHeader2 value) {
        this.stsHdr = value;
        return this;
    }

    /**
     * Gets the value of the netPosSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netPosSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetPosSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashObligationStatus1 }
     * 
     * 
     * @return
     *     The value of the netPosSts property.
     */
    public List<CashObligationStatus1> getNetPosSts() {
        if (netPosSts == null) {
            netPosSts = new ArrayList<>();
        }
        return this.netPosSts;
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
     * Adds a new item to the netPosSts list.
     * @see #getNetPosSts()
     * 
     */
    public CashObligationStatusAdviceV01 addNetPosSts(CashObligationStatus1 netPosSts) {
        getNetPosSts().add(netPosSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CashObligationStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
