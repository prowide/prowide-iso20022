
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * ATM information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomatedTellerMachine4", propOrder = {
    "id",
    "addtlId",
    "seqNb",
    "baseCcy",
    "lctn",
    "lctnCtgy",
    "cpblties",
    "eqpmnt",
    "avlblDvc"
})
public class AutomatedTellerMachine4 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AddtlId")
    protected String addtlId;
    @XmlElement(name = "SeqNb")
    protected String seqNb;
    @XmlElement(name = "BaseCcy", required = true)
    protected String baseCcy;
    @XmlElement(name = "Lctn")
    protected PostalAddress17 lctn;
    @XmlElement(name = "LctnCtgy")
    @XmlSchemaType(name = "string")
    protected TransactionEnvironment2Code lctnCtgy;
    @XmlElement(name = "Cpblties")
    protected PointOfInteractionCapabilities5 cpblties;
    @XmlElement(name = "Eqpmnt")
    protected ATMEquipment1 eqpmnt;
    @XmlElement(name = "AvlblDvc")
    @XmlSchemaType(name = "string")
    protected List<ATMDevice2Code> avlblDvc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AutomatedTellerMachine4 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AutomatedTellerMachine4 setAddtlId(String value) {
        this.addtlId = value;
        return this;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AutomatedTellerMachine4 setSeqNb(String value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the baseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcy() {
        return baseCcy;
    }

    /**
     * Sets the value of the baseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AutomatedTellerMachine4 setBaseCcy(String value) {
        this.baseCcy = value;
        return this;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress17 }
     *     
     */
    public PostalAddress17 getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress17 }
     *     
     */
    public AutomatedTellerMachine4 setLctn(PostalAddress17 value) {
        this.lctn = value;
        return this;
    }

    /**
     * Gets the value of the lctnCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEnvironment2Code }
     *     
     */
    public TransactionEnvironment2Code getLctnCtgy() {
        return lctnCtgy;
    }

    /**
     * Sets the value of the lctnCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEnvironment2Code }
     *     
     */
    public AutomatedTellerMachine4 setLctnCtgy(TransactionEnvironment2Code value) {
        this.lctnCtgy = value;
        return this;
    }

    /**
     * Gets the value of the cpblties property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities5 }
     *     
     */
    public PointOfInteractionCapabilities5 getCpblties() {
        return cpblties;
    }

    /**
     * Sets the value of the cpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities5 }
     *     
     */
    public AutomatedTellerMachine4 setCpblties(PointOfInteractionCapabilities5 value) {
        this.cpblties = value;
        return this;
    }

    /**
     * Gets the value of the eqpmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEquipment1 }
     *     
     */
    public ATMEquipment1 getEqpmnt() {
        return eqpmnt;
    }

    /**
     * Sets the value of the eqpmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEquipment1 }
     *     
     */
    public AutomatedTellerMachine4 setEqpmnt(ATMEquipment1 value) {
        this.eqpmnt = value;
        return this;
    }

    /**
     * Gets the value of the avlblDvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avlblDvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlblDvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMDevice2Code }
     * 
     * 
     */
    public List<ATMDevice2Code> getAvlblDvc() {
        if (avlblDvc == null) {
            avlblDvc = new ArrayList<ATMDevice2Code>();
        }
        return this.avlblDvc;
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
     * Adds a new item to the avlblDvc list.
     * @see #getAvlblDvc()
     * 
     */
    public AutomatedTellerMachine4 addAvlblDvc(ATMDevice2Code avlblDvc) {
        getAvlblDvc().add(avlblDvc);
        return this;
    }

}
