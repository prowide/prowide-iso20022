
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
@XmlType(name = "SaleToPOIProtocolParameter3", propOrder = {
    "actnTp",
    "mrchntId",
    "vrsn",
    "hstId",
    "mrchntPOIId",
    "saleId",
    "allwdSaleMsg",
    "allwdPOIMsg",
    "allwdPOISvc",
    "allwdSaleDvc",
    "xtrnlyTpSpprtd"
})
public class SaleToPOIProtocolParameter3 {

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
    @XmlElement(name = "AllwdSaleMsg")
    @XmlSchemaType(name = "string")
    protected List<RetailerMessage1Code> allwdSaleMsg;
    @XmlElement(name = "AllwdPOIMsg")
    @XmlSchemaType(name = "string")
    protected List<RetailerMessage1Code> allwdPOIMsg;
    @XmlElement(name = "AllwdPOISvc")
    @XmlSchemaType(name = "string")
    protected List<RetailerService2Code> allwdPOISvc;
    @XmlElement(name = "AllwdSaleDvc")
    @XmlSchemaType(name = "string")
    protected List<RetailerService8Code> allwdSaleDvc;
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
    public SaleToPOIProtocolParameter3 setActnTp(TerminalManagementAction3Code value) {
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
    public SaleToPOIProtocolParameter3 setMrchntId(Organisation26 value) {
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
    public SaleToPOIProtocolParameter3 setVrsn(String value) {
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
    public SaleToPOIProtocolParameter3 setHstId(String value) {
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
    public SaleToPOIProtocolParameter3 setMrchntPOIId(String value) {
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
    public SaleToPOIProtocolParameter3 setSaleId(String value) {
        this.saleId = value;
        return this;
    }

    /**
     * Gets the value of the allwdSaleMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdSaleMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdSaleMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailerMessage1Code }
     * 
     * 
     * @return
     *     The value of the allwdSaleMsg property.
     */
    public List<RetailerMessage1Code> getAllwdSaleMsg() {
        if (allwdSaleMsg == null) {
            allwdSaleMsg = new ArrayList<>();
        }
        return this.allwdSaleMsg;
    }

    /**
     * Gets the value of the allwdPOIMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdPOIMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdPOIMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailerMessage1Code }
     * 
     * 
     * @return
     *     The value of the allwdPOIMsg property.
     */
    public List<RetailerMessage1Code> getAllwdPOIMsg() {
        if (allwdPOIMsg == null) {
            allwdPOIMsg = new ArrayList<>();
        }
        return this.allwdPOIMsg;
    }

    /**
     * Gets the value of the allwdPOISvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdPOISvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdPOISvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailerService2Code }
     * 
     * 
     * @return
     *     The value of the allwdPOISvc property.
     */
    public List<RetailerService2Code> getAllwdPOISvc() {
        if (allwdPOISvc == null) {
            allwdPOISvc = new ArrayList<>();
        }
        return this.allwdPOISvc;
    }

    /**
     * Gets the value of the allwdSaleDvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdSaleDvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdSaleDvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailerService8Code }
     * 
     * 
     * @return
     *     The value of the allwdSaleDvc property.
     */
    public List<RetailerService8Code> getAllwdSaleDvc() {
        if (allwdSaleDvc == null) {
            allwdSaleDvc = new ArrayList<>();
        }
        return this.allwdSaleDvc;
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
     * Adds a new item to the allwdSaleMsg list.
     * @see #getAllwdSaleMsg()
     * 
     */
    public SaleToPOIProtocolParameter3 addAllwdSaleMsg(RetailerMessage1Code allwdSaleMsg) {
        getAllwdSaleMsg().add(allwdSaleMsg);
        return this;
    }

    /**
     * Adds a new item to the allwdPOIMsg list.
     * @see #getAllwdPOIMsg()
     * 
     */
    public SaleToPOIProtocolParameter3 addAllwdPOIMsg(RetailerMessage1Code allwdPOIMsg) {
        getAllwdPOIMsg().add(allwdPOIMsg);
        return this;
    }

    /**
     * Adds a new item to the allwdPOISvc list.
     * @see #getAllwdPOISvc()
     * 
     */
    public SaleToPOIProtocolParameter3 addAllwdPOISvc(RetailerService2Code allwdPOISvc) {
        getAllwdPOISvc().add(allwdPOISvc);
        return this;
    }

    /**
     * Adds a new item to the allwdSaleDvc list.
     * @see #getAllwdSaleDvc()
     * 
     */
    public SaleToPOIProtocolParameter3 addAllwdSaleDvc(RetailerService8Code allwdSaleDvc) {
        getAllwdSaleDvc().add(allwdSaleDvc);
        return this;
    }

    /**
     * Adds a new item to the xtrnlyTpSpprtd list.
     * @see #getXtrnlyTpSpprtd()
     * 
     */
    public SaleToPOIProtocolParameter3 addXtrnlyTpSpprtd(String xtrnlyTpSpprtd) {
        getXtrnlyTpSpprtd().add(xtrnlyTpSpprtd);
        return this;
    }

}
