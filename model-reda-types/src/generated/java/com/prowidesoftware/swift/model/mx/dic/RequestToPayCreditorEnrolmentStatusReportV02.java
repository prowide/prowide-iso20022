
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
 * The RequestToPayCreditorEnrolmentStatusReport message is sent from the RTP (Request To Pay) directory provider to the creditor RTP provider and optionally from the creditor RTP provider to the creditor or any of the forwarding agent to provide the status of the initial creation, amendment or cancellation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestToPayCreditorEnrolmentStatusReportV02", propOrder = {
    "hdr",
    "orgnlEnrlmntAndSts",
    "splmtryData"
})
public class RequestToPayCreditorEnrolmentStatusReportV02 {

    @XmlElement(name = "Hdr", required = true)
    protected EnrolmentHeader3 hdr;
    @XmlElement(name = "OrgnlEnrlmntAndSts", required = true)
    protected List<EnrolmentStatus3> orgnlEnrlmntAndSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link EnrolmentHeader3 }
     *     
     */
    public EnrolmentHeader3 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrolmentHeader3 }
     *     
     */
    public RequestToPayCreditorEnrolmentStatusReportV02 setHdr(EnrolmentHeader3 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlEnrlmntAndSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlEnrlmntAndSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlEnrlmntAndSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnrolmentStatus3 }
     * 
     * 
     * @return
     *     The value of the orgnlEnrlmntAndSts property.
     */
    public List<EnrolmentStatus3> getOrgnlEnrlmntAndSts() {
        if (orgnlEnrlmntAndSts == null) {
            orgnlEnrlmntAndSts = new ArrayList<>();
        }
        return this.orgnlEnrlmntAndSts;
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
     * Adds a new item to the orgnlEnrlmntAndSts list.
     * @see #getOrgnlEnrlmntAndSts()
     * 
     */
    public RequestToPayCreditorEnrolmentStatusReportV02 addOrgnlEnrlmntAndSts(EnrolmentStatus3 orgnlEnrlmntAndSts) {
        getOrgnlEnrlmntAndSts().add(orgnlEnrlmntAndSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public RequestToPayCreditorEnrolmentStatusReportV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
