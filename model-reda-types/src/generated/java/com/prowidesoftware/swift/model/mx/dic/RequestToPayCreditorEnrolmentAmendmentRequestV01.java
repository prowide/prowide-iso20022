
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
 * The RequestToPayCreditorEnrolmentAmendmentRequest message is sent by the creditor RTP (Request To Pay) provider to an RTP directory provider and optionally by the creditor to a creditor RTP provider to request for the amendment of the creditor registration in the RTP directory. 
 * The message may also be forwarded to any authorised third party, as defined in the local scheme
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestToPayCreditorEnrolmentAmendmentRequestV01", propOrder = {
    "hdr",
    "amdmntData",
    "splmtryData"
})
public class RequestToPayCreditorEnrolmentAmendmentRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected EnrolmentHeader2 hdr;
    @XmlElement(name = "AmdmntData", required = true)
    protected List<CreditorEnrolmentAmendment3> amdmntData;
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
    public RequestToPayCreditorEnrolmentAmendmentRequestV01 setHdr(EnrolmentHeader2 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the amdmntData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amdmntData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmdmntData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditorEnrolmentAmendment3 }
     * 
     * 
     * @return
     *     The value of the amdmntData property.
     */
    public List<CreditorEnrolmentAmendment3> getAmdmntData() {
        if (amdmntData == null) {
            amdmntData = new ArrayList<>();
        }
        return this.amdmntData;
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
     * Adds a new item to the amdmntData list.
     * @see #getAmdmntData()
     * 
     */
    public RequestToPayCreditorEnrolmentAmendmentRequestV01 addAmdmntData(CreditorEnrolmentAmendment3 amdmntData) {
        getAmdmntData().add(amdmntData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public RequestToPayCreditorEnrolmentAmendmentRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
