
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
 * The PaymentStatusTrackerUpdate message is sent by an agent to a tracking facility to monitor the progress of a business transaction, and to update the status of this business transaction for obtaining tracking and transparency purpose.
 * 
 * Usage:
 * Multiple business transaction statuses may be reported in a single message, and each status may include all relevant information of a single transaction or multiple transactions of the tracked payment(s) exchanged.
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusTrackerUpdateV02", propOrder = {
    "grpHdr",
    "trckrStsAndTx",
    "splmtryData"
})
public class PaymentStatusTrackerUpdateV02 {

    @XmlElement(name = "GrpHdr", required = true)
    protected TrackerHeader6 grpHdr;
    @XmlElement(name = "TrckrStsAndTx", required = true)
    protected List<TrackerStatusAndTransaction12> trckrStsAndTx;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerHeader6 }
     *     
     */
    public TrackerHeader6 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerHeader6 }
     *     
     */
    public PaymentStatusTrackerUpdateV02 setGrpHdr(TrackerHeader6 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the trckrStsAndTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trckrStsAndTx property.
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
     * {@link TrackerStatusAndTransaction12 }
     * 
     * 
     */
    public List<TrackerStatusAndTransaction12> getTrckrStsAndTx() {
        if (trckrStsAndTx == null) {
            trckrStsAndTx = new ArrayList<TrackerStatusAndTransaction12>();
        }
        return this.trckrStsAndTx;
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
     * Adds a new item to the trckrStsAndTx list.
     * @see #getTrckrStsAndTx()
     * 
     */
    public PaymentStatusTrackerUpdateV02 addTrckrStsAndTx(TrackerStatusAndTransaction12 trckrStsAndTx) {
        getTrckrStsAndTx().add(trckrStsAndTx);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public PaymentStatusTrackerUpdateV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
