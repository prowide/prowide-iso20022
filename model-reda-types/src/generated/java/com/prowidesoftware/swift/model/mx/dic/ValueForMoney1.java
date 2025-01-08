
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Additional information about UK Value For Money to complement the UK consumer duty regime.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueForMoney1", propOrder = {
    "emtDataRptgVFMUK",
    "assmntOfValReqrdUdrCOLLUK",
    "outcmOfCOLLAssmntOfValUK",
    "outcmOfPRINValAssmntOrRvwUK",
    "othrRvwRltdToValAndOrChrgsUK",
    "frthrInfUK",
    "rvwDtUK",
    "rvwNxtDueUK"
})
public class ValueForMoney1 {

    @XmlElement(name = "EMTDataRptgVFMUK")
    @XmlSchemaType(name = "string")
    protected EMTDataReportingVFMUKType1Code emtDataRptgVFMUK;
    @XmlElement(name = "AssmntOfValReqrdUdrCOLLUK")
    @XmlSchemaType(name = "string")
    protected AssessmentOfValueRequiredUnderCOLLUKType1Code assmntOfValReqrdUdrCOLLUK;
    @XmlElement(name = "OutcmOfCOLLAssmntOfValUK")
    @XmlSchemaType(name = "string")
    protected OutcomeOfCOLLAssessmentOfValueUKType1Code outcmOfCOLLAssmntOfValUK;
    @XmlElement(name = "OutcmOfPRINValAssmntOrRvwUK")
    @XmlSchemaType(name = "string")
    protected OutcomeOfPRINValueAssessmentOrReviewUKType1Code outcmOfPRINValAssmntOrRvwUK;
    @XmlElement(name = "OthrRvwRltdToValAndOrChrgsUK")
    @XmlSchemaType(name = "string")
    protected OtherReviewRelatedToValueAndOrChargesUKType1Code othrRvwRltdToValAndOrChrgsUK;
    @XmlElement(name = "FrthrInfUK")
    protected String frthrInfUK;
    @XmlElement(name = "RvwDtUK", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate rvwDtUK;
    @XmlElement(name = "RvwNxtDueUK", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate rvwNxtDueUK;

    /**
     * Gets the value of the emtDataRptgVFMUK property.
     * 
     * @return
     *     possible object is
     *     {@link EMTDataReportingVFMUKType1Code }
     *     
     */
    public EMTDataReportingVFMUKType1Code getEMTDataRptgVFMUK() {
        return emtDataRptgVFMUK;
    }

    /**
     * Sets the value of the emtDataRptgVFMUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMTDataReportingVFMUKType1Code }
     *     
     */
    public ValueForMoney1 setEMTDataRptgVFMUK(EMTDataReportingVFMUKType1Code value) {
        this.emtDataRptgVFMUK = value;
        return this;
    }

    /**
     * Gets the value of the assmntOfValReqrdUdrCOLLUK property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentOfValueRequiredUnderCOLLUKType1Code }
     *     
     */
    public AssessmentOfValueRequiredUnderCOLLUKType1Code getAssmntOfValReqrdUdrCOLLUK() {
        return assmntOfValReqrdUdrCOLLUK;
    }

    /**
     * Sets the value of the assmntOfValReqrdUdrCOLLUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentOfValueRequiredUnderCOLLUKType1Code }
     *     
     */
    public ValueForMoney1 setAssmntOfValReqrdUdrCOLLUK(AssessmentOfValueRequiredUnderCOLLUKType1Code value) {
        this.assmntOfValReqrdUdrCOLLUK = value;
        return this;
    }

    /**
     * Gets the value of the outcmOfCOLLAssmntOfValUK property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeOfCOLLAssessmentOfValueUKType1Code }
     *     
     */
    public OutcomeOfCOLLAssessmentOfValueUKType1Code getOutcmOfCOLLAssmntOfValUK() {
        return outcmOfCOLLAssmntOfValUK;
    }

    /**
     * Sets the value of the outcmOfCOLLAssmntOfValUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeOfCOLLAssessmentOfValueUKType1Code }
     *     
     */
    public ValueForMoney1 setOutcmOfCOLLAssmntOfValUK(OutcomeOfCOLLAssessmentOfValueUKType1Code value) {
        this.outcmOfCOLLAssmntOfValUK = value;
        return this;
    }

    /**
     * Gets the value of the outcmOfPRINValAssmntOrRvwUK property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeOfPRINValueAssessmentOrReviewUKType1Code }
     *     
     */
    public OutcomeOfPRINValueAssessmentOrReviewUKType1Code getOutcmOfPRINValAssmntOrRvwUK() {
        return outcmOfPRINValAssmntOrRvwUK;
    }

    /**
     * Sets the value of the outcmOfPRINValAssmntOrRvwUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeOfPRINValueAssessmentOrReviewUKType1Code }
     *     
     */
    public ValueForMoney1 setOutcmOfPRINValAssmntOrRvwUK(OutcomeOfPRINValueAssessmentOrReviewUKType1Code value) {
        this.outcmOfPRINValAssmntOrRvwUK = value;
        return this;
    }

    /**
     * Gets the value of the othrRvwRltdToValAndOrChrgsUK property.
     * 
     * @return
     *     possible object is
     *     {@link OtherReviewRelatedToValueAndOrChargesUKType1Code }
     *     
     */
    public OtherReviewRelatedToValueAndOrChargesUKType1Code getOthrRvwRltdToValAndOrChrgsUK() {
        return othrRvwRltdToValAndOrChrgsUK;
    }

    /**
     * Sets the value of the othrRvwRltdToValAndOrChrgsUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherReviewRelatedToValueAndOrChargesUKType1Code }
     *     
     */
    public ValueForMoney1 setOthrRvwRltdToValAndOrChrgsUK(OtherReviewRelatedToValueAndOrChargesUKType1Code value) {
        this.othrRvwRltdToValAndOrChrgsUK = value;
        return this;
    }

    /**
     * Gets the value of the frthrInfUK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrthrInfUK() {
        return frthrInfUK;
    }

    /**
     * Sets the value of the frthrInfUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValueForMoney1 setFrthrInfUK(String value) {
        this.frthrInfUK = value;
        return this;
    }

    /**
     * Gets the value of the rvwDtUK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRvwDtUK() {
        return rvwDtUK;
    }

    /**
     * Sets the value of the rvwDtUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValueForMoney1 setRvwDtUK(LocalDate value) {
        this.rvwDtUK = value;
        return this;
    }

    /**
     * Gets the value of the rvwNxtDueUK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRvwNxtDueUK() {
        return rvwNxtDueUK;
    }

    /**
     * Sets the value of the rvwNxtDueUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValueForMoney1 setRvwNxtDueUK(LocalDate value) {
        this.rvwNxtDueUK = value;
        return this;
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

}
