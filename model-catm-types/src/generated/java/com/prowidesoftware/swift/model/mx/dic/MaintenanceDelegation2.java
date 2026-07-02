
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
 * Information on the delegation of a maintenance action or maintenance function.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDelegation2", propOrder = {
    "mntncSvc",
    "rspn",
    "rspnRsn",
    "poiSubset",
    "paramsSubsetId",
    "paramsSubsetDef",
    "dlgtnProof",
    "prtctdDlgtnProof",
    "poiIdAssoctn"
})
public class MaintenanceDelegation2 {

    @XmlElement(name = "MntncSvc", required = true)
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory6Code> mntncSvc;
    @XmlElement(name = "Rspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response2Code rspn;
    @XmlElement(name = "RspnRsn")
    protected String rspnRsn;
    @XmlElement(name = "POISubset")
    protected List<String> poiSubset;
    @XmlElement(name = "ParamsSubsetId")
    protected String paramsSubsetId;
    @XmlElement(name = "ParamsSubsetDef")
    protected byte[] paramsSubsetDef;
    @XmlElement(name = "DlgtnProof")
    protected byte[] dlgtnProof;
    @XmlElement(name = "PrtctdDlgtnProof")
    protected ContentInformationType12 prtctdDlgtnProof;
    @XmlElement(name = "POIIdAssoctn")
    protected List<MaintenanceIdentificationAssociation1> poiIdAssoctn;

    /**
     * Gets the value of the mntncSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mntncSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMntncSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetCategory6Code }
     * 
     * 
     */
    public List<DataSetCategory6Code> getMntncSvc() {
        if (mntncSvc == null) {
            mntncSvc = new ArrayList<DataSetCategory6Code>();
        }
        return this.mntncSvc;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link Response2Code }
     *     
     */
    public Response2Code getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response2Code }
     *     
     */
    public MaintenanceDelegation2 setRspn(Response2Code value) {
        this.rspn = value;
        return this;
    }

    /**
     * Gets the value of the rspnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnRsn() {
        return rspnRsn;
    }

    /**
     * Sets the value of the rspnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MaintenanceDelegation2 setRspnRsn(String value) {
        this.rspnRsn = value;
        return this;
    }

    /**
     * Gets the value of the poiSubset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poiSubset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOISubset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPOISubset() {
        if (poiSubset == null) {
            poiSubset = new ArrayList<String>();
        }
        return this.poiSubset;
    }

    /**
     * Gets the value of the paramsSubsetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamsSubsetId() {
        return paramsSubsetId;
    }

    /**
     * Sets the value of the paramsSubsetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MaintenanceDelegation2 setParamsSubsetId(String value) {
        this.paramsSubsetId = value;
        return this;
    }

    /**
     * Gets the value of the paramsSubsetDef property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getParamsSubsetDef() {
        return paramsSubsetDef;
    }

    /**
     * Sets the value of the paramsSubsetDef property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public MaintenanceDelegation2 setParamsSubsetDef(byte[] value) {
        this.paramsSubsetDef = value;
        return this;
    }

    /**
     * Gets the value of the dlgtnProof property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDlgtnProof() {
        return dlgtnProof;
    }

    /**
     * Sets the value of the dlgtnProof property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public MaintenanceDelegation2 setDlgtnProof(byte[] value) {
        this.dlgtnProof = value;
        return this;
    }

    /**
     * Gets the value of the prtctdDlgtnProof property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType12 }
     *     
     */
    public ContentInformationType12 getPrtctdDlgtnProof() {
        return prtctdDlgtnProof;
    }

    /**
     * Sets the value of the prtctdDlgtnProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType12 }
     *     
     */
    public MaintenanceDelegation2 setPrtctdDlgtnProof(ContentInformationType12 value) {
        this.prtctdDlgtnProof = value;
        return this;
    }

    /**
     * Gets the value of the poiIdAssoctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poiIdAssoctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOIIdAssoctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceIdentificationAssociation1 }
     * 
     * 
     */
    public List<MaintenanceIdentificationAssociation1> getPOIIdAssoctn() {
        if (poiIdAssoctn == null) {
            poiIdAssoctn = new ArrayList<MaintenanceIdentificationAssociation1>();
        }
        return this.poiIdAssoctn;
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
     * Adds a new item to the mntncSvc list.
     * @see #getMntncSvc()
     * 
     */
    public MaintenanceDelegation2 addMntncSvc(DataSetCategory6Code mntncSvc) {
        getMntncSvc().add(mntncSvc);
        return this;
    }

    /**
     * Adds a new item to the pOISubset list.
     * @see #getPOISubset()
     * 
     */
    public MaintenanceDelegation2 addPOISubset(String pOISubset) {
        getPOISubset().add(pOISubset);
        return this;
    }

    /**
     * Adds a new item to the pOIIdAssoctn list.
     * @see #getPOIIdAssoctn()
     * 
     */
    public MaintenanceDelegation2 addPOIIdAssoctn(MaintenanceIdentificationAssociation1 pOIIdAssoctn) {
        getPOIIdAssoctn().add(pOIIdAssoctn);
        return this;
    }

}
