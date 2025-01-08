
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
@XmlType(name = "TMSAction7", propOrder = {
    "tp",
    "rmotAccs",
    "key",
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
    "addtlInf",
    "msgItm"
})
public class TMSAction7 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction4Code tp;
    @XmlElement(name = "RmotAccs")
    protected NetworkParameters5 rmotAccs;
    @XmlElement(name = "Key")
    protected List<KEKIdentifier5> key;
    @XmlElement(name = "TermnlMgrId")
    protected GenericIdentification71 termnlMgrId;
    @XmlElement(name = "TMSPrtcol")
    protected String tmsPrtcol;
    @XmlElement(name = "TMSPrtcolVrsn")
    protected String tmsPrtcolVrsn;
    @XmlElement(name = "DataSetId")
    protected DataSetIdentification7 dataSetId;
    @XmlElement(name = "CmpntTp")
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory12Code> cmpntTp;
    @XmlElement(name = "DlgtnScpId")
    protected String dlgtnScpId;
    @XmlElement(name = "DlgtnScpDef")
    protected byte[] dlgtnScpDef;
    @XmlElement(name = "DlgtnProof")
    protected byte[] dlgtnProof;
    @XmlElement(name = "PrtctdDlgtnProof")
    protected ContentInformationType19 prtctdDlgtnProof;
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
    protected List<ErrorAction4> errActn;
    @XmlElement(name = "AddtlInf")
    protected List<byte[]> addtlInf;
    @XmlElement(name = "MsgItm")
    protected List<MessageItemCondition1> msgItm;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction4Code }
     *     
     */
    public TerminalManagementAction4Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction4Code }
     *     
     */
    public TMSAction7 setTp(TerminalManagementAction4Code value) {
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
    public TMSAction7 setRmotAccs(NetworkParameters5 value) {
        this.rmotAccs = value;
        return this;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KEKIdentifier5 }
     * 
     * 
     * @return
     *     The value of the key property.
     */
    public List<KEKIdentifier5> getKey() {
        if (key == null) {
            key = new ArrayList<>();
        }
        return this.key;
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
    public TMSAction7 setTermnlMgrId(GenericIdentification71 value) {
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
    public TMSAction7 setTMSPrtcol(String value) {
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
    public TMSAction7 setTMSPrtcolVrsn(String value) {
        this.tmsPrtcolVrsn = value;
        return this;
    }

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification7 }
     *     
     */
    public DataSetIdentification7 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification7 }
     *     
     */
    public TMSAction7 setDataSetId(DataSetIdentification7 value) {
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
     * {@link DataSetCategory12Code }
     * 
     * 
     * @return
     *     The value of the cmpntTp property.
     */
    public List<DataSetCategory12Code> getCmpntTp() {
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
    public TMSAction7 setDlgtnScpId(String value) {
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
    public TMSAction7 setDlgtnScpDef(byte[] value) {
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
    public TMSAction7 setDlgtnProof(byte[] value) {
        this.dlgtnProof = value;
        return this;
    }

    /**
     * Gets the value of the prtctdDlgtnProof property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType19 }
     *     
     */
    public ContentInformationType19 getPrtctdDlgtnProof() {
        return prtctdDlgtnProof;
    }

    /**
     * Sets the value of the prtctdDlgtnProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType19 }
     *     
     */
    public TMSAction7 setPrtctdDlgtnProof(ContentInformationType19 value) {
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
    public TMSAction7 setTrggr(TerminalManagementActionTrigger1Code value) {
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
    public TMSAction7 setReTry(ProcessRetry2 value) {
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
    public TMSAction7 setTmCond(ProcessTiming3 value) {
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
    public TMSAction7 setTMChllng(byte[] value) {
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
     * {@link ErrorAction4 }
     * 
     * 
     * @return
     *     The value of the errActn property.
     */
    public List<ErrorAction4> getErrActn() {
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

    /**
     * Gets the value of the msgItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageItemCondition1 }
     * 
     * 
     * @return
     *     The value of the msgItm property.
     */
    public List<MessageItemCondition1> getMsgItm() {
        if (msgItm == null) {
            msgItm = new ArrayList<>();
        }
        return this.msgItm;
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
     * Adds a new item to the key list.
     * @see #getKey()
     * 
     */
    public TMSAction7 addKey(KEKIdentifier5 key) {
        getKey().add(key);
        return this;
    }

    /**
     * Adds a new item to the cmpntTp list.
     * @see #getCmpntTp()
     * 
     */
    public TMSAction7 addCmpntTp(DataSetCategory12Code cmpntTp) {
        getCmpntTp().add(cmpntTp);
        return this;
    }

    /**
     * Adds a new item to the addtlPrc list.
     * @see #getAddtlPrc()
     * 
     */
    public TMSAction7 addAddtlPrc(TerminalManagementAdditionalProcess1Code addtlPrc) {
        getAddtlPrc().add(addtlPrc);
        return this;
    }

    /**
     * Adds a new item to the keyNcphrmntCert list.
     * @see #getKeyNcphrmntCert()
     * 
     */
    public TMSAction7 addKeyNcphrmntCert(byte[] keyNcphrmntCert) {
        getKeyNcphrmntCert().add(keyNcphrmntCert);
        return this;
    }

    /**
     * Adds a new item to the errActn list.
     * @see #getErrActn()
     * 
     */
    public TMSAction7 addErrActn(ErrorAction4 errActn) {
        getErrActn().add(errActn);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public TMSAction7 addAddtlInf(byte[] addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

    /**
     * Adds a new item to the msgItm list.
     * @see #getMsgItm()
     * 
     */
    public TMSAction7 addMsgItm(MessageItemCondition1 msgItm) {
        getMsgItm().add(msgItm);
        return this;
    }

}
