
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
 * Status of the acceptor system containing the identification of the POI (Point Of Interaction), its components and their installed versions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReport8", propOrder = {
    "poiId",
    "initgTrggr",
    "termnlMgrId",
    "dataSet"
})
public class StatusReport8 {

    @XmlElement(name = "POIId", required = true)
    protected GenericIdentification71 poiId;
    @XmlElement(name = "InitgTrggr")
    protected TriggerInformation1 initgTrggr;
    @XmlElement(name = "TermnlMgrId", required = true)
    protected GenericIdentification71 termnlMgrId;
    @XmlElement(name = "DataSet", required = true)
    protected TerminalManagementDataSet28 dataSet;

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification71 }
     *     
     */
    public GenericIdentification71 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification71 }
     *     
     */
    public StatusReport8 setPOIId(GenericIdentification71 value) {
        this.poiId = value;
        return this;
    }

    /**
     * Gets the value of the initgTrggr property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerInformation1 }
     *     
     */
    public TriggerInformation1 getInitgTrggr() {
        return initgTrggr;
    }

    /**
     * Sets the value of the initgTrggr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerInformation1 }
     *     
     */
    public StatusReport8 setInitgTrggr(TriggerInformation1 value) {
        this.initgTrggr = value;
        return this;
    }

    /**
     * Gets the value of the termnlMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification71 }
     *     
     */
    public GenericIdentification71 getTermnlMgrId() {
        return termnlMgrId;
    }

    /**
     * Sets the value of the termnlMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification71 }
     *     
     */
    public StatusReport8 setTermnlMgrId(GenericIdentification71 value) {
        this.termnlMgrId = value;
        return this;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementDataSet28 }
     *     
     */
    public TerminalManagementDataSet28 getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementDataSet28 }
     *     
     */
    public StatusReport8 setDataSet(TerminalManagementDataSet28 value) {
        this.dataSet = value;
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
