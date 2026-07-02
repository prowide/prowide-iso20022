
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
@XmlType(name = "MaintenanceDelegation14", propOrder = {
    "mntncSvc",
    "rspn",
    "rspnRsn",
    "dlgtnTp",
    "poiSubset",
    "dlgtnScpId",
    "dlgtnScpDef",
    "dlgtnProof",
    "prtctdDlgtnProof",
    "poiIdAssoctn"
})
public class MaintenanceDelegation14 {

    @XmlElement(name = "MntncSvc", required = true)
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory16Code> mntncSvc;
    @XmlElement(name = "Rspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response2Code rspn;
    @XmlElement(name = "RspnRsn")
    protected String rspnRsn;
    @XmlElement(name = "DlgtnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code dlgtnTp;
    @XmlElement(name = "POISubset")
    protected List<String> poiSubset;
    @XmlElement(name = "DlgtnScpId")
    protected String dlgtnScpId;
    @XmlElement(name = "DlgtnScpDef")
    protected byte[] dlgtnScpDef;
    @XmlElement(name = "DlgtnProof")
    protected byte[] dlgtnProof;
    @XmlElement(name = "PrtctdDlgtnProof")
    protected ContentInformationType30 prtctdDlgtnProof;
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
     * {@link DataSetCategory16Code }
     * 
     * 
     */
    public List<DataSetCategory16Code> getMntncSvc() {
        if (mntncSvc == null) {
            mntncSvc = new ArrayList<DataSetCategory16Code>();
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
    public MaintenanceDelegation14 setRspn(Response2Code value) {
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
    public MaintenanceDelegation14 setRspnRsn(String value) {
        this.rspnRsn = value;
        return this;
    }

    /**
     * Gets the value of the dlgtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getDlgtnTp() {
        return dlgtnTp;
    }

    /**
     * Sets the value of the dlgtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public MaintenanceDelegation14 setDlgtnTp(TerminalManagementAction3Code value) {
        this.dlgtnTp = value;
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
     * Gets the value of the dlgtnScpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlgtnScpId() {
        return dlgtnScpId;
    }

    /**
     * Sets the value of the dlgtnScpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MaintenanceDelegation14 setDlgtnScpId(String value) {
        this.dlgtnScpId = value;
        return this;
    }

    /**
     * Gets the value of the dlgtnScpDef property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDlgtnScpDef() {
        return dlgtnScpDef;
    }

    /**
     * Sets the value of the dlgtnScpDef property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public MaintenanceDelegation14 setDlgtnScpDef(byte[] value) {
        this.dlgtnScpDef = value;
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
    public MaintenanceDelegation14 setDlgtnProof(byte[] value) {
        this.dlgtnProof = value;
        return this;
    }

    /**
     * Gets the value of the prtctdDlgtnProof property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType30 }
     *     
     */
    public ContentInformationType30 getPrtctdDlgtnProof() {
        return prtctdDlgtnProof;
    }

    /**
     * Sets the value of the prtctdDlgtnProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType30 }
     *     
     */
    public MaintenanceDelegation14 setPrtctdDlgtnProof(ContentInformationType30 value) {
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
    public MaintenanceDelegation14 addMntncSvc(DataSetCategory16Code mntncSvc) {
        getMntncSvc().add(mntncSvc);
        return this;
    }

    /**
     * Adds a new item to the pOISubset list.
     * @see #getPOISubset()
     * 
     */
    public MaintenanceDelegation14 addPOISubset(String pOISubset) {
        getPOISubset().add(pOISubset);
        return this;
    }

    /**
     * Adds a new item to the pOIIdAssoctn list.
     * @see #getPOIIdAssoctn()
     * 
     */
    public MaintenanceDelegation14 addPOIIdAssoctn(MaintenanceIdentificationAssociation1 pOIIdAssoctn) {
        getPOIIdAssoctn().add(pOIIdAssoctn);
        return this;
    }

}
