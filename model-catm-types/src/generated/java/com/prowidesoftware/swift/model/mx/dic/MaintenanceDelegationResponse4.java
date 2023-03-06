
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
@XmlType(name = "MaintenanceDelegationResponse4", propOrder = {
    "tmId",
    "mstrTMId",
    "dlgtnRspn"
})
public class MaintenanceDelegationResponse4 {

    @XmlElement(name = "TMId", required = true)
    protected GenericIdentification176 tmId;
    @XmlElement(name = "MstrTMId")
    protected GenericIdentification176 mstrTMId;
    @XmlElement(name = "DlgtnRspn", required = true)
    protected List<MaintenanceDelegation9> dlgtnRspn;

    /**
     * Gets the value of the tmId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getTMId() {
        return tmId;
    }

    /**
     * Sets the value of the tmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public MaintenanceDelegationResponse4 setTMId(GenericIdentification176 value) {
        this.tmId = value;
        return this;
    }

    /**
     * Gets the value of the mstrTMId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getMstrTMId() {
        return mstrTMId;
    }

    /**
     * Sets the value of the mstrTMId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public MaintenanceDelegationResponse4 setMstrTMId(GenericIdentification176 value) {
        this.mstrTMId = value;
        return this;
    }

    /**
     * Gets the value of the dlgtnRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlgtnRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlgtnRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceDelegation9 }
     * 
     * 
     */
    public List<MaintenanceDelegation9> getDlgtnRspn() {
        if (dlgtnRspn == null) {
            dlgtnRspn = new ArrayList<MaintenanceDelegation9>();
        }
        return this.dlgtnRspn;
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
     * Adds a new item to the dlgtnRspn list.
     * @see #getDlgtnRspn()
     * 
     */
    public MaintenanceDelegationResponse4 addDlgtnRspn(MaintenanceDelegation9 dlgtnRspn) {
        getDlgtnRspn().add(dlgtnRspn);
        return this;
    }

}
