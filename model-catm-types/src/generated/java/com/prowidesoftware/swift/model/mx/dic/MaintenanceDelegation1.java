
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
@XmlType(name = "MaintenanceDelegation1", propOrder = {
    "mntncSvc",
    "prtlDlgtn",
    "poiSubset",
    "dlgtdActn",
    "paramsSubsetId",
    "paramsSubsetDef",
    "cert",
    "poiIdAssoctn",
    "smmtrcKey",
    "paramDataSet"
})
public class MaintenanceDelegation1 {

    @XmlElement(name = "MntncSvc", required = true)
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory6Code> mntncSvc;
    @XmlElement(name = "PrtlDlgtn")
    protected Boolean prtlDlgtn;
    @XmlElement(name = "POISubset")
    protected List<String> poiSubset;
    @XmlElement(name = "DlgtdActn")
    protected MaintenanceDelegateAction1 dlgtdActn;
    @XmlElement(name = "ParamsSubsetId")
    protected String paramsSubsetId;
    @XmlElement(name = "ParamsSubsetDef")
    protected byte[] paramsSubsetDef;
    @XmlElement(name = "Cert")
    protected List<byte[]> cert;
    @XmlElement(name = "POIIdAssoctn")
    protected List<MaintenanceIdentificationAssociation1> poiIdAssoctn;
    @XmlElement(name = "SmmtrcKey")
    protected List<KEKIdentifier2> smmtrcKey;
    @XmlElement(name = "ParamDataSet")
    protected TerminalManagementDataSet14 paramDataSet;

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
     * Gets the value of the prtlDlgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlDlgtn() {
        return prtlDlgtn;
    }

    /**
     * Sets the value of the prtlDlgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MaintenanceDelegation1 setPrtlDlgtn(Boolean value) {
        this.prtlDlgtn = value;
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
     * Gets the value of the dlgtdActn property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceDelegateAction1 }
     *     
     */
    public MaintenanceDelegateAction1 getDlgtdActn() {
        return dlgtdActn;
    }

    /**
     * Sets the value of the dlgtdActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceDelegateAction1 }
     *     
     */
    public MaintenanceDelegation1 setDlgtdActn(MaintenanceDelegateAction1 value) {
        this.dlgtdActn = value;
        return this;
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
    public MaintenanceDelegation1 setParamsSubsetId(String value) {
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
    public MaintenanceDelegation1 setParamsSubsetDef(byte[] value) {
        this.paramsSubsetDef = value;
        return this;
    }

    /**
     * Gets the value of the cert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getCert() {
        if (cert == null) {
            cert = new ArrayList<byte[]>();
        }
        return this.cert;
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

    /**
     * Gets the value of the smmtrcKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smmtrcKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmmtrcKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KEKIdentifier2 }
     * 
     * 
     */
    public List<KEKIdentifier2> getSmmtrcKey() {
        if (smmtrcKey == null) {
            smmtrcKey = new ArrayList<KEKIdentifier2>();
        }
        return this.smmtrcKey;
    }

    /**
     * Gets the value of the paramDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementDataSet14 }
     *     
     */
    public TerminalManagementDataSet14 getParamDataSet() {
        return paramDataSet;
    }

    /**
     * Sets the value of the paramDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementDataSet14 }
     *     
     */
    public MaintenanceDelegation1 setParamDataSet(TerminalManagementDataSet14 value) {
        this.paramDataSet = value;
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
     * Adds a new item to the mntncSvc list.
     * @see #getMntncSvc()
     * 
     */
    public MaintenanceDelegation1 addMntncSvc(DataSetCategory6Code mntncSvc) {
        getMntncSvc().add(mntncSvc);
        return this;
    }

    /**
     * Adds a new item to the pOISubset list.
     * @see #getPOISubset()
     * 
     */
    public MaintenanceDelegation1 addPOISubset(String pOISubset) {
        getPOISubset().add(pOISubset);
        return this;
    }

    /**
     * Adds a new item to the cert list.
     * @see #getCert()
     * 
     */
    public MaintenanceDelegation1 addCert(byte[] cert) {
        getCert().add(cert);
        return this;
    }

    /**
     * Adds a new item to the pOIIdAssoctn list.
     * @see #getPOIIdAssoctn()
     * 
     */
    public MaintenanceDelegation1 addPOIIdAssoctn(MaintenanceIdentificationAssociation1 pOIIdAssoctn) {
        getPOIIdAssoctn().add(pOIIdAssoctn);
        return this;
    }

    /**
     * Adds a new item to the smmtrcKey list.
     * @see #getSmmtrcKey()
     * 
     */
    public MaintenanceDelegation1 addSmmtrcKey(KEKIdentifier2 smmtrcKey) {
        getSmmtrcKey().add(smmtrcKey);
        return this;
    }

}
