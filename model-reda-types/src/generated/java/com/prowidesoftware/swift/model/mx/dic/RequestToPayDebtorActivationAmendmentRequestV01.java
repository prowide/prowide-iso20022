
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
 * The RequestToPayDebtorActivationAmendmentRequest message is sent by the debtor RTP (Request To Pay) provider to the creditor RTP provider and optionally from the debtor to its RTP provider and from the creditor RTP provider to the creditor to request for the amendment of the debtor activation of the RTP service with that specific creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestToPayDebtorActivationAmendmentRequestV01", propOrder = {
    "hdr",
    "amdmntData",
    "splmtryData"
})
public class RequestToPayDebtorActivationAmendmentRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected ActivationHeader2 hdr;
    @XmlElement(name = "AmdmntData", required = true)
    protected List<DebtorActivationAmendment3> amdmntData;
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
    public RequestToPayDebtorActivationAmendmentRequestV01 setHdr(ActivationHeader2 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the amdmntData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amdmntData property.
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
     * {@link DebtorActivationAmendment3 }
     * 
     * 
     */
    public List<DebtorActivationAmendment3> getAmdmntData() {
        if (amdmntData == null) {
            amdmntData = new ArrayList<DebtorActivationAmendment3>();
        }
        return this.amdmntData;
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
     * Adds a new item to the amdmntData list.
     * @see #getAmdmntData()
     * 
     */
    public RequestToPayDebtorActivationAmendmentRequestV01 addAmdmntData(DebtorActivationAmendment3 amdmntData) {
        getAmdmntData().add(amdmntData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public RequestToPayDebtorActivationAmendmentRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
