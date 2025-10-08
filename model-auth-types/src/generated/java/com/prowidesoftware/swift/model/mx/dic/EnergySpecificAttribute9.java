
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Attributes of energy related derivatives.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergySpecificAttribute9", propOrder = {
    "dlvryPtOrZone",
    "intrCnnctnPt",
    "ldTp",
    "dlvryAttr"
})
public class EnergySpecificAttribute9 {

    @XmlElement(name = "DlvryPtOrZone")
    protected List<DeliveryInterconnectionPoint1Choice> dlvryPtOrZone;
    @XmlElement(name = "IntrCnnctnPt")
    protected DeliveryInterconnectionPoint1Choice intrCnnctnPt;
    @XmlElement(name = "LdTp")
    @XmlSchemaType(name = "string")
    protected EnergyLoadType1Code ldTp;
    @XmlElement(name = "DlvryAttr")
    protected List<EnergyDeliveryAttribute10> dlvryAttr;

    /**
     * Gets the value of the dlvryPtOrZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlvryPtOrZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryPtOrZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInterconnectionPoint1Choice }
     * 
     * 
     */
    public List<DeliveryInterconnectionPoint1Choice> getDlvryPtOrZone() {
        if (dlvryPtOrZone == null) {
            dlvryPtOrZone = new ArrayList<DeliveryInterconnectionPoint1Choice>();
        }
        return this.dlvryPtOrZone;
    }

    /**
     * Gets the value of the intrCnnctnPt property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInterconnectionPoint1Choice }
     *     
     */
    public DeliveryInterconnectionPoint1Choice getIntrCnnctnPt() {
        return intrCnnctnPt;
    }

    /**
     * Sets the value of the intrCnnctnPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInterconnectionPoint1Choice }
     *     
     */
    public EnergySpecificAttribute9 setIntrCnnctnPt(DeliveryInterconnectionPoint1Choice value) {
        this.intrCnnctnPt = value;
        return this;
    }

    /**
     * Gets the value of the ldTp property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyLoadType1Code }
     *     
     */
    public EnergyLoadType1Code getLdTp() {
        return ldTp;
    }

    /**
     * Sets the value of the ldTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyLoadType1Code }
     *     
     */
    public EnergySpecificAttribute9 setLdTp(EnergyLoadType1Code value) {
        this.ldTp = value;
        return this;
    }

    /**
     * Gets the value of the dlvryAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlvryAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyDeliveryAttribute10 }
     * 
     * 
     */
    public List<EnergyDeliveryAttribute10> getDlvryAttr() {
        if (dlvryAttr == null) {
            dlvryAttr = new ArrayList<EnergyDeliveryAttribute10>();
        }
        return this.dlvryAttr;
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
     * Adds a new item to the dlvryPtOrZone list.
     * @see #getDlvryPtOrZone()
     * 
     */
    public EnergySpecificAttribute9 addDlvryPtOrZone(DeliveryInterconnectionPoint1Choice dlvryPtOrZone) {
        getDlvryPtOrZone().add(dlvryPtOrZone);
        return this;
    }

    /**
     * Adds a new item to the dlvryAttr list.
     * @see #getDlvryAttr()
     * 
     */
    public EnergySpecificAttribute9 addDlvryAttr(EnergyDeliveryAttribute10 dlvryAttr) {
        getDlvryAttr().add(dlvryAttr);
        return this;
    }

}
