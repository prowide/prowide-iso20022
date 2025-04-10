
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
 * Configuration parameters to communicate with a sale system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIProtocolParameter2", propOrder = {
    "actnTp",
    "mrchntId",
    "vrsn",
    "hstId",
    "mrchntPOIId",
    "saleId",
    "xtrnlyTpSpprtd"
})
public class SaleToPOIProtocolParameter2 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "MrchntId")
    protected Organisation26 mrchntId;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "HstId", required = true)
    protected String hstId;
    @XmlElement(name = "MrchntPOIId")
    protected String mrchntPOIId;
    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "XtrnlyTpSpprtd")
    protected List<String> xtrnlyTpSpprtd;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public SaleToPOIProtocolParameter2 setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
        return this;
    }

    /**
     * Gets the value of the mrchntId property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation26 }
     *     
     */
    public Organisation26 getMrchntId() {
        return mrchntId;
    }

    /**
     * Sets the value of the mrchntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation26 }
     *     
     */
    public SaleToPOIProtocolParameter2 setMrchntId(Organisation26 value) {
        this.mrchntId = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleToPOIProtocolParameter2 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the hstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstId() {
        return hstId;
    }

    /**
     * Sets the value of the hstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleToPOIProtocolParameter2 setHstId(String value) {
        this.hstId = value;
        return this;
    }

    /**
     * Gets the value of the mrchntPOIId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntPOIId() {
        return mrchntPOIId;
    }

    /**
     * Sets the value of the mrchntPOIId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleToPOIProtocolParameter2 setMrchntPOIId(String value) {
        this.mrchntPOIId = value;
        return this;
    }

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleToPOIProtocolParameter2 setSaleId(String value) {
        this.saleId = value;
        return this;
    }

    /**
     * Gets the value of the xtrnlyTpSpprtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtrnlyTpSpprtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtrnlyTpSpprtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the xtrnlyTpSpprtd property.
     */
    public List<String> getXtrnlyTpSpprtd() {
        if (xtrnlyTpSpprtd == null) {
            xtrnlyTpSpprtd = new ArrayList<>();
        }
        return this.xtrnlyTpSpprtd;
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
     * Adds a new item to the xtrnlyTpSpprtd list.
     * @see #getXtrnlyTpSpprtd()
     * 
     */
    public SaleToPOIProtocolParameter2 addXtrnlyTpSpprtd(String xtrnlyTpSpprtd) {
        getXtrnlyTpSpprtd().add(xtrnlyTpSpprtd);
        return this;
    }

}
