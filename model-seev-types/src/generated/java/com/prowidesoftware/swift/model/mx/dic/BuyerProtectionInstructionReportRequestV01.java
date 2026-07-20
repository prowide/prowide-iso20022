
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
 * Scope
 * The BuyerProtectionInstructionReportRequest message is sent by an account owner or its designated agent to an account servicer to request a report of all buyer protection instructions at the safekeeping account level for one or more corporate action events or at the corporate action event level for one or more safekeeping accounts.
 * 
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate), using the relevant elements in the business application header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerProtectionInstructionReportRequestV01", propOrder = {
    "qryRef",
    "buyrPrtcnSelctnCrit",
    "splmtryData"
})
public class BuyerProtectionInstructionReportRequestV01 {

    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "BuyrPrtcnSelctnCrit", required = true)
    protected BuyerProtectionSelectionCriteria1 buyrPrtcnSelctnCrit;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BuyerProtectionInstructionReportRequestV01 setQryRef(String value) {
        this.qryRef = value;
        return this;
    }

    /**
     * Gets the value of the buyrPrtcnSelctnCrit property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProtectionSelectionCriteria1 }
     *     
     */
    public BuyerProtectionSelectionCriteria1 getBuyrPrtcnSelctnCrit() {
        return buyrPrtcnSelctnCrit;
    }

    /**
     * Sets the value of the buyrPrtcnSelctnCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProtectionSelectionCriteria1 }
     *     
     */
    public BuyerProtectionInstructionReportRequestV01 setBuyrPrtcnSelctnCrit(BuyerProtectionSelectionCriteria1 value) {
        this.buyrPrtcnSelctnCrit = value;
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
    public BuyerProtectionInstructionReportRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
