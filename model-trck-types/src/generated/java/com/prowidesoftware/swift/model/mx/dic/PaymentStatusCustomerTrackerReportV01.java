
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
 * The PaymentStatusTrackerReport message is sent by a tracking facility or any authorised party to relevant parties involved in the business transaction to report on the progress of one or more business transaction(s) and obtain transparency on the status.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusCustomerTrackerReportV01", propOrder = {
    "grpHdr",
    "trckrStsAndTx",
    "splmtryData"
})
public class PaymentStatusCustomerTrackerReportV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected TrackerHeader5 grpHdr;
    @XmlElement(name = "TrckrStsAndTx", required = true)
    protected List<TrackerStatusAndTransaction11> trckrStsAndTx;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerHeader5 }
     *     
     */
    public TrackerHeader5 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerHeader5 }
     *     
     */
    public PaymentStatusCustomerTrackerReportV01 setGrpHdr(TrackerHeader5 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the trckrStsAndTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trckrStsAndTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrckrStsAndTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackerStatusAndTransaction11 }
     * 
     * 
     * @return
     *     The value of the trckrStsAndTx property.
     */
    public List<TrackerStatusAndTransaction11> getTrckrStsAndTx() {
        if (trckrStsAndTx == null) {
            trckrStsAndTx = new ArrayList<>();
        }
        return this.trckrStsAndTx;
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
     * Adds a new item to the trckrStsAndTx list.
     * @see #getTrckrStsAndTx()
     * 
     */
    public PaymentStatusCustomerTrackerReportV01 addTrckrStsAndTx(TrackerStatusAndTransaction11 trckrStsAndTx) {
        getTrckrStsAndTx().add(trckrStsAndTx);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public PaymentStatusCustomerTrackerReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
