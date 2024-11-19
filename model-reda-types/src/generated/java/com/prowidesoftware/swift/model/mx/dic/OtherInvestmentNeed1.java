
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Other investment need.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherInvestmentNeed1", propOrder = {
    "clntObjctvsAndNeedsTp",
    "trgt",
    "addtlInf"
})
public class OtherInvestmentNeed1 {

    @XmlElement(name = "ClntObjctvsAndNeedsTp")
    protected String clntObjctvsAndNeedsTp;
    @XmlElement(name = "Trgt")
    protected TargetMarket1Choice trgt;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the clntObjctvsAndNeedsTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntObjctvsAndNeedsTp() {
        return clntObjctvsAndNeedsTp;
    }

    /**
     * Sets the value of the clntObjctvsAndNeedsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherInvestmentNeed1 setClntObjctvsAndNeedsTp(String value) {
        this.clntObjctvsAndNeedsTp = value;
        return this;
    }

    /**
     * Gets the value of the trgt property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Choice }
     *     
     */
    public TargetMarket1Choice getTrgt() {
        return trgt;
    }

    /**
     * Sets the value of the trgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Choice }
     *     
     */
    public OtherInvestmentNeed1 setTrgt(TargetMarket1Choice value) {
        this.trgt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public AdditionalInformation15 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public OtherInvestmentNeed1 setAddtlInf(AdditionalInformation15 value) {
        this.addtlInf = value;
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
