
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
 * Acceptor configuration to be downloaded from the terminal management system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorConfiguration10", propOrder = {
    "termnlMgrId",
    "poiGrpId",
    "dataSet"
})
public class AcceptorConfiguration10 {

    @XmlElement(name = "TermnlMgrId", required = true)
    protected GenericIdentification176 termnlMgrId;
    @XmlElement(name = "POIGrpId")
    protected List<String> poiGrpId;
    @XmlElement(name = "DataSet", required = true)
    protected List<AcceptorConfigurationDataSet2> dataSet;

    /**
     * Gets the value of the termnlMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getTermnlMgrId() {
        return termnlMgrId;
    }

    /**
     * Sets the value of the termnlMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public AcceptorConfiguration10 setTermnlMgrId(GenericIdentification176 value) {
        this.termnlMgrId = value;
        return this;
    }

    /**
     * Gets the value of the poiGrpId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiGrpId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOIGrpId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the poiGrpId property.
     */
    public List<String> getPOIGrpId() {
        if (poiGrpId == null) {
            poiGrpId = new ArrayList<>();
        }
        return this.poiGrpId;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dataSet property.
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
     * {@link AcceptorConfigurationDataSet2 }
     * 
     * 
     * @return
     *     The value of the dataSet property.
     */
    public List<AcceptorConfigurationDataSet2> getDataSet() {
        if (dataSet == null) {
            dataSet = new ArrayList<>();
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
     * Adds a new item to the pOIGrpId list.
     * @see #getPOIGrpId()
     * 
     */
    public AcceptorConfiguration10 addPOIGrpId(String pOIGrpId) {
        getPOIGrpId().add(pOIGrpId);
        return this;
    }

    /**
     * Adds a new item to the dataSet list.
     * @see #getDataSet()
     * 
     */
    public AcceptorConfiguration10 addDataSet(AcceptorConfigurationDataSet2 dataSet) {
        getDataSet().add(dataSet);
        return this;
    }

}
