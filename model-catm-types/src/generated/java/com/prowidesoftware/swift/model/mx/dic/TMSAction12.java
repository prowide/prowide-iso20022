
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
 * Single terminal management action to be performed by the point of interaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSAction12", propOrder = {
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
    "msgItm",
    "dvcReq"
})
public class TMSAction12 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction5Code tp;
    @XmlElement(name = "RmotAccs")
    protected NetworkParameters7 rmotAccs;
    @XmlElement(name = "Key")
    protected List<KEKIdentifier5> key;
    @XmlElement(name = "TermnlMgrId")
    protected GenericIdentification176 termnlMgrId;
    @XmlElement(name = "TMSPrtcol")
    protected String tmsPrtcol;
    @XmlElement(name = "TMSPrtcolVrsn")
    protected String tmsPrtcolVrsn;
    @XmlElement(name = "DataSetId")
    protected DataSetIdentification10 dataSetId;
    @XmlElement(name = "CmpntTp")
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory18Code> cmpntTp;
    @XmlElement(name = "DlgtnScpId")
    protected String dlgtnScpId;
    @XmlElement(name = "DlgtnScpDef")
    protected byte[] dlgtnScpDef;
    @XmlElement(name = "DlgtnProof")
    protected byte[] dlgtnProof;
    @XmlElement(name = "PrtctdDlgtnProof")
    protected ContentInformationType39 prtctdDlgtnProof;
    @XmlElement(name = "Trggr", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementActionTrigger1Code trggr;
    @XmlElement(name = "AddtlPrc")
    @XmlSchemaType(name = "string")
    protected List<TerminalManagementAdditionalProcess1Code> addtlPrc;
    @XmlElement(name = "ReTry")
    protected ProcessRetry3 reTry;
    @XmlElement(name = "TmCond")
    protected ProcessTiming5 tmCond;
    @XmlElement(name = "TMChllng")
    protected byte[] tmChllng;
    @XmlElement(name = "KeyNcphrmntCert")
    protected List<byte[]> keyNcphrmntCert;
    @XmlElement(name = "ErrActn")
    protected List<ErrorAction5> errActn;
    @XmlElement(name = "AddtlInf")
    protected List<byte[]> addtlInf;
    @XmlElement(name = "MsgItm")
    protected List<MessageItemCondition2> msgItm;
    @XmlElement(name = "DvcReq")
    protected DeviceRequest7 dvcReq;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction5Code }
     *     
     */
    public TerminalManagementAction5Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction5Code }
     *     
     */
    public TMSAction12 setTp(TerminalManagementAction5Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rmotAccs property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getRmotAccs() {
        return rmotAccs;
    }

    /**
     * Sets the value of the rmotAccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public TMSAction12 setRmotAccs(NetworkParameters7 value) {
        this.rmotAccs = value;
        return this;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
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
     */
    public List<KEKIdentifier5> getKey() {
        if (key == null) {
            key = new ArrayList<KEKIdentifier5>();
        }
        return this.key;
    }

    /**
     * Gets the value of the termnlMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getTermnlMgrId() {
        return termnlMgrId;
    }

    /**
     * Sets the value of the termnlMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public TMSAction12 setTermnlMgrId(GenericIdentification176 value) {
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
    public TMSAction12 setTMSPrtcol(String value) {
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
    public TMSAction12 setTMSPrtcolVrsn(String value) {
        this.tmsPrtcolVrsn = value;
        return this;
    }

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public DataSetIdentification10 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public TMSAction12 setDataSetId(DataSetIdentification10 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the cmpntTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmpntTp property.
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
     * {@link DataSetCategory18Code }
     * 
     * 
     */
    public List<DataSetCategory18Code> getCmpntTp() {
        if (cmpntTp == null) {
            cmpntTp = new ArrayList<DataSetCategory18Code>();
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
    public TMSAction12 setDlgtnScpId(String value) {
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
    public TMSAction12 setDlgtnScpDef(byte[] value) {
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
    public TMSAction12 setDlgtnProof(byte[] value) {
        this.dlgtnProof = value;
        return this;
    }

    /**
     * Gets the value of the prtctdDlgtnProof property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType39 }
     *     
     */
    public ContentInformationType39 getPrtctdDlgtnProof() {
        return prtctdDlgtnProof;
    }

    /**
     * Sets the value of the prtctdDlgtnProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType39 }
     *     
     */
    public TMSAction12 setPrtctdDlgtnProof(ContentInformationType39 value) {
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
    public TMSAction12 setTrggr(TerminalManagementActionTrigger1Code value) {
        this.trggr = value;
        return this;
    }

    /**
     * Gets the value of the addtlPrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlPrc property.
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
     */
    public List<TerminalManagementAdditionalProcess1Code> getAddtlPrc() {
        if (addtlPrc == null) {
            addtlPrc = new ArrayList<TerminalManagementAdditionalProcess1Code>();
        }
        return this.addtlPrc;
    }

    /**
     * Gets the value of the reTry property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRetry3 }
     *     
     */
    public ProcessRetry3 getReTry() {
        return reTry;
    }

    /**
     * Sets the value of the reTry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRetry3 }
     *     
     */
    public TMSAction12 setReTry(ProcessRetry3 value) {
        this.reTry = value;
        return this;
    }

    /**
     * Gets the value of the tmCond property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTiming5 }
     *     
     */
    public ProcessTiming5 getTmCond() {
        return tmCond;
    }

    /**
     * Sets the value of the tmCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTiming5 }
     *     
     */
    public TMSAction12 setTmCond(ProcessTiming5 value) {
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
    public TMSAction12 setTMChllng(byte[] value) {
        this.tmChllng = value;
        return this;
    }

    /**
     * Gets the value of the keyNcphrmntCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyNcphrmntCert property.
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
     */
    public List<byte[]> getKeyNcphrmntCert() {
        if (keyNcphrmntCert == null) {
            keyNcphrmntCert = new ArrayList<byte[]>();
        }
        return this.keyNcphrmntCert;
    }

    /**
     * Gets the value of the errActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errActn property.
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
     * {@link ErrorAction5 }
     * 
     * 
     */
    public List<ErrorAction5> getErrActn() {
        if (errActn == null) {
            errActn = new ArrayList<ErrorAction5>();
        }
        return this.errActn;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
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
     */
    public List<byte[]> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<byte[]>();
        }
        return this.addtlInf;
    }

    /**
     * Gets the value of the msgItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgItm property.
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
     * {@link MessageItemCondition2 }
     * 
     * 
     */
    public List<MessageItemCondition2> getMsgItm() {
        if (msgItm == null) {
            msgItm = new ArrayList<MessageItemCondition2>();
        }
        return this.msgItm;
    }

    /**
     * Gets the value of the dvcReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceRequest7 }
     *     
     */
    public DeviceRequest7 getDvcReq() {
        return dvcReq;
    }

    /**
     * Sets the value of the dvcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceRequest7 }
     *     
     */
    public TMSAction12 setDvcReq(DeviceRequest7 value) {
        this.dvcReq = value;
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
     * Adds a new item to the key list.
     * @see #getKey()
     * 
     */
    public TMSAction12 addKey(KEKIdentifier5 key) {
        getKey().add(key);
        return this;
    }

    /**
     * Adds a new item to the cmpntTp list.
     * @see #getCmpntTp()
     * 
     */
    public TMSAction12 addCmpntTp(DataSetCategory18Code cmpntTp) {
        getCmpntTp().add(cmpntTp);
        return this;
    }

    /**
     * Adds a new item to the addtlPrc list.
     * @see #getAddtlPrc()
     * 
     */
    public TMSAction12 addAddtlPrc(TerminalManagementAdditionalProcess1Code addtlPrc) {
        getAddtlPrc().add(addtlPrc);
        return this;
    }

    /**
     * Adds a new item to the keyNcphrmntCert list.
     * @see #getKeyNcphrmntCert()
     * 
     */
    public TMSAction12 addKeyNcphrmntCert(byte[] keyNcphrmntCert) {
        getKeyNcphrmntCert().add(keyNcphrmntCert);
        return this;
    }

    /**
     * Adds a new item to the errActn list.
     * @see #getErrActn()
     * 
     */
    public TMSAction12 addErrActn(ErrorAction5 errActn) {
        getErrActn().add(errActn);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public TMSAction12 addAddtlInf(byte[] addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

    /**
     * Adds a new item to the msgItm list.
     * @see #getMsgItm()
     * 
     */
    public TMSAction12 addMsgItm(MessageItemCondition2 msgItm) {
        getMsgItm().add(msgItm);
        return this;
    }

}
