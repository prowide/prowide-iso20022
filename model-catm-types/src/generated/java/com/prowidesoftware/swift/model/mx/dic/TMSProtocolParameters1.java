
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
@XmlType(name = "TMSProtocolParameters1", propOrder = {
    "termnlMgrId",
    "mntncSvc",
    "vrsn",
    "applId",
    "hstAdr",
    "hstKey",
    "poiId",
    "initgPtyId",
    "rcptPtyId"
})
public class TMSProtocolParameters1 {

    @XmlElement(name = "TermnlMgrId", required = true)
    protected GenericIdentification71 termnlMgrId;
    @XmlElement(name = "MntncSvc", required = true)
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory5Code> mntncSvc;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "ApplId")
    protected List<String> applId;
    @XmlElement(name = "HstAdr")
    protected NetworkParameters3 hstAdr;
    @XmlElement(name = "HstKey")
    protected List<KEKIdentifier2> hstKey;
    @XmlElement(name = "POIId")
    protected String poiId;
    @XmlElement(name = "InitgPtyId")
    protected String initgPtyId;
    @XmlElement(name = "RcptPtyId")
    protected String rcptPtyId;

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
    public TMSProtocolParameters1 setTermnlMgrId(GenericIdentification71 value) {
        this.termnlMgrId = value;
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
     * {@link DataSetCategory5Code }
     * 
     * 
     * @return
     *     The value of the mntncSvc property.
     */
    public List<DataSetCategory5Code> getMntncSvc() {
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
    public TMSProtocolParameters1 setVrsn(String value) {
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
     * Gets the value of the hstAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters3 }
     *     
     */
    public NetworkParameters3 getHstAdr() {
        return hstAdr;
    }

    /**
     * Sets the value of the hstAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters3 }
     *     
     */
    public TMSProtocolParameters1 setHstAdr(NetworkParameters3 value) {
        this.hstAdr = value;
        return this;
    }

    /**
     * Gets the value of the hstKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hstKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHstKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KEKIdentifier2 }
     * 
     * 
     * @return
     *     The value of the hstKey property.
     */
    public List<KEKIdentifier2> getHstKey() {
        if (hstKey == null) {
            hstKey = new ArrayList<>();
        }
        return this.hstKey;
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
    public TMSProtocolParameters1 setPOIId(String value) {
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
    public TMSProtocolParameters1 setInitgPtyId(String value) {
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
    public TMSProtocolParameters1 setRcptPtyId(String value) {
        this.rcptPtyId = value;
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
    public TMSProtocolParameters1 addMntncSvc(DataSetCategory5Code mntncSvc) {
        getMntncSvc().add(mntncSvc);
        return this;
    }

    /**
     * Adds a new item to the applId list.
     * @see #getApplId()
     * 
     */
    public TMSProtocolParameters1 addApplId(String applId) {
        getApplId().add(applId);
        return this;
    }

    /**
     * Adds a new item to the hstKey list.
     * @see #getHstKey()
     * 
     */
    public TMSProtocolParameters1 addHstKey(KEKIdentifier2 hstKey) {
        getHstKey().add(hstKey);
        return this;
    }

}
