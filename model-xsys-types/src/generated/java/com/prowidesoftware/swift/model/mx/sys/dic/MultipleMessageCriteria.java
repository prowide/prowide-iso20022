
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for MultipleMessageCriteria complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleMessageCriteria", propOrder = {
    "maxNm",
    "inptSeqCrit",
    "inptTmCrit",
    "outptSeqCrit",
    "outptTmCrit",
    "addtnlFltrCrit"
})
public class MultipleMessageCriteria {

    @XmlElement(name = "MaxNm", required = true)
    protected BigDecimal maxNm;
    @XmlElement(name = "InptSeqCrit")
    protected InputSequenceCriteria inptSeqCrit;
    @XmlElement(name = "InptTmCrit")
    protected InputTimeCriteria inptTmCrit;
    @XmlElement(name = "OutptSeqCrit")
    protected OutputSequenceCriteria outptSeqCrit;
    @XmlElement(name = "OutptTmCrit")
    protected OutputTimeCriteria outptTmCrit;
    @XmlElement(name = "AddtnlFltrCrit")
    protected AdditionalFilterCriteria addtnlFltrCrit;

    /**
     * Gets the value of the maxNm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNm() {
        return maxNm;
    }

    /**
     * Sets the value of the maxNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MultipleMessageCriteria setMaxNm(BigDecimal value) {
        this.maxNm = value;
        return this;
    }

    /**
     * Gets the value of the inptSeqCrit property.
     * 
     * @return
     *     possible object is
     *     {@link InputSequenceCriteria }
     *     
     */
    public InputSequenceCriteria getInptSeqCrit() {
        return inptSeqCrit;
    }

    /**
     * Sets the value of the inptSeqCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputSequenceCriteria }
     *     
     */
    public MultipleMessageCriteria setInptSeqCrit(InputSequenceCriteria value) {
        this.inptSeqCrit = value;
        return this;
    }

    /**
     * Gets the value of the inptTmCrit property.
     * 
     * @return
     *     possible object is
     *     {@link InputTimeCriteria }
     *     
     */
    public InputTimeCriteria getInptTmCrit() {
        return inptTmCrit;
    }

    /**
     * Sets the value of the inptTmCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputTimeCriteria }
     *     
     */
    public MultipleMessageCriteria setInptTmCrit(InputTimeCriteria value) {
        this.inptTmCrit = value;
        return this;
    }

    /**
     * Gets the value of the outptSeqCrit property.
     * 
     * @return
     *     possible object is
     *     {@link OutputSequenceCriteria }
     *     
     */
    public OutputSequenceCriteria getOutptSeqCrit() {
        return outptSeqCrit;
    }

    /**
     * Sets the value of the outptSeqCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputSequenceCriteria }
     *     
     */
    public MultipleMessageCriteria setOutptSeqCrit(OutputSequenceCriteria value) {
        this.outptSeqCrit = value;
        return this;
    }

    /**
     * Gets the value of the outptTmCrit property.
     * 
     * @return
     *     possible object is
     *     {@link OutputTimeCriteria }
     *     
     */
    public OutputTimeCriteria getOutptTmCrit() {
        return outptTmCrit;
    }

    /**
     * Sets the value of the outptTmCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputTimeCriteria }
     *     
     */
    public MultipleMessageCriteria setOutptTmCrit(OutputTimeCriteria value) {
        this.outptTmCrit = value;
        return this;
    }

    /**
     * Gets the value of the addtnlFltrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFilterCriteria }
     *     
     */
    public AdditionalFilterCriteria getAddtnlFltrCrit() {
        return addtnlFltrCrit;
    }

    /**
     * Sets the value of the addtnlFltrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFilterCriteria }
     *     
     */
    public MultipleMessageCriteria setAddtnlFltrCrit(AdditionalFilterCriteria value) {
        this.addtnlFltrCrit = value;
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
