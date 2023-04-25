
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
 * The RequestToPayCreditorEnrolmentCancellationRequest message is sent by the creditor RTP (Request To Pay) provider to an RTP directory provider and optionally by the creditor to a creditor RTP provider to request for the cancellation of the creditor registration in the RTP directory. 
 * The message may also be forwarded to any authorised third party, as defined in the local scheme
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestToPayCreditorEnrolmentCancellationRequestV01", propOrder = {
    "hdr",
    "cxlData",
    "splmtryData"
})
public class RequestToPayCreditorEnrolmentCancellationRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected EnrolmentHeader2 hdr;
    @XmlElement(name = "CxlData", required = true)
    protected List<CreditorEnrolmentCancellation2> cxlData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link EnrolmentHeader2 }
     *     
     */
    public EnrolmentHeader2 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrolmentHeader2 }
     *     
     */
    public RequestToPayCreditorEnrolmentCancellationRequestV01 setHdr(EnrolmentHeader2 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cxlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditorEnrolmentCancellation2 }
     * 
     * 
     * @return
     *     The value of the cxlData property.
     */
    public List<CreditorEnrolmentCancellation2> getCxlData() {
        if (cxlData == null) {
            cxlData = new ArrayList<>();
        }
        return this.cxlData;
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
     * Adds a new item to the cxlData list.
     * @see #getCxlData()
     * 
     */
    public RequestToPayCreditorEnrolmentCancellationRequestV01 addCxlData(CreditorEnrolmentCancellation2 cxlData) {
        getCxlData().add(cxlData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public RequestToPayCreditorEnrolmentCancellationRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
