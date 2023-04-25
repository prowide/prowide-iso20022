
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
 * Specifies the status of a creditor enrolment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrolmentStatus2", propOrder = {
    "orgnlBizInstr",
    "sts",
    "stsRsn",
    "orgnlEnrlmntRef",
    "fctvEnrlmntDt",
    "splmtryData"
})
public class EnrolmentStatus2 {

    @XmlElement(name = "OrgnlBizInstr")
    protected OriginalBusinessInstruction1 orgnlBizInstr;
    @XmlElement(name = "Sts", required = true)
    protected ServiceStatus1Choice sts;
    @XmlElement(name = "StsRsn")
    protected CreditorEnrolmentStatusReason2 stsRsn;
    @XmlElement(name = "OrgnlEnrlmntRef")
    protected OriginalEnrolment2Choice orgnlEnrlmntRef;
    @XmlElement(name = "FctvEnrlmntDt")
    protected DateAndDateTime2Choice fctvEnrlmntDt;
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
    public EnrolmentStatus2 setOrgnlBizInstr(OriginalBusinessInstruction1 value) {
        this.orgnlBizInstr = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus1Choice }
     *     
     */
    public ServiceStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus1Choice }
     *     
     */
    public EnrolmentStatus2 setSts(ServiceStatus1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorEnrolmentStatusReason2 }
     *     
     */
    public CreditorEnrolmentStatusReason2 getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorEnrolmentStatusReason2 }
     *     
     */
    public EnrolmentStatus2 setStsRsn(CreditorEnrolmentStatusReason2 value) {
        this.stsRsn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlEnrlmntRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalEnrolment2Choice }
     *     
     */
    public OriginalEnrolment2Choice getOrgnlEnrlmntRef() {
        return orgnlEnrlmntRef;
    }

    /**
     * Sets the value of the orgnlEnrlmntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalEnrolment2Choice }
     *     
     */
    public EnrolmentStatus2 setOrgnlEnrlmntRef(OriginalEnrolment2Choice value) {
        this.orgnlEnrlmntRef = value;
        return this;
    }

    /**
     * Gets the value of the fctvEnrlmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getFctvEnrlmntDt() {
        return fctvEnrlmntDt;
    }

    /**
     * Sets the value of the fctvEnrlmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public EnrolmentStatus2 setFctvEnrlmntDt(DateAndDateTime2Choice value) {
        this.fctvEnrlmntDt = value;
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
    public EnrolmentStatus2 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
