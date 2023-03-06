
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
 * The RequestToPayDebtorActivationStatusReport message is sent from the recipient of the debtor activation request message (initiation, amendment or cancellation), such as the creditor RTP provider or the creditor, to the initiator of the debtor activation request message (debtor, debtor RTP provider or any of the forwarding agent) to provide the status of the request. 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestToPayDebtorActivationStatusReportV01", propOrder = {
    "hdr",
    "orgnlActvtnAndSts",
    "splmtryData"
})
public class RequestToPayDebtorActivationStatusReportV01 {

    @XmlElement(name = "Hdr", required = true)
    protected ActivationHeader2 hdr;
    @XmlElement(name = "OrgnlActvtnAndSts", required = true)
    protected List<ActivationStatus2> orgnlActvtnAndSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationHeader2 }
     *     
     */
    public ActivationHeader2 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationHeader2 }
     *     
     */
    public RequestToPayDebtorActivationStatusReportV01 setHdr(ActivationHeader2 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlActvtnAndSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlActvtnAndSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlActvtnAndSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivationStatus2 }
     * 
     * 
     */
    public List<ActivationStatus2> getOrgnlActvtnAndSts() {
        if (orgnlActvtnAndSts == null) {
            orgnlActvtnAndSts = new ArrayList<ActivationStatus2>();
        }
        return this.orgnlActvtnAndSts;
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
     * Adds a new item to the orgnlActvtnAndSts list.
     * @see #getOrgnlActvtnAndSts()
     * 
     */
    public RequestToPayDebtorActivationStatusReportV01 addOrgnlActvtnAndSts(ActivationStatus2 orgnlActvtnAndSts) {
        getOrgnlActvtnAndSts().add(orgnlActvtnAndSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public RequestToPayDebtorActivationStatusReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
