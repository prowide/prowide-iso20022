
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
 * Outcome of the processing of the batch.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResult3", propOrder = {
    "rsltData",
    "orgnlRsltData"
})
public class ProcessingResult3 {

    @XmlElement(name = "RsltData", required = true)
    protected ResultData2 rsltData;
    @XmlElement(name = "OrgnlRsltData")
    protected ResultData1 orgnlRsltData;

    /**
     * Gets the value of the rsltData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultData2 }
     *     
     */
    public ResultData2 getRsltData() {
        return rsltData;
    }

    /**
     * Sets the value of the rsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData2 }
     *     
     */
    public ProcessingResult3 setRsltData(ResultData2 value) {
        this.rsltData = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRsltData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultData1 }
     *     
     */
    public ResultData1 getOrgnlRsltData() {
        return orgnlRsltData;
    }

    /**
     * Sets the value of the orgnlRsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData1 }
     *     
     */
    public ProcessingResult3 setOrgnlRsltData(ResultData1 value) {
        this.orgnlRsltData = value;
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
