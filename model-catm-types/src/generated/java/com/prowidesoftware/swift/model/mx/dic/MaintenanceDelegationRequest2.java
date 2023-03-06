
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
 * Information related to the request of maintenance delegations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDelegationRequest2", propOrder = {
    "tmId",
    "mstrTMId",
    "reqdDlgtn"
})
public class MaintenanceDelegationRequest2 {

    @XmlElement(name = "TMId", required = true)
    protected GenericIdentification72 tmId;
    @XmlElement(name = "MstrTMId")
    protected GenericIdentification72 mstrTMId;
    @XmlElement(name = "ReqdDlgtn", required = true)
    protected List<MaintenanceDelegation3> reqdDlgtn;

    /**
     * Gets the value of the tmId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification72 }
     *     
     */
    public GenericIdentification72 getTMId() {
        return tmId;
    }

    /**
     * Sets the value of the tmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification72 }
     *     
     */
    public MaintenanceDelegationRequest2 setTMId(GenericIdentification72 value) {
        this.tmId = value;
        return this;
    }

    /**
     * Gets the value of the mstrTMId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification72 }
     *     
     */
    public GenericIdentification72 getMstrTMId() {
        return mstrTMId;
    }

    /**
     * Sets the value of the mstrTMId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification72 }
     *     
     */
    public MaintenanceDelegationRequest2 setMstrTMId(GenericIdentification72 value) {
        this.mstrTMId = value;
        return this;
    }

    /**
     * Gets the value of the reqdDlgtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqdDlgtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdDlgtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceDelegation3 }
     * 
     * 
     */
    public List<MaintenanceDelegation3> getReqdDlgtn() {
        if (reqdDlgtn == null) {
            reqdDlgtn = new ArrayList<MaintenanceDelegation3>();
        }
        return this.reqdDlgtn;
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
     * Adds a new item to the reqdDlgtn list.
     * @see #getReqdDlgtn()
     * 
     */
    public MaintenanceDelegationRequest2 addReqdDlgtn(MaintenanceDelegation3 reqdDlgtn) {
        getReqdDlgtn().add(reqdDlgtn);
        return this;
    }

}
