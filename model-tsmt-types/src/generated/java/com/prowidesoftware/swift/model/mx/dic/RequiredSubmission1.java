
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
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
 * Specifies per transaction which document must be submitted and under which conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredSubmission1", propOrder = {
    "latstMtchDt",
    "reqrdComrclDataSet",
    "reqrdTrnsprtDataSet",
    "submitr"
})
public class RequiredSubmission1 {

    @XmlElement(name = "LatstMtchDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar latstMtchDt;
    @XmlElement(name = "ReqrdComrclDataSet")
    protected boolean reqrdComrclDataSet;
    @XmlElement(name = "ReqrdTrnsprtDataSet")
    protected boolean reqrdTrnsprtDataSet;
    @XmlElement(name = "Submitr", required = true)
    protected BICIdentification1 submitr;

    /**
     * Gets the value of the latstMtchDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLatstMtchDt() {
        return latstMtchDt;
    }

    /**
     * Sets the value of the latstMtchDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequiredSubmission1 setLatstMtchDt(Calendar value) {
        this.latstMtchDt = value;
        return this;
    }

    /**
     * Gets the value of the reqrdComrclDataSet property.
     * 
     */
    public boolean isReqrdComrclDataSet() {
        return reqrdComrclDataSet;
    }

    /**
     * Sets the value of the reqrdComrclDataSet property.
     * 
     */
    public RequiredSubmission1 setReqrdComrclDataSet(boolean value) {
        this.reqrdComrclDataSet = value;
        return this;
    }

    /**
     * Gets the value of the reqrdTrnsprtDataSet property.
     * 
     */
    public boolean isReqrdTrnsprtDataSet() {
        return reqrdTrnsprtDataSet;
    }

    /**
     * Sets the value of the reqrdTrnsprtDataSet property.
     * 
     */
    public RequiredSubmission1 setReqrdTrnsprtDataSet(boolean value) {
        this.reqrdTrnsprtDataSet = value;
        return this;
    }

    /**
     * Gets the value of the submitr property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSubmitr() {
        return submitr;
    }

    /**
     * Sets the value of the submitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public RequiredSubmission1 setSubmitr(BICIdentification1 value) {
        this.submitr = value;
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
