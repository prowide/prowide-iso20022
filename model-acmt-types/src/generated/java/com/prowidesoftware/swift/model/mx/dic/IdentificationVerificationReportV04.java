
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
@XmlType(name = "IdentificationVerificationReportV04", propOrder = {
    "assgnmt",
    "orgnlAssgnmt",
    "rpt",
    "splmtryData"
})
public class IdentificationVerificationReportV04 {

    @XmlElement(name = "Assgnmt", required = true)
    protected IdentificationAssignment4 assgnmt;
    @XmlElement(name = "OrgnlAssgnmt")
    protected MessageIdentification8 orgnlAssgnmt;
    @XmlElement(name = "Rpt", required = true)
    protected List<VerificationReport5> rpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationAssignment4 }
     *     
     */
    public IdentificationAssignment4 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationAssignment4 }
     *     
     */
    public IdentificationVerificationReportV04 setAssgnmt(IdentificationAssignment4 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlAssgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification8 }
     *     
     */
    public MessageIdentification8 getOrgnlAssgnmt() {
        return orgnlAssgnmt;
    }

    /**
     * Sets the value of the orgnlAssgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification8 }
     *     
     */
    public IdentificationVerificationReportV04 setOrgnlAssgnmt(MessageIdentification8 value) {
        this.orgnlAssgnmt = value;
        return this;
    }

    /**
     * Gets the value of the rpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rpt property.
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
     * {@link VerificationReport5 }
     * 
     * 
     * @return
     *     The value of the rpt property.
     */
    public List<VerificationReport5> getRpt() {
        if (rpt == null) {
            rpt = new ArrayList<>();
        }
        return this.rpt;
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
     * Adds a new item to the rpt list.
     * @see #getRpt()
     * 
     */
    public IdentificationVerificationReportV04 addRpt(VerificationReport5 rpt) {
        getRpt().add(rpt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public IdentificationVerificationReportV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
