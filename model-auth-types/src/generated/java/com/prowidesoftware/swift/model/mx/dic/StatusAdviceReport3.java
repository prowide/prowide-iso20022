
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
 * Provides the report level status advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAdviceReport3", propOrder = {
    "sts",
    "vldtnRule",
    "msgDt",
    "sttstcs"
})
public class StatusAdviceReport3 {

    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingMessageStatus1Code sts;
    @XmlElement(name = "VldtnRule")
    protected List<GenericValidationRuleIdentification1> vldtnRule;
    @XmlElement(name = "MsgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate msgDt;
    @XmlElement(name = "Sttstcs")
    protected OriginalReportStatistics3 sttstcs;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingMessageStatus1Code }
     *     
     */
    public ReportingMessageStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingMessageStatus1Code }
     *     
     */
    public StatusAdviceReport3 setSts(ReportingMessageStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the vldtnRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vldtnRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVldtnRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericValidationRuleIdentification1 }
     * 
     * 
     * @return
     *     The value of the vldtnRule property.
     */
    public List<GenericValidationRuleIdentification1> getVldtnRule() {
        if (vldtnRule == null) {
            vldtnRule = new ArrayList<>();
        }
        return this.vldtnRule;
    }

    /**
     * Gets the value of the msgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMsgDt() {
        return msgDt;
    }

    /**
     * Sets the value of the msgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusAdviceReport3 setMsgDt(LocalDate value) {
        this.msgDt = value;
        return this;
    }

    /**
     * Gets the value of the sttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalReportStatistics3 }
     *     
     */
    public OriginalReportStatistics3 getSttstcs() {
        return sttstcs;
    }

    /**
     * Sets the value of the sttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalReportStatistics3 }
     *     
     */
    public StatusAdviceReport3 setSttstcs(OriginalReportStatistics3 value) {
        this.sttstcs = value;
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

    /**
     * Adds a new item to the vldtnRule list.
     * @see #getVldtnRule()
     * 
     */
    public StatusAdviceReport3 addVldtnRule(GenericValidationRuleIdentification1 vldtnRule) {
        getVldtnRule().add(vldtnRule);
        return this;
    }

}
