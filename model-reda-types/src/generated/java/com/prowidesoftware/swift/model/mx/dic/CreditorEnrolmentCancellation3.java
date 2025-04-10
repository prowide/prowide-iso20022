
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
 * Identifies the creditor enrolment to be cancelled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorEnrolmentCancellation3", propOrder = {
    "orgnlBizInstr",
    "cxlRsn",
    "orgnlEnrlmnt",
    "splmtryData"
})
public class CreditorEnrolmentCancellation3 {

    @XmlElement(name = "OrgnlBizInstr")
    protected OriginalBusinessInstruction1 orgnlBizInstr;
    @XmlElement(name = "CxlRsn")
    protected CreditorEnrolmentCancellationReason3 cxlRsn;
    @XmlElement(name = "OrgnlEnrlmnt", required = true)
    protected OriginalEnrolment3Choice orgnlEnrlmnt;
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
    public CreditorEnrolmentCancellation3 setOrgnlBizInstr(OriginalBusinessInstruction1 value) {
        this.orgnlBizInstr = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorEnrolmentCancellationReason3 }
     *     
     */
    public CreditorEnrolmentCancellationReason3 getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorEnrolmentCancellationReason3 }
     *     
     */
    public CreditorEnrolmentCancellation3 setCxlRsn(CreditorEnrolmentCancellationReason3 value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlEnrlmnt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalEnrolment3Choice }
     *     
     */
    public OriginalEnrolment3Choice getOrgnlEnrlmnt() {
        return orgnlEnrlmnt;
    }

    /**
     * Sets the value of the orgnlEnrlmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalEnrolment3Choice }
     *     
     */
    public CreditorEnrolmentCancellation3 setOrgnlEnrlmnt(OriginalEnrolment3Choice value) {
        this.orgnlEnrlmnt = value;
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
    public CreditorEnrolmentCancellation3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
