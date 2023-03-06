
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
 * Specifies the details to identify a creditor enrolment to be amended and the new amended data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorEnrolmentAmendment3", propOrder = {
    "orgnlBizInstr",
    "amdmntRsn",
    "amdmnt",
    "orgnlEnrlmnt",
    "splmtryData"
})
public class CreditorEnrolmentAmendment3 {

    @XmlElement(name = "OrgnlBizInstr")
    protected OriginalBusinessInstruction1 orgnlBizInstr;
    @XmlElement(name = "AmdmntRsn")
    protected CreditorEnrolmentAmendmentReason2 amdmntRsn;
    @XmlElement(name = "Amdmnt", required = true)
    protected CreditorEnrolmentAmendment4 amdmnt;
    @XmlElement(name = "OrgnlEnrlmnt", required = true)
    protected OriginalEnrolment2Choice orgnlEnrlmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the orgnlBizInstr property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessInstruction1 }
     *     
     */
    public OriginalBusinessInstruction1 getOrgnlBizInstr() {
        return orgnlBizInstr;
    }

    /**
     * Sets the value of the orgnlBizInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessInstruction1 }
     *     
     */
    public CreditorEnrolmentAmendment3 setOrgnlBizInstr(OriginalBusinessInstruction1 value) {
        this.orgnlBizInstr = value;
        return this;
    }

    /**
     * Gets the value of the amdmntRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorEnrolmentAmendmentReason2 }
     *     
     */
    public CreditorEnrolmentAmendmentReason2 getAmdmntRsn() {
        return amdmntRsn;
    }

    /**
     * Sets the value of the amdmntRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorEnrolmentAmendmentReason2 }
     *     
     */
    public CreditorEnrolmentAmendment3 setAmdmntRsn(CreditorEnrolmentAmendmentReason2 value) {
        this.amdmntRsn = value;
        return this;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorEnrolmentAmendment4 }
     *     
     */
    public CreditorEnrolmentAmendment4 getAmdmnt() {
        return amdmnt;
    }

    /**
     * Sets the value of the amdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorEnrolmentAmendment4 }
     *     
     */
    public CreditorEnrolmentAmendment3 setAmdmnt(CreditorEnrolmentAmendment4 value) {
        this.amdmnt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlEnrlmnt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalEnrolment2Choice }
     *     
     */
    public OriginalEnrolment2Choice getOrgnlEnrlmnt() {
        return orgnlEnrlmnt;
    }

    /**
     * Sets the value of the orgnlEnrlmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalEnrolment2Choice }
     *     
     */
    public CreditorEnrolmentAmendment3 setOrgnlEnrlmnt(OriginalEnrolment2Choice value) {
        this.orgnlEnrlmnt = value;
        return this;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CreditorEnrolmentAmendment3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
