
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
 * Configuration parameters of the TMS protocol between a POI and a terminal manager.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSProtocolParameters5", propOrder = {
    "actnTp",
    "termnlMgrId",
    "prtcolVrsn",
    "mntncSvc",
    "vrsn",
    "applId",
    "hstId",
    "poiId",
    "initgPtyId",
    "rcptPtyId",
    "fileTrf",
    "msgItm"
})
public class TMSProtocolParameters5 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "TermnlMgrId", required = true)
    protected GenericIdentification176 termnlMgrId;
    @XmlElement(name = "PrtcolVrsn")
    protected String prtcolVrsn;
    @XmlElement(name = "MntncSvc", required = true)
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory10Code> mntncSvc;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "ApplId")
    protected List<String> applId;
    @XmlElement(name = "HstId", required = true)
    protected String hstId;
    @XmlElement(name = "POIId")
    protected String poiId;
    @XmlElement(name = "InitgPtyId")
    protected String initgPtyId;
    @XmlElement(name = "RcptPtyId")
    protected String rcptPtyId;
    @XmlElement(name = "FileTrf")
    protected Boolean fileTrf;
    @XmlElement(name = "MsgItm")
    protected List<MessageItemCondition1> msgItm;

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
    public TMSProtocolParameters5 setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
        return this;
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
    public TMSProtocolParameters5 setTermnlMgrId(GenericIdentification176 value) {
        this.termnlMgrId = value;
        return this;
    }

    /**
     * Gets the value of the prtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolVrsn() {
        return prtcolVrsn;
    }

    /**
     * Sets the value of the prtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TMSProtocolParameters5 setPrtcolVrsn(String value) {
        this.prtcolVrsn = value;
        return this;
    }

    /**
     * Gets the value of the mntncSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mntncSvc property.
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
     * {@link DataSetCategory10Code }
     * 
     * 
     * @return
     *     The value of the mntncSvc property.
     */
    public List<DataSetCategory10Code> getMntncSvc() {
        if (mntncSvc == null) {
            mntncSvc = new ArrayList<>();
        }
        return this.mntncSvc;
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
    public TMSProtocolParameters5 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the applId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the applId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the applId property.
     */
    public List<String> getApplId() {
        if (applId == null) {
            applId = new ArrayList<>();
        }
        return this.applId;
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
    public TMSProtocolParameters5 setHstId(String value) {
        this.hstId = value;
        return this;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TMSProtocolParameters5 setPOIId(String value) {
        this.poiId = value;
        return this;
    }

    /**
     * Gets the value of the initgPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitgPtyId() {
        return initgPtyId;
    }

    /**
     * Sets the value of the initgPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TMSProtocolParameters5 setInitgPtyId(String value) {
        this.initgPtyId = value;
        return this;
    }

    /**
     * Gets the value of the rcptPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptPtyId() {
        return rcptPtyId;
    }

    /**
     * Sets the value of the rcptPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TMSProtocolParameters5 setRcptPtyId(String value) {
        this.rcptPtyId = value;
        return this;
    }

    /**
     * Gets the value of the fileTrf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileTrf() {
        return fileTrf;
    }

    /**
     * Sets the value of the fileTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TMSProtocolParameters5 setFileTrf(Boolean value) {
        this.fileTrf = value;
        return this;
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
     * Adds a new item to the mntncSvc list.
     * @see #getMntncSvc()
     * 
     */
    public TMSProtocolParameters5 addMntncSvc(DataSetCategory10Code mntncSvc) {
        getMntncSvc().add(mntncSvc);
        return this;
    }

    /**
     * Adds a new item to the applId list.
     * @see #getApplId()
     * 
     */
    public TMSProtocolParameters5 addApplId(String applId) {
        getApplId().add(applId);
        return this;
    }

    /**
     * Adds a new item to the msgItm list.
     * @see #getMsgItm()
     * 
     */
    public TMSProtocolParameters5 addMsgItm(MessageItemCondition1 msgItm) {
        getMsgItm().add(msgItm);
        return this;
    }

}
