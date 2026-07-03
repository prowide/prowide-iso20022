
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
 * Information that identifies a side pocket in investment fund orders.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SidePocketInformation1", propOrder = {
    "sdPcktInclsnInd",
    "sdPcktId",
    "sdPcktQty"
})
public class SidePocketInformation1 {

    @XmlElement(name = "SdPcktInclsnInd")
    protected Boolean sdPcktInclsnInd;
    @XmlElement(name = "SdPcktId")
    protected String sdPcktId;
    @XmlElement(name = "SdPcktQty")
    protected SidePocketUnitsOrAmountOrRate1Choice sdPcktQty;

    /**
     * Gets the value of the sdPcktInclsnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSdPcktInclsnInd() {
        return sdPcktInclsnInd;
    }

    /**
     * Sets the value of the sdPcktInclsnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SidePocketInformation1 setSdPcktInclsnInd(Boolean value) {
        this.sdPcktInclsnInd = value;
        return this;
    }

    /**
     * Gets the value of the sdPcktId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdPcktId() {
        return sdPcktId;
    }

    /**
     * Sets the value of the sdPcktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SidePocketInformation1 setSdPcktId(String value) {
        this.sdPcktId = value;
        return this;
    }

    /**
     * Gets the value of the sdPcktQty property.
     * 
     * @return
     *     possible object is
     *     {@link SidePocketUnitsOrAmountOrRate1Choice }
     *     
     */
    public SidePocketUnitsOrAmountOrRate1Choice getSdPcktQty() {
        return sdPcktQty;
    }

    /**
     * Sets the value of the sdPcktQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SidePocketUnitsOrAmountOrRate1Choice }
     *     
     */
    public SidePocketInformation1 setSdPcktQty(SidePocketUnitsOrAmountOrRate1Choice value) {
        this.sdPcktQty = value;
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
