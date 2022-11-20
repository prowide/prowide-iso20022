
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
 * Scope
 * The IdentificationVerificationReport message is sent by an assigner to an assignee. It is used to confirm whether or not the presented party and/or account identification information is correct.
 * Usage
 * The IdentificationVerificationReport message is sent as a response to an IdentificationVerificationRequest message.
 * The IdentificationVerificationReport message can contain one or more reports.
 * The IdentificationVerificationReport message may include a reason if the presented party and/or account identification information is confirmed to be incorrect.
 * The IdentificationVerificationReport message may include the correct party and/or account identification information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationVerificationReportV03", propOrder = {
    "assgnmt",
    "orgnlAssgnmt",
    "rpt",
    "splmtryData"
})
public class IdentificationVerificationReportV03 {

    @XmlElement(name = "Assgnmt", required = true)
    protected IdentificationAssignment3 assgnmt;
    @XmlElement(name = "OrgnlAssgnmt")
    protected MessageIdentification7 orgnlAssgnmt;
    @XmlElement(name = "Rpt", required = true)
    protected List<VerificationReport4> rpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationAssignment3 }
     *     
     */
    public IdentificationAssignment3 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationAssignment3 }
     *     
     */
    public IdentificationVerificationReportV03 setAssgnmt(IdentificationAssignment3 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlAssgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification7 }
     *     
     */
    public MessageIdentification7 getOrgnlAssgnmt() {
        return orgnlAssgnmt;
    }

    /**
     * Sets the value of the orgnlAssgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification7 }
     *     
     */
    public IdentificationVerificationReportV03 setOrgnlAssgnmt(MessageIdentification7 value) {
        this.orgnlAssgnmt = value;
        return this;
    }

    /**
     * Gets the value of the rpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationReport4 }
     * 
     * 
     */
    public List<VerificationReport4> getRpt() {
        if (rpt == null) {
            rpt = new ArrayList<VerificationReport4>();
        }
        return this.rpt;
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
     * Adds a new item to the rpt list.
     * @see #getRpt()
     * 
     */
    public IdentificationVerificationReportV03 addRpt(VerificationReport4 rpt) {
        getRpt().add(rpt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public IdentificationVerificationReportV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
