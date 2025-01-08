
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ProcessStatus complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessStatus", propOrder = {
    "process",
    "processExpected",
    "processActual"
})
public class SwProcessStatus {

    @XmlElement(name = "Process", required = true)
    protected String process;
    @XmlElement(name = "ProcessExpected", required = true)
    protected String processExpected;
    @XmlElement(name = "ProcessActual", required = true)
    protected String processActual;

    /**
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwProcessStatus setProcess(String value) {
        this.process = value;
        return this;
    }

    /**
     * Gets the value of the processExpected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessExpected() {
        return processExpected;
    }

    /**
     * Sets the value of the processExpected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwProcessStatus setProcessExpected(String value) {
        this.processExpected = value;
        return this;
    }

    /**
     * Gets the value of the processActual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessActual() {
        return processActual;
    }

    /**
     * Sets the value of the processActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwProcessStatus setProcessActual(String value) {
        this.processActual = value;
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
