
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Assumed obligations that are required to be met in cash under a hypothetical stress scenario.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StressLiquidResourceRequirement1", propOrder = {
    "oprlOutflw",
    "vartnMrgnPmtOblgtn",
    "sttlmOrDlvry",
    "othr"
})
public class StressLiquidResourceRequirement1 {

    @XmlElement(name = "OprlOutflw", required = true)
    protected AmountAndDirection102 oprlOutflw;
    @XmlElement(name = "VartnMrgnPmtOblgtn", required = true)
    protected AmountAndDirection102 vartnMrgnPmtOblgtn;
    @XmlElement(name = "SttlmOrDlvry", required = true)
    protected AmountAndDirection102 sttlmOrDlvry;
    @XmlElement(name = "Othr", required = true)
    protected AmountAndDirection102 othr;

    /**
     * Gets the value of the oprlOutflw property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getOprlOutflw() {
        return oprlOutflw;
    }

    /**
     * Sets the value of the oprlOutflw property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public StressLiquidResourceRequirement1 setOprlOutflw(AmountAndDirection102 value) {
        this.oprlOutflw = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnPmtOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getVartnMrgnPmtOblgtn() {
        return vartnMrgnPmtOblgtn;
    }

    /**
     * Sets the value of the vartnMrgnPmtOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public StressLiquidResourceRequirement1 setVartnMrgnPmtOblgtn(AmountAndDirection102 value) {
        this.vartnMrgnPmtOblgtn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmOrDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getSttlmOrDlvry() {
        return sttlmOrDlvry;
    }

    /**
     * Sets the value of the sttlmOrDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public StressLiquidResourceRequirement1 setSttlmOrDlvry(AmountAndDirection102 value) {
        this.sttlmOrDlvry = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public StressLiquidResourceRequirement1 setOthr(AmountAndDirection102 value) {
        this.othr = value;
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
