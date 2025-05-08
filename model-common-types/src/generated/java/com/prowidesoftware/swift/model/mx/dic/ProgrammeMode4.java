
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
 * Proposed or applied programme, network, or brand processes the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgrammeMode4", propOrder = {
    "propsdId",
    "apldId",
    "addtlId",
    "idSelctdBy"
})
public class ProgrammeMode4 {

    @XmlElement(name = "PropsdId")
    protected List<String> propsdId;
    @XmlElement(name = "ApldId")
    protected String apldId;
    @XmlElement(name = "AddtlId")
    protected List<AdditionalData1> addtlId;
    @XmlElement(name = "IdSelctdBy")
    @XmlSchemaType(name = "string")
    protected PartyType20Code idSelctdBy;

    /**
     * Gets the value of the propsdId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the propsdId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropsdId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the propsdId property.
     */
    public List<String> getPropsdId() {
        if (propsdId == null) {
            propsdId = new ArrayList<>();
        }
        return this.propsdId;
    }

    /**
     * Gets the value of the apldId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApldId() {
        return apldId;
    }

    /**
     * Sets the value of the apldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProgrammeMode4 setApldId(String value) {
        this.apldId = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlId property.
     */
    public List<AdditionalData1> getAddtlId() {
        if (addtlId == null) {
            addtlId = new ArrayList<>();
        }
        return this.addtlId;
    }

    /**
     * Gets the value of the idSelctdBy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType20Code }
     *     
     */
    public PartyType20Code getIdSelctdBy() {
        return idSelctdBy;
    }

    /**
     * Sets the value of the idSelctdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType20Code }
     *     
     */
    public ProgrammeMode4 setIdSelctdBy(PartyType20Code value) {
        this.idSelctdBy = value;
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

    /**
     * Adds a new item to the propsdId list.
     * @see #getPropsdId()
     * 
     */
    public ProgrammeMode4 addPropsdId(String propsdId) {
        getPropsdId().add(propsdId);
        return this;
    }

    /**
     * Adds a new item to the addtlId list.
     * @see #getAddtlId()
     * 
     */
    public ProgrammeMode4 addAddtlId(AdditionalData1 addtlId) {
        getAddtlId().add(addtlId);
        return this;
    }

}
