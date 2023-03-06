
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
 * Information on the delegation of a maintenance action or maintenance function.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDelegation5", propOrder = {
    "dlgtnTp",
    "mntncSvc",
    "prtlDlgtn",
    "poiSubset",
    "dlgtdActn",
    "dlgtnScpId",
    "dlgtnScpDef",
    "cert",
    "poiIdAssoctn",
    "smmtrcKey",
    "paramDataSet"
})
public class MaintenanceDelegation5 {

    @XmlElement(name = "DlgtnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code dlgtnTp;
    @XmlElement(name = "MntncSvc", required = true)
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory11Code> mntncSvc;
    @XmlElement(name = "PrtlDlgtn")
    protected Boolean prtlDlgtn;
    @XmlElement(name = "POISubset")
    protected List<String> poiSubset;
    @XmlElement(name = "DlgtdActn")
    protected MaintenanceDelegateAction3 dlgtdActn;
    @XmlElement(name = "DlgtnScpId")
    protected String dlgtnScpId;
    @XmlElement(name = "DlgtnScpDef")
    protected byte[] dlgtnScpDef;
    @XmlElement(name = "Cert")
    protected List<byte[]> cert;
    @XmlElement(name = "POIIdAssoctn")
    protected List<MaintenanceIdentificationAssociation1> poiIdAssoctn;
    @XmlElement(name = "SmmtrcKey")
    protected List<KEKIdentifier5> smmtrcKey;
    @XmlElement(name = "ParamDataSet")
    protected TerminalManagementDataSet20 paramDataSet;

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
    public MaintenanceDelegation5 setDlgtnTp(TerminalManagementAction3Code value) {
        this.dlgtnTp = value;
        return this;
    }

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
     * {@link DataSetCategory11Code }
     * 
     * 
     */
    public List<DataSetCategory11Code> getMntncSvc() {
        if (mntncSvc == null) {
            mntncSvc = new ArrayList<DataSetCategory11Code>();
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
    public MaintenanceDelegation5 setPrtlDlgtn(Boolean value) {
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
     *     {@link MaintenanceDelegateAction3 }
     *     
     */
    public MaintenanceDelegateAction3 getDlgtdActn() {
        return dlgtdActn;
    }

    /**
     * Sets the value of the dlgtdActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceDelegateAction3 }
     *     
     */
    public MaintenanceDelegation5 setDlgtdActn(MaintenanceDelegateAction3 value) {
        this.dlgtdActn = value;
        return this;
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
    public MaintenanceDelegation5 setDlgtnScpId(String value) {
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
    public MaintenanceDelegation5 setDlgtnScpDef(byte[] value) {
        this.dlgtnScpDef = value;
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
     * {@link KEKIdentifier5 }
     * 
     * 
     */
    public List<KEKIdentifier5> getSmmtrcKey() {
        if (smmtrcKey == null) {
            smmtrcKey = new ArrayList<KEKIdentifier5>();
        }
        return this.smmtrcKey;
    }

    /**
     * Gets the value of the paramDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementDataSet20 }
     *     
     */
    public TerminalManagementDataSet20 getParamDataSet() {
        return paramDataSet;
    }

    /**
     * Sets the value of the paramDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementDataSet20 }
     *     
     */
    public MaintenanceDelegation5 setParamDataSet(TerminalManagementDataSet20 value) {
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
    public MaintenanceDelegation5 addMntncSvc(DataSetCategory11Code mntncSvc) {
        getMntncSvc().add(mntncSvc);
        return this;
    }

    /**
     * Adds a new item to the pOISubset list.
     * @see #getPOISubset()
     * 
     */
    public MaintenanceDelegation5 addPOISubset(String pOISubset) {
        getPOISubset().add(pOISubset);
        return this;
    }

    /**
     * Adds a new item to the cert list.
     * @see #getCert()
     * 
     */
    public MaintenanceDelegation5 addCert(byte[] cert) {
        getCert().add(cert);
        return this;
    }

    /**
     * Adds a new item to the pOIIdAssoctn list.
     * @see #getPOIIdAssoctn()
     * 
     */
    public MaintenanceDelegation5 addPOIIdAssoctn(MaintenanceIdentificationAssociation1 pOIIdAssoctn) {
        getPOIIdAssoctn().add(pOIIdAssoctn);
        return this;
    }

    /**
     * Adds a new item to the smmtrcKey list.
     * @see #getSmmtrcKey()
     * 
     */
    public MaintenanceDelegation5 addSmmtrcKey(KEKIdentifier5 smmtrcKey) {
        getSmmtrcKey().add(smmtrcKey);
        return this;
    }

}
