
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
 * Information on the cassette of an ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCassette1", propOrder = {
    "physId",
    "logclId",
    "tp",
    "subTp",
    "mdiaTp",
    "mdiaCntrs"
})
public class ATMCassette1 {

    @XmlElement(name = "PhysId")
    protected String physId;
    @XmlElement(name = "LogclId", required = true)
    protected String logclId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCassetteType1Code tp;
    @XmlElement(name = "SubTp")
    @XmlSchemaType(name = "string")
    protected List<ATMNoteType1Code> subTp;
    @XmlElement(name = "MdiaTp")
    @XmlSchemaType(name = "string")
    protected ATMMediaType1Code mdiaTp;
    @XmlElement(name = "MdiaCntrs")
    protected List<ATMCassetteCounters1> mdiaCntrs;

    /**
     * Gets the value of the physId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysId() {
        return physId;
    }

    /**
     * Sets the value of the physId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCassette1 setPhysId(String value) {
        this.physId = value;
        return this;
    }

    /**
     * Gets the value of the logclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogclId() {
        return logclId;
    }

    /**
     * Sets the value of the logclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCassette1 setLogclId(String value) {
        this.logclId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCassetteType1Code }
     *     
     */
    public ATMCassetteType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCassetteType1Code }
     *     
     */
    public ATMCassette1 setTp(ATMCassetteType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the subTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMNoteType1Code }
     * 
     * 
     * @return
     *     The value of the subTp property.
     */
    public List<ATMNoteType1Code> getSubTp() {
        if (subTp == null) {
            subTp = new ArrayList<>();
        }
        return this.subTp;
    }

    /**
     * Gets the value of the mdiaTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType1Code }
     *     
     */
    public ATMMediaType1Code getMdiaTp() {
        return mdiaTp;
    }

    /**
     * Sets the value of the mdiaTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType1Code }
     *     
     */
    public ATMCassette1 setMdiaTp(ATMMediaType1Code value) {
        this.mdiaTp = value;
        return this;
    }

    /**
     * Gets the value of the mdiaCntrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mdiaCntrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMdiaCntrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCassetteCounters1 }
     * 
     * 
     * @return
     *     The value of the mdiaCntrs property.
     */
    public List<ATMCassetteCounters1> getMdiaCntrs() {
        if (mdiaCntrs == null) {
            mdiaCntrs = new ArrayList<>();
        }
        return this.mdiaCntrs;
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
     * Adds a new item to the subTp list.
     * @see #getSubTp()
     * 
     */
    public ATMCassette1 addSubTp(ATMNoteType1Code subTp) {
        getSubTp().add(subTp);
        return this;
    }

    /**
     * Adds a new item to the mdiaCntrs list.
     * @see #getMdiaCntrs()
     * 
     */
    public ATMCassette1 addMdiaCntrs(ATMCassetteCounters1 mdiaCntrs) {
        getMdiaCntrs().add(mdiaCntrs);
        return this;
    }

}
