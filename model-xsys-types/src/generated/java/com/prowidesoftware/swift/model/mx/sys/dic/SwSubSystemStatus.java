
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for SubSystemStatus complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubSystemStatus", propOrder = {
    "subSystem",
    "subSystemStatusValue",
    "processStatus",
    "executableStatus"
})
public class SwSubSystemStatus {

    @XmlElement(name = "SubSystem", required = true)
    protected String subSystem;
    @XmlElement(name = "SubSystemStatusValue", required = true)
    protected String subSystemStatusValue;
    @XmlElement(name = "ProcessStatus")
    protected List<SwProcessStatus> processStatus;
    @XmlElement(name = "ExecutableStatus")
    protected List<SwExecutableStatus> executableStatus;

    /**
     * Gets the value of the subSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSystem() {
        return subSystem;
    }

    /**
     * Sets the value of the subSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSubSystemStatus setSubSystem(String value) {
        this.subSystem = value;
        return this;
    }

    /**
     * Gets the value of the subSystemStatusValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSystemStatusValue() {
        return subSystemStatusValue;
    }

    /**
     * Sets the value of the subSystemStatusValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSubSystemStatus setSubSystemStatusValue(String value) {
        this.subSystemStatusValue = value;
        return this;
    }

    /**
     * Gets the value of the processStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwProcessStatus }
     * 
     * 
     */
    public List<SwProcessStatus> getProcessStatus() {
        if (processStatus == null) {
            processStatus = new ArrayList<SwProcessStatus>();
        }
        return this.processStatus;
    }

    /**
     * Gets the value of the executableStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executableStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutableStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwExecutableStatus }
     * 
     * 
     */
    public List<SwExecutableStatus> getExecutableStatus() {
        if (executableStatus == null) {
            executableStatus = new ArrayList<SwExecutableStatus>();
        }
        return this.executableStatus;
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
     * Adds a new item to the processStatus list.
     * @see #getProcessStatus()
     * 
     */
    public SwSubSystemStatus addProcessStatus(SwProcessStatus processStatus) {
        getProcessStatus().add(processStatus);
        return this;
    }

    /**
     * Adds a new item to the executableStatus list.
     * @see #getExecutableStatus()
     * 
     */
    public SwSubSystemStatus addExecutableStatus(SwExecutableStatus executableStatus) {
        getExecutableStatus().add(executableStatus);
        return this;
    }

}
