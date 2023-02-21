
package com.prowidesoftware.swift.model.mx.dic;

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
 * Sequence of terminal management actions to be performed by a point of interaction (POI).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementPlan2", propOrder = {
    "poiId",
    "termnlMgrId",
    "dataSet"
})
public class ManagementPlan2 {

    @XmlElement(name = "POIId")
    protected GenericIdentification35 poiId;
    @XmlElement(name = "TermnlMgrId", required = true)
    protected GenericIdentification35 termnlMgrId;
    @XmlElement(name = "DataSet", required = true)
    protected List<TerminalManagementDataSet5> dataSet;

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification35 }
     *     
     */
    public GenericIdentification35 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification35 }
     *     
     */
    public ManagementPlan2 setPOIId(GenericIdentification35 value) {
        this.poiId = value;
        return this;
    }

    /**
     * Gets the value of the termnlMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification35 }
     *     
     */
    public GenericIdentification35 getTermnlMgrId() {
        return termnlMgrId;
    }

    /**
     * Sets the value of the termnlMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification35 }
     *     
     */
    public ManagementPlan2 setTermnlMgrId(GenericIdentification35 value) {
        this.termnlMgrId = value;
        return this;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalManagementDataSet5 }
     * 
     * 
     */
    public List<TerminalManagementDataSet5> getDataSet() {
        if (dataSet == null) {
            dataSet = new ArrayList<TerminalManagementDataSet5>();
        }
        return this.dataSet;
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
     * Adds a new item to the dataSet list.
     * @see #getDataSet()
     * 
     */
    public ManagementPlan2 addDataSet(TerminalManagementDataSet5 dataSet) {
        getDataSet().add(dataSet);
        return this;
    }

}
