
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
@XmlType(name = "DebtorActivationAmendment5", propOrder = {
    "orgnlBizInstr",
    "amdmntRsn",
    "amdmnt",
    "orgnlActvtn",
    "splmtryData"
})
public class DebtorActivationAmendment5 {

    @XmlElement(name = "OrgnlBizInstr")
    protected OriginalBusinessInstruction1 orgnlBizInstr;
    @XmlElement(name = "AmdmntRsn")
    protected DebtorActivationAmendmentReason3 amdmntRsn;
    @XmlElement(name = "Amdmnt", required = true)
    protected DebtorActivationAmendment6 amdmnt;
    @XmlElement(name = "OrgnlActvtn", required = true)
    protected OriginalActivation3Choice orgnlActvtn;
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
    public DebtorActivationAmendment5 setOrgnlBizInstr(OriginalBusinessInstruction1 value) {
        this.orgnlBizInstr = value;
        return this;
    }

    /**
     * Gets the value of the amdmntRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorActivationAmendmentReason3 }
     *     
     */
    public DebtorActivationAmendmentReason3 getAmdmntRsn() {
        return amdmntRsn;
    }

    /**
     * Sets the value of the amdmntRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorActivationAmendmentReason3 }
     *     
     */
    public DebtorActivationAmendment5 setAmdmntRsn(DebtorActivationAmendmentReason3 value) {
        this.amdmntRsn = value;
        return this;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorActivationAmendment6 }
     *     
     */
    public DebtorActivationAmendment6 getAmdmnt() {
        return amdmnt;
    }

    /**
     * Sets the value of the amdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorActivationAmendment6 }
     *     
     */
    public DebtorActivationAmendment5 setAmdmnt(DebtorActivationAmendment6 value) {
        this.amdmnt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlActvtn property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalActivation3Choice }
     *     
     */
    public OriginalActivation3Choice getOrgnlActvtn() {
        return orgnlActvtn;
    }

    /**
     * Sets the value of the orgnlActvtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalActivation3Choice }
     *     
     */
    public DebtorActivationAmendment5 setOrgnlActvtn(OriginalActivation3Choice value) {
        this.orgnlActvtn = value;
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
    public DebtorActivationAmendment5 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
