
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
 * Information on the cassette of an ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCassette3", propOrder = {
    "physId",
    "logclId",
    "srlNb",
    "tp",
    "subTp",
    "mdiaTp",
    "mdiaCntrs",
    "cssttSts"
})
public class ATMCassette3 {

    @XmlElement(name = "PhysId")
    protected String physId;
    @XmlElement(name = "LogclId", required = true)
    protected String logclId;
    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCassetteType1Code tp;
    @XmlElement(name = "SubTp")
    @XmlSchemaType(name = "string")
    protected List<ATMNoteType1Code> subTp;
    @XmlElement(name = "MdiaTp")
    @XmlSchemaType(name = "string")
    protected ATMMediaType4Code mdiaTp;
    @XmlElement(name = "MdiaCntrs")
    protected List<ATMCassetteCounters6> mdiaCntrs;
    @XmlElement(name = "CssttSts")
    @XmlSchemaType(name = "string")
    protected ATMCassetteStatus1Code cssttSts;

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
    public ATMCassette3 setPhysId(String value) {
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
    public ATMCassette3 setLogclId(String value) {
        this.logclId = value;
        return this;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCassette3 setSrlNb(String value) {
        this.srlNb = value;
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
    public ATMCassette3 setTp(ATMCassetteType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the subTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subTp property.
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
     */
    public List<ATMNoteType1Code> getSubTp() {
        if (subTp == null) {
            subTp = new ArrayList<ATMNoteType1Code>();
        }
        return this.subTp;
    }

    /**
     * Gets the value of the mdiaTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType4Code }
     *     
     */
    public ATMMediaType4Code getMdiaTp() {
        return mdiaTp;
    }

    /**
     * Sets the value of the mdiaTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType4Code }
     *     
     */
    public ATMCassette3 setMdiaTp(ATMMediaType4Code value) {
        this.mdiaTp = value;
        return this;
    }

    /**
     * Gets the value of the mdiaCntrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mdiaCntrs property.
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
     * {@link ATMCassetteCounters6 }
     * 
     * 
     */
    public List<ATMCassetteCounters6> getMdiaCntrs() {
        if (mdiaCntrs == null) {
            mdiaCntrs = new ArrayList<ATMCassetteCounters6>();
        }
        return this.mdiaCntrs;
    }

    /**
     * Gets the value of the cssttSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCassetteStatus1Code }
     *     
     */
    public ATMCassetteStatus1Code getCssttSts() {
        return cssttSts;
    }

    /**
     * Sets the value of the cssttSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCassetteStatus1Code }
     *     
     */
    public ATMCassette3 setCssttSts(ATMCassetteStatus1Code value) {
        this.cssttSts = value;
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
     * Adds a new item to the subTp list.
     * @see #getSubTp()
     * 
     */
    public ATMCassette3 addSubTp(ATMNoteType1Code subTp) {
        getSubTp().add(subTp);
        return this;
    }

    /**
     * Adds a new item to the mdiaCntrs list.
     * @see #getMdiaCntrs()
     * 
     */
    public ATMCassette3 addMdiaCntrs(ATMCassetteCounters6 mdiaCntrs) {
        getMdiaCntrs().add(mdiaCntrs);
        return this;
    }

}
