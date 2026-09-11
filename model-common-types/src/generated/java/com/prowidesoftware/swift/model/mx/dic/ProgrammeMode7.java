
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
@XmlType(name = "ProgrammeMode7", propOrder = {
    "propsdId",
    "apldId",
    "idSelctdBy",
    "prvtData",
    "ntlData"
})
public class ProgrammeMode7 {

    @XmlElement(name = "PropsdId")
    protected List<String> propsdId;
    @XmlElement(name = "ApldId")
    protected String apldId;
    @XmlElement(name = "IdSelctdBy")
    @XmlSchemaType(name = "string")
    protected PartyType20Code idSelctdBy;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

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
    public ProgrammeMode7 setApldId(String value) {
        this.apldId = value;
        return this;
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
    public ProgrammeMode7 setIdSelctdBy(PartyType20Code value) {
        this.idSelctdBy = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
    public ProgrammeMode7 addPropsdId(String propsdId) {
        getPropsdId().add(propsdId);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public ProgrammeMode7 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public ProgrammeMode7 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
