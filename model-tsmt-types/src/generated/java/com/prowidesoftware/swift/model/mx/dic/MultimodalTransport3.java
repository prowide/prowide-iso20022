
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
 * Information related to multimodal transportation of goods.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimodalTransport3", propOrder = {
    "takngInChrg",
    "plcOfFnlDstn"
})
public class MultimodalTransport3 {

    @XmlElement(name = "TakngInChrg", required = true)
    protected String takngInChrg;
    @XmlElement(name = "PlcOfFnlDstn", required = true)
    protected String plcOfFnlDstn;

    /**
     * Gets the value of the takngInChrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakngInChrg() {
        return takngInChrg;
    }

    /**
     * Sets the value of the takngInChrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MultimodalTransport3 setTakngInChrg(String value) {
        this.takngInChrg = value;
        return this;
    }

    /**
     * Gets the value of the plcOfFnlDstn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfFnlDstn() {
        return plcOfFnlDstn;
    }

    /**
     * Sets the value of the plcOfFnlDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MultimodalTransport3 setPlcOfFnlDstn(String value) {
        this.plcOfFnlDstn = value;
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
