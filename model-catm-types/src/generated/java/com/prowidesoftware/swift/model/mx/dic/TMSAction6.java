
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
 * Single terminal management action to be performed by the point of interaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSAction6", propOrder = {
    "tp",
    "rmotAccs",
    "termnlMgrId",
    "tmsPrtcol",
    "tmsPrtcolVrsn",
    "dataSetId",
    "cmpntTp",
    "dlgtnScpId",
    "dlgtnScpDef",
    "dlgtnProof",
    "prtctdDlgtnProof",
    "trggr",
    "addtlPrc",
    "reTry",
    "tmCond",
    "tmChllng",
    "keyNcphrmntCert",
    "errActn",
    "addtlInf"
})
public class TMSAction6 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction2Code tp;
    @XmlElement(name = "RmotAccs")
    protected NetworkParameters5 rmotAccs;
    @XmlElement(name = "TermnlMgrId")
    protected GenericIdentification71 termnlMgrId;
    @XmlElement(name = "TMSPrtcol")
    protected String tmsPrtcol;
    @XmlElement(name = "TMSPrtcolVrsn")
    protected String tmsPrtcolVrsn;
    @XmlElement(name = "DataSetId")
    protected DataSetIdentification6 dataSetId;
    @XmlElement(name = "CmpntTp")
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory9Code> cmpntTp;
    @XmlElement(name = "DlgtnScpId")
    protected String dlgtnScpId;
    @XmlElement(name = "DlgtnScpDef")
    protected byte[] dlgtnScpDef;
    @XmlElement(name = "DlgtnProof")
    protected byte[] dlgtnProof;
    @XmlElement(name = "PrtctdDlgtnProof")
    protected ContentInformationType12 prtctdDlgtnProof;
    @XmlElement(name = "Trggr", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementActionTrigger1Code trggr;
    @XmlElement(name = "AddtlPrc")
    @XmlSchemaType(name = "string")
    protected List<TerminalManagementAdditionalProcess1Code> addtlPrc;
    @XmlElement(name = "ReTry")
    protected ProcessRetry2 reTry;
    @XmlElement(name = "TmCond")
    protected ProcessTiming3 tmCond;
    @XmlElement(name = "TMChllng")
    protected byte[] tmChllng;
    @XmlElement(name = "KeyNcphrmntCert")
    protected List<byte[]> keyNcphrmntCert;
    @XmlElement(name = "ErrActn")
    protected List<ErrorAction3> errActn;
    @XmlElement(name = "AddtlInf")
    protected List<byte[]> addtlInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction2Code }
     *     
     */
    public TerminalManagementAction2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction2Code }
     *     
     */
    public TMSAction6 setTp(TerminalManagementAction2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rmotAccs property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters5 }
     *     
     */
    public NetworkParameters5 getRmotAccs() {
        return rmotAccs;
    }

    /**
     * Sets the value of the rmotAccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters5 }
     *     
     */
    public TMSAction6 setRmotAccs(NetworkParameters5 value) {
        this.rmotAccs = value;
        return this;
    }

    /**
     * Gets the value of the termnlMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification71 }
     *     
     */
    public GenericIdentification71 getTermnlMgrId() {
        return termnlMgrId;
    }

    /**
     * Sets the value of the termnlMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification71 }
     *     
     */
    public TMSAction6 setTermnlMgrId(GenericIdentification71 value) {
        this.termnlMgrId = value;
        return this;
    }

    /**
     * Gets the value of the tmsPrtcol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSPrtcol() {
        return tmsPrtcol;
    }

    /**
     * Sets the value of the tmsPrtcol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TMSAction6 setTMSPrtcol(String value) {
        this.tmsPrtcol = value;
        return this;
    }

    /**
     * Gets the value of the tmsPrtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSPrtcolVrsn() {
        return tmsPrtcolVrsn;
    }

    /**
     * Sets the value of the tmsPrtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TMSAction6 setTMSPrtcolVrsn(String value) {
        this.tmsPrtcolVrsn = value;
        return this;
    }

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification6 }
     *     
     */
    public DataSetIdentification6 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification6 }
     *     
     */
    public TMSAction6 setDataSetId(DataSetIdentification6 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the cmpntTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmpntTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpntTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetCategory9Code }
     * 
     * 
     * @return
     *     The value of the cmpntTp property.
     */
    public List<DataSetCategory9Code> getCmpntTp() {
        if (cmpntTp == null) {
            cmpntTp = new ArrayList<>();
        }
        return this.cmpntTp;
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
    public TMSAction6 setDlgtnScpId(String value) {
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
    public TMSAction6 setDlgtnScpDef(byte[] value) {
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
    public TMSAction6 setDlgtnProof(byte[] value) {
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
    public TMSAction6 setPrtctdDlgtnProof(ContentInformationType12 value) {
        this.prtctdDlgtnProof = value;
        return this;
    }

    /**
     * Gets the value of the trggr property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementActionTrigger1Code }
     *     
     */
    public TerminalManagementActionTrigger1Code getTrggr() {
        return trggr;
    }

    /**
     * Sets the value of the trggr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementActionTrigger1Code }
     *     
     */
    public TMSAction6 setTrggr(TerminalManagementActionTrigger1Code value) {
        this.trggr = value;
        return this;
    }

    /**
     * Gets the value of the addtlPrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlPrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlPrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalManagementAdditionalProcess1Code }
     * 
     * 
     * @return
     *     The value of the addtlPrc property.
     */
    public List<TerminalManagementAdditionalProcess1Code> getAddtlPrc() {
        if (addtlPrc == null) {
            addtlPrc = new ArrayList<>();
        }
        return this.addtlPrc;
    }

    /**
     * Gets the value of the reTry property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRetry2 }
     *     
     */
    public ProcessRetry2 getReTry() {
        return reTry;
    }

    /**
     * Sets the value of the reTry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRetry2 }
     *     
     */
    public TMSAction6 setReTry(ProcessRetry2 value) {
        this.reTry = value;
        return this;
    }

    /**
     * Gets the value of the tmCond property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTiming3 }
     *     
     */
    public ProcessTiming3 getTmCond() {
        return tmCond;
    }

    /**
     * Sets the value of the tmCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTiming3 }
     *     
     */
    public TMSAction6 setTmCond(ProcessTiming3 value) {
        this.tmCond = value;
        return this;
    }

    /**
     * Gets the value of the tmChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTMChllng() {
        return tmChllng;
    }

    /**
     * Sets the value of the tmChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public TMSAction6 setTMChllng(byte[] value) {
        this.tmChllng = value;
        return this;
    }

    /**
     * Gets the value of the keyNcphrmntCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyNcphrmntCert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyNcphrmntCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the keyNcphrmntCert property.
     */
    public List<byte[]> getKeyNcphrmntCert() {
        if (keyNcphrmntCert == null) {
            keyNcphrmntCert = new ArrayList<>();
        }
        return this.keyNcphrmntCert;
    }

    /**
     * Gets the value of the errActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorAction3 }
     * 
     * 
     * @return
     *     The value of the errActn property.
     */
    public List<ErrorAction3> getErrActn() {
        if (errActn == null) {
            errActn = new ArrayList<>();
        }
        return this.errActn;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<byte[]> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the cmpntTp list.
     * @see #getCmpntTp()
     * 
     */
    public TMSAction6 addCmpntTp(DataSetCategory9Code cmpntTp) {
        getCmpntTp().add(cmpntTp);
        return this;
    }

    /**
     * Adds a new item to the addtlPrc list.
     * @see #getAddtlPrc()
     * 
     */
    public TMSAction6 addAddtlPrc(TerminalManagementAdditionalProcess1Code addtlPrc) {
        getAddtlPrc().add(addtlPrc);
        return this;
    }

    /**
     * Adds a new item to the keyNcphrmntCert list.
     * @see #getKeyNcphrmntCert()
     * 
     */
    public TMSAction6 addKeyNcphrmntCert(byte[] keyNcphrmntCert) {
        getKeyNcphrmntCert().add(keyNcphrmntCert);
        return this;
    }

    /**
     * Adds a new item to the errActn list.
     * @see #getErrActn()
     * 
     */
    public TMSAction6 addErrActn(ErrorAction3 errActn) {
        getErrActn().add(errActn);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public TMSAction6 addAddtlInf(byte[] addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
